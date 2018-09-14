/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contocorrent;
import java.io.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ousseni bara
 */
public class fileManager implements Serializable{
    private CC conto;
    
    public fileManager(){
        conto=new CC();
    }
    
    public static void scrivi(File file,String testo) throws FileNotFoundException, IOException
    {
        if(!file.exists())
        {
            System.out.println("ERRRORE! IL FILE NON ESISTE,VERRA' CREATO");
             file.createNewFile();
        }
         FileWriter scrivo=new FileWriter (file,true);
         scrivo.write(testo);
         scrivo.flush();
         scrivo.close();
    }
    
    
    
    //trasferisci contenuto vettore in file
    public static void upload(File f,Vector vett) throws FileNotFoundException, IOException{
        if(f.exists()){
        ObjectOutputStream os = new ObjectOutputStream (new FileOutputStream (f));
        for(int x=0;x<vett.size();x++)
        {
            os.writeObject(vett.elementAt(x));
        }
        os.flush();
        os.close();
        }else{
            System.out.println("ERRORE! IL FILE NON ESISTE");
        }
    }
    
    
    public static void download(File f,Vector vett) throws FileNotFoundException, IOException, ClassNotFoundException{
        vett.clear();
         if(f.exists()){
            ObjectInputStream in = new ObjectInputStream (new FileInputStream (f));
             try {
                 while(true)
                 {
                     try{
                         vett.add(in.readObject());
                     }catch(EOFException ex){
                         break;
                     }
                 }
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(fileManager.class.getName()).log(Level.SEVERE, null, ex);
             }
            in.close();
        }
        else{
            System.out.println("ERRORE! IL FILE NON ESISTE");
            f.createNewFile();
        }
    }
    
    public void leggo(File f) throws FileNotFoundException, IOException
    {
        if(f.exists()){
        FileReader l=new FileReader(f);
        BufferedReader lettore=new BufferedReader(l);
        String riga;
        riga=lettore.readLine();
        while(riga!=null){
            System.out.println(riga);
            riga=lettore.readLine();
        }
        }
        else{
            System.out.println("ERRORE! IL FILE NON ESISTE");
        }
    }
    
    public Object leggoDati(File f) throws FileNotFoundException, IOException
    {
        Object dati=null;
        if(f.exists()){
        FileReader l=new FileReader(f);
        BufferedReader lettore=new BufferedReader(l);
        String riga;
         riga=lettore.readLine();
        dati+=riga;
        while(riga!=null){
            riga=lettore.readLine();
            dati+=riga;
        }
        }
        else{
            System.out.println("ERRORE! IL FILE NON ESISTE");
        }
        
        return dati;
    }
    
    public Vector prelevoDati(File f) throws FileNotFoundException, IOException{
        Vector dati=new Vector();
        if(f.exists()){
            FileReader l=new FileReader(f);
            BufferedReader lettore=new BufferedReader(l);
            String riga;
            riga=lettore.readLine();
            dati.addElement(riga);
            while(riga!=null){
                dati.addElement(riga);
                riga=lettore.readLine();
            }
        }
        else{
            System.out.println("ERRORE! IL FILE NON ESISTE");
        }
         
         return dati;
    }

    
    public void cancellaContenuto(File f) throws FileNotFoundException, IOException
    {
        if(f.exists())
        {
             FileWriter scrivo=new FileWriter (f,false);
             scrivo.write("");
        }
        else{
            System.out.println("ERRORE! IL FILE NON ESISTE");
        }
    }
    
    public void cancellaFile(File f)
    {
        f.delete();
    }
    
    public void serializza(File f,Object obj) throws IOException{
        FileOutputStream fileOs = new FileOutputStream (f);
        ObjectOutputStream os = new ObjectOutputStream (fileOs);
        os.writeObject(obj);
        fileOs.flush();
        fileOs.close();
    }
    
    public void deserializza(File f,Object o) throws IOException, ClassNotFoundException{
        FileInputStream fileIs = new FileInputStream (f);
        ObjectInputStream is = new ObjectInputStream(fileIs);
        //IMPORTANTE!!!!
        Object p1 = (Object)is.readObject();
        fileIs.close();
        System.out.println("deserializziamolo. Stampo tutti i valori degli attributi: "+p1); 
        
        File f1=new File("conti.txt");
        f1.createNewFile();
        FileWriter fw=new FileWriter(f1);
        PrintWriter pw=new PrintWriter(fw);
        pw.print(p1);
        pw.flush();
        fw.close();
    }

}
