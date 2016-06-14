/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.PhotoFilm;
import Model.ModeleJTablePhotosFilms;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPSClient;


public class FenetreGestionPhotosFilms extends javax.swing.JDialog {

    private boolean etatSortie;
    private ModeleJTablePhotosFilms leModelePhotoFilm;
    private int numVisa;

    /**
     *Constructeur
     * @param parent
     * @param leModelePhotosFilms
     */
    public FenetreGestionPhotosFilms(java.awt.Dialog parent, ModeleJTablePhotosFilms leModelePhotoFilm, int numVisa) {

        super(parent, true);
        try {
            this.etatSortie = false;
            this.leModelePhotoFilm = leModelePhotoFilm;
            this.numVisa=numVisa;
            
            initComponents();

            leModelePhotoFilm.lireLesPhotos();
        } catch (Exception e) {
            
            Logger.getLogger(FenetreApplication.class.getName()).log(Level.SEVERE, null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jbnAjoutPhoto = new javax.swing.JButton();
        jbnSuppr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePhoto = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestionnaire de photos de films");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbnAjoutPhoto.setText("Ajouter une photo");
        jbnAjoutPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAjoutPhotoActionPerformed(evt);
            }
        });

        jbnSuppr.setText("Supprimer");
        jbnSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSupprActionPerformed(evt);
            }
        });

        jTablePhoto.setModel(leModelePhotoFilm
        );
        jScrollPane1.setViewportView(jTablePhoto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbnAjoutPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbnSuppr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnAjoutPhoto)
                    .addComponent(jbnSuppr))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAjoutPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAjoutPhotoActionPerformed
        try {
            PhotoFilm laPhoto = new PhotoFilm();
            FenetreUploadPhotoFilm upload = new FenetreUploadPhotoFilm(this, laPhoto);
            laPhoto.setNumVisa(numVisa);
            
            if (upload.doModal() == true) {
                leModelePhotoFilm.insererPhoto(laPhoto);
                Properties props = new Properties();
                FileInputStream fis = new FileInputStream("src/fpt.properties");
                FileInputStream lienPhoto = new FileInputStream(laPhoto.getLien());
                props.load(fis);
                FTPSClient ftpClient = new FTPSClient();
                //connexion au serveur
                ftpClient.connect(props.getProperty("serveur"), Integer.parseInt(props.getProperty("port")));
                ftpClient.login(props.getProperty("user"), props.getProperty("pwd"));
                // transfert
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();
                //bar de  chargement
                viewBar();
                ftpClient.storeFile("public_html/VIP/asset/images/" + laPhoto.getNomPhoto(), lienPhoto);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Erreur gestion photos: "+e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbnAjoutPhotoActionPerformed

    /**
     *bar de progression
     */
    public void viewBar() {

  jProgressBar1.setStringPainted(true);
  jProgressBar1.setValue(0);

  int timerDelay = 10;
  new javax.swing.Timer(timerDelay , new ActionListener() {
     private int index = 0;
     private int maxIndex = 100;
     public void actionPerformed(ActionEvent e) {
        if (index < maxIndex) {
           jProgressBar1.setValue(index);
           index++;
        } else {
           jProgressBar1.setValue(maxIndex);
           ((javax.swing.Timer)e.getSource()).stop(); // stop the timer
        }
     }
  }).start();

  jProgressBar1.setValue(jProgressBar1.getMinimum());
}
    private void jbnSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSupprActionPerformed
            try {
            int ligne = jTablePhoto.getSelectedRow();
            PhotoFilm laPhoto = new PhotoFilm();
            String nomPhoto = leModelePhotoFilm.getValueAt(ligne, 2).toString();
             Properties props = new Properties();
             FileInputStream fis = new FileInputStream("src/fpt.properties");
                
                props.load(fis);
                FTPSClient ftpClient = new FTPSClient();
                //connexion au serveur
                ftpClient.connect(props.getProperty("serveur"), Integer.parseInt(props.getProperty("port")));
                ftpClient.login(props.getProperty("user"), props.getProperty("pwd"));
                 // supression
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();
                ftpClient.deleteFile("public_html/VIP/asset/images/" + nomPhoto);
                
                viewBar();
                leModelePhotoFilm.supprimerPhoto(ligne);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Erreur gestion photos: "+e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);        }
    }//GEN-LAST:event_jbnSupprActionPerformed

    /**
     *
     * @return
     */
    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePhoto;
    private javax.swing.JButton jbnAjoutPhoto;
    private javax.swing.JButton jbnSuppr;
    // End of variables declaration//GEN-END:variables
}
