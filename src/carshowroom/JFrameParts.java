/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carshowroom;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author shamaz
 */
public class JFrameParts extends javax.swing.JFrame {

    /**
     * Creates new form JFrameParts
     */
    public JFrameParts() {
        initComponents();
        showParts();
    }

    public ArrayList<Parts> getPartsList()
   {
       ArrayList<Parts>Partslist = new ArrayList<Parts>();
      try
        {
            ClassDBConnectivity databaseConnectivity = new ClassDBConnectivity();
            Connection connection = databaseConnectivity.getDatabaseConnectivity();
//            Statement statement = connection.createStatement();
//            
            String query4 = "select * from Parts_T";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query4);
           Parts part;
           while(rs.next())
           {
               part = new Parts(rs.getString("PartID"), rs.getInt("PartNumber"),rs.getString("PartDescription"),rs.getInt("PurchasePrice"),rs.getInt("RetailPrice"));
               Partslist.add(part);
           }
            
        }
       catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null, e);
                   
        }
       
      return Partslist;
   }
    
    public void showParts()
    {
        ArrayList<Parts>  listintableParts = getPartsList();
        DefaultTableModel modelParts = (DefaultTableModel)jTableShowSearchedRecondForDeletion.getModel();
        
        Object[] row = new Object[5];
       for(int i = 0; i < listintableParts.size(); i++)
       {
           row[0] = listintableParts.get(i).getPartid();
           row[1] = listintableParts.get(i).getPartsno();
           row[2] = listintableParts.get(i).getDescription();
           row[3] = listintableParts.get(i).getPurchaseprice();
           row[4] = listintableParts.get(i).getRetailprice();
           
           
           
           modelParts.addRow(row);
       }
    }
    
    public void executeSQLQuery(String queryParts,String message)
    {
              try
        {
            ClassDBConnectivity databaseConnectivity = new ClassDBConnectivity();
            Connection connection = databaseConnectivity.getDatabaseConnectivity();
       //     Statement statement = connection.createStatement();
//         
           Statement st;
            try
            {
               st = connection.createStatement();
               if(st.executeUpdate(queryParts) == 1)
               {
                   
                 DefaultTableModel modelParts = (DefaultTableModel)jTableShowSearchedRecondForDeletion.getModel();
                 modelParts.setRowCount(0);
                 showParts();
                 
                 JOptionPane.showMessageDialog(null, "Data "+message+" Successfully");
               }
               else 
               {
                   JOptionPane.showMessageDialog(null, "Data not "+message+ " " );
                   
               }
               
            }
             catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null,"Primary Key Mismatch.Please Choose Unique Primary Key");
                   
        }
           
            
            
        }
       catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null, e);
                   
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPartsID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPartsNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPartsDescription = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldPartsRPrice = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPartsPPrice = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableShowSearchedRecondForDeletion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Dealing Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        jLabel1.setText("PARTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 20, 240, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/LOG.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 0, 90, 59);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/home.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(900, 0, 100, 59);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Parts ID");

        jTextFieldPartsID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPartsID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPartsIDKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Parts No");

        jTextFieldPartsNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPartsNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPartsNoKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Description ");

        jTextFieldPartsDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPartsDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPartsDescriptionKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Retail Price");

        jTextFieldPartsRPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPartsRPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPartsRPriceKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Purchase Price ");

        jTextFieldPartsPPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPartsPPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPartsPPriceKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPartsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPartsID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPartsDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jTextFieldPartsPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPartsRPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldPartsPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextFieldPartsID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPartsRPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPartsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPartsDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/insert.png"))); // NOI18N
        jButton3.setText("Insert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/delete.jpg"))); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/update.png"))); // NOI18N
        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/clear.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTableShowSearchedRecondForDeletion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parts ID", "Parts No", "Description ", "Purchase Price", "Retail Price"
            }
        ));
        jTableShowSearchedRecondForDeletion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowSearchedRecondForDeletionMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableShowSearchedRecondForDeletion);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("View All Record Of Parts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        setVisible(false);
//        new JFrameLogIn().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
        new JFrameMain().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       String queryParts = "DELETE FROM Parts_T WHERE PartID = '"+jTextFieldPartsID.getText()+"'" ;
         executeSQLQuery(queryParts,"Deleted");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTableShowSearchedRecondForDeletionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowSearchedRecondForDeletionMouseClicked
       int i = jTableShowSearchedRecondForDeletion.getSelectedRow();
        TableModel modelParts = jTableShowSearchedRecondForDeletion.getModel();
        jTextFieldPartsID.setText(modelParts.getValueAt(i,0).toString());
        jTextFieldPartsNo.setText(modelParts.getValueAt(i,1).toString());
        jTextFieldPartsDescription.setText(modelParts.getValueAt(i,2).toString());
        jTextFieldPartsPPrice.setText(modelParts.getValueAt(i,3).toString());
        jTextFieldPartsRPrice.setText(modelParts.getValueAt(i,3).toString());
        
    }//GEN-LAST:event_jTableShowSearchedRecondForDeletionMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String queryParts = "insert into Parts_T(PartID,PartNumber,PartDescription,PurchasePrice,RetailPrice) values('"+jTextFieldPartsID.getText()+"','"+jTextFieldPartsNo.getText()+"','"+jTextFieldPartsDescription.getText()+"','"+jTextFieldPartsPPrice.getText()+"','"+jTextFieldPartsRPrice.getText()+"') ";
        executeSQLQuery(queryParts,"Inserted");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jTextFieldPartsDescription.setText("");
        jTextFieldPartsID.setText("");
        jTextFieldPartsNo.setText("");
        jTextFieldPartsPPrice.setText("");
        jTextFieldPartsRPrice.setText("");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String queryParts = "update Parts_T set PartNumber='"+jTextFieldPartsNo.getText()+"',PartDescription='"+jTextFieldPartsDescription.getText()+"',PurchasePrice='"+jTextFieldPartsPPrice.getText()+"',RetailPrice='"+jTextFieldPartsRPrice.getText()+"' where PartID='"+jTextFieldPartsID.getText()+"'" ;
         executeSQLQuery(queryParts,"Updated");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextFieldPartsNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartsNoKeyPressed
        if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Alphabet or Special Characters are not allowed in Parts No");
            jTextFieldPartsNo.setText("");
        }
        



        if(evt.getKeyCode() == 10)
        {
            jTextFieldPartsDescription.requestFocus(true);
     }
// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartsNoKeyPressed

    private void jTextFieldPartsDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartsDescriptionKeyPressed
  jTextFieldPartsDescription.getText();
        if(evt.getKeyCode() > 47 && evt.getKeyCode()< 59)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Digits are not allowed in PartsDescription" );
            String textFirstName = jTextFieldPartsDescription.getText();
            evt.setKeyCode(8);
        }  



        if(evt.getKeyCode() == 10)
        {
            jTextFieldPartsPPrice.requestFocus(true);
     }        
// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartsDescriptionKeyPressed

    private void jTextFieldPartsPPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartsPPriceKeyPressed
 if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Alphabet or Special Characters are not allowed");
            jTextFieldPartsPPrice.setText("");
        }  



        if(evt.getKeyCode() == 10)
        {
            jTextFieldPartsRPrice.requestFocus(true);
     } 
// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartsPPriceKeyPressed

    private void jTextFieldPartsRPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartsRPriceKeyPressed
 if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Alphabet or Special Characters are not allowed");
            jTextFieldPartsRPrice.setText("");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartsRPriceKeyPressed

    private void jTextFieldPartsIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartsIDKeyPressed



        if(evt.getKeyCode() == 10)
        {
            jTextFieldPartsNo.requestFocus(true);
     }       
        
// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartsIDKeyPressed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
 int option;
     if( SwingUtilities.isLeftMouseButton(evt) )
        {   
            option = javax.swing.JOptionPane.showConfirmDialog(null,"Are you sure you want to Logout?");
            if (option==0)
            {
                setVisible(false);
             new JFrameLogIn().setVisible(true);
             
            }
            else if (option==1)
            {
                setVisible(false);
                setVisible(true);
            }
            else if (option==2)
            {
                setVisible(false);
                setVisible(true);
            }
        }            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameParts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameParts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableShowSearchedRecondForDeletion;
    private javax.swing.JTextField jTextFieldPartsDescription;
    private javax.swing.JTextField jTextFieldPartsID;
    private javax.swing.JTextField jTextFieldPartsNo;
    private javax.swing.JTextField jTextFieldPartsPPrice;
    private javax.swing.JTextField jTextFieldPartsRPrice;
    // End of variables declaration//GEN-END:variables
}
