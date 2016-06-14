package Model;

import AccesDonnees.DaoCast;
import AccesDonnees.DaoFilm;
import AccesDonnees.DaoReal;
import Metier.Casting;
import Metier.Film;
import Metier.Real;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ModeleComboBoxFilm extends DefaultComboBoxModel<Film> {

    private List<Film> listeItems;
    private String[] listeNoms;
    private DaoCast daoCasting;
    private DaoReal daoRealisateur;
    private DaoFilm daoFilm;

    /**
     *
     * @param daoFilm
     * @param daoCasting
     * @param daoRealisateur
     * @throws Exception
     */
    public ModeleComboBoxFilm(DaoFilm daoFilm, DaoCast daoCasting, DaoReal daoRealisateur) throws Exception {
        super();
        //pour test

        this.daoFilm = daoFilm;
        this.daoCasting = daoCasting;
        this.daoRealisateur = daoRealisateur;
        listeItems = daoFilm.SelectFilm();
    }

    @Override
    public void addElement(Film uneChaine) {
        super.addElement(uneChaine);
    }

    @Override
    public Film getElementAt(int i) {
        return listeItems.get(i);
    }

    @Override
    public int getSize() {
        return listeItems.size();
    }

    /**
     * appel insertCast du dao Casting
     *
     * @param cast
     * @throws SQLException
     */
    public void insererCast(Casting cast) throws SQLException {
        daoCasting.insertCast(cast.getIdVip(), cast.getNumVisa());
    }

    /**
     * appel insertRel du dao realise
     *
     * @param rel
     * @throws SQLException
     */
    public void insererReal(Real rel) throws SQLException {
        daoRealisateur.insertReal(rel.getIdVip(), rel.getNumVisa());
    }

    /**
     * appel supprCAst du dao casting
     *
     * @param visa
     * @throws SQLException
     */
    public void supprCast(int visa) throws SQLException {
        daoCasting.supprCasting(visa);
    }

}
