package Model;

import AccesDonnees.DaoEvent;
import AccesDonnees.DaoVIP;
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
public class ModeleComboBoxVIP1M extends DefaultComboBoxModel<VIP> {

    private List<VIP> listeItems;
    private String[] listeNoms ;
    private DaoEvent daoEvent;

    public ModeleComboBoxVIP1M(DaoVIP daoVIP) throws Exception {
        super();
        //pour test
        listeItems=daoVIP.SelectVIPNM(); 
    }
    public ModeleComboBoxVIP1M(DaoVIP daoVIP,DaoEvent daoEvent)throws Exception{
        super();
        //pour test
        listeItems=daoVIP.SelectVIPNM();
        this.daoEvent=daoEvent;
        
    }

    @Override
    public void addElement(VIP uneChaine) {
        super.addElement(uneChaine);
    }

    @Override
    public VIP getElementAt(int i) {
        return listeItems.get(i);
    }

    @Override
    public int getSize() {
        return listeItems.size();
    }
    
    public void addMariage(int numVip1, int numVip2, Date dateMariage, String lieuMariage)throws Exception{
        
        daoEvent.addMariage(numVip1, numVip2, dateMariage, lieuMariage);
        
    }
    
    public void addDivorce(int numVip1, int numVip2, Date dateDivorce) throws Exception{
        daoEvent.addDivorce(numVip1, numVip2, dateDivorce);
    }
    
    

}


