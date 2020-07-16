/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gloire
 */
public class DbConnect
{
    public static Connection con;
    static String url = "jdbc:postgresql://localhost:5432/scolaritedb";
    static String user = "glotec";
    static String pasword = "glotec";
    
    public static Connection DbConnecter() throws ClassNotFoundException, SQLException
    {
         Class.forName("org.postgresql.Driver");
        return con = DriverManager.getConnection(url, user, pasword);
                     
    }
    
    public static void Deconnter() throws ClassNotFoundException, SQLException
    {
        if (!(con == null))
        {
            con.close();
        }
    }
}
