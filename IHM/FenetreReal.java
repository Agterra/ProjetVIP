/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import AccesDonnees.DaoPays;
import Metier.Casting;
import Metier.Film;
import Metier.Real;
import Metier.VIP;
import java.sql.Date;
import javax.swing.JOptionPane;
import Model.ModeleComboBoxCR;
import Model.ModeleComboBoxCS;
import Model.ModeleComboBoxFilm;
import Model.ModeleComboBoxGenre;
import Model.ModeleComboBoxPays;
import Model.ModeleComboBoxVIPAct;
import Model.ModeleComboBoxVIPReal;

/**
 *
 * @author Louis
 */
public class FenetreReal extends javax.swing.JDialog {

    private Real real;
    private boolean etatSortie;
    private ModeleComboBoxFilm CBf;
    private ModeleComboBoxVIPReal CBv;
    private String nomFilm;
    private int visaFilm;

    public FenetreReal(javax.swing.JDialog parent, Real real, String nomFilm, int visaFilm, ModeleComboBoxFilm CBf, ModeleComboBoxVIPReal CBv) {
        super(parent, true);
        this.real = real;
        etatSortie = false;
        this.CBv = CBv;
        this.CBf = CBf;
        this.visaFilm = visaFilm;
        this.nomFilm = nomFilm;

        initComponents();
        
        jlblNomFilm.setText(this.nomFilm);

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
        jbtnSoumettre = new javax.swing.JButton();
        jcbReal = new javax.swing.JComboBox();
        jlblNomFilm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saisie d'un VIP");

        jlbNomVIP.setText("Film");

        jlbPrenomVIP.setText("Réalisateur");

        jbtnSoumettre.setText("Ajouter Réalisatieur");
        jbtnSoumettre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSoumettreActionPerformed(evt);
            }
        });

        jcbReal.setModel(CBv);

        jlblNomFilm.setEditable(false);

        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlbNomVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(jlblNomFilm))
                    .addComponent(jbtnSoumettre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbReal, 0, 192, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbPrenomVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomVIP)
                    .addComponent(jlbPrenomVIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbReal)
                    .addComponent(jlblNomFilm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSoumettre)
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSoumettreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSoumettreActionPerformed
        try {

            real.setNumVisa(visaFilm);
            if (jcbReal.getSelectedItem().toString().isEmpty()) {
                throw new Exception("acteur");
            }
            real.setIdVip(((VIP) jcbReal.getSelectedItem()).getIdVip());
            etatSortie=true;
            this.dispose();
        

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jbtnSoumettreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          etatSortie = true;
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jbtnSoumettre;
    private javax.swing.JComboBox jcbReal;
    private javax.swing.JLabel jlbNomVIP;
    private javax.swing.JLabel jlbPrenomVIP;
    private javax.swing.JTextField jlblNomFilm;
    // End of variables declaration//GEN-END:variables
}
