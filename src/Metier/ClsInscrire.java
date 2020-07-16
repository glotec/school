/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author gloire
 */
public class ClsInscrire implements Dao.DaoInterfaceImpl
{
    
    private String idinsc, eleve;

    public ClsInscrire() {
    }

    public ClsInscrire(String idinsc, String eleve) {
        this.idinsc = idinsc;
        this.eleve = eleve;
    }

    public String getIdinsc() {
        return idinsc;
    }

    public void setIdinsc(String idinsc) {
        this.idinsc = idinsc;
    }

    public String getEleve() {
        return eleve;
    }

    public void setEleve(String eleve) {
        this.eleve = eleve;
    }

    @Override
    public boolean Enregistrer() throws Exception 
    {
        return Dao.ClsUpdate.Enregistrement(this);
    }

    @Override
    public boolean Modifier() throws Exception
    {
        return Dao.ClsUpdate.Modifier(this);
    }

    @Override
    public void Delete() throws Exception 
    {
        Dao.ClsUpdate.Delete("iscrire", getIdinsc());
    }
    
    
}
