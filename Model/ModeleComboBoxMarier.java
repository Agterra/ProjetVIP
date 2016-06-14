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
    private String[] noms;
    private DaoEvent daoEvent;

    /**
     * Constructeur
     *
     * @param daoEv
     * @throws Exception
     */
    public ModeleComboBoxMarier(DaoEvent daoEv) throws Exception {
        super();

        daoEvent = daoEv;
        listeItems = daoEv.SelectMarier();

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

    /**
     * Appel addmariage du dao
     *
     * @param numVip1
     * @param numVip2
     * @param dateMariage
     * @param lieuMariage
     * @throws Exception
     */
    public void addMariage(int numVip1, int numVip2, Date dateMariage, String lieuMariage) throws Exception {

        daoEvent.addMariage(numVip1, numVip2, dateMariage, lieuMariage);

    }

    /**
     * met a jour la combobox
     *
     * @throws Exception
     */
    public void majBox() throws Exception {
        this.listeItems.clear();
        this.listeItems = daoEvent.SelectMarier();
    }
}
