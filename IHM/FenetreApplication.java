/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Evenements;
import Metier.Photo;
import Model.ModelJTableVIP;
import Metier.VIP;
import Model.ModeleComboBoxCR;
import Model.ModeleComboBoxCS;
import Model.ModeleComboBoxMarier;
import Model.ModeleComboBoxPays;
<<<<<<< HEAD

import Model.ModeleComboBoxVIP1M;
import Model.ModeleComboBoxVIP2M;
=======
import Model.ModeleComboBoxVIP1;
import Model.ModeleComboBoxVIP2;
import Model.ModeleJTablePhotos;
import java.sql.SQLException;
>>>>>>> origin/master
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Louis
 */
public class FenetreApplication extends javax.swing.JFrame {

    private ModelJTableVIP leModele;
    private ModeleComboBoxCS csCB;
    private ModeleComboBoxCR crCB;
    private ModeleComboBoxPays paysCB;
<<<<<<< HEAD
 
     private ModeleComboBoxVIP1M mvCB1M;
    private ModeleComboBoxVIP2M mvCB2M;
    private ModeleComboBoxMarier mvCBMar;

    public FenetreApplication(ModelJTable leModele, ModeleComboBoxCR crCB, ModeleComboBoxCS csCB, ModeleComboBoxPays paysCB, ModeleComboBoxVIP1M mvCB1M,ModeleComboBoxVIP2M mvCB2M,ModeleComboBoxMarier mvCBMar) {
=======
    private ModeleComboBoxVIP1 mvCB1;
    private ModeleComboBoxVIP2 mvCB2;
    private ModeleJTablePhotos leModelePhoto;

    public FenetreApplication(ModelJTableVIP leModele, ModeleComboBoxCR crCB, ModeleComboBoxCS csCB, ModeleComboBoxPays paysCB, ModeleComboBoxVIP1 mvCB1, ModeleComboBoxVIP2 mvCB2,ModeleJTablePhotos leModelePhoto) {
>>>>>>> origin/master
        this.leModele = leModele;
        this.crCB = crCB;
        this.csCB = csCB;
        this.paysCB = paysCB;
<<<<<<< HEAD
        
        this.mvCB1M = mvCB1M;
        this.mvCB2M = mvCB2M;
            this.mvCBMar = mvCBMar;
=======
        this.mvCB1 = mvCB1;
        this.mvCB2 = mvCB2;
        this.leModelePhoto=leModelePhoto;

>>>>>>> origin/master
        initComponents();
        try {
            leModele.lireLesVip();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        btInserer = new javax.swing.JButton();
        btSuppr = new javax.swing.JButton();
        jbtGestionEvents = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Les VIPs");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        laTable.setModel(leModele);
        jScrollPane1.setViewportView(laTable);

        btInserer.setText("Insérer");
        btInserer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsererActionPerformed(evt);
            }
        });

        btSuppr.setText("Supprimer");
        btSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupprActionPerformed(evt);
            }
        });

        jbtGestionEvents.setText("Gestionnaire événements");
        jbtGestionEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGestionEventsActionPerformed(evt);
            }
        });

        jButton2.setText("Gestionnaire photos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1323.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtGestionEvents)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSuppr)
                    .addComponent(jbtGestionEvents)
                    .addComponent(jButton2)
                    .addComponent(btInserer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsererActionPerformed
        try {
            VIP vip = new VIP();
            FenetreSaisieVIP laSaisie = new FenetreSaisieVIP(this, vip, csCB, crCB, paysCB);
            if (laSaisie.doModal() == true) {
                leModele.insererVip(vip);
            }
        } catch (Exception e) {
            System.out.println("Exception à l'insertion : " + e.getMessage());
        }
    }//GEN-LAST:event_btInsererActionPerformed

    private void btSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupprActionPerformed
        try {
            int ligne = laTable.getSelectedRow();
            leModele.supprimerVip(ligne);
        } catch (Exception e) {
            System.out.println("Exception à la suppression : " + e.getMessage());
        }
    }//GEN-LAST:event_btSupprActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vraiment sortir ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (reponse == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jbtGestionEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGestionEventsActionPerformed
        try {
            Evenements event = new Evenements();
            FenetreSaisieEvents laSaisie = new FenetreSaisieEvents(this, event ,mvCB1M,mvCB2M,mvCBMar);
            if (laSaisie.doModal() == true) {
                if(event.getType()==-1){
                    System.out.println("div");
                    mvCB1M.addDivorce(event.getIdVip1(),event.getIdVip2(),event.getDateDiv());
                }else if(event.getType()==1){
                    System.out.println("mar");
                    mvCB1M.addMariage(event.getIdVip1(), event.getIdVip2(), event.getDateMar(), event.getLieuMariage());
                }else{
                    System.out.println("fail");
                }
                leModele.updateTable();
            }
        } catch (Exception e) {
            System.out.println("Exception à l'insertion : " + e.getMessage());
        }
    }//GEN-LAST:event_jbtGestionEventsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        Photo laPhoto = new Photo();
        FenetreGestionPhotos gestionPhoto = new FenetreGestionPhotos(this,laPhoto,leModelePhoto);
        
          if (gestionPhoto.doModal() == true) {
              
            }
   
    //    System.out.println("Exception gestionnaire photo: "+e.getMessage());
    
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserer;
    private javax.swing.JButton btSuppr;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtGestionEvents;
    private javax.swing.JTable laTable;
    // End of variables declaration//GEN-END:variables
}
