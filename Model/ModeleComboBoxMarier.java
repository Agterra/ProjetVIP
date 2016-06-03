package Model;

import AccesDonnees.DaoEvent;
import AccesDonnees.DaoVIP;
import Metier.Evenements;
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
public class ModeleComboBoxMarier extends DefaultComboBoxModel<Evenements> {

    private List<Evenements> listeItems;
    private String[] noms ;
    private DaoEvent daoEvent;
    private DaoVIP daoVip;

    public ModeleComboBoxMarier(DaoEvent daoEv,DaoVIP daoVip) throws Exception {
        super();
        //pour test
        listeItems=daoEv.SelectMarier();
       
    }
   

    @Override
    public void addElement(Evenements uneChaine) {
        super.addElement(uneChaine);
    }

    @Override
    public Evenements getElementAt(int i) {
        return listeItems.get(i);
    }

    @Override
    public int getSize() {
        return listeItems.size();
    }
    public void addMariage(int numVip1, int numVip2, Date dateMariage, String lieuMariage)throws Exception{
        
        daoEvent.addMariage(numVip1, numVip2, dateMariage, lieuMariage);
        
    }
    

}

