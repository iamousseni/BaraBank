/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contocorrent;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Ousseni bara
 */
public class GUIContoCorrente extends javax.swing.JFrame implements WindowListener{
    /**
     * Creates new form GUIContoCorrente
     */
    public GUIContoCorrente() {
        initComponents();
        display.setEditable(false);
        setResizable(false);
        display.setText("Designed & Developed by Ousseni Bara");
        setTitle("BARA BANK | WebJobs");
        //path of my img
        String imagePath = "logo.png";
        //open the stream and find my img
        InputStream imgStream = GUIContoCorrente.class.getResourceAsStream(imagePath);
        //read my img
        BufferedImage myImg;
        try {
            myImg = ImageIO.read(imgStream);
            setIconImage(myImg);
        } catch (IOException ex) {}
        setResizable(false);
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
        header = new javax.swing.JLabel();
        addConto = new javax.swing.JButton();
        operation = new javax.swing.JButton();
        stampa = new javax.swing.JButton();
        showProprietariMaggiori = new javax.swing.JButton();
        esportaCSV = new javax.swing.JButton();
        editProprietari = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 24)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("BARA BANK");

        addConto.setText("NUOVO CONTO");
        addConto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addContoMouseClicked(evt);
            }
        });

        operation.setText("OPERAZIONI");
        operation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operationMouseClicked(evt);
            }
        });

        stampa.setText("STAMPA CONTI");
        stampa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stampaMouseClicked(evt);
            }
        });

        showProprietariMaggiori.setText("STAMPA MAGGIORI");
        showProprietariMaggiori.setMaximumSize(new java.awt.Dimension(130, 23));
        showProprietariMaggiori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showProprietariMaggioriMouseClicked(evt);
            }
        });

        esportaCSV.setText("ESPORTA CSV");
        esportaCSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esportaCSVMouseClicked(evt);
            }
        });

        editProprietari.setText("MODIFICA INTEST.");
        editProprietari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProprietariMouseClicked(evt);
            }
        });

        display.setBackground(new java.awt.Color(0, 102, 102));
        display.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        display.setToolTipText("");
        display.setSelectionColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(display)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(showProprietariMaggiori, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(esportaCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editProprietari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addConto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operation, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stampa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stampa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addConto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editProprietari, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(esportaCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showProprietariMaggiori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void addContoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addContoMouseClicked
       
        
        try {
            nuovoConto conto = new nuovoConto();
            conto.setVisible(true);
        } catch (Exception ex) {} 
     
        
    }//GEN-LAST:event_addContoMouseClicked

    private void operationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operationMouseClicked
   
        try {
            operazioni operazioni = new operazioni();
            operazioni.setVisible(true);
        } catch (Exception ex) {} 
 
    }//GEN-LAST:event_operationMouseClicked

    private void stampaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stampaMouseClicked
        try {
            stampaConti stampaConti = new stampaConti();
            stampaConti.setVisible(true);  
        } catch (Exception ex) {}
        
               
           
        
    }//GEN-LAST:event_stampaMouseClicked

    private void esportaCSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esportaCSVMouseClicked
        try {
            lossClients lossClients = new lossClients();
            lossClients.setVisible(true);  
        } catch (Exception ex){}
    }//GEN-LAST:event_esportaCSVMouseClicked

    private void showProprietariMaggioriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProprietariMaggioriMouseClicked
        try {
            saldoMaggiore saldoMaggiore = new saldoMaggiore();
            saldoMaggiore.setVisible(true);  
        } catch (Exception ex) {}
    }//GEN-LAST:event_showProprietariMaggioriMouseClicked

    private void editProprietariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProprietariMouseClicked
        try {
            modifyProprietario modifyProprietario = new modifyProprietario();
            modifyProprietario.setVisible(true);  
        } catch (Exception ex) {}
    }//GEN-LAST:event_editProprietariMouseClicked

   
        //eventi finestra
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    @Override
    public void windowClosed(WindowEvent e){}
    @Override
    public void windowClosing(WindowEvent e){this.dispose();}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addConto;
    private javax.swing.JTextField display;
    private javax.swing.JButton editProprietari;
    private javax.swing.JButton esportaCSV;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton operation;
    private javax.swing.JButton showProprietariMaggiori;
    private javax.swing.JButton stampa;
    // End of variables declaration//GEN-END:variables
}