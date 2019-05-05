package carshowroom;

import java.sql.Connection;
import java.sql.DriverManager;
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
public class JFrameSalesPerson extends javax.swing.JFrame {

    /**
     * Creates new form JFrameSalesPerson
     */
    public JFrameSalesPerson() {
        initComponents();
//        Show_Customers_In_JTable();
        show_sales_Person();
    }

       
    /**
     *
     * @return
     */
    
    public ArrayList<salesperson> getSalesPersonList()
   {
       ArrayList<salesperson>salespersonlist = new ArrayList<salesperson>();
      try
        {
            ClassDBConnectivity databaseConnectivity = new ClassDBConnectivity();
            Connection connection = databaseConnectivity.getDatabaseConnectivity();
//            Statement statement = connection.createStatement();
//            
            String query1 = "select * from Salesperson_T";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
           salesperson saleperson;
           while(rs.next())
           {
               saleperson = new salesperson(rs.getString("SalespersonID"), rs.getString("LastName"),rs.getString("FirstName"));
               salespersonlist.add(saleperson);
           }
            
        }
       catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null, e);
                   
        }
       
      return salespersonlist;
   }
    
    public void show_sales_Person()
    {
        ArrayList<salesperson>  listintablesalesperson = getSalesPersonList();
        DefaultTableModel modelsaleperson = (DefaultTableModel)jTableShowallrecordsaleasperson.getModel();
        
        Object[] row = new Object[3];
       for(int i = 0; i < listintablesalesperson.size(); i++)
       {
           row[0] = listintablesalesperson.get(i).getSalespersonID();
           row[1] = listintablesalesperson.get(i).getLastName();
           row[2] = listintablesalesperson.get(i).getFirstName();
           
           
           modelsaleperson.addRow(row);
       }
    }
    
    public void executeSQLQuery(String querySalePersonInsert ,String message)
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
               if(st.executeUpdate(querySalePersonInsert) == 1)
               {
                   
                 DefaultTableModel modelsaleperson = (DefaultTableModel)jTableShowallrecordsaleasperson.getModel();
                 modelsaleperson.setRowCount(0);
                 show_sales_Person();
                 
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonSalesPersonAddNewData = new javax.swing.JButton();
        jButtonDeleteSalesPerson = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSalesPersonID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldSalesPersonFirstName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldSalesPersonLastName = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableShowallrecordsaleasperson = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Dealing Management System");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("SalesPerson");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(380, 10, 180, 30);

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
        jPanel3.add(jButton4);
        jButton4.setBounds(0, 0, 90, 59);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/home.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(920, 0, 100, 59);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonSalesPersonAddNewData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalesPersonAddNewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/insert.png"))); // NOI18N
        jButtonSalesPersonAddNewData.setText("Insert");
        jButtonSalesPersonAddNewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalesPersonAddNewDataActionPerformed(evt);
            }
        });

        jButtonDeleteSalesPerson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeleteSalesPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/delete.jpg"))); // NOI18N
        jButtonDeleteSalesPerson.setText("Delete");
        jButtonDeleteSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteSalesPersonActionPerformed(evt);
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
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalesPersonAddNewData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteSalesPerson, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalesPersonAddNewData, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteSalesPerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Sales Person ID");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 30, 130, 17);

        jTextFieldSalesPersonID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSalesPersonID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSalesPersonIDKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldSalesPersonID);
        jTextFieldSalesPersonID.setBounds(180, 30, 110, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("First Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 70, 80, 17);

        jTextFieldSalesPersonFirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSalesPersonFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSalesPersonFirstNameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldSalesPersonFirstName);
        jTextFieldSalesPersonFirstName.setBounds(180, 70, 110, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Last Name");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 110, 80, 17);

        jTextFieldSalesPersonLastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSalesPersonLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSalesPersonLastNameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldSalesPersonLastName);
        jTextFieldSalesPersonLastName.setBounds(180, 110, 110, 20);

        jTableShowallrecordsaleasperson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Person ID", "First Name", "Last Name"
            }
        ));
        jTableShowallrecordsaleasperson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowallrecordsaleaspersonMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableShowallrecordsaleasperson);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("View All Record Of Sales Person");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableShowallrecordsaleaspersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowallrecordsaleaspersonMouseClicked
        int i = jTableShowallrecordsaleasperson.getSelectedRow();
        TableModel modelsaleperson = jTableShowallrecordsaleasperson.getModel();
        jTextFieldSalesPersonID.setText(modelsaleperson.getValueAt(i,0).toString());
        jTextFieldSalesPersonFirstName.setText(modelsaleperson.getValueAt(i,1).toString());
        jTextFieldSalesPersonLastName.setText(modelsaleperson.getValueAt(i,2).toString());
    }//GEN-LAST:event_jTableShowallrecordsaleaspersonMouseClicked

    private void jButtonSalesPersonAddNewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalesPersonAddNewDataActionPerformed
        String querySalePersonInsert = "insert into Salesperson_T(SalespersonID,FirstName,LastName) values('"+jTextFieldSalesPersonID.getText()+"','"+jTextFieldSalesPersonFirstName.getText()+"','"+jTextFieldSalesPersonLastName.getText()+"') ";
        executeSQLQuery(querySalePersonInsert,"Inserted");
    }//GEN-LAST:event_jButtonSalesPersonAddNewDataActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String querySalePersonInsert = "update Salesperson_T set FirstName='"+jTextFieldSalesPersonFirstName.getText()+"',LastName="+jTextFieldSalesPersonLastName.getText()+" where SalespersonID='"+jTextFieldSalesPersonID.getText()+"'" ;
        executeSQLQuery(querySalePersonInsert,"Updated");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButtonDeleteSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteSalesPersonActionPerformed
       
         String querySalePersonInsert = "DELETE FROM Salesperson_T WHERE FirstName = '"+jTextFieldSalesPersonFirstName.getText()+"'";
         executeSQLQuery(querySalePersonInsert,"Deleted");
    }//GEN-LAST:event_jButtonDeleteSalesPersonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        setVisible(false);
