/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Claire
 */
public class Genre {
    private String libelle;

    /**
     *Constructeur
     */
    public Genre() {
    }

    /**
     *Constructeur
     * @param libelle
     */
    public Genre(String libelle) {
        this.libelle = libelle;
    }

    /**
     *
     * @return
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
