/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Casting;
import Metier.Film;
import Metier.PhotoFilm;
import Metier.Real;
import Model.ModeleComboBoxFilm;
import Model.ModeleComboBoxGenre;
import Model.ModeleComboBoxVIPAct;
import Model.ModeleComboBoxVIPReal;
import Model.ModeleJTableFilm;
import Model.ModeleJTablePhotosFilms;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FenetreGestionFilm extends javax.swing.JDialog {

    private boolean etatSortie;
    private Film film;
    private ModeleJTableFilm leModeleFilm;
    private ModeleComboBoxGenre csCf;
    private ModeleComboBoxFilm CBVF;
    private ModeleComboBoxVIPAct CBVA;
    private ModeleComboBoxVIPReal CBVR;
    private ModeleJTablePhotosFilms leModelePhotoFilm;

    /**
     * Constructeur
     *
     * @param parent
     * @param leModeleFilm
     * @param csCf
     * @param CBVF
     * @param CBVA
     * @param CBVR
     * @param leModelePhotoFilm
     */
    public FenetreGestionFilm(java.awt.Frame parent, ModeleJTableFilm leModeleFilm, ModeleComboBoxGenre csCf, ModeleComboBoxFilm CBVF, ModeleComboBoxVIPAct CBVA, ModeleComboBoxVIPReal CBVR, ModeleJTablePhotosFilms leModelePhotoFilm) {

        super(parent, true);
        this.csCf = csCf;
        this.CBVF = CBVF;
        this.CBVA = CBVA;
        this.CBVR = CBVR;
        this.etatSortie = false;

        this.leModeleFilm = leModeleFilm;
        this.leModelePhotoFilm = leModelePhotoFilm;

        initComponents();
        try {
            leModeleFilm.lireLesFilm();
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jbnAjoutPhoto = new javax.swing.JButton();
        jbnSuppr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilm = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBCast = new javax.swing.JButton();
        jBReal = new javax.swing.JButton();
        jbtnGEstionPhotosFilms = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestionnaire de Films");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbnAjoutPhoto.setText("Ajouter un film");
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

        jTableFilm.setModel(leModeleFilm);
        jTableFilm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTableFilm);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Sélectionnez un film");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel3.setText("pour le gérer:");

        jBCast.setText("Gestion Casting");
        jBCast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCastActionPerformed(evt);
            }
        });

        jBReal.setText("Gestion Realisation");
        jBReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRealActionPerformed(evt);
            }
        });

        jbtnGEstionPhotosFilms.setText("Gestion Photo");
        jbtnGEstionPhotosFilms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGEstionPhotosFilmsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBReal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnGEstionPhotosFilms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jBCast)
                .addGap(18, 18, 18)
                .addComponent(jBReal)
                .addGap(18, 18, 18)
                .addComponent(jbtnGEstionPhotosFilms)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbnAjoutPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbnSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnAjoutPhoto)
                    .addComponent(jbnSuppr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAjoutPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAjoutPhotoActionPerformed
        try {
            Film leFilm = new Film();
            //instantiation fenetre de saisie
            FenetreSaisieFilm saise = new FenetreSaisieFilm(this, leFilm, csCf);
            if (saise.doModal() == true) {
                //insertion
                leModeleFilm.insererFilm(leFilm);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur gestion film: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbnAjoutPhotoActionPerformed

    private void jbnSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSupprActionPerformed
        try {
            //supretion d'un film selectionné
            int ligne = jTableFilm.getSelectedRow();
            CBVF.supprCast(Integer.parseInt(leModeleFilm.getValueAt(ligne, 0).toString()));
            leModeleFilm.supprimerFilm(ligne);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur de suppression de film: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbnSupprActionPerformed

    private void jBCastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCastActionPerformed
        try {
            //ajout d'un acting au film selectionné
            int ligne = jTableFilm.getSelectedRow();
            Casting cas = new Casting();
            CBVA.majBox();//maj combobox
            FenetreCasting saise = new FenetreCasting(this, cas, leModeleFilm.getValueAt(ligne, 1).toString(), Integer.parseInt(leModeleFilm.getValueAt(ligne, 0).toString()), CBVA, CBVF);
            if (saise.doModal() == true) {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur gestion casting: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBCastActionPerformed

    private void jBRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRealActionPerformed
        try {
            //ajouit d'un realisateur au film selectionné
            int ligne = jTableFilm.getSelectedRow();
            Real real = new Real();
            CBVR.majBox();//maj combobox
            FenetreReal saise = new FenetreReal(this, real, leModeleFilm.getValueAt(ligne, 1).toString(), Integer.parseInt(leModeleFilm.getValueAt(ligne, 0).toString()), CBVF, CBVR);
            if (saise.doModal() == true) {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur gestion réal: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBRealActionPerformed

    private void jbtnGEstionPhotosFilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGEstionPhotosFilmsActionPerformed
        try {
            //ajouit d'un realisateur au film selectionné
            int ligne = jTableFilm.getSelectedRow();
            FenetreGestionPhotosFilms saise = new FenetreGestionPhotosFilms(this, leModelePhotoFilm, Integer.parseInt(leModeleFilm.getValueAt(ligne, 0).toString()));
            if (saise.doModal() == true) {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur gestion Photos: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtnGEstionPhotosFilmsActionPerformed

    /**
     * @return
     */
    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCast;
    private javax.swing.JButton jBReal;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFilm;
    private javax.swing.JButton jbnAjoutPhoto;
    private javax.swing.JButton jbnSuppr;
    private javax.swing.JButton jbtnGEstionPhotosFilms;
    // End of variables declaration//GEN-END:variables
}
