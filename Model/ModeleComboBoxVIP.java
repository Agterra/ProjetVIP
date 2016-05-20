package Model;

import AccesDonnees.DaoVIP;
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
public class ModeleComboBoxVIP extends DefaultComboBoxModel<String> {

    private List<String> listeItems;
    private String[] noms ;
   // private DaoPays daoPays;

    public ModeleComboBoxVIP(DaoVIP daoVIP) throws Exception {
        super();
        //pour test
        listeItems=daoVIP.SelectVIP();
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
    
    

}


