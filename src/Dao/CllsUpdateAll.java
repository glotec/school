/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.DbConnect.con;
import cls.Glossiaire;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author gloire
 */
public class CllsUpdateAll 
{
    
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    
    public static int Incrementation(String dbTable) throws ClassNotFoundException, SQLException
    {
        ps = DbConnect.DbConnecter().prepareStatement
            ("SELECT COUNT(*) FROM " +dbTable);
        rs = ps.executeQuery();
        
        if (rs.next())
        {
            return rs.getInt(1) + 1;
        }
        return 0;        
    }
    
    public static void LogIn(JLabel userName, JLabel passWord, String password, String username) throws ClassNotFoundException {

        try {
            ps = DbConnect.DbConnecter().prepareStatement
                    ("SELECT * FROM loggin WHERE nomutil='" + username + "' and motdepass='" + password + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                userName.setText(rs.getString(2));
                passWord.setText(rs.getString(3));

            }
//select count(*) from users where type_account ='s001'
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public static void ChargerComboBox(JComboBox cmb, String requette) throws ClassNotFoundException, SQLException
    {
        ps = DbConnect.DbConnecter().prepareStatement(requette);
        rs = ps.executeQuery();
        while (rs.next())
        {
            cmb.addItem(rs.getObject(1));
        }
    }
    
    public static void ChargerTextField(JTextField textField, String requette) throws ClassNotFoundException, SQLException
    {
        ps = DbConnect.DbConnecter().prepareStatement(requette);
        rs = ps.executeQuery();
        
        if (rs.next())
        {
            textField.setText((String) rs.getObject(1));
        }
    }
    
    public static void ChargerNoms(JTextField txt, String req) throws ClassNotFoundException, SQLException
    {
        ps = DbConnect.DbConnecter().prepareStatement(req);
        rs = ps.executeQuery();
        
        if (rs.next())
        {
            txt.setText((String) rs.getObject(1));
        }
    }
    
    public static void ChargerText(int t, String requette) throws ClassNotFoundException, SQLException
    {
        ps = DbConnect.DbConnecter().prepareStatement(requette);
        rs = ps.executeQuery();
        
        if (rs.next())
        {
            t = (int) ( rs.getObject(1));
        }
    }
    
    public static void ChargerEleve(String txtid, JTable tbl) throws ClassNotFoundException, SQLException
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NOM ");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("AGE");
        dtm.addColumn("GENRE");
        dtm.addColumn("CLASSE");
        dtm.addColumn("ADDRESSE");
        dtm.addColumn("RESPONSABLE");
        tbl.setModel(dtm);
        
        ps = DbConnect.DbConnecter().prepareStatement
            ("SELECT  CONCAT(r.nomresp, r.postnomresp) AS res, e.idel, e.nomel, e.postnomel, e.prenomel, e.age, e.genre, e.addresse, cl.classe "
                    + "FROM responsable r INNER JOIN eleve e ON r.idresp = e.resp INNER JOIN inscrire i ON e.idel = i.eleve "
                        + "INNER JOIN detail d ON i.idinsc = d.inscrit INNER JOIN categorie c ON d.categorie = c.idcat "
                            + "INNER JOIN classe cl ON c.classe = cl.idclass WHERE CONCAT(e.nomel, e.postnomel, e.prenomel)  LIKE'%"+txtid+"%'");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
                 rs.getString("age"), rs.getString("genre"), rs.getString("classe"), rs.getString("addresse"), rs.getString("res")};                    
            dtm.addRow(obj);
        }
    }
        
        /****
         * Print 
     * @param cheminJRxmlfile
     * @param sql
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException       */
           public static void print(JLabel cheminJRxmlfile, String sql) throws ClassNotFoundException, SQLException {
        try {
            JasperDesign jd = JRXmlLoader.load(cheminJRxmlfile.getText());
            JRDesignQuery jdq = new JRDesignQuery();
            jdq.setText(sql);
            jd.setQuery(jdq);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, DbConnect.DbConnecter());

//            JFrame fr = new JFrame();
//            fr.setSize(100, 100);
//
//            fr.getContentPane().add(new JRViewer(jp));
//            fr.pack();
//            fr.setVisible(true);
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            Logger.getLogger(Glossiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ChargerTableInsription(JTable tbl) throws ClassNotFoundException, SQLException
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NOM");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("AGE");
        dtm.addColumn("GENRE");
        dtm.addColumn("CLASSE");
        dtm.addColumn("NOM RESP");
        dtm.addColumn("POSTNOM RESP");
        tbl.setModel(dtm);
        
        ps = DbConnect.DbConnecter().prepareStatement
            ("SELECT r.nomresp, r.postnomresp, e.idel, e.nomel, e.postnomel, e.prenomel,e.age, e.genre, i.idinsc, i.eleve, d.categorie, c.idcat, c.classe, cl.idclass,\n" +
" cl.classe FROM responsable r INNER JOIN eleve e ON r.idresp = e.resp INNER JOIN inscrire i ON i.eleve = e.idel INNER JOIN detail d\n" +
"  ON i.idinsc = d.inscrit INNER JOIN categorie c ON c.idcat = d.categorie INNER JOIN classe cl ON c.classe = cl.idclass "
                    + "ORDER BY idel DESC");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),
                            rs.getString("prenomel"), rs.getString("age"), rs.getString("genre"), rs.getString("classe"),
                            rs.getString("nomresp"), rs.getString("postnomresp")};                    
            dtm.addRow(obj);
        }
    }
    
    public static void ChargerTablePaiement(JTable tbl) throws ClassNotFoundException, SQLException
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID ELEVE");
        dtm.addColumn("CATEGORIE");
        dtm.addColumn("ID DETAIL PAIEMENT");
        dtm.addColumn("MONTANT");
        dtm.addColumn("DATE PAIEMENT");
        dtm.addColumn("TYPE PAIEMENT");
        tbl.setModel(dtm);
        
        ps = DbConnect.DbConnecter().prepareStatement
            ("SELECT e.idel, e.nomel, e.postnomel, e.prenomel, i.idinsc, i.eleve, d.iddet, d.inscrit, d.categorie, p.idpaie, p.detail, p.idpaie, dp.iddetail, "
                    + "dp.montant, dp.datepaie, dp.typepaie, dp.paiement FROM  eleve e INNER JOIN inscrire i ON e.idel = i.eleve INNER JOIN detail d "
                    + "ON i.idinsc = d.inscrit INNER JOIN paiement p ON d.iddet = p.detail INNER JOIN detailpaiement dp ON p.idpaie = dp.paiement "
                    + "ORDER BY e.idel DESC;");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Object obj[] = {rs.getString("idel"),   rs.getString("categorie"),  rs.getString("iddetail"), rs.getString("montant"), rs.getString("datepaie"), rs.getString("typepaie")};                    
            dtm.addRow(obj);
        }
    }
    
    public static void ChargerTableInfos(JTable tbl) throws ClassNotFoundException, SQLException
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("NOM ");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("AGE");
        dtm.addColumn("GENRE");
        dtm.addColumn("CLASSE");
        dtm.addColumn("ADDRESSE");
        dtm.addColumn("RESPONSABLE");
        tbl.setModel(dtm);
        
        ps = DbConnect.DbConnecter().prepareStatement
            ("SELECT  CONCAT(r.nomresp, r.postnomresp) AS res, e.idel, e.nomel, e.postnomel, e.prenomel, e.age, e.genre, e.addresse, cl.classe "
                    + "FROM responsable r INNER JOIN eleve e ON r.idresp = e.resp INNER JOIN inscrire i ON e.idel = i.eleve "
                        + "INNER JOIN detail d ON i.idinsc = d.inscrit INNER JOIN categorie c ON d.categorie = c.idcat "
                            + "INNER JOIN classe cl ON c.classe = cl.idclass");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
                 rs.getString("age"), rs.getString("genre"), rs.getString("classe"), rs.getString("addresse"), rs.getString("res")};                    
            dtm.addRow(obj);
        }
    }
    
    public static void ChargerPanel(JPanel pnl1, JPanel pnl2)
    {
        pnl1.removeAll();
        pnl1.add(pnl2);
        pnl1.revalidate();
        pnl1.repaint();
    }

    public static void ChargerTextField(JTable tbl) throws ClassNotFoundException, SQLException 
    {
       DefaultTableModel dtm = new DefaultTableModel();
       dtm.addColumn("ID");
        dtm.addColumn("NOM ");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("CLASSE");
        dtm.addColumn("MONTANT");
        dtm.addColumn("DATE");
        dtm.addColumn("TYPE");
       tbl.setModel(dtm);
       
       ps = DbConnect.DbConnecter().prepareStatement
                         ("SELECT e.idel, e.nomel, e.postnomel, e.prenomel, cl.classe, dp.montant, dp.datepaie, dp.typepaie"
                                 + " FROM eleve e INNER JOIN inscrire i ON e.idel = i.eleve INNER JOIN detail d ON i.idinsc = d.inscrit "
                                    + "INNER JOIN categorie c ON d.categorie = c.idcat INNER JOIN classe cl ON c.classe = cl.idclass "
                                        + "INNER JOIN paiement p ON d.iddet = p.detail INNER JOIN detailpaiement dp ON p.idpaie = dp.paiement "
                                            + "ORDER BY datepaie");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
                 rs.getString("classe"), rs.getInt("montant"), rs.getString("datepaie"), rs.getString("typepaie")/*, rs.getString("res")*/};                    
            dtm.addRow(obj);
        }
    }
    
    /*search for information paiement*/

    public static void ChargerDeatail(String txtid, JTable tbl) throws ClassNotFoundException, SQLException 
    {
       DefaultTableModel dtm = new DefaultTableModel();
       dtm.addColumn("ID");
        dtm.addColumn("NOM ");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("CLASSE");
        dtm.addColumn("MONTANT");
        dtm.addColumn("DATE");
        dtm.addColumn("TYPE");
       tbl.setModel(dtm);
       
       ps = DbConnect.DbConnecter().prepareStatement
                         ("SELECT e.idel, e.nomel, e.postnomel, e.prenomel, cl.classe, dp.montant, dp.datepaie, dp.typepaie"
                                 + " FROM eleve e INNER JOIN inscrire i ON e.idel = i.eleve INNER JOIN detail d ON i.idinsc = d.inscrit "
                                    + "INNER JOIN categorie c ON d.categorie = c.idcat INNER JOIN classe cl ON c.classe = cl.idclass "
                                        + "INNER JOIN paiement p ON d.iddet = p.detail INNER JOIN detailpaiement dp ON p.idpaie = dp.paiement "
                                            + "WHERE CONCAT(e.nomel, e.postnomel, e.prenomel)  LIKE'%"+txtid+"%' ORDER BY datepaie");
        rs = ps.executeQuery();
        while (rs.next())
        {
            Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
                 rs.getString("classe"), rs.getInt("montant"), rs.getString("datepaie"), rs.getString("typepaie")/*, rs.getString("res")*/};                    
            dtm.addRow(obj);
        }
    }
    
    public static void calculerFrais(JTable tbl) throws ClassNotFoundException, SQLException
    {
       DefaultTableModel dtm = new DefaultTableModel();
       dtm.addColumn("ID");
        dtm.addColumn("NOM ");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("CLASSE");
        dtm.addColumn("MONTANT");
        dtm.addColumn("TOTAL A PAYER");
        dtm.addColumn("RESTE A PAYER");
        dtm.addColumn("OBSERVATION");
       tbl.setModel(dtm);
       
        ps = DbConnect.DbConnecter().prepareStatement
                    ("SELECT e.idel, e.nomel, e.postnomel, e.prenomel, cl.classe, SUM(dp.montant) AS mont, p.montant FROM eleve e "
                            + "INNER JOIN inscrire i ON e.idel = i.eleve INNER JOIN detail d ON i.idinsc = d.inscrit "
                            + "INNER JOIN categorie c ON c.idcat = d.categorie INNER JOIN classe cl ON cl.idclass = c.classe "
                            + "INNER JOIN provisionfrais p ON p.idfrais = c.provisionfrais INNER JOIN paiement pe ON d.iddet = pe.detail "
                            + "INNER JOIN detailpaiement dp ON dp.paiement = pe.idpaie GROUP BY e.idel, cl.classe, p.montant ");
        rs = ps.executeQuery();
        while (rs.next())
        {
            int tot = rs.getInt("montant");
            int paie = rs.getInt("mont");
            int rest  = tot - paie;
            String obs;
            if (rest == 0 || rest < 0)
            {
                obs = "A solder";
                
//           Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
//                 rs.getString("classe"), rs.getInt("mont"), rs.getInt("montant"), rest, obs};                    
//            dtm.addRow(obj);
            }
            else
            {
                obs = "Insolvable";
           Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
                 rs.getString("classe"), rs.getInt("mont"), rs.getInt("montant"), rest, obs};                    
            dtm.addRow(obj);
            }
//           Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
//                 rs.getString("classe"), rs.getInt("mont"), rs.getInt("montant"), rest, obs};                    
//            dtm.addRow(obj);
        }
    }
    
    public static void calculeSelect(String nom, JTable tbl) throws ClassNotFoundException, SQLException
    {
       DefaultTableModel dtm = new DefaultTableModel();
       dtm.addColumn("ID");
        dtm.addColumn("NOM ");
        dtm.addColumn("POST NOM");
        dtm.addColumn("PRENOM");
        dtm.addColumn("CLASSE");
        dtm.addColumn("MONTANT");
        dtm.addColumn("TOTAL A PAYER");
        dtm.addColumn("RESTE A PAYER");
        dtm.addColumn("OBSERVATION");
       tbl.setModel(dtm);
       
        ps = DbConnect.DbConnecter().prepareStatement
                    ("SELECT e.idel, e.nomel, e.postnomel, e.prenomel, cl.classe, SUM(dp.montant) AS mont, p.montant FROM eleve e "
                            + "INNER JOIN inscrire i ON e.idel = i.eleve INNER JOIN detail d ON i.idinsc = d.inscrit "
                            + "INNER JOIN categorie c ON c.idcat = d.categorie INNER JOIN classe cl ON cl.idclass = c.classe "
                            + "INNER JOIN provisionfrais p ON p.idfrais = c.provisionfrais INNER JOIN paiement pe ON d.iddet = pe.detail "
                            + "INNER JOIN detailpaiement dp ON dp.paiement = pe.idpaie WHERE e.nomel LIKE '%"+nom+"%'"
                            + " GROUP BY e.idel, cl.classe, p.montant ");
        rs = ps.executeQuery();
        while (rs.next())
        {
            int tot = rs.getInt("montant");
            int paie = rs.getInt("mont");
            int rest  = tot - paie;
            String obs;
            if (rest == 0)
            {
                obs = "A solder";
                
//           Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
//                 rs.getString("classe"), rs.getInt("mont"), rs.getInt("montant"), rest, obs};                    
//            dtm.addRow(obj);
            }
            else
            {
                obs = "Insolvable";
           Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
                 rs.getString("classe"), rs.getInt("mont"), rs.getInt("montant"), rest, obs};                    
            dtm.addRow(obj);
            }
//           Object obj[] = {rs.getString("idel"), rs.getString("nomel"), rs.getString("postnomel"),  rs.getString("prenomel"),
//                 rs.getString("classe"), rs.getInt("mont"), rs.getInt("montant"), rest, obs};                    
//            dtm.addRow(obj);
        }
    }
    
}