//        new JFrameLogIn().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
        new JFrameMain().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jTextFieldSalesPersonFirstName.setText("");
        jTextFieldSalesPersonID.setText("");
        jTextFieldSalesPersonLastName.setText("");
//        jTextFielddreturned.setText("");
//        jTextFieldserviceticketid.setText("");
//        jTextFieldsticketNo.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldSalesPersonFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalesPersonFirstNameKeyPressed
  jTextFieldSalesPersonFirstName.getText();
        if(evt.getKeyCode() > 47 && evt.getKeyCode()< 59)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Digits are not allowed in First Name" );
            String textFirstName = jTextFieldSalesPersonFirstName.getText();
            evt.setKeyCode(8);
        }   



        if(evt.getKeyCode() == 10)
        {
            jTextFieldSalesPersonLastName.requestFocus(true);
     }        


// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesPersonFirstNameKeyPressed

    private void jTextFieldSalesPersonLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalesPersonLastNameKeyPressed
  jTextFieldSalesPersonLastName.getText();
        if(evt.getKeyCode() > 47 && evt.getKeyCode()< 59)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Digits are not allowed in Last Name" );
            String textFirstName = jTextFieldSalesPersonLastName.getText();
            evt.setKeyCode(8);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesPersonLastNameKeyPressed

    private void jTextFieldSalesPersonIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSalesPersonIDKeyPressed



        if(evt.getKeyCode() == 10)
        {
            jTextFieldSalesPersonFirstName.requestFocus(true);
     }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesPersonIDKeyPressed

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
            java.util.logging.Logger.getLogger(JFrameSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSalesPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonDeleteSalesPerson;
    private javax.swing.JButton jButtonSalesPersonAddNewData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableShowallrecordsaleasperson;
    private javax.swing.JTextField jTextFieldSalesPersonFirstName;
    private javax.swing.JTextField jTextFieldSalesPersonID;
    private javax.swing.JTextField jTextFieldSalesPersonLastName;
    // End of variables declaration//GEN-END:variables
}
