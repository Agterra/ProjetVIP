package Model;

import AccesDonnees.DaoCast;
import AccesDonnees.DaoEvent;
import AccesDonnees.DaoFilm;
import AccesDonnees.DaoReal;
import AccesDonnees.DaoVIP;
import Metier.Casting;
import Metier.Film;
import Metier.Real;
import Metier.VIP;
import java.sql.Date;
import java.sql.SQLException;
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
public class ModeleComboBoxFilm extends DefaultComboBoxModel<Film> {

    private List<Film> listeItems;
    private String[] listeNoms ;
    private DaoCast daoc;
     private DaoReal daor;
      private DaoFilm daof;
   
    public  ModeleComboBoxFilm(DaoFilm daof,DaoCast daoc,DaoReal daor)throws Exception{
        super();
        //pour test
        
        this.daof=daof;
        this.daoc=daoc;
        this.daor=daor;
        listeItems=daof.SelectFilm();
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
    
   public void insererCast(Casting cast) throws SQLException{
       daoc.insertCast(cast.getIdVip(), cast.getNumVisa());
   }
   public void insererReal(Real rel) throws SQLException{
       daor.insertReal(rel.getIdVip(), rel.getNumVisa());
   }
    
    

}


