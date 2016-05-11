/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import ProjetVIP.Metier.VIP;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Louis
 */
public class FenetreSaisie extends javax.swing.JDialog {

    private VIP vip;
    private boolean etatSortie;
    
    public FenetreSaisie(java.awt.Frame parent, VIP vip) {
        super(parent, true);
        this.vip=vip;
        etatSortie=false;
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

        jlbNumVIP = new javax.swing.JLabel();
        jlbNomVIP = new javax.swing.JLabel();
        jlbPrenomVIP = new javax.swing.JLabel();
        jlbCivVIP = new javax.swing.JLabel();
        jlbDateNaiss = new javax.swing.JLabel();
        jlbLieuNaiss = new javax.swing.JLabel();
        jlbCodeRole = new javax.swing.JLabel();
        jlbPaysVIP = new javax.swing.JLabel();
        jlbCodeStatut = new javax.swing.JLabel();
        txtNumVIP = new javax.swing.JTextField();
        txtNomVIP = new javax.swing.JTextField();
        txtPrenomVIP = new javax.swing.JTextField();
        txtCivVIP = new javax.swing.JTextField();
        txtDateNaiss = new javax.swing.JTextField();
        txtLieuNaiss = new javax.swing.JTextField();
        txtCodeRole = new javax.swing.JTextField();
        txtPaysVIP = new javax.swing.JTextField();
        txtCodeStatut = new javax.swing.JTextField();
        jbtnSoumettre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saisie d'un VIP");

        jlbNumVIP.setText("Numéro VIP");

        jlbNomVIP.setText("Nom VIP");

        jlbPrenomVIP.setText("Prénom VIP");

        jlbCivVIP.setText("Civilité");

        jlbDateNaiss.setText("Date de naissance");

        jlbLieuNaiss.setText("Lieu de naissance");

        jlbCodeRole.setText("Code Rôle (0=réal / 1=acteur)");

        jlbPaysVIP.setText("Pays");

        jlbCodeStatut.setText("Code Statut (-1:divorcé/0:célib/1:marié)");

        jbtnSoumettre.setText("Soumettre");
        jbtnSoumettre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSoumettreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbNumVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbPrenomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCivVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbDateNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbLieuNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbPaysVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCodeRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbCodeStatut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumVIP)
                    .addComponent(txtNomVIP)
                    .addComponent(txtPrenomVIP)
                    .addComponent(txtCivVIP)
                    .addComponent(txtDateNaiss)
                    .addComponent(txtLieuNaiss)
                    .addComponent(txtCodeRole)
                    .addComponent(txtPaysVIP)
                    .addComponent(txtCodeStatut))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jbtnSoumettre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNumVIP)
                    .addComponent(txtNumVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomVIP)
                    .addComponent(txtNomVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPrenomVIP)
                    .addComponent(txtPrenomVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCivVIP)
                    .addComponent(txtCivVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDateNaiss)
                    .addComponent(txtDateNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLieuNaiss)
                    .addComponent(txtLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPaysVIP)
                    .addComponent(txtCodeRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodeRole)
                    .addComponent(txtPaysVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodeStatut)
                    .addComponent(txtCodeStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSoumettre)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSoumettreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSoumettreActionPerformed
        try{
            if(txtCivVIP.getText().isEmpty()){
                throw new Exception("Champ civilité vide!");
            }
            vip.setCivilite(txtCivVIP.getText());
            if(txtCodeRole.getText().isEmpty()){
                throw new Exception("Champ code rôle vide!");
            }
            vip.setCodeRole(txtCodeRole.getText());
            if(txtDateNaiss.getText().isEmpty()){
                throw new Exception("Champ date de naissance vide!");
            }
            vip.setDateNaiss(Date.valueOf(txtDateNaiss.getText()));
            if(txtLieuNaiss.getText().isEmpty()){
                throw new Exception("Champ lieu de naissance vide!");
            }
            vip.setLieuNaiss(txtLieuNaiss.getText());
            if(txtNomVIP.getText().isEmpty()){
                throw new Exception("Champ nom vide!");
            }
            vip.setNomVIP(txtNomVIP.getText());
            if(txtNumVIP.getText().isEmpty()){
                throw new Exception("Champ numéro vide!");
            }
            vip.setIdVip(Integer.parseInt(txtNumVIP.getText()));
            if(txtPaysVIP.getText().isEmpty()){
                throw new Exception("Champ pays vide!");
            }
            vip.setNomPays(txtPaysVIP.getText());
            if(txtPrenomVIP.getText().isEmpty()){
                throw new Exception("Champ prénom vide!");
            }
            vip.setPrenomVip(txtPrenomVIP.getText());
            if(txtCodeStatut.getText().isEmpty()){
                throw new Exception("Champ code statut vide!");
            }
            vip.setCodeStatut(txtCodeStatut.getText());
            etatSortie=true;
            this.dispose();
            
        }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        
        }
    }//GEN-LAST:event_jbtnSoumettreActionPerformed

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnSoumettre;
    private javax.swing.JLabel jlbCivVIP;
    private javax.swing.JLabel jlbCodeRole;
    private javax.swing.JLabel jlbCodeStatut;
    private javax.swing.JLabel jlbDateNaiss;
    private javax.swing.JLabel jlbLieuNaiss;
    private javax.swing.JLabel jlbNomVIP;
    private javax.swing.JLabel jlbNumVIP;
    private javax.swing.JLabel jlbPaysVIP;
    private javax.swing.JLabel jlbPrenomVIP;
    private javax.swing.JTextField txtCivVIP;
    private javax.swing.JTextField txtCodeRole;
    private javax.swing.JTextField txtCodeStatut;
    private javax.swing.JTextField txtDateNaiss;
    private javax.swing.JTextField txtLieuNaiss;
    private javax.swing.JTextField txtNomVIP;
    private javax.swing.JTextField txtNumVIP;
    private javax.swing.JTextField txtPaysVIP;
    private javax.swing.JTextField txtPrenomVIP;
    // End of variables declaration//GEN-END:variables
}
