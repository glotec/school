/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VuePnl;

import Metier.ClsDetail;
import Metier.ClsEleve;
import Metier.ClsInscrire;
import Metier.ClsResponsable;
import Vue.FrmPrincipal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gloire
 */
public final class PnlInscription extends javax.swing.JPanel {

    /**
     * Creates new form PnlInscription
     */
    
    String idinscr, iddetail, idcateg, idclasse;
    
    public PnlInscription() throws ClassNotFoundException, SQLException {
        initComponents();
        txtidel.setText("El00" + Dao.CllsUpdateAll.Incrementation("eleve"));
        txtidres.setText("Re00" + Dao.CllsUpdateAll.Incrementation("responsable"));
        idinscr ="In00" + Dao.CllsUpdateAll.Incrementation("inscrire");
        iddetail ="De00" + Dao.CllsUpdateAll.Incrementation("detail");
        Dao.CllsUpdateAll.ChargerComboBox(cbClasse, "SELECT classe FROM classe");
//        System.out.println(idclasse);
        Dao.CllsUpdateAll.ChargerTextField(txtidclasse, "SELECT idclass FROM classe WHERE classe = "
                    + "'"+cbClasse.getSelectedItem()+"'");
        Dao.CllsUpdateAll.ChargerTextField(txtid, "SELECT idcat FROM categorie WHERE classe = "
                    + "'"+txtidclasse.getText()+"'");
        Dao.CllsUpdateAll.ChargerTableInsription(jTable1);
        txtid.setVisible(false);
        txtidclasse.setVisible(false);
//        jButton3.setVisible(false);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtidel = new javax.swing.JTextField();
        txtnomel = new javax.swing.JTextField();
        txtpostel = new javax.swing.JTextField();
        txtprenomel = new javax.swing.JTextField();
        txtageel = new javax.swing.JTextField();
        txtaddel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtidres = new javax.swing.JTextField();
        txtnomres = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtrelres = new javax.swing.JTextField();
        txtcontactres = new javax.swing.JTextField();
        txtprenomres = new javax.swing.JTextField();
        txtpostres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        cbgenreel = new javax.swing.JComboBox();
        cbgenreres = new javax.swing.JComboBox();
        cbClasse = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        cbannee = new javax.swing.JComboBox();
        txtidclasse = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();

        setBackground(new java.awt.Color(4, 123, 249));
        setForeground(java.awt.Color.white);
        setFont(new java.awt.Font("Century Schoolbook L", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("INSCRIPTION");

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(23, 42, 25));
        jButton3.setText("MODIFIER");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(16, 246, 36));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(23, 42, 25));
        jButton1.setText("ENREGISTRER");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Nouvel eleve");

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Id");

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Nom");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Post nom");

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("Prenom");

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setForeground(java.awt.Color.white);
        jLabel20.setText("Age");

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Genre");

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("Address");

        txtidel.setBackground(new java.awt.Color(67, 156, 230));
        txtidel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtidel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnomel.setBackground(new java.awt.Color(67, 156, 230));
        txtnomel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtnomel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtpostel.setBackground(new java.awt.Color(67, 156, 230));
        txtpostel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtpostel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtprenomel.setBackground(new java.awt.Color(67, 156, 230));
        txtprenomel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtprenomel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtageel.setBackground(new java.awt.Color(67, 156, 230));
        txtageel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtageel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtaddel.setBackground(new java.awt.Color(67, 156, 230));
        txtaddel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtaddel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Responsable");

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(java.awt.Color.white);
        jLabel23.setText("Id");

        txtidres.setBackground(new java.awt.Color(67, 156, 230));
        txtidres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtidres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtnomres.setBackground(new java.awt.Color(67, 156, 230));
        txtnomres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtnomres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("Nom");

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel25.setForeground(java.awt.Color.white);
        jLabel25.setText("Post nom");

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setForeground(java.awt.Color.white);
        jLabel26.setText("Prenom");

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel27.setForeground(java.awt.Color.white);
        jLabel27.setText("Contact");

        jLabel28.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel28.setForeground(java.awt.Color.white);
        jLabel28.setText("Genre");

        jLabel29.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel29.setForeground(java.awt.Color.white);
        jLabel29.setText("Relation enfant");

        txtrelres.setBackground(new java.awt.Color(67, 156, 230));
        txtrelres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtrelres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtcontactres.setBackground(new java.awt.Color(67, 156, 230));
        txtcontactres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtcontactres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtprenomres.setBackground(new java.awt.Color(67, 156, 230));
        txtprenomres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtprenomres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtpostres.setBackground(new java.awt.Color(67, 156, 230));
        txtpostres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtpostres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel30.setForeground(java.awt.Color.white);
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("LISTE DES INSCRIPTS");

        cbgenreel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbgenreel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculin", "Femini" }));

        cbgenreres.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbgenreres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "De quel genre etes vous?", "Masculin", "Femini" }));

        cbClasse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbClasse.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbClassePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClasseActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.white);
        jLabel31.setText("Classe");

        cbannee.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbannee.setForeground(java.awt.Color.white);
        cbannee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018 - 2019", "2019 - 2020", "2020 - 2021", "2021 - 2022", "2022 - 2023", "2023 - 2024", "2024 - 2025", "2025 - 2026", "2026 - 2027", "2027 - 2028", "2028 - 2029", "2029 - 2030" }));

        txtidclasse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtid.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(389, 389, 389))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator7)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidclasse, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpostel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprenomel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtageel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaddel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbgenreel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbannee, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(139, 139, 139))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtidres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnomres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpostres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtprenomres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtrelres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(cbgenreres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcontactres, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator8)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(cbannee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtidel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtnomel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtpostel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtprenomel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtageel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbgenreel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtaddel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtidres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtnomres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtpostres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtprenomres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cbgenreres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontactres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtrelres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidclasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            ClsResponsable res = new ClsResponsable();
            ClsEleve el = new ClsEleve();
            ClsInscrire in = new ClsInscrire();
            ClsDetail de = new ClsDetail();
            
            res.setIdresp(txtidres.getText());
            res.setNomresp(txtnomres.getText());
            res.setPostnomresp(txtpostres.getText());
            res.setPrenomresp(txtprenomres.getText());
            res.setGenre((String) cbgenreres.getSelectedItem());
            res.setTel(Integer.parseInt(txtcontactres.getText()));
            res.setRelation(txtrelres.getText());
            
            el.setIdel(txtidel.getText());
            el.setNomel(txtnomel.getText());
            el.setPostnomel(txtpostel.getText());
            el.setPrenomel(txtprenomel.getText());
            el.setAge(txtageel.getText());
            el.setGenre((String) cbgenreel.getSelectedItem());
            el.setAddresse(txtaddel.getText()); 
            el.setResp(txtidres.getText());
            
//            in.setIdinsc(idinscr);
            in.setEleve(txtidel.getText());
//            
//            de.setIddet(iddetail);
            de.setDateinsc(FrmPrincipal.viewdate.getText());
            de.setAnnee((String) cbannee.getSelectedItem());
            de.setInscrit(idinscr);
            de.setCategorie(txtid.getText());
            
            if (res.Modifier()&& el.Modifier() && in.Modifier() && de.Modifier())
            {
                JOptionPane.showMessageDialog(null, "Modification reussi", "Reussi", JOptionPane.INFORMATION_MESSAGE);
                Dao.CllsUpdateAll.ChargerTableInsription(jTable1);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur de modification", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            ClsResponsable res = new ClsResponsable();
            ClsEleve el = new ClsEleve();
            ClsInscrire in = new ClsInscrire();
            ClsDetail de = new ClsDetail();
            
            res.setIdresp(txtidres.getText());
            res.setNomresp(txtnomres.getText());
            res.setPostnomresp(txtpostres.getText());
            res.setPrenomresp(txtprenomres.getText());
            res.setGenre((String) cbgenreres.getSelectedItem());
            res.setTel(Integer.parseInt(txtcontactres.getText()));
            res.setRelation(txtrelres.getText());
            
            el.setIdel(txtidel.getText());
            el.setNomel(txtnomel.getText());
            el.setPostnomel(txtpostel.getText());
            el.setPrenomel(txtprenomel.getText());
            el.setAge(txtageel.getText());
            el.setGenre((String) cbgenreel.getSelectedItem());
            el.setAddresse(txtaddel.getText()); 
            el.setResp(txtidres.getText());
            
            in.setIdinsc(idinscr);
            in.setEleve(txtidel.getText());
//            
            de.setIddet(iddetail);
            de.setDateinsc(FrmPrincipal.viewdate.getText());
            de.setAnnee((String) cbannee.getSelectedItem());
            de.setInscrit(idinscr);
            de.setCategorie(txtid.getText());
            
            if (res.Enregistrer() && el.Enregistrer() && in.Enregistrer() && de.Enregistrer())
            {
                JOptionPane.showMessageDialog(null, "Enregistrement reussi", "Reussi", JOptionPane.INFORMATION_MESSAGE);
                Dao.CllsUpdateAll.ChargerTableInsription(jTable1);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur d'ajout", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClasseActionPerformed

    private void cbClassePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbClassePopupMenuWillBecomeInvisible
        String tmp = (String)cbClasse.getSelectedItem();
        try {
            Dao.CllsUpdateAll.ChargerTextField(txtidclasse, "SELECT idclass FROM classe WHERE classe = "
                    + "'"+cbClasse.getSelectedItem()+"'");      
        Dao.CllsUpdateAll.ChargerTextField(txtid, "SELECT idcat FROM categorie WHERE classe = "
                    + "'"+txtidclasse.getText()+"'");      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PnlInscription.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PnlInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbClassePopupMenuWillBecomeInvisible

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        txtidel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        txtnomel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        txtpostel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        txtprenomel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        txtageel.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        cbgenreel.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        cbClasse.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        txtnomres.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
        try {
            Dao.CllsUpdateAll.ChargerTextField(txtidres, "SELECT idresp FROM responsable WHERE nomresp = '"+
                    jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString()+"'");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PnlInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbClasse;
    private javax.swing.JComboBox cbannee;
    private javax.swing.JComboBox cbgenreel;
    private javax.swing.JComboBox cbgenreres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddel;
    private javax.swing.JTextField txtageel;
    private javax.swing.JTextField txtcontactres;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidclasse;
    private javax.swing.JTextField txtidel;
    private javax.swing.JTextField txtidres;
    private javax.swing.JTextField txtnomel;
    private javax.swing.JTextField txtnomres;
    private javax.swing.JTextField txtpostel;
    private javax.swing.JTextField txtpostres;
    private javax.swing.JTextField txtprenomel;
    private javax.swing.JTextField txtprenomres;
    private javax.swing.JTextField txtrelres;
    // End of variables declaration//GEN-END:variables
}
