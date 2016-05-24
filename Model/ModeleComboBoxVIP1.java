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
public class ModeleComboBoxVIP1 extends DefaultComboBoxModel<String> {

    private List<String> listeItems;
    private String[] listeNoms ;
    private DaoEvent daoEvent;

    public ModeleComboBoxVIP1(DaoVIP daoVIP) throws Exception {
        super();
        //pour test
        listeItems=daoVIP.SelectVIP(); 
    }
    public ModeleComboBoxVIP1(DaoVIP daoVIP,DaoEvent daoEvent)throws Exception{
        super();
        //pour test
        listeItems=daoVIP.SelectVIP();
        this.daoEvent=daoEvent;
        for(String nom : listeItems){
            System.out.println(nom);
        }
    }

    @Override
    public void addElement(String uneChaine) {
        super.addElement(uneChaine);
    }

    @Override
    public String getElementAt(int i) {
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


