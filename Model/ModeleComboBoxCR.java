package Model;

import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claire et louis
 */

public class ModeleComboBoxCR extends DefaultComboBoxModel<String> {

    private List<String> listeItems;
    private String[] noms = {"Acteur-rice", "Realisateur-trice", "Les Deux"};

    /**
     * Constructeur
     */
    public ModeleComboBoxCR() {
        super();
        listeItems = Arrays.asList(noms);
    }

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
