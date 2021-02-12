/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_bibliotheque;

import java.util.Date;

/**
 *
 * @author nianacoro
 */
public class Ouvrage {

    static void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //tout exemplaire correspond a 1 ouvrage de reference
    private int codeisbn; // code ouvrage
    private String auteur;
    private String titre;
    private Float prix;
    private String resume;
    private String motclefs;

    public Ouvrage(int codeisbn, String auteur, String titre, Float prix, String resume, String motclefs) {
        this.codeisbn = codeisbn;
        this.auteur = auteur;
        this.titre = titre;
        this.prix = prix;
        this.resume = resume;
        this.motclefs = motclefs;
    }

    
    
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getMotclefs() {
        return motclefs;
    }

    public void setMotclefs(String motclefs) {
        this.motclefs = motclefs;
    }
    
    
    
    
}
