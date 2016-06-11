package Model;

import AccesDonnees.DaoGenre;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ModeleComboBoxGenre extends DefaultComboBoxModel<String> {

    private List<String> listeItems;
    private String[] noms ;
    private DaoGenre daoGenre;
   // 

    public ModeleComboBoxGenre(DaoGenre daoGenre) throws Exception {
        super();
        //pour test
        daoGenre=daoGenre;
        listeItems=daoGenre.SelectGenre();
       
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


