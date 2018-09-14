/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.contocorrent;

import static gui.contocorrent.fileManager.download;
import static gui.contocorrent.fileManager.upload;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Ousseni bara
 */
public class modifyProprietario extends javax.swing.JFrame {
    private fileManager fileManager; 
    private nuovoConto conti;
    private CC conto;
    private boolean control;
    private int pos;
    /**
     * Creates new form modifyProprietario
     */
    public modifyProprietario() throws IOException, FileNotFoundException, ClassNotFoundException{
        initComponents();
        setResizable(false);
        setTitle("BARA BANK | WebJobs");
        InputStream myStream = modifyProprietario.class.getResourceAsStream("logo.png");
        BufferedImage myImg = ImageIO.read(myStream);
        setIconImage(myImg);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        display.setEditable(false);
        fileManager = new fileManager();
        conti=new nuovoConto();
        conto = new CC();
        control=false;
        pos=0;
        if(conti.getFile().exists()){
            download(conti.getFile(),conti.getVettore());
        }else{
            display.setText("NON CI SONO CONTI DA MODIFICARE!");
            idField.setEditable(false);
            nomeField.setEditable(false);
            btnId.setEnabled(false);
            btnNome.setEnabled(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        btnId = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        btnNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BARA BANK");

        jLabel2.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N
        jLabel2.setText("INSERISCI ID DEL CONTO");

        idField.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N

        btnId.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N
        btnId.setText("CONFERMA");
        btnId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIdMouseClicked(evt);
            }
        });

        display.setColumns(20);
        display.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jLabel3.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INSERISCI IL NOME DEL NUVO DESTINATARIO");

        nomeField.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N

        btnNome.setFont(new java.awt.Font("Brandon Grotesque Bold", 0, 18)); // NOI18N
        btnNome.setText("CONFERMA");
        btnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNome, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(btnId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeField)
                    .addComponent(btnNome, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeActionPerformed
         if(control==false)
       {
           JOptionPane.showMessageDialog(null, "ATTENZIONE! E' NECCESSARIO, PRIMA DI MODIFICARE, INSERIRE UN ID VALIDO");
       }else{
           if(nomeField.getText().equals("")||!conto.isOnlyCharacter(nomeField.getText()))
           {
               JOptionPane.showMessageDialog(null, "ERRORE! INSERIRE UN DATO VALIDO");
           }else{
                    ((CC)conti.getVettore().elementAt(pos)).setProprietario(nomeField.getText());
                    try {
                      upload(conti.getFile(),conti.getVettore());
                    } catch (Exception ex) {}
                    JOptionPane.showMessageDialog(null, "MODIFICA EFFETTUATA CON SUCCESSO");
           }
       }
    }//GEN-LAST:event_btnNomeActionPerformed

    private void btnIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIdMouseClicked

        int id=0;
        if(idField.getText().equals("")||!conto.isOnlyNum(idField.getText()))
        {
            JOptionPane.showMessageDialog(null, "ERRORE! L'IDENFIFICATIVO INSERITO NON E' VALIDO");
        }else{
            control=false;
            id=Integer.parseInt(idField.getText());
            
            //ora cerco se l'ID inserito esiste o meno
            for(int x=0;x<conti.getVettore().size()&&control!=true;x++)
            {
                if(((CC)conti.getVettore().elementAt(x)).getId()==id&&!conti.getVettore().isEmpty())
                {
                    display.setText("ID TROVATO! ORA SI PUO' MODIFICARE L'INTESTATARIO DEL CONTO");
                    pos=x;
                    control=true;
                }
            }
            if(control==false)
            {
                JOptionPane.showMessageDialog(null, "ID INESISTENTE! SI PREGA DI INSERIRE UN ID ESISTENTE O CREARE UN NUOVO CONTO PER QUELLO");
            }
        }
    }//GEN-LAST:event_btnIdMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnId;
    private javax.swing.JButton btnNome;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    // End of variables declaration//GEN-END:variables
}
