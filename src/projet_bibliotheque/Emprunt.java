/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_bibliotheque;

import java.util.Date;

/**
 *
 * @author svenm
 */
public class Emprunt {
    
    private int codeBarreExemplaire;
    private int codeBarreEmprunteur;
    private Date dateRetourMax;
    private Date dateRetour;
    private int idEmprunt;

    
    
    public Emprunt(int pCodeBarreExemplaire,int pCodeBarreEmprunteur, Date pDateRetourMax, Date pDateRetour, int pIdEmprunt){
        
        this.codeBarreExemplaire = pCodeBarreExemplaire;
        this.codeBarreEmprunteur = pCodeBarreEmprunteur;
        this.dateRetourMax = pDateRetourMax;
        this.dateRetour = pDateRetour;
        this.idEmprunt = pIdEmprunt;
 
    }
    
    
    public int getCodeBarreExemplaire(){
        return this.codeBarreExemplaire;
    }
    public void setCodeBarreExemplaire(int pCodeBarreExemplaire){
        this.codeBarreExemplaire = pCodeBarreExemplaire;
    }
    
    
    public int getCodeBarreEmprunteur(){
        return this.codeBarreEmprunteur;
    }
    public void setCodeBarreEmprunteur(int pCodeBarreEmprunteur){
        this.codeBarreEmprunteur = pCodeBarreEmprunteur;
    }
    
    
    public Date getDateRetourMax(){
        return this.dateRetourMax;
    }
    public void setDateRetourMax(Date pDateRetourMax){
        this.dateRetourMax = pDateRetourMax;
    }
    
    
     public Date getDateRetour(){
        return this.dateRetour;
    }
    public void setDateRetour(Date pDateRetour){
        this.dateRetour = pDateRetour;
    }
    
    
    public int getIdEmprunt(){
        return this.idEmprunt;
    }
    public void setIdEmprunt(int pIdEmprunt){
        this.idEmprunt = pIdEmprunt;
    }
    
}
