/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contocorrent;
import java.io.*;
import java.util.*;
import java.util.Vector;
/**
 *
 * @author Ousseni bara
 */

/*
    
        PSEUDO CODIFICA
        
        1) SITUAZIONE GENERALE CLASSE CONTO CORRENTE
        Per creare la classe conto corrente iniziamo a definire i suoi attributi che sono: id(numero identificativo univovo del conto corrente) di tipo intero
        ,nome del/dei proprietario/i (di tipo string), saldo(di tipo double) e il fido (di tipo double). 
        A seguire i suoi metodi, i quali sono: versamento, prelievo, visualizzazione saldo corrente, lista ultimi 5 movimenti, e infine tutti i set e get
        dei vari attributi. Il costruttore del conto corrente sarà definito con questi attributi.
        
        2)  METODO DI VERSAMENTO
            Il metodo di versamento non avrà nessun valore di ritorno per cui sarà di tipo void, essa infatti si limiterà solamente a ricevere come parametro
            un importo (di tipo double) e sommare essa con il saldo corrente.In fatto di controlli occorrerà controllare che il valore dato in input NON sia
            minore di zero. Inoltre vi sarà all'interno del metodo versamento un vettore che registrerà tale
            movimento effettuato dal metodo versamento.(in caso il numero di elementi aggiunti al vettore superasse i 5 
            valori, il valore che sarà aggiunto successivamente al vettore occuperà l'ultima posizione del vettore (il 5°), il successivo invece il penultimo
            (il 4°) e così via.
        
        3) METODO PRELIEVO
           Il metodo di prelievo non avrà nessun valore di ritorno per cui sarà anch'esso di tipo vois, essa si limiterà a ricevere come parametro un importo 
           (di tipo double) e sottrarre essa con il saldo corrente. In fatto di controlli bisognerà controllare che: se effettuando il prelevamento il valore
            del saldo diventi negativo, in tal caso mandare un messaggio di errore e che il valore dato in input non sia minore di zero. Inoltre vi sarà all'interno 
            del metodo prelievo un vettore che ne registrerà il movimento di prelevamento. (in caso il numero di elementi aggiunti al vettore superasse i 5 
            valori, il valore che sarà aggiunto successivamente al vettore occuperà l'ultima posizione del vettore (il 5°), il successivo invece il penultimo
            (il 4°) e così via.

        4) METODO VISUALIZZA SALDO CORRENTE
           Il metodo di visualizzazione del saldo corrente, avrà un valore di ritorno che sarà di tipo double in quanto dovrà solamente ritornare il valore 
           dell'attributo saldo.

        5) METODO VISUALIZZAZIONE ULTIMI 5 MOVIMENTI
           Il metodo di visualizzazione degli ultimi 5 movimenti, NON avrà alcun valore di ritorno pertanto sarà di tipo void, essa si occuperà semplicemnte
           di ciclare il contenuto del vettore (a cui gli sono stati aggiunti in precedenza i valori di prelevamento e versamento) e mandarlo a video. In
           fatto di controlli si dovrà controllare che tale vettore non sia vuoto, in caso si verificasse ciò di mandarne un messaggio di errore.

*/
public class CC implements Serializable{
    private int id,x=0;
    private String proprietario;
    private double fido;
    private double saldo;
    private boolean control=false;
    private Vector Vector=new Vector();
    
    public CC(){
        setId(0);
        setProprietario(null);
        setFido(0);
        setSaldo(0);
    }
    
    public CC (int id,String proprietario,double fido,double saldo)
    {
        setId(id);
        setProprietario(proprietario);
        setFido(fido);
        setSaldo(saldo);
    }


    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setProprietario(String proprietario){
        this.proprietario=proprietario;
    }
    
    public String getProprietario()
    {
        return this.proprietario;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setFido(double fido){
        this.fido=-fido;
    }
    
    public double getFido()
    {
        return this.fido;
    }
    
    public void versa(double num){
        
        if(num<0)
        {
            System.out.println("ATTENZIONE! L'importo che si desidera versare è negativo");
        }
        else{
              setSaldo(saldo+num);
        }
    }
    
    public void preleva(double num){
        if((saldo-num)>=fido && num>0){
            setSaldo(saldo-num);
        }
        else {
            System.out.println("ERRORE! NON E' POSSIBILE PRELEVARE");
        }
    }
    
        public boolean isOnlyNum(String check){
        boolean control=true;
        double D=0;
        for(int x=0;x<check.length()&&control!=false;x++)
        {
            try{
                D= Double.parseDouble(Character.toString(check.charAt(x)));
            }
            catch(Exception ex)
            {control=false;}
        }
        
        return control;
    }
    
    public boolean isOnlyCharacter(String check){
         boolean control=true;
        double D=0;
        for(int x=0;x<check.length()&&control!=false;x++)
        {
            try{
                D= Double.parseDouble(Character.toString(check.charAt(x)));
                control=false;
            }
            catch(Exception ex)
            {}
        }
        return control;
    }
    
}
