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
public class ClsEleve implements Dao.DaoInterfaceImpl
{
    
    private String idel, nomel, postnomel, prenomel, age, genre, addresse, resp;

    public ClsEleve() {
    }

    public ClsEleve(String idel, String nomel, String postnomel, String prenomel, String age, String genre, String addresse, String resp) {
        this.idel = idel;
        this.nomel = nomel;
        this.postnomel = postnomel;
        this.prenomel = prenomel;
        this.age = age;
        this.genre = genre;
        this.addresse = addresse;
        this.resp = resp;
    }

    public String getIdel() {
        return idel;
    }

    public void setIdel(String idel) {
        this.idel = idel;
    }

    public String getNomel() {
        return nomel;
    }

    public void setNomel(String nomel) {
        this.nomel = nomel;
    }

    public String getPostnomel() {
        return postnomel;
    }

    public void setPostnomel(String postnomel) {
        this.postnomel = postnomel;
    }

    public String getPrenomel() {
        return prenomel;
    }

    public void setPrenomel(String prenomel) {
        this.prenomel = prenomel;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
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
        Dao.ClsUpdate.Delete("eleve", getIdel());
    }

}
