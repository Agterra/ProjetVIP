package Model;

import AccesDonnees.DaoEvent;
import AccesDonnees.DaoFilm;
import AccesDonnees.DaoVIP;
import Metier.Evenements;
import Metier.Film;
import Metier.VIP;
import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claire
 */
public class ModeleComboBoxGenre extends DefaultComboBoxModel<Film> {

    private List<Film> listeItems;
    private String[] noms ;
<<<<<<< HEAD:Model/ModeleComboBoxGenre.java
    private DaoFilm daoFilm;
   // 

    public ModeleComboBoxGenre(DaoFilm daof) throws Exception {
        super();
        //pour test
        daoFilm=daof;
        listeItems=daof.SelectFilm();
=======
    private DaoEvent daoEvent;
    private DaoVIP daoVip;

    public ModeleComboBoxMarier(DaoEvent daoEv,DaoVIP daoVip) throws Exception {
        super();
        //pour test
        listeItems=daoEv.SelectMarier();
>>>>>>> parent of 1f3c026... commit mariage marche:Model/ModeleComboBoxMarier.java
       
    }
   

    @Override
    public void addElement(Film uneChaine) {
        super.addElement(uneChaine);
    }

    @Override
    public Film getElementAt(int i) {
        return listeItems.get(i);
    }

    @Override
    public int getSize() {
        return listeItems.size();
    }
<<<<<<< HEAD:Model/ModeleComboBoxGenre.java
   
     
=======
    public void addMariage(int numVip1, int numVip2, Date dateMariage, String lieuMariage)throws Exception{
        
        daoEvent.addMariage(numVip1, numVip2, dateMariage, lieuMariage);
        
    }
>>>>>>> parent of 1f3c026... commit mariage marche:Model/ModeleComboBoxMarier.java
    

}


