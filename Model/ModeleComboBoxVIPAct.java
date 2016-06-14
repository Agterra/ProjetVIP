package Model;

import AccesDonnees.DaoVIP;
import Metier.VIP;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ModeleComboBoxVIPAct extends DefaultComboBoxModel<VIP> {

    private List<VIP> listeItems;
    private String[] listeNoms;
    private DaoVIP daoVip;

    /**
     * Constructeur
     *
     * @param daoVIP
     * @throws Exception
     */
    public ModeleComboBoxVIPAct(DaoVIP daoVIP) throws Exception {
        super();

        this.daoVip = daoVIP;
        listeItems = daoVip.SelectVIPACteur();
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
     * met ajour la combo box
     *
     * @throws Exception
     */
    public void majBox() throws Exception {
        this.listeItems.clear();
        this.listeItems = daoVip.SelectVIPACteur();
    }

}
