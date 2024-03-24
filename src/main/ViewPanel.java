/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ARAY KALYANI
 */
public class ViewPanel extends javax.swing.JPanel {

   
    
    JPanel bottomPanel;
    private ArrayList<User> users;
    private User selectedUser;
    
    
    public ViewPanel(JPanel bottomPanel) {
        initComponents();
       
        this.bottomPanel = bottomPanel;
        populateTable();
    }
    

    public void populateTable() {
        try{
            this.users = DatabaseConnector.getAllusers();
            
            DefaultTableModel tableModel = (DefaultTableModel) userDataTable.getModel();
            tableModel.setRowCount(0);
            for (User u: users){
                
                String[] userData = {String.valueOf(u.getId()),u.getName(),String.valueOf(u.getAge()),u.getEmail()};

                tableModel.addRow(userData);
            }
            
            clearFields();
           
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clearFields(){
        
        nameTextField.setText("");
        ageTextField.setText("");
        emailTextField.setText("");
      
      selectedUser = null;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userDataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        updateUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        saveUser = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();

        userDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Email"
            }
        ));
        userDataTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(userDataTable);
        userDataTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("User Details");

        jLabel2.setText("Name");

        jLabel3.setText("Age");

        updateUser.setText("Update User");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });

        deleteUser.setText("Delete User");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        saveUser.setText("Save User");
        saveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField)
                            .addComponent(ageTextField)
                            .addComponent(emailTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(updateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(updateUser)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUser)
                        .addGap(20, 20, 20)
                        .addComponent(saveUser)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        // TODO add your handling code here:
        try{
            int selectedRowIndex = userDataTable.getSelectedRow();
            if(selectedRowIndex < 0 ){

                throw new IllegalArgumentException("Select any one user details to delete");

            }
            else{

                DefaultTableModel model = (DefaultTableModel) userDataTable.getModel();              
                selectedUser = users.get(selectedRowIndex);
                DatabaseConnector.deleteUser(selectedUser);
                JOptionPane.showMessageDialog(null, "User Data Successfully Deleted","Successfully Deleted",JOptionPane.INFORMATION_MESSAGE);
                clearFields();
                populateTable();
            }

        }
        catch (IllegalArgumentException e){

            JOptionPane.showMessageDialog(this, e.getMessage(),"Data Selection Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Data Deletion Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_deleteUserActionPerformed

    private void saveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserActionPerformed
        // TODO add your handling code here:
         try{
            
            if (selectedUser == null){
                throw new IllegalArgumentException("Not Selected any user to edit");
                
            }
            else{
                User newUser = new User();
                newUser.setName(nameTextField.getText());
                newUser.setAge(Integer.parseInt(ageTextField.getText()));
                newUser.setEmail(emailTextField.getText());
                DatabaseConnector.editUser(selectedUser,newUser);
                if ((selectedUser.getName().equals(newUser.getName())) && (selectedUser.getAge() == newUser.getAge())){

                    throw new IllegalArgumentException("Updating data is same as old, please update with new data");
                }   
                clearFields();
                populateTable();
            }
        
            
        }  
        catch (IllegalArgumentException e){
            if ("not selected any user to edit".equals(e.getMessage().toLowerCase())){
                JOptionPane.showMessageDialog(this, "Please Select any of the Users to Update","Data Updation Error",JOptionPane.ERROR_MESSAGE);
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Please change the existing data before saving the details","Data Updation Error",JOptionPane.ERROR_MESSAGE);
            }
            
   
        }
    }//GEN-LAST:event_saveUserActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
        try{
            
            int selectedRowIndex = userDataTable.getSelectedRow();
            if (selectedRowIndex<0){
                throw new IllegalArgumentException("Select any one user to edit");
            }
           
            else{
                selectedUser = users.get(selectedRowIndex);
                nameTextField.setText(selectedUser.getName());
                ageTextField.setText(String.valueOf(selectedUser.getAge()));
                emailTextField.setText(selectedUser.getEmail());
            }
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateUserActionPerformed

    public void clearAll(){
        ageTextField.setText("");
        ageTextField.setText("");
        
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton deleteUser;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveUser;
    private javax.swing.JButton updateUser;
    private javax.swing.JTable userDataTable;
    // End of variables declaration//GEN-END:variables
}

