/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import AccesDonnees.DaoEvent;
import AccesDonnees.DaoVIP;
import Metier.Evenements;
import Model.ModelJTableVIP;
import Metier.VIP;
import Model.ModeleComboBoxCR;
import Model.ModeleComboBoxFilm;
import Model.ModeleComboBoxGenre;
import Model.ModeleComboBoxMarier;
import Model.ModeleComboBoxPays;
import Model.ModeleComboBoxVIP;

import Model.ModeleComboBoxVIP1M;
import Model.ModeleComboBoxVIP2M;
import Model.ModeleComboBoxVIPAct;
import Model.ModeleComboBoxVIPReal;
import Model.ModeleJTableFilm;

import Model.ModeleJTablePhotos;
import Model.ModeleJTablePhotosFilms;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Claire et louis
 */
public class FenetreApplication extends javax.swing.JFrame {

    private ModelJTableVIP leModele;
    private ModeleComboBoxCR modeleComboBoxRole;
    private ModeleComboBoxPays modeleComboBoxPays;
    private ModeleJTableFilm leModeleFilm;

    private ModeleComboBoxVIP1M modeleComboBoxVipUn;
    private ModeleComboBoxVIP2M modeleComboBoxVipDeux;
    private ModeleComboBoxMarier modeleComboBoxMariages;
    private ModeleJTablePhotos leModelePhoto;
    private ModeleComboBoxGenre modeleComboBoxGenre;
    private ModeleComboBoxFilm modeleComboBoxFilms;
    private ModeleComboBoxVIPAct modeleComboBoxActeur;
    private ModeleComboBoxVIPReal modeleComboBoxRealisateur;
    private ModeleComboBoxVIP modeleComboBoxVip;
    private ModeleJTablePhotosFilms leModelePhotoFilm;

