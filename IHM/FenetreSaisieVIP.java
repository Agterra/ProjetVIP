/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.VIP;
import javax.swing.JOptionPane;
import Model.ModeleComboBoxCR;
import Model.ModeleComboBoxCS;
import Model.ModeleComboBoxPays;



public class FenetreSaisieVIP extends javax.swing.JDialog {
    private VIP vip;
    private boolean etatSortie;
    private ModeleComboBoxCS csCB;
    private ModeleComboBoxCR crCB;
    private ModeleComboBoxPays paysCB;
  
    
    public FenetreSaisieVIP(java.awt.Frame parent, VIP vip,ModeleComboBoxCS csCB,ModeleComboBoxCR crCB,ModeleComboBoxPays paysCB) {
        super(parent, true);
        this.vip=vip;
        etatSortie=false;
        this.crCB=crCB;
        this.csCB=csCB;
        this.paysCB=paysCB;
      
        
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

        jlbNomVIP = new javax.swing.JLabel();
        jlbPrenomVIP = new javax.swing.JLabel();
        jlbCivVIP = new javax.swing.JLabel();
        jlbDateNaiss = new javax.swing.JLabel();
        jlbLieuNaiss = new javax.swing.JLabel();
        jlbCodeRole = new javax.swing.JLabel();
        jlbPaysVIP = new javax.swing.JLabel();
        jlbCodeStatut = new javax.swing.JLabel();
        txtNomVIP = new javax.swing.JTextField();
        txtPrenomVIP = new javax.swing.JTextField();
        txtCivVIP = new javax.swing.JTextField();
        txtLieuNaiss = new javax.swing.JTextField();
        jbtnSoumettre = new javax.swing.JButton();
        jcbCodeRole = new javax.swing.JComboBox();
        jcbCodeStatut = new javax.swing.JComboBox();
        jcbPays = new javax.swing.JComboBox();
        jDateN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saisie d'un VIP");

        jlbNomVIP.setText("Nom VIP :");

        jlbPrenomVIP.setText("Prénom VIP :");

        jlbCivVIP.setText("Civilité :");

        jlbDateNaiss.setText("Date de naissance :");

        jlbLieuNaiss.setText("Lieu de naissance :");

        jlbCodeRole.setText("Rôle :");

        jlbPaysVIP.setText("Pays :");

        jlbCodeStatut.setText("Statut :");

        jbtnSoumettre.setText("Soumettre");
        jbtnSoumettre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSoumettreActionPerformed(evt);
            }
        });

        jcbCodeRole.setModel(crCB);

        jcbCodeStatut.setModel(csCB);

        jcbPays.setModel(paysCB);
        jcbPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbNomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbPrenomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbCivVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbDateNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlbLieuNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addGap(68, 68, 68))
                        .addComponent(jlbPaysVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbCodeRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlbCodeStatut, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbCodeStatut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomVIP)
                    .addComponent(txtPrenomVIP)
                    .addComponent(txtLieuNaiss)
                    .addComponent(jcbCodeRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbPays, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCivVIP)
                    .addComponent(jDateN, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jbtnSoumettre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomVIP)
                    .addComponent(txtNomVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPrenomVIP)
                    .addComponent(txtPrenomVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCivVIP)
                    .addComponent(txtCivVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbDateNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLieuNaiss)
                    .addComponent(txtLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPaysVIP)
                    .addComponent(jcbPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodeRole)
                    .addComponent(jcbCodeRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodeStatut)
                    .addComponent(jcbCodeStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnSoumettre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSoumettreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSoumettreActionPerformed
        try{
            if(txtCivVIP.getText().isEmpty()){
                throw new Exception("Champ civilité vide!");
            }
            vip.setCivilite(txtCivVIP.getText());
            if(jcbCodeRole.getSelectedItem().toString().isEmpty()){
                throw new Exception("Champ code rôle vide!");
            }
            if(jcbCodeRole.getSelectedItem().toString().equalsIgnoreCase("acteur-rice")){
                vip.setCodeRole(1);
            }else if(jcbCodeRole.getSelectedItem().toString().equalsIgnoreCase("Realisateur-trice")){
                vip.setCodeRole(0);
            }else{
                    vip.setCodeRole(2);
            }
           if(jDateN.getDate()==null){
                throw new Exception("Champ date de naissance vide!");
            }
            vip.setDateNaiss(new java.sql.Date(jDateN.getDate().getTime()));
            if(txtLieuNaiss.getText().isEmpty()){
                throw new Exception("Champ lieu de naissance vide!");
            }
            vip.setLieuNaiss(txtLieuNaiss.getText());
            if(txtNomVIP.getText().isEmpty()){
                throw new Exception("Champ nom vide!");
            }
            vip.setNomVIP(txtNomVIP.getText());
            
            if(jcbPays.getSelectedItem().toString().isEmpty()){
                throw new Exception("Champ pays vide!");
            }
            
            vip.setNomPays(jcbPays.getSelectedItem().toString());
            if(txtPrenomVIP.getText().isEmpty()){
                throw new Exception("Champ prénom vide!");
            }
            vip.setPrenomVip(txtPrenomVIP.getText());
            if(jcbCodeStatut.getSelectedItem().toString().isEmpty()){
                throw new Exception("Champ code statut vide!");
            }
           
            
                vip.setCodeStatut(0);
            
           
            etatSortie=true;
            this.dispose();
            
        }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Erreur insertion VIP: "+e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_jbtnSoumettreActionPerformed

    private void jcbPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPaysActionPerformed

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateN;
    private javax.swing.JButton jbtnSoumettre;
    private javax.swing.JComboBox jcbCodeRole;
    private javax.swing.JComboBox jcbCodeStatut;
    private javax.swing.JComboBox jcbPays;
    private javax.swing.JLabel jlbCivVIP;
    private javax.swing.JLabel jlbCodeRole;
    private javax.swing.JLabel jlbCodeStatut;
    private javax.swing.JLabel jlbDateNaiss;
    private javax.swing.JLabel jlbLieuNaiss;
    private javax.swing.JLabel jlbNomVIP;
    private javax.swing.JLabel jlbPaysVIP;
    private javax.swing.JLabel jlbPrenomVIP;
    private javax.swing.JTextField txtCivVIP;
    private javax.swing.JTextField txtLieuNaiss;
    private javax.swing.JTextField txtNomVIP;
    private javax.swing.JTextField txtPrenomVIP;
    // End of variables declaration//GEN-END:variables
}
