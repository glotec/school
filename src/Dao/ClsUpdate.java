/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Metier.ClsDetail;
import Metier.ClsDetailPaiement;
import Metier.ClsEleve;
import Metier.ClsInscrire;
import Metier.ClsLoggin;
import Metier.ClsPaiement;
import Metier.ClsResponsable;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gloire
 */
public class ClsUpdate
{

    //PreparedStatement ps;
    public static boolean Enregistrement(Object ob)throws ClassNotFoundException, SQLException
    {
        //New Responsable
        if (ob instanceof ClsResponsable)
        {
            ClsResponsable re = (ClsResponsable)ob;
            try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                        ("INSERT INTO responsable VALUES(?,?,?,?,?,?,?)")) {
                ps.setString(1, re.getIdresp());
                ps.setString(5, re.getGenre());
                ps.setInt(6, re.getTel());
                ps.setString(7, re.getRelation());
                ps.setString(2, re.getNomresp());
                ps.setString(3, re.getPostnomresp());
                ps.setString(4, re.getPrenomresp());
                ps.executeUpdate();
            }
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsEleve)
        {
            ClsEleve el = (ClsEleve)ob;
            try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                        ("INSERT INTO eleve VALUES (?,?,?,?,?,?,?,?)")) {
                ps.setString(1, el.getIdel());
                ps.setString(2, el.getNomel());
                ps.setString(3, el.getPostnomel());
                ps.setString(4, el.getPrenomel());
                ps.setString(5, el.getAge());
                ps.setString(6, el.getGenre());
                ps.setString(7, el.getAddresse());
                ps.setString(8, el.getResp());
                ps.executeUpdate();
            }
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsInscrire)
        {
            ClsInscrire in = (ClsInscrire)ob;
            PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                    ("INSERT INTO inscrire VALUES (?, ?)");
            ps.setString(1, in.getIdinsc());
            ps.setString(2, in.getEleve());
            ps.executeUpdate();
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsDetail)
        {
            ClsDetail de = (ClsDetail)ob;
            try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                        ("INSERT INTO detail VALUES (?,?,?,?,?)")) {
                ps.setString(1, de.getIddet());
                ps.setString(2, de.getDateinsc());
                ps.setString(3, de.getAnnee());
                ps.setString(4, de.getInscrit());
                ps.setString(5, de.getCategorie());
                ps.executeUpdate();
            }
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsDetailPaiement)
        {
            ClsDetailPaiement dp = (ClsDetailPaiement)ob;
            PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                            ("INSERT INTO detailpaiement VALUES (?,?,?,?,?)");
            ps.setString(1, dp.getIddetail());
            ps.setInt(2, dp.getMontant());
            ps.setString(3, dp.getDatepaie());
            ps.setString(4, dp.getTypepaie());
            ps.setString(5, dp.getPaiement());
            ps.executeUpdate();
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof  ClsPaiement)
        {
            ClsPaiement p = (ClsPaiement)ob;
            PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                            ("INSERT INTO paiement VALUES (?,?)");
            ps.setString(1, p.getIdpaie());
            ps.setString(2, p.getDetail());
            ps.executeUpdate();
            DbConnect.Deconnter();
            return true;
        }
        
        
        return false;     
    }

    public static boolean Modifier(Object ob) throws ClassNotFoundException, SQLException 
    {
        if (ob instanceof ClsResponsable)
        {
            ClsResponsable re = (ClsResponsable)ob;
            try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                        ("UPDATE public.responsable SET nomresp=?, postnomresp=?, prenomresp=?, genre=?, tel=?,  relation=? "
                                + "WHERE idresp = ?")) {
                ps.setString(7, re.getIdresp());
                ps.setString(1, re.getNomresp());
                ps.setString(2, re.getPostnomresp());
                ps.setString(3, re.getPrenomresp());
                ps.setString(4, re.getGenre());
                ps.setInt(5, re.getTel());
                ps.setString(6, re.getRelation());
                ps.executeUpdate();
            }
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsEleve)
        {
            ClsEleve el = (ClsEleve)ob;
            try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                        ("UPDATE eleve SET nomel = ?, postnomel = ?, prenomel = ?, age = ?, genre = ?" 
                                + "addresse = ?, resp = ? WHERE idel = ?")) {
                ps.setString(8, el.getIdel());
                ps.setString(1, el.getNomel());
                ps.setString(2, el.getPostnomel());
                ps.setString(3, el.getPrenomel());
                ps.setString(4, el.getAge());
                ps.setString(5, el.getGenre());
                ps.setString(6, el.getAddresse());
                ps.setString(7, el.getResp());
                ps.executeUpdate();
            }
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsDetail)
        {
            ClsDetail de = (ClsDetail)ob;
            try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                        ("UPDATE detail SET dateinsc = ?, annee = ?, inscrit = ?, categorie = ? "
                                + "WHERE iddet = ?")) {
                ps.setString(5, de.getIddet());
                ps.setString(1, de.getDateinsc());
                ps.setString(2, de.getAnnee());
                ps.setString(3, de.getInscrit());
                ps.setString(4, de.getCategorie());
                ps.executeUpdate();
            }
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsDetailPaiement)
        {
            ClsDetailPaiement dp = (ClsDetailPaiement)ob;
            PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                            ("UPDATE detailpaiement SET montant = ?, datepaie = ?, typepaie = ?, paiement = ? "
                                    + "WHERE iddetail = ?");
            ps.setString(5, dp.getIddetail());
            ps.setInt(1, dp.getMontant());
            ps.setString(2, dp.getDatepaie());
            ps.setString(3, dp.getTypepaie());
            ps.setString(4, dp.getPaiement());
            ps.executeUpdate();
            DbConnect.Deconnter();
            return true;
        }
        
        else if (ob instanceof ClsLoggin)
        {
            ClsLoggin log = (ClsLoggin)ob;
            PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                    ("UPDATE loggin SET nomutil = ?, motdepass = ?, typelog = ?"
                            + "WHERE id = ?");
            ps.setString(4, log.getId());
            ps.setString(1, log.getNomutil());
            ps.setString(2, log.getMotdepass());
            ps.setString(3, log.getTypelog());
            ps.executeUpdate();
            DbConnect.Deconnter();
            return true;
        }
        
        return false;
    }

    public static void Delete(String tbl, String id) throws ClassNotFoundException, SQLException 
    {
        try (PreparedStatement ps = DbConnect.DbConnecter().prepareStatement
                                        ("DELETE FROM " + tbl + "WHERE idel = ?")) {
            ps.setString(1, id);
            ps.executeUpdate();
        }
        DbConnect.Deconnter();
    }
    
}
