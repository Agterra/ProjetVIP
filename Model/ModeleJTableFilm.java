/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import AccesDonnees.DaoFilm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import AccesDonnees.DaoPhoto;
import Metier.Film;
import Metier.Photo;
import java.sql.SQLException;

/**
 *
 * @author Louis
 */
public class ModeleJTableFilm extends AbstractTableModel {

    private List<Film> leConteneur;
    private String[] titre;
    private DaoFilm daoFilm;

    public ModeleJTableFilm(DaoFilm daoFilm) {
        this.leConteneur = new ArrayList<>();
        this.titre = new String[]{"Visa","Titre","Annee","Genre"};
        this.daoFilm = daoFilm;
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Film leFilm = leConteneur.get(row);
            if (column == 0) {
            return leFilm.getVisa();
        }else if (column == 1){
            return leFilm.getTitre();
        }else if (column == 2){
            return leFilm.getAnnee();
        }else {
            return leFilm.getGenre();
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return titre[column];
    }
    
     public void insererFilm(Film laFilm) throws Exception {
        daoFilm.insererFilm(laFilm);
        leConteneur.add(laFilm);
        this.fireTableDataChanged();
    }

    public void supprimerFilm(int ligne) throws Exception {
        int Visa = Integer.parseInt(getValueAt(ligne, 0).toString());
        daoFilm.supprimerFilm(Visa);
        leConteneur.remove(ligne);
        this.fireTableDataChanged();
    }

    public void lireLesFilm() throws Exception {
        leConteneur=daoFilm.SelectFilm();
        fireTableDataChanged();  // notification de modification des données à la vue
    }
}
