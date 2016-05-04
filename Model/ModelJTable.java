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
import ProjetVIP.Metier.VIP;

public class ModelJTable extends AbstractTableModel {
    
    private List<VIP> leConteneur;
    private String[] titre;
    private DaoVIP leDaoVIP;
    
    public ModelJTable(DaoVIP leDaoVIP){
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
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        VIP levip = leConteneur.get(row);
        if (column == 0) {
            return levip.getIdVip();
        }else if (column == 1){
            return levip.getNomVIP();
        }else if (column == 2){
            return levip.getPrenomVip();
        }else if (column == 3){
            return levip.getCodeRole();
        }else{
            return levip.getCodeStatut();
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
}
