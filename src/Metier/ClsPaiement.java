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
public class ClsPaiement implements Dao.DaoInterfaceImpl
{
    
    private String idpaie, detail;

    public ClsPaiement() {
    }

    public ClsPaiement(String idpaie, String detail) {
        this.idpaie = idpaie;
        this.detail = detail;
    }

    public String getIdpaie() {
        return idpaie;
    }

    public void setIdpaie(String idpaie) {
        this.idpaie = idpaie;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean Enregistrer() throws Exception 
    {
          return Dao.ClsUpdate.Enregistrement(this);
    }

    @Override
    public boolean Modifier() throws Exception
    {
        return  Dao.ClsUpdate.Modifier(this);
    }

    @Override
    public void Delete() throws Exception
    {
        Dao.ClsUpdate.Delete("paiement", getIdpaie());
    }
    
}
