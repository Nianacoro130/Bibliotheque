/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_bibliotheque;

/**
 *
 * @author svenm
 */
public class Emprunteur {
    
    private int codeBarre;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    
    
    public Emprunteur(int pCodeBarre,String pNom, String pPrenom, String pAdresse, String pEmail){
        
        this.codeBarre = pCodeBarre;
        this.nom = pNom;
        this.prenom = pPrenom;
        this.adresse = pAdresse;
        this.email = pEmail;
 
    }
    
    
    public int getCodeBarre(){
        return this.codeBarre;
    }
    public void setCodeBarre(int pCodeBarre){
        this.codeBarre = pCodeBarre;
    }
    
    
    public String getNom(){
        return this.nom;
    }
    public void setNom(String pNom){
        this.nom = pNom;
    }
    
    
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String pPrenom){
        this.prenom = pPrenom;
    }
    
    
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String pAdresse){
        this.adresse = pAdresse;
    }
    
    
    public String getEmail(){
        return this.email;
    }
    public void setCodeBarre(String pEmail){
        this.email = pEmail;
    }
    

}
