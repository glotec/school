/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author gloire
 */
public interface DaoInterfaceImpl 
{
    
    public boolean Enregistrer() throws Exception;
    public boolean Modifier() throws Exception;
    public void Delete() throws Exception;
    
}
