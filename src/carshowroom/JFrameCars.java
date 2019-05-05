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
public class JFrameCars extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCars
     */
    public JFrameCars() {
        initComponents();
        showCars();
    }
    
    public ArrayList<Cars> getCarsList()
   {
       ArrayList<Cars>Carslist = new ArrayList<Cars>();
      try
        {
            ClassDBConnectivity databaseConnectivity = new ClassDBConnectivity();
            Connection connection = databaseConnectivity.getDatabaseConnectivity();
//            Statement statement = connection.createStatement();
//            
            String query1 = "select * from Car_T";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
           Cars carc;
           while(rs.next())
           {
               carc = new Cars(rs.getString("CarID"), rs.getInt("Serialnumber"),rs.getString("Model"),rs.getString("Color"));
               Carslist.add(carc);
           }
            
        }
       catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(null, e);
                   
        }
       
      return Carslist;
   }
    
    public void showCars()
    {
        ArrayList<Cars>  listintablecar = getCarsList();
        DefaultTableModel modelCar = (DefaultTableModel)jTableShowAllRecordCar.getModel();
        
        Object[] row = new Object[4];
       for(int i = 0; i < listintablecar.size(); i++)
       {
           row[0] = listintablecar.get(i).getCarID();
           row[1] = listintablecar.get(i).getSerialNo();
           row[2] = listintablecar.get(i).getModel();
           row[3] = listintablecar.get(i).getColor();
           
           
           
           modelCar.addRow(row);
       }
    }
    
    public void executeSQLQuery(String queryCar,String message)
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
               if(st.executeUpdate(queryCar) == 1)
               {
                   
                 DefaultTableModel modelCar = (DefaultTableModel)jTableShowAllRecordCar.getModel();
                 modelCar.setRowCount(0);
                 showCars();
                 
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
            JOptionPane.showMessageDialog(null, "Primary Key Mismatch.Please Choose Unique Primary Key");
                   
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldCarID = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldSerialN = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextFieldModel = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldCarColor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableShowAllRecordCar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Dealing Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        jLabel1.setText("CAr");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 20, 100, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/home.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(933, 0, 100, 59);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/LOG.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 0, 90, 59);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Serial No.");
        jPanel6.add(jLabel36);
        jLabel36.setBounds(20, 70, 80, 17);

        jTextFieldCarID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCarID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCarIDKeyPressed(evt);
            }
        });
        jPanel6.add(jTextFieldCarID);
        jTextFieldCarID.setBounds(120, 20, 110, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Car ID");
        jPanel6.add(jLabel37);
        jLabel37.setBounds(20, 20, 70, 17);

        jTextFieldSerialN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSerialN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSerialNKeyPressed(evt);
            }
        });
        jPanel6.add(jTextFieldSerialN);
        jTextFieldSerialN.setBounds(120, 70, 110, 20);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Model");
        jPanel6.add(jLabel38);
        jLabel38.setBounds(260, 70, 70, 17);

        jTextFieldModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModelActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldModel);
        jTextFieldModel.setBounds(360, 70, 110, 20);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Color");
        jPanel6.add(jLabel39);
        jLabel39.setBounds(260, 20, 70, 17);

        jTextFieldCarColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCarColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCarColorKeyPressed(evt);
            }
        });
        jPanel6.add(jTextFieldCarColor);
        jTextFieldCarColor.setBounds(360, 20, 110, 20);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/insert.png"))); // NOI18N
        jButton3.setText("INSERT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/delete.jpg"))); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carshowroom/clear.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(83, 83, 83)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableShowAllRecordCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableShowAllRecordCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car ID", "Serial No", "Model", "Color"
            }
        ));
        jTableShowAllRecordCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowAllRecordCarMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableShowAllRecordCar);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
        new JFrameMain().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String queryCar = "insert into Car_T(CarID,Serialnumber,Model,Color) values('"+jTextFieldCarID.getText()+"','"+jTextFieldSerialN.getText()+"','"+jTextFieldModel.getText()+"','"+jTextFieldCarColor.getText()+"') ";
        executeSQLQuery(queryCar,"Inserted");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         String queryCar = "update Car_T set Serialnumber='"+jTextFieldSerialN.getText()+"',Model='"+jTextFieldModel.getText()+"',Color='"+jTextFieldCarColor.getText()+"' where CarID='"+jTextFieldCarID.getText()+"'" ;
        executeSQLQuery(queryCar,"Updated");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
         String queryCar = "DELETE FROM Car_T WHERE CarID = '"+jTextFieldCarID.getText()+"'" ;
         executeSQLQuery(queryCar,"Deleted");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTableShowAllRecordCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowAllRecordCarMouseClicked
        int i = jTableShowAllRecordCar.getSelectedRow();
        TableModel modelCar = jTableShowAllRecordCar.getModel();
        jTextFieldCarID.setText(modelCar.getValueAt(i,0).toString());
        jTextFieldSerialN.setText(modelCar.getValueAt(i,1).toString());
        jTextFieldModel.setText(modelCar.getValueAt(i,2).toString());
        jTextFieldCarColor.setText(modelCar.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTableShowAllRecordCarMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        jTextFieldCarColor.setText("");
        jTextFieldCarID.setText("");
        jTextFieldModel.setText("");
        jTextFieldSerialN.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldSerialNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerialNKeyPressed
         if((evt.getKeyCode() < 48 || evt.getKeyCode() > 57))
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Alphabet or Special Characters are not allowed");
            jTextFieldSerialN.setText("");
        } 
         
         


        if(evt.getKeyCode() == 10)
        {
            jTextFieldCarColor.requestFocus(true);
     }
    }//GEN-LAST:event_jTextFieldSerialNKeyPressed

    private void jTextFieldCarColorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCarColorKeyPressed
         jTextFieldCarColor.getText();
        if(evt.getKeyCode() > 47 && evt.getKeyCode()< 59)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Digits are not allowed in name" );
            String textFirstName = jTextFieldCarColor.getText();
            evt.setKeyCode(8);
        }
        


        if(evt.getKeyCode() == 10)
        {
            jTextFieldModel.requestFocus(true);
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCarColorKeyPressed

    private void jTextFieldCarIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCarIDKeyPressed
  if(evt.getKeyCode() == 10)
        {
            jTextFieldSerialN.requestFocus(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCarIDKeyPressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableShowAllRecordCar;
    private javax.swing.JTextField jTextFieldCarColor;
    private javax.swing.JTextField jTextFieldCarID;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldSerialN;
    // End of variables declaration//GEN-END:variables
}
