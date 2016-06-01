/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import AccesDonnees.DaoPhoto;
import Metier.Photo;
import java.sql.SQLException;

/**
 *
 * @author Louis
 */
public class ModeleJTablePhotos extends AbstractTableModel {

    private List<Photo> leConteneur;
    private String[] titre;
    private DaoPhoto daoPhoto;

    public ModeleJTablePhotos(DaoPhoto daoPhoto) {
        this.leConteneur = new ArrayList<>();
        this.titre = new String[]{"idVip","idPhoto","datePhoto","lieu","lien"};
        this.daoPhoto = daoPhoto;
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Photo laPhoto = leConteneur.get(row);
            if (column == 0) {
            return laPhoto.getIdVip();
        }else if (column == 1){
            return laPhoto.getIdPhoto();
        }else if (column == 2){
            return laPhoto.getLaDate();
        }else if (column == 3){
            return laPhoto.getLieu();
        }else{
            return laPhoto.getLien();
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return titre[column];
    }
    
     public void insererPhoto(Photo laPhoto) throws Exception {
        daoPhoto.insererPhoto(laPhoto);
        leConteneur.add(laPhoto);
        this.fireTableDataChanged();
    }

    public void supprimerPhoto(int ligne) throws Exception {
        String idPhoto = getValueAt(ligne, 1).toString();
        daoPhoto.supprimerPhoto(idPhoto);
        leConteneur.remove(ligne);
        this.fireTableDataChanged();
    }

    public void lireLesPhotos() throws Exception {
        daoPhoto.lireLesPhotos(leConteneur);
        fireTableDataChanged();  // notification de modification des données à la vue
    }
}
