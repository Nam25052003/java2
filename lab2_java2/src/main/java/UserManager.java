
import javax.swing.DropMode;
import javax.swing.table.DefaultTableModel;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class UserManager extends javax.swing.JFrame {

    private DefaultTableModel tblmodel;
    private List<User> list = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        pnlUserList = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        rdioUser = new javax.swing.JRadioButton();
        rdioAdmin = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("User Manager");

        lblUsername.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblRole.setText("Role");

        buttonGroup1.add(rdioUser);
        rdioUser.setText("User");

        buttonGroup1.add(rdioAdmin);
        rdioAdmin.setText("Admin");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPassword)
                            .addGap(3, 3, 3))
                        .addComponent(lblUsername))
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdioUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdioAdmin))
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(rdioUser)
                    .addComponent(rdioAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlUserList.addTab("Edition", jPanel1);

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        pnlUserList.addTab("List", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pnlUserList, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlUserList, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public UserManager() {
        initComponents();
        setLocationRelativeTo(null);
        initTable();
        innitData();
        fillTable();
        tblList.setModel(tblmodel);
    }

    private void fillTable() {
        while (tblmodel.getRowCount() > 0) {
            tblmodel.removeRow(0);
        }
        for (User user : list) {
            tblmodel.addRow(new String[]{user.getUsename(), user.getPass(), user.getRole()});
        }
        tblmodel.fireTableDataChanged();
    }

    public void innitData() {
        list.add(new User("fpt", "polytechnic", "Admin"));
    }

    public void initTable() {
        tblmodel = new DefaultTableModel();
        String[] cols = new String[]{"Username", "Password", "Role"};
        tblmodel.setColumnIdentifiers(cols);
    }
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String userr = txtUsername.getText();
        String pass = txtPassword.getText();
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Username và password!!!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Username và password!!!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        User user = new User();
        user.setUsename(txtUsername.getText());
        user.setPass(txtPassword.getText());
        user.setRole(rdioUser.isSelected() ? "User" : "Admin");
        list.add(user);
        fillTable();
        JOptionPane.showMessageDialog(this, "Đã thêm người dùng");
        txtUsername.setText("");
        txtPassword.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Username và password!!!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (User user : list) {
            if (user.getUsename().equals(txtUsername.getText())) {
                int choice = (JOptionPane.showConfirmDialog(this, "Delete", "Confirm", JOptionPane.YES_NO_OPTION));
                if (choice == JOptionPane.YES_OPTION) {
                    list.remove(user);
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    txtUsername.setText("");
                    txtPassword.setText("");
                    buttonGroup1.clearSelection();
                    return;
                } else {
                    return;
                }
            }
        };
        JOptionPane.showMessageDialog(this, "Người dùng không tồn tại");
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Username và password!!!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Username và password!!!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (User user : list) {
            if (user.getUsename().equals(txtUsername.getText())) {
                int choice = (JOptionPane.showConfirmDialog(this, "Có muốn update không?", "Confirm", JOptionPane.YES_NO_OPTION));
                if (choice == JOptionPane.YES_OPTION) {
                    user.setPass(new String(txtPassword.getPassword()));
                    user.setRole(rdioUser.isSelected() ? "User" : "Admin");
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Đã cập nhập");
                    txtUsername.setText("");
                    txtPassword.setText("");
                    buttonGroup1.clearSelection();
                    return;
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        int i = tblList.getSelectedRow();
        if (i >= 0) {
            String username = (String) tblmodel.getValueAt(i, 0);
            for (User user : list) {
                if (user.getUsename().equals(username)) {
                    txtUsername.setText(user.getUsename());
                    txtPassword.setText(user.getPass());
                    if (user.getRole().equals("User")) {
                        rdioUser.setSelected(true);
                    } else {
                        rdioAdmin.setSelected(true);
                    }
                    return;
                }
            }
        }
    }//GEN-LAST:event_tblListMouseClicked

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
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManager().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTabbedPane pnlUserList;
    private javax.swing.JRadioButton rdioAdmin;
    private javax.swing.JRadioButton rdioUser;
    private javax.swing.JTable tblList;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
