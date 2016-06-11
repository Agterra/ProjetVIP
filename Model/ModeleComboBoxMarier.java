package Model;

import AccesDonnees.DaoEvent;
import Metier.Evenements;
import java.sql.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ModeleComboBoxMarier extends DefaultComboBoxModel<Evenements> {

    private List<Evenements> listeItems;
    private String[] noms ;
    private DaoEvent daoEvent;
   // 

    public ModeleComboBoxMarier(DaoEvent daoEv) throws Exception {
        super();
        //pour test
        daoEvent=daoEv;
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