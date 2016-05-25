/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Evenements;
import Model.ModeleComboBoxVIP1;
import Model.ModeleComboBoxVIP2;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Louis
 */
public class FenetreSaisieEvents extends javax.swing.JDialog {

    private boolean etatSortie;
    private Evenements evenement;
    private ModeleComboBoxVIP1 leModeleVip1;
    private ModeleComboBoxVIP2 leModeleVip2;
    
    public FenetreSaisieEvents(java.awt.Frame parent, Evenements evenement, ModeleComboBoxVIP1 leModeleVip1, ModeleComboBoxVIP2 leModeleVip2) {
        super(parent, true);
        this.etatSortie = false;
        this.evenement = evenement;
        this.leModeleVip1 = leModeleVip1;
        this.leModeleVip2 = leModeleVip2;

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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpMariage = new javax.swing.JPanel();
        jcbVip1 = new javax.swing.JComboBox();
        jcbVip2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtDateMariage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtLieuMariage = new javax.swing.JTextField();
        jbtValiderMariage = new javax.swing.JButton();
        jpDivorce = new javax.swing.JPanel();
        jcbVip5 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jcbVip6 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtDateDivorce = new javax.swing.JTextField();
        jbnDivorce = new javax.swing.JButton();
        jlbTitre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jcbVip1.setModel(leModeleVip1);
        jcbVip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVip1ActionPerformed(evt);
            }
        });

        jcbVip2.setModel(leModeleVip2);

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
                        .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpMariageLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbVip1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMariageLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtDateMariage))
                            .addGroup(jpMariageLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtLieuMariage)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbVip2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMariageLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbtValiderMariage, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtDateMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpMariageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtLieuMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtValiderMariage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mariage", jpMariage);

        jcbVip5.setModel(leModeleVip1);

        jLabel9.setText("Vip 1:");

        jcbVip6.setModel(leModeleVip2);

        jLabel10.setText("Vip 2:");

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
                        .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpDivorceLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(20, 20, 20)
                                .addComponent(jtxtDateDivorce))
                            .addGroup(jpDivorceLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbVip5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbVip6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDivorceLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbnDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jpDivorceLayout.setVerticalGroup(
            jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDivorceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbVip5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jcbVip6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jpDivorceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtDateDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jbnDivorce)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Divorce", jpDivorce);

        jlbTitre.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jlbTitre.setText("Gestionnaire d'événements");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtValiderMariageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtValiderMariageActionPerformed
        try {
            if (jcbVip1.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 1 vide!");
            }
            String nomVip1 = jcbVip1.getSelectedItem().toString();
            if (jcbVip2.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 2 vide!");
            }
            String nomVip2 = jcbVip2.getSelectedItem().toString();
            if (jtxtDateMariage.getText().isEmpty()) {
                throw new Exception("Champs Date Mariage vide!");
            }
            Date dateMariage = Date.valueOf(jtxtDateMariage.getText());
            if (jtxtLieuMariage.getText().isEmpty()) {
                throw new Exception("Champs Lieu Mariage");
            }
            String lieuMariage = jtxtLieuMariage.getText();
            
            for(int i =0;i<leModeleVip1.getSize();i++){
                if(leModeleVip1.getElementAt(i).equalsIgnoreCase(nomVip1)){
                    evenement.setIdVip1(i);
                }
            }
            for(int i =0;i<leModeleVip2.getSize();i++){
                if(leModeleVip2.getElementAt(i).equalsIgnoreCase(nomVip2)){
                    evenement.setIdVip2(i);
                }
            }
            
            evenement.setDateMar(dateMariage);
            evenement.setLieuMariage(lieuMariage);
            
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
            if (jcbVip1.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 1 vide!");
            }
            String nomVip1 = jcbVip1.getSelectedItem().toString();
            if (jcbVip2.getSelectedItem().toString().isEmpty()) {
                throw new Exception("Champs Vip 2 vide!");
            }
            String nomVip2 = jcbVip2.getSelectedItem().toString();
            if (jtxtDateDivorce.getText().isEmpty()) {
                throw new Exception("Champs Date Mariage vide!");
            }
            Date dateDivorce = Date.valueOf(jtxtDateDivorce.getText());
            
            for(int i =0;i<leModeleVip1.getSize();i++){
                if(leModeleVip1.getElementAt(i).equalsIgnoreCase(nomVip1)){
                    evenement.setIdVip1(i);
                }
            }
            for(int i =0;i<leModeleVip2.getSize();i++){
                if(leModeleVip2.getElementAt(i).equalsIgnoreCase(nomVip2)){
                    evenement.setIdVip2(i);
                }
            }
            
          
            
            evenement.setDateDiv(dateDivorce);
            
            etatSortie = true;
            
            this.dispose();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Erreur Divorce: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbnDivorceActionPerformed
    
    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbnDivorce;
    private javax.swing.JButton jbtValiderMariage;
    private javax.swing.JComboBox jcbVip1;
    private javax.swing.JComboBox jcbVip2;
    private javax.swing.JComboBox jcbVip5;
    private javax.swing.JComboBox jcbVip6;
    private javax.swing.JLabel jlbTitre;
    private javax.swing.JPanel jpDivorce;
    private javax.swing.JPanel jpMariage;
    private javax.swing.JTextField jtxtDateDivorce;
    private javax.swing.JTextField jtxtDateMariage;
    private javax.swing.JTextField jtxtLieuMariage;
    // End of variables declaration//GEN-END:variables
}
