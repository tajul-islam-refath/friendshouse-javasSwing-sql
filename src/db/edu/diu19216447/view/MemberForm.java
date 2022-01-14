package db.edu.diu19216447.view;

import bd.edu.diu19216447.controller.MemberController;
import bd.edu.diu19216447.model.Member;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class MemberForm extends javax.swing.JInternalFrame {

    private int selectedId = -1;

    public MemberForm() {
        initComponents();
       loadTableData();

//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        pack();
//        setSize(screenSize.width, screenSize.height);
        mTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = mTable.getSelectedRow();
                if (selectedRow >= 0) {
                    DefaultTableModel dft = (DefaultTableModel) mTable.getModel();
                    String id = dft.getValueAt(selectedRow, 0).toString();
                    String name = dft.getValueAt(selectedRow, 1).toString();
                    String email = dft.getValueAt(selectedRow, 2).toString();
                    String password = dft.getValueAt(selectedRow, 3).toString();
                    String address = dft.getValueAt(selectedRow, 4).toString();
                    String phone = dft.getValueAt(selectedRow, 5).toString();
                    String nid = dft.getValueAt(selectedRow, 6).toString();
                    String role = dft.getValueAt(selectedRow, 7).toString();
                    String status = dft.getValueAt(selectedRow, 8).toString();

//                    jT_selectedId.setText(id);
                    JTName.setText(name);
                    JTEmail.setText(email);
                    jTPassword.setText(password);
                    jTAddress.setText(address);
                    jTPhone.setText(phone);
                    jTNid.setText(nid);
//                    jCRole.addItem(role);
//                    jCStatus.addItem(status);
                    selectedId = Integer.parseInt(id);
                    if (selectedId != -1) {
                        selectIdLable.setText("Selected Item Id : " + id);
                    }

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLName = new javax.swing.JLabel();
        JTName = new javax.swing.JTextField();
        JTEmail = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jTAddress = new javax.swing.JTextField();
        jLName3 = new javax.swing.JLabel();
        jTPhone = new javax.swing.JTextField();
        jLName4 = new javax.swing.JLabel();
        jTNid = new javax.swing.JTextField();
        jLName5 = new javax.swing.JLabel();
        jTPassword = new javax.swing.JPasswordField();
        jLName6 = new javax.swing.JLabel();
        jLName7 = new javax.swing.JLabel();
        jCStatus = new javax.swing.JComboBox<>();
        jCRole = new javax.swing.JComboBox<>();
        JBSave = new javax.swing.JButton();
        jBUpdate = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        selectIdLable = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(360, 360));

        jPanel5.setBackground(new java.awt.Color(33, 47, 60));

        jLName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLName.setForeground(new java.awt.Color(255, 255, 255));
        jLName.setText("Name");

        JTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTNameActionPerformed(evt);
            }
        });

        JTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTEmailActionPerformed(evt);
            }
        });

        jLEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLEmail.setText("Email");

        jLPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLPassword.setText("Password");

        jTAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAddressActionPerformed(evt);
            }
        });

        jLName3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLName3.setForeground(new java.awt.Color(255, 255, 255));
        jLName3.setText("Address");

        jTPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPhoneActionPerformed(evt);
            }
        });

        jLName4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLName4.setForeground(new java.awt.Color(255, 255, 255));
        jLName4.setText("Phone");

        jTNid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNidActionPerformed(evt);
            }
        });

        jLName5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLName5.setForeground(new java.awt.Color(255, 255, 255));
        jLName5.setText("NID");

        jLName6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLName6.setForeground(new java.awt.Color(255, 255, 255));
        jLName6.setText("Role");

        jLName7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLName7.setForeground(new java.awt.Color(255, 255, 255));
        jLName7.setText("Status");

        jCStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "deactive" }));

        jCRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "regular", "manager", "guest" }));

        JBSave.setText("Save");
        JBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaveActionPerformed(evt);
            }
        });

        jBUpdate.setText("Update");
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });

        jBClear.setText("Clear");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jBDelete.setText("Delete");

        selectIdLable.setBackground(new java.awt.Color(255, 255, 255));
        selectIdLable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        selectIdLable.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(selectIdLable, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLName7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLName6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCRole, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLName5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTNid, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLName4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addComponent(jLName3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTPassword))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(JTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(JTName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(JBSave)
                        .addGap(18, 18, 18)
                        .addComponent(jBUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jBDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jBClear)
                        .addGap(47, 47, 47))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(selectIdLable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCRole, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCStatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSave)
                    .addComponent(jBUpdate)
                    .addComponent(jBClear)
                    .addComponent(jBDelete))
                .addGap(70, 70, 70))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null , null , null , null , null},

            },
            new String [] {
                "ID", "Name", "Email",
                "Password","Address","Phone","NID","Role","Status"
            }
        ));
        jScrollPane1.setViewportView(mTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTNameActionPerformed

    private void JTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTEmailActionPerformed

    private void jTAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAddressActionPerformed

    private void jTPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPhoneActionPerformed

    private void jTNidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNidActionPerformed

    }//GEN-LAST:event_jTNidActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        clear();
    }//GEN-LAST:event_jBClearActionPerformed

    @SuppressWarnings("deprecation")
    private void JBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaveActionPerformed
        if (JTName.getText().isEmpty()
                || JTEmail.getText().isEmpty()
                || jTPassword.getPassword().equals("")
                || jTAddress.getText().isEmpty()
                || jTPhone.getText().isEmpty()
                || jTNid.getText().isEmpty()
                ) {
            JOptionPane.showMessageDialog(this, "Fill up all the input box !");
        } else {
            Member m = new Member();

            m.setName(JTName.getText());
            m.setEmail(JTEmail.getText());
            m.setPassword(jTPassword.getText());
            m.setAddress(jTAddress.getText());
            m.setPhone(jTPhone.getText());
            m.setNid(jTNid.getText());
            m.setRole(jCRole.getSelectedItem().toString().toLowerCase());
            m.setStatus(jCStatus.getSelectedItem().toString().toLowerCase());

            MemberController mc = new MemberController();
//        boolean rs = m.save();
            if (mc.saveMember(m) == true) {
                JOptionPane.showMessageDialog(this, "New member is created!");
                clear();
                loadTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Member cannot be created! Please try again");
            }
        }


    }//GEN-LAST:event_JBSaveActionPerformed

    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed

        if (selectedId == -1) {
            JOptionPane.showMessageDialog(this, "Select a member !");
        } else {
            Member m = new Member();

            m.setmId(selectedId);
            m.setName(JTName.getText());
            m.setEmail(JTEmail.getText());
            m.setAddress(jTAddress.getText());
            m.setPhone(jTPhone.getText());
            m.setNid(jTNid.getText());
            m.setRole(jCRole.getSelectedItem().toString().toLowerCase());
            m.setStatus(jCStatus.getSelectedItem().toString().toLowerCase());

            MemberController mc = new MemberController();

            if (mc.updateMember(m) == true) {
                JOptionPane.showMessageDialog(this, "Member update success!");
                clear();
                loadTableData();
            } else {
                JOptionPane.showMessageDialog(this, "Member cannot be updated! Please try again");
            }
        }


    }//GEN-LAST:event_jBUpdateActionPerformed

    @SuppressWarnings("unchecked")
    private void loadTableData() {
        MemberController mc = new MemberController();
//        Member mc = new Member();
        ArrayList<Member> allMembers = mc.getMembers();
        DefaultTableModel DTM = (DefaultTableModel) mTable.getModel();
        DTM.setRowCount(0);

        for (int i = 0; i < allMembers.size(); i++) {
            Vector v = new Vector();
            Member m = allMembers.get(i);
            v.add(m.getmId());
            v.add(m.getName());
            v.add(m.getEmail());
            v.add(m.getPassword());
            v.add(m.getAddress());
            v.add(m.getPhone());
            v.add(m.getNid());
            v.add(m.getRole());
            v.add(m.getStatus());

            DTM.addRow(v);
        }

//        System.out.println(allMembers);
    }

    public void clear() {
        JTName.setText("");
        JTEmail.setText("");
        jTPassword.setText("");
        jTAddress.setText("");
        jTNid.setText("");
        jTPhone.setText("");
        selectIdLable.setText("");
        selectedId = -1;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSave;
    private javax.swing.JTextField JTEmail;
    private javax.swing.JTextField JTName;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBUpdate;
    private javax.swing.JComboBox<String> jCRole;
    private javax.swing.JComboBox<String> jCStatus;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLName3;
    private javax.swing.JLabel jLName4;
    private javax.swing.JLabel jLName5;
    private javax.swing.JLabel jLName6;
    private javax.swing.JLabel jLName7;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAddress;
    private javax.swing.JTextField jTNid;
    private javax.swing.JPasswordField jTPassword;
    private javax.swing.JTextField jTPhone;
    private javax.swing.JTable mTable;
    private javax.swing.JLabel selectIdLable;
    // End of variables declaration//GEN-END:variables
}
