/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;


public class Pays {
    private String nom;

    /**
     *Constructeur
     * @param nom
     */
    public Pays(String nom) {
        this.nom = nom;
    }

    /**
     *Constructeur
     */
    public Pays() {
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
