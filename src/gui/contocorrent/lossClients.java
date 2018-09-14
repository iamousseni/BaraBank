/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contocorrent;
import static gui.contocorrent.fileManager.download;
import static gui.contocorrent.fileManager.scrivi;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 *
 * @author Ousseni bara
 */
public class lossClients extends javax.swing.JFrame implements WindowListener{
    private fileManager fileManager; 
    private nuovoConto conti;
    private File csv;
    private boolean control;
    /**
     * Creates new form lossClients
     */
    public lossClients(){
        initComponents();
        setResizable(false);
        setTitle("BARA BANK | WebJobs");
        InputStream myStream = lossClients.class.getResourceAsStream("logo.png");
        BufferedImage myImg;
        try {
            myImg = ImageIO.read(myStream);
            setIconImage(myImg);
        } catch (IOException ex) {}
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        fileManager = new fileManager();
        try {
            conti=new nuovoConto();
        } catch (IOException ex) {
            Logger.getLogger(lossClients.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lossClients.class.getName()).log(Level.SEVERE, null, ex);
        }
        control=false;
        display.setEditable(false);
        csv=new File("lossClients.csv");
        if(conti.getFile().exists()){
            try {
                download(conti.getFile(),conti.getVettore());
            } catch (IOException ex) {
                Logger.getLogger(lossClients.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(lossClients.class.getName()).log(Level.SEVERE, null, ex);
            }
            showLossClients();
        }else{
            display.setText("NON CI SONO CONTI DA MOSTRARE!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BARA BANK");

        display.setColumns(20);
        display.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showLossClients(){
        if(!conti.getVettore().isEmpty()&&conti.getFile().exists()){
            try {
                csv.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(lossClients.class.getName()).log(Level.SEVERE, null, ex);
            }
            control=false;
        for(int x=0;x<conti.getVettore().size();x++)
        {
            if(((CC) conti.getVettore().elementAt(x)).getSaldo()<0){
                control=true;
                try{
                scrivi(csv,Integer.toString(((CC) conti.getVettore().elementAt(x)).getId())+",");
                scrivi(csv,(((CC) conti.getVettore().elementAt(x)).getProprietario())+",");
                scrivi(csv,Double.toString(((CC) conti.getVettore().elementAt(x)).getFido())+",");
                scrivi(csv,Double.toString(((CC) conti.getVettore().elementAt(x)).getSaldo())+",");
                }catch(Exception e){}
            }
        }
            if(control==false)
            {
                display.setText("ATTENZIONE! non esistono conti con saldo negativo");
            }else{
                display.setText("Esportazione avvenuta con successo!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"ERRORE! NON CI SONO CONTI DA MOSTRARE");
        }
    }
        //eventi finestra
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){this.dispose();}
    public void windowClosing(WindowEvent e){this.dispose();}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
