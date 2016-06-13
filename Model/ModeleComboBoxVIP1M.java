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


public class ModeleComboBoxVIP1M extends DefaultComboBoxModel<VIP> {

    private List<VIP> listeItems;
    private String[] listeNoms ;
    private DaoEvent daoEvent;
      private DaoVIP daoVip;
   
    /**
     *Constructeur
     * @param daoVIP
     * @param daoEvent
     * @throws Exception
     */
    public ModeleComboBoxVIP1M(DaoVIP daoVIP,DaoEvent daoEvent)throws Exception{
        super();
        //pour test
        
        this.daoEvent=daoEvent;
        this.daoVip=daoVIP;
        listeItems=daoVip.SelectVIPNM();
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
     *appel add mariage du dao
     * @param numVip1
     * @param numVip2
     * @param dateMariage
     * @param lieuMariage
     * @throws Exception
     */
    public void addMariage(int numVip1, int numVip2, Date dateMariage, String lieuMariage)throws Exception{
        
        daoEvent.addMariage(numVip1, numVip2, dateMariage, lieuMariage);
        
    }
    
    /**
     * appel add divorce du dao
     * @param numVip1
     * @param numVip2
     * @param dateDivorce
     * @param dateMar
     * @throws Exception
     */
    public void addDivorce(int numVip1, int numVip2, Date dateDivorce, Date dateMar) throws Exception{
        daoEvent.addDivorce(numVip1, numVip2, dateDivorce,dateMar);
    }
    
    /**
     *met a jour la combox box
     * @throws Exception
     */
    public void majBox()throws Exception{
        this.listeItems.clear();
        this.listeItems=daoVip.SelectVIPNM();
    }
    

}


