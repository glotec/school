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
public class ClsResponsable implements Dao.DaoInterfaceImpl
{
 
    private String idresp, nomresp, postnomresp, prenomresp, genre, relation;
    private int tel;

    public ClsResponsable() {
    }

    public ClsResponsable(String idresp, String nomresp, String postnomresp, String prenomresp, 
            String genre, String relation, int tel) 
    {
        this.idresp = idresp;
        this.nomresp = nomresp;
        this.postnomresp = postnomresp;
        this.prenomresp = prenomresp;
        this.genre = genre;
        this.relation = relation;
        this.tel = tel;
    }

    public String getIdresp() {
        return idresp;
    }

    public void setIdresp(String idresp) {
        this.idresp = idresp;
    }

    public String getNomresp() {
        return nomresp;
    }

    public void setNomresp(String nomresp) {
        this.nomresp = nomresp;
    }

    public String getPostnomresp() {
        return postnomresp;
    }

    public void setPostnomresp(String postnomresp) {
        this.postnomresp = postnomresp;
    }

    public String getPrenomresp() {
        return prenomresp;
    }

    public void setPrenomresp(String prenomresp) {
        this.prenomresp = prenomresp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
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
        Dao.ClsUpdate.Delete("responsable", getIdresp());
    }   
    
}
