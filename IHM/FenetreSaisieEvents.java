/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Evenements;
import Metier.VIP;
import Model.ModeleComboBoxMarier;

import Model.ModeleComboBoxVIP1M;
import Model.ModeleComboBoxVIP2M;
import java.sql.Date;
import javax.swing.JOptionPane;

public class FenetreSaisieEvents extends javax.swing.JDialog {

    private boolean etatSortie;
    private Evenements evenement;

    private ModeleComboBoxVIP1M modeleComboBoxVipUn;
    private ModeleComboBoxVIP2M modeleComboBoxVipDeux;
    private ModeleComboBoxMarier modeleComboBoxMariages;

    /**
     * Constructeur
     *
     * @param parent
     * @param evenement
     * @param modeleComboBoxVipUn
     * @param modeleComboBoxVipDeux
     * @param modeleComboBoxMariages
     */
    public FenetreSaisieEvents(java.awt.Frame parent, Evenements evenement, ModeleComboBoxVIP1M modeleComboBoxVipUn, ModeleComboBoxVIP2M modeleComboBoxVipDeux, ModeleComboBoxMarier modeleComboBoxMariages) {
        super(parent, true);
        this.etatSortie = false;
        this.evenement = evenement;

        this.modeleComboBoxVipUn = modeleComboBoxVipUn;
        this.modeleComboBoxVipDeux = modeleComboBoxVipDeux;
        this.modeleComboBoxMariages = modeleComboBoxMariages;

        initComponents();
        //initialisation a l'item null les combobox
        jcbVip1.setSelectedItem(null);
        jcbVip2.setSelectedItem(null);
        jcbVip1M.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpMariage = new javax.swing.JPanel();
        jcbVip1 = new javax.swing.JComboBox();
        jcbVip2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtLieuMariage = new javax.swing.JTextField();
        jbtValiderMariage = new javax.swing.JButton();
        jDateM = new com.toedter.calendar.JDateChooser();
        jpDivorce = new javax.swing.JPanel();
        jcbVip1M = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbnDivorce = new javax.swing.JButton();
        jDateD = new com.toedter.calendar.JDateChooser();
        jlbTitre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcbVip1.setModel(modeleComboBoxVipUn);
        jcbVip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVip1ActionPerformed(evt);
            }
        });

        jcbVip2.setModel(modeleComboBoxVipDeux);
        jcbVip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVip2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Vip 1:");

        jLabel2.setText("Vip 2:");

        jLabel3.setText("Date de mariage:");

        jLabel4.setText("Lieu du mariage:");

        jbtValiderMariage.setText("Valider le mariage");
        jbtValiderMariage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtValiderMariageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMariageLayout = new javax.swing.GroupLayout(jpMariage);
        jpMariage.setLayout(jpMariageLayout);
        jpMariageLayout.setHorizontalGroup(
            jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMariageLayout.createSequentialGroup()
                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMariageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMariageLayout.createSequentialGroup()
                                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpMariageLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbVip1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpMariageLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtxtLieuMariage)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbVip2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMariageLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpMariageLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbtValiderMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMariageLayout.setVerticalGroup(
            jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMariageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbVip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbVip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMariageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jpMariageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtLieuMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtValiderMariage)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mariage", jpMariage);

        jcbVip1M.setModel( modeleComboBoxMariages);
        jcbVip1M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVip1MActionPerformed(evt);
            }
        });

        jLabel9.setText("Vip 1:");

        jLabel11.setText("Date de divorce:");

        jbnDivorce.setText("Valider le divorce");
        jbnDivorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnDivorceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDivorceLayout = new javax.swing.GroupLayout(jpDivorce);
        jpDivorce.setLayout(jpDivorceLayout);
        jpDivorceLayout.setHorizontalGroup(
            jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDivorceLayout.createSequentialGroup()
                .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDivorceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDivorceLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbVip1M, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDivorceLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jDateD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpDivorceLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbnDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        jpDivorceLayout.setVerticalGroup(
            jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDivorceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbVip1M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jDateD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jbnDivorce)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Divorce", jpDivorce);

        jlbTitre.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jlbTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitre.setText("Gestionnaire d'événements");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtValiderMariageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtValiderMariageActionPerformed
        try {
            //verrifie que les champs sont rempli et attribution du contenu dans l'oject evenements
            if (jcbVip1.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 1 vide!");
            }
            int idVip1 = ((VIP) jcbVip1.getSelectedItem()).getIdVip();
            if (jcbVip2.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 2 vide!");
            }
            int idVip2 = ((VIP) jcbVip2.getSelectedItem()).getIdVip();
            if (jDateM.getDate() == null) {
                throw new Exception("Champs Date Mariage vide!");
            }
            Date dateMariage = new java.sql.Date(jDateM.getDate().getTime());
            if (jtxtLieuMariage.getText().isEmpty()) {
                throw new Exception("Champs Lieu Mariage");
            }
            String lieuMariage = jtxtLieuMariage.getText();

            System.out.println(idVip1 + " " + idVip2);
            evenement.setIdVip1(idVip1);
            evenement.setIdVip2(idVip2);
            evenement.setDateMar(dateMariage);
            evenement.setLieuMariage(lieuMariage);
            evenement.setType(1);
            etatSortie = true;

            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur Marriage: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtValiderMariageActionPerformed

    private void jcbVip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVip1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVip1ActionPerformed

    private void jbnDivorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnDivorceActionPerformed
        try {
            //verrifie que les champs sont rempli et attribution du contenu dans l'oject evenements
            if (jcbVip1M.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 1 vide!");
            }
            Evenements eve = ((Evenements) jcbVip1M.getSelectedItem());

            if (jDateD.getDate() == null) {
                throw new Exception("Champs Date Mariage vide!");
            }
            Date dateDivorce = new java.sql.Date(jDateD.getDate().getTime());

            evenement.setIdVip1(eve.getIdVip1());
            evenement.setIdVip2(eve.getIdVip2());
            evenement.setDateMar(eve.getDateMar());
            evenement.setDateDiv(dateDivorce);
            evenement.setType(-1);
            etatSortie = true;

            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur Divorce: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbnDivorceActionPerformed

    private void jcbVip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVip2ActionPerformed

    private void jcbVip1MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVip1MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVip1MActionPerformed

    /**
     * gestion modal
     *
     * @return
     */
    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateD;
    private com.toedter.calendar.JDateChooser jDateM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbnDivorce;
    private javax.swing.JButton jbtValiderMariage;
    private javax.swing.JComboBox jcbVip1;
    private javax.swing.JComboBox jcbVip1M;
    private javax.swing.JComboBox jcbVip2;
    private javax.swing.JLabel jlbTitre;
    private javax.swing.JPanel jpDivorce;
    private javax.swing.JPanel jpMariage;
    private javax.swing.JTextField jtxtLieuMariage;
    // End of variables declaration//GEN-END:variables
}
