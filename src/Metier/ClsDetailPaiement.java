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
public class ClsDetailPaiement implements Dao.DaoInterfaceImpl
{
    
    private String iddetail, datepaie, typepaie, paiement;
    private int montant;

    public ClsDetailPaiement() {
    }

    public ClsDetailPaiement(String iddetail, String datepaie, String typepaie, String paiement, int montant) {
        this.iddetail = iddetail;
        this.datepaie = datepaie;
        this.typepaie = typepaie;
        this.paiement = paiement;
        this.montant = montant;
    }

    public String getIddetail() {
        return iddetail;
    }

    public void setIddetail(String iddetail) {
        this.iddetail = iddetail;
    }

    public String getDatepaie() {
        return datepaie;
    }

    public void setDatepaie(String datepaie) {
        this.datepaie = datepaie;
    }

    public String getTypepaie() {
        return typepaie;
    }

    public void setTypepaie(String typepaie) {
        this.typepaie = typepaie;
    }

    public String getPaiement() {
        return paiement;
    }

    public void setPaiement(String paiement) {
        this.paiement = paiement;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
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
        Dao.ClsUpdate.Delete("detailpaiement", getIddetail());
    }
    
    
}
