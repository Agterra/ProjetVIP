/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import AccesDonnees.DaoVIP;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import Metier.VIP;

public class ModelJTableVIP extends AbstractTableModel {
    
    private List<VIP> leConteneur;
    private String[] titre;
    private DaoVIP leDaoVIP;
    
    public ModelJTableVIP(DaoVIP leDaoVIP){
        this.leConteneur = new ArrayList<>();
        this.titre = new String[]{"idVip","nomVIP","prenomVip","civilite","dateNaiss","lieuNaiss","codeRole","codeStatut","nomPays"};
        this.leDaoVIP = leDaoVIP;
    }
    
    @Override
    public int getRowCount(){
        return leConteneur.size();
    }
    
    @Override
     public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int row, int column) {
        VIP leVip = leConteneur.get(row);
        if (column == 0) {
            return leVip.getIdVip();
        }else if (column == 1){
            return leVip.getNomVip();
        }else if (column == 2){
            return leVip.getPrenomVip();
        }else if (column == 3){
            return leVip.getCivilite();
        }else if(column == 4){
            return String.valueOf(leVip.getDateNaiss());
        }else if(column == 5){
            return leVip.getLieuNaiss();
        }else if(column ==6){
            return leVip.getCodeRole();
        }else if(column == 7){
          return leVip.getCodeStatut();  
        }else {
            return leVip.getNomPays();
        }
         
        
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }

    public void insererVip(VIP leVip) throws SQLException {
        leDaoVIP.insererVip(leVip);
        leConteneur.add(leVip);
        this.fireTableDataChanged();
    }

    public void supprimerVip(int ligne) throws SQLException {
        int idVip = (int) getValueAt(ligne, 0);
        leDaoVIP.supprimerVip(idVip);
        leConteneur.remove(ligne);
        this.fireTableDataChanged();
    }

    public void lireLesVip() throws SQLException {
        leDaoVIP.lireLesVip(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }
     public void updateTable() throws SQLException {
         leConteneur.clear();
        leDaoVIP.lireLesVip(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }
}
