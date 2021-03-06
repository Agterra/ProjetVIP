/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Real;
import Metier.VIP;
import javax.swing.JOptionPane;
import Model.ModeleComboBoxFilm;
import Model.ModeleComboBoxVIPReal;

/**
 *
 * @author Claire et louis
 */
public class FenetreReal extends javax.swing.JDialog {

    private Real real;
    private boolean etatSortie;
    private ModeleComboBoxFilm modeleComboBoxFilms;
    private ModeleComboBoxVIPReal modeleComboBoxRealisateur;
    private String nomFilm;
    private int visaFilm;

    /**
     * Constructeur
     *
     * @param parent
     * @param real
     * @param nomFilm
     * @param visaFilm
     * @param modeleComboBoxFilms
     * @param modeleComboBoxRealisateur
     */
    public FenetreReal(javax.swing.JDialog parent, Real real, String nomFilm, int visaFilm, ModeleComboBoxFilm modeleComboBoxFilms, ModeleComboBoxVIPReal modeleComboBoxRealisateur) {
        super(parent, true);
        this.real = real;
        etatSortie = false;
        this.modeleComboBoxRealisateur = modeleComboBoxRealisateur;
        this.modeleComboBoxFilms = modeleComboBoxFilms;
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
        setTitle("Saisie du réalisateur");

        jlbNomVIP.setText("Film");

        jlbPrenomVIP.setText("Réalisateur");

        jbtnSoumettre.setText("Ajouter Réalisatieur");
        jbtnSoumettre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSoumettreActionPerformed(evt);
            }
        });

        jcbReal.setModel(modeleComboBoxRealisateur);

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
            //verrifie que les champs sont rempli et attribution du contenu dans l'oject Real
            real.setNumVisa(visaFilm);
            if (jcbReal.getSelectedItem().toString().isEmpty()) {
                throw new Exception("realisateur");
            }
            real.setIdVip(((VIP) jcbReal.getSelectedItem()).getIdVip());
            etatSortie = true;
            modeleComboBoxRealisateur.setSelectedItem(null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur gestion réal: " + e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jbtnSoumettreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        etatSortie = true;
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     *
     * @return
     */
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
