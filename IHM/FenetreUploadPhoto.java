/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Photo;
import java.io.File;
import java.sql.Date;

/**
 *
 * @author Louis
 */
public class FenetreUploadPhoto extends javax.swing.JDialog {

    private boolean etatSortie;
    private Photo laPhoto;

    public FenetreUploadPhoto(javax.swing.JDialog parent, Photo laPhoto) {
        super(parent, true);
        this.etatSortie = false;
        this.laPhoto = laPhoto;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jfcPhoto = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtIdVip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtLieuPhoto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtDatePhoto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uploader une photo");

        jfcPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfcPhotoActionPerformed(evt);
            }
        });

        jLabel2.setText("IdVip:");

        jtxtIdVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdVipActionPerformed(evt);
            }
        });

        jLabel4.setText("Date photo:");

        jtxtLieuPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLieuPhotoActionPerformed(evt);
            }
        });

        jLabel5.setText("Lieu photo:");

        jtxtDatePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDatePhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtIdVip)
                    .addComponent(jtxtLieuPhoto)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jtxtDatePhoto))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtIdVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtLieuPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtDatePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfcPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jfcPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfcPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfcPhotoActionPerformed
        try {
            File f = jfcPhoto.getSelectedFile();
            laPhoto.setIdPhoto(f.getName());
            laPhoto.setLien(f.getAbsolutePath());
             if (jtxtIdVip.getText().isEmpty()) {
                throw new Exception("Champs IdVip vide!");
            }
            laPhoto.setIdVip(Integer.parseInt(jtxtIdVip.getText()));
            if (jtxtDatePhoto.getText().isEmpty()) {
                throw new Exception("Champs Date vide!");
            }
            laPhoto.setLaDate(Date.valueOf(jtxtDatePhoto.getText()));
            if (jtxtLieuPhoto.getText().isEmpty()) {
                throw new Exception("Champs Lieu vide!");
            }
            laPhoto.setLieu(jtxtLieuPhoto.getText());
            etatSortie=true;
            this.dispose();
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }

    }//GEN-LAST:event_jfcPhotoActionPerformed

    private void jtxtIdVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdVipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdVipActionPerformed

    private void jtxtDatePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDatePhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDatePhotoActionPerformed

    private void jtxtLieuPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLieuPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLieuPhotoActionPerformed

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser jfcPhoto;
    private javax.swing.JTextField jtxtDatePhoto;
    private javax.swing.JTextField jtxtIdVip;
    private javax.swing.JTextField jtxtLieuPhoto;
    // End of variables declaration//GEN-END:variables
}