    /**
     * Constructeur
     *
     * @param leModele
     * @param modeleComboBoxRole
     * @param modeleComboBoxPays
     * @param modeleComboBoxVipUn
     * @param modeleComboBoxVipDeux
     * @param modeleComboBoxGenre
     * @param modeleComboBoxMariages
     * @param leModelePhoto
     * @param leModeleFilm
     * @param daoEvent
     * @param daoVIP
     * @param modeleComboBoxFilms
     * @param modeleComboBoxActeur
     * @param modeleComboBoxRealisateur
     * @param modeleComboBoxVip
     * @param leModelePhotoFilm
     */
    public FenetreApplication(ModelJTableVIP leModele, ModeleComboBoxCR modeleComboBoxRole, ModeleComboBoxPays modeleComboBoxPays, ModeleComboBoxVIP1M modeleComboBoxVipUn, ModeleComboBoxVIP2M modeleComboBoxVipDeux, ModeleComboBoxGenre modeleComboBoxGenre, ModeleComboBoxMarier modeleComboBoxMariages, ModeleJTablePhotos leModelePhoto, ModeleJTableFilm leModeleFilm, DaoEvent daoEvent, DaoVIP daoVIP, ModeleComboBoxFilm modeleComboBoxFilms, ModeleComboBoxVIPAct modeleComboBoxActeur, ModeleComboBoxVIPReal modeleComboBoxRealisateur, ModeleComboBoxVIP modeleComboBoxVip, ModeleJTablePhotosFilms leModelePhotoFilm) {

        this.leModele = leModele;
        this.modeleComboBoxRole = modeleComboBoxRole;
        this.modeleComboBoxPays = modeleComboBoxPays;
        this.modeleComboBoxVip = modeleComboBoxVip;
        this.modeleComboBoxVipUn = modeleComboBoxVipUn;
        this.modeleComboBoxVipDeux = modeleComboBoxVipDeux;
        this.modeleComboBoxMariages = modeleComboBoxMariages;
        this.modeleComboBoxGenre = modeleComboBoxGenre;
        this.modeleComboBoxFilms = modeleComboBoxFilms;
        this.modeleComboBoxActeur = modeleComboBoxActeur;
        this.modeleComboBoxRealisateur = modeleComboBoxRealisateur;
        this.leModelePhoto = leModelePhoto;
        this.leModeleFilm = leModeleFilm;
        this.leModelePhotoFilm = leModelePhotoFilm;

        initComponents();
        try {
            leModele.lireLesVip();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        laTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btInserer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtGestionEvents = new javax.swing.JButton();
        jBFilm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Les VIPs");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        laTable.setModel(leModele);
        jScrollPane1.setViewportView(laTable);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("~ Voicela ~");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btInserer.setText("Insérer VIP");
        btInserer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsererActionPerformed(evt);
            }
        });

        jButton1.setText("Modifier sélection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btInserer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserer)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtGestionEvents.setText("Gestionnaire événements");
        jbtGestionEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGestionEventsActionPerformed(evt);
            }
        });

        jBFilm.setText("Gestionnaire Film");
        jBFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFilmActionPerformed(evt);
            }
        });

        jButton2.setText("Gestionnaire photos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtGestionEvents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtGestionEvents)
                    .addComponent(jBFilm)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsererActionPerformed
        try {
            VIP vip = new VIP();

            FenetreSaisieVIP laSaisie = new FenetreSaisieVIP(this, vip, modeleComboBoxRole, modeleComboBoxPays);
            if (laSaisie.doModal() == true) {
                leModele.insererVip(vip);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur insertion VIP: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btInsererActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vraiment sortir ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (reponse == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jbtGestionEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGestionEventsActionPerformed
        try {

            Evenements eve = new Evenements();
            //maj des combobox
            modeleComboBoxMariages.majBox();
            modeleComboBoxVipDeux.majBox();
            modeleComboBoxVipUn.majBox();
            FenetreSaisieEvents laSaisie = new FenetreSaisieEvents(this, eve, modeleComboBoxVipUn, modeleComboBoxVipDeux, modeleComboBoxMariages);
            if (laSaisie.doModal() == true) {
                if (eve.getType() == -1) {
                    
                    modeleComboBoxVipUn.addDivorce(eve.getIdVip1(), eve.getIdVip2(), eve.getDateDiv(), eve.getDateMar());
                } else if (eve.getType() == 1) {
                    
                    modeleComboBoxVipUn.addMariage(eve.getIdVip1(), eve.getIdVip2(), eve.getDateMar(), eve.getLieuMariage());
                } else {
                    JOptionPane.showMessageDialog(this, "Erreur gestion événement: Ce n'est ni un mariage ni un divorce", "Erreur", JOptionPane.WARNING_MESSAGE);
                }
                leModele.updateTable();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur gestion événement: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtGestionEventsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        FenetreGestionPhotos gestionPhoto = new FenetreGestionPhotos(this, leModelePhoto, modeleComboBoxVip);

        if (gestionPhoto.doModal() == true) {

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFilmActionPerformed
        // TODO add your handling code here:
        FenetreGestionFilm gestionfilm = new FenetreGestionFilm(this, leModeleFilm, modeleComboBoxGenre, modeleComboBoxFilms, modeleComboBoxActeur, modeleComboBoxRealisateur, leModelePhotoFilm);

        if (gestionfilm.doModal() == true) {

        }
    }//GEN-LAST:event_jBFilmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int ligne = laTable.getSelectedRow();
            VIP vip = leModele.getVip(Integer.parseInt(leModele.getValueAt(ligne, 0).toString()));
            FenetreModVip laSaisie = new FenetreModVip(this, vip, modeleComboBoxRole, modeleComboBoxPays);
            if (laSaisie.doModal() == true) {
                leModele.ModifierVip(vip);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur modification VIP: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserer;
    private javax.swing.JButton jBFilm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtGestionEvents;
    private javax.swing.JTable laTable;
    // End of variables declaration//GEN-END:variables
}
