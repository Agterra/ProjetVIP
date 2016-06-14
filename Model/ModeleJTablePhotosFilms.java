/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import AccesDonnees.DaoFilmPhoto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import Metier.PhotoFilm;


public class ModeleJTablePhotosFilms extends AbstractTableModel {

    private List<PhotoFilm> leConteneur;
    private String[] titre;
    private DaoFilmPhoto daoFilmPhoto;

    /**
     *Constructeur
     * @param daoPhoto
     */
    public ModeleJTablePhotosFilms(DaoFilmPhoto daoFilmPhoto) {
        this.leConteneur = new ArrayList<>();
        this.titre = new String[]{"numVisa","lien","nomPhoto"};
        this.daoFilmPhoto = daoFilmPhoto;
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        PhotoFilm laPhoto = leConteneur.get(row);
            if (column == 0) {
            return laPhoto.getNumVisa();
        }else if (column == 1){
            return laPhoto.getLien();          
        }else{
              return laPhoto.getNomPhoto();
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return titre[column];
    }
    
    /**
     *appel inserer du dao
     * @param laPhoto
     * @throws Exception
     */
    public void insererPhoto(PhotoFilm laPhoto) throws Exception {
        daoFilmPhoto.insererPhoto(laPhoto);
        leConteneur.add(laPhoto);
        this.fireTableDataChanged();
    }

    /**
     *appel la supression du dao
     * @param ligne
     * @throws Exception
     */
    public void supprimerPhoto(int ligne) throws Exception {
        String nom = getValueAt(ligne, 2).toString();
        daoFilmPhoto.supprimerPhoto(nom);
        leConteneur.remove(ligne);
        this.fireTableDataChanged();
    }

    /**
     *appel lecture du dao
     * @throws Exception
     */
    public void lireLesPhotos() throws Exception {
        this.leConteneur = new ArrayList<>();
        daoFilmPhoto.lireLesPhotos(leConteneur);
    }
}
