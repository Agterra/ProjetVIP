package Model;

import AccesDonnees.DaoEvent;
import AccesDonnees.DaoVIP;
import Metier.VIP;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ModeleComboBoxVIPReal extends DefaultComboBoxModel<VIP> {

    private List<VIP> listeItems;
    private String[] listeNoms;
    private DaoEvent daoEvent;
    private DaoVIP daoVip;

    /**
     * Constructeur
     *
     * @param daoVIP
     * @throws Exception
     */
    public ModeleComboBoxVIPReal(DaoVIP daoVIP) throws Exception {
        super();

        this.daoVip = daoVIP;
        listeItems = daoVip.SelectVIPReal();
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

    /**
     * met a jour la combobox
     *
     * @throws Exception
     */
    public void majBox() throws Exception {
        this.listeItems.clear();
        this.listeItems = daoVip.SelectVIPReal();
    }

}
