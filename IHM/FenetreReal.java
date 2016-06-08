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
    
  
    
    public FenetreReal(javax.swing.JDialog parent, Real real,ModeleComboBoxFilm CBf,ModeleComboBoxVIPReal CBv) {
        super(parent, true);
        this.real=real;
        etatSortie=false;
        this.CBv=CBv;
        this.CBf=CBf;

      
        
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
        jbtnSoumettre = new javax.swing.JButton();
        jcbFilm = new javax.swing.JComboBox();
        jcbReal = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saisie d'un VIP");

        jlbNomVIP.setText("Film");

        jlbPrenomVIP.setText("Realisateur");

        jbtnSoumettre.setText("Soumettre");
        jbtnSoumettre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSoumettreActionPerformed(evt);
            }
        });

        jcbFilm.setModel(CBf    );

        jcbReal.setModel(CBv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbFilm, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNomVIP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbPrenomVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jcbReal, 0, 192, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jbtnSoumettre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomVIP)
                    .addComponent(jlbPrenomVIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnSoumettre)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSoumettreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSoumettreActionPerformed
        try{
            
            if(jcbFilm.getSelectedItem().toString().isEmpty()){
                throw new Exception("Champ film vide!");
            }
            real.setNumVisa(((Film)jcbFilm.getSelectedItem()).getVisa());
            if(jcbReal.getSelectedItem().toString().isEmpty()){
                throw new Exception("acteur");
            }
            real.setIdVip(((VIP)jcbReal.getSelectedItem()).getIdVip());
           
            etatSortie=true;
            this.dispose();
            
        }catch(Exception e){
                    JOptionPane.showMessageDialog(this,"a"+ e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        
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
    private javax.swing.JComboBox jcbFilm;
    private javax.swing.JComboBox jcbReal;
    private javax.swing.JLabel jlbNomVIP;
    private javax.swing.JLabel jlbPrenomVIP;
    // End of variables declaration//GEN-END:variables
}