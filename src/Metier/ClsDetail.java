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
public class ClsDetail implements Dao.DaoInterfaceImpl
        
{
    
    private String iddet, dateinsc, annee, inscrit, categorie;

    public ClsDetail() {
    }

    public ClsDetail(String iddet, String dateinsc, String annee, String inscrit, String categorie) {
        this.iddet = iddet;
        this.dateinsc = dateinsc;
        this.annee = annee;
        this.inscrit = inscrit;
        this.categorie = categorie;
    }

    public String getIddet() {
        return iddet;
    }

    public void setIddet(String iddet) {
        this.iddet = iddet;
    }

    public String getDateinsc() {
        return dateinsc;
    }

    public void setDateinsc(String dateinsc) {
        this.dateinsc = dateinsc;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getInscrit() {
        return inscrit;
    }

    public void setInscrit(String inscrit) {
        this.inscrit = inscrit;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
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
        Dao.ClsUpdate.Delete("detail", getIddet());
    }
    
    
}
