/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VuePnl;

import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author gloire
 */
public class PnlSuivitPaie extends javax.swing.JPanel {

    /**
     * Creates new form PnlEleves
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public PnlSuivitPaie() throws ClassNotFoundException, SQLException {
        initComponents();
        Dao.CllsUpdateAll.ChargerTextField(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtnomel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(3, 95, 248));

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAIEMENT INFORMATION");

        txtnomel.setBackground(new java.awt.Color(67, 156, 230));
        txtnomel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtnomel.setForeground(null);
        txtnomel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(java.awt.Color.gray);
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setForeground(null);
        jButton1.setText("RECHERCHER");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.gray);
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PrinterNetwork_32x32.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtnomel, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
        {
            if (txtnomel.getText().equals(""))
                Dao.CllsUpdateAll.ChargerTextField(jTable1);
            else
                Dao.CllsUpdateAll.ChargerDeatail(txtnomel.getText(), jTable1);
        }
        catch (ClassNotFoundException | SQLException e) 
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
//        MessageFormat Header = new MessageFormat("Liste des eleves");
//        MessageFormat Footer = new MessageFormat("Page {0, number, integer}");
//        
//        try
//        {
//            jTable1.print(JTable.PrintMode.NORMAL, Header, Footer);
//        } 
//        catch (Exception e)
//        {
//            System.err.format("erreur d'impession", e.getMessage());
//        }
        
        JLabel lb = new JLabel();
                String req = "SELECT e.idel, e.nomel, e.postnomel, e.prenomel, cl.classe, dp.montant, dp.datepaie, dp.typepaie"
                                 + " FROM eleve e INNER JOIN inscrire i ON e.idel = i.eleve INNER JOIN detail d ON i.idinsc = d.inscrit "
                                    + "INNER JOIN categorie c ON d.categorie = c.idcat INNER JOIN classe cl ON c.classe = cl.idclass "
                                        + "INNER JOIN paiement p ON d.iddet = p.detail INNER JOIN detailpaiement dp ON p.idpaie = dp.paiement "
                                            + "WHERE CONCAT(e.nomel, e.postnomel, e.prenomel)  LIKE'%"+txtnomel.getText()+"%'";
        lb.setText("src//Rapport//rRecuPaiement.jrxml");
        try {       
            Dao.CllsUpdateAll.print(lb, req);
        } catch (ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Une erreur est survenu lors de l'impression !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtnomel;
    // End of variables declaration//GEN-END:variables
}
