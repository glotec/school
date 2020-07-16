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
public class ClsLoggin implements Dao.DaoInterfaceImpl
{
    
    private String id, nomutil, motdepass, typelog;

    public ClsLoggin() {
    }

    public ClsLoggin(String id, String nomutil, String motdepass, String typelog) {
        this.id = id;
        this.nomutil = nomutil;
        this.motdepass = motdepass;
        this.typelog = typelog;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomutil() {
        return nomutil;
    }

    public void setNomutil(String nomutil) {
        this.nomutil = nomutil;
    }

    public String getMotdepass() {
        return motdepass;
    }

    public void setMotdepass(String motdepass) {
        this.motdepass = motdepass;
    }

    public String getTypelog() {
        return typelog;
    }

    public void setTypelog(String typelog) {
        this.typelog = typelog;
    }

    @Override
    public boolean Enregistrer() throws Exception 
    {
        return Dao.ClsUpdate.Enregistrement(id);
    }

    @Override
    public boolean Modifier() throws Exception 
    {
        return Dao.ClsUpdate.Modifier(id);
    }

    @Override
    public void Delete() throws Exception 
    {
        Dao.ClsUpdate.Delete("loggin", getId());
    }    
    
}
