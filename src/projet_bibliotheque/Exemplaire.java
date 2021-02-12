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
public class Exemplaire {
    private int codeBarreExemplaire; // code barre de l'exemplaire
    private Date  acquisition; // date de l'acquisition de l'exemaplaire
    private Date  datefin; // date de fin de vie de l'exemplaire
    
    //constuctueur
    public Exemplaire(int codeBarreExemplaire, Date acquisition , Date datefin){
        this.codeBarreExemplaire = codeBarreExemplaire;
        this.acquisition = acquisition;
        this.datefin = datefin;
    }
    public int getCodebarre() {
        return this.codeBarreExemplaire;
    }

    public Date getAcquisition() {
        return acquisition;
    }

    public Date getDuree() {
        return datefin;
    }
    
    
    

    
}
