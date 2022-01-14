package db.edu.diu19216447.view;

import bd.edu.diu19216447.model.LoggedInMember;
import bd.edu.diu19216447.model.Member;

@SuppressWarnings("serial")
public class Main extends javax.swing.JFrame {

    @SuppressWarnings("PackageVisibleField")
    Member loggedInMember = LoggedInMember.getInstance().getMember();

    public Main() {
        initComponents();
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        if (!"manager".equals(loggedInMember.getRole())) {
            memberMenu.setVisible(false);
            shoppingMenu.setVisible(false);
            depositMenu1.setVisible(false);
            fixedExMenu.setVisible(false);
            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        desktopPanel = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        memberMenu = new javax.swing.JMenu();
        shoppingMenu = new javax.swing.JMenu();
        fsMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        depositMenu1 = new javax.swing.JMenu();
        fixedExMenu = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(33, 47, 60));

        desktopPanel.setBackground(new java.awt.Color(33, 47, 60));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(desktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel)
        );

        memberMenu.setText("Member");
        memberMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                memberMenuMousePressed(evt);
            }
        });
        MenuBar.add(memberMenu);

        shoppingMenu.setText("Shopping");

        fsMenu.setText("Food Shopping");
        fsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsMenuActionPerformed(evt);
            }
        });
        shoppingMenu.add(fsMenu);

        jMenuItem2.setText("Other Shopping");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        shoppingMenu.add(jMenuItem2);

        MenuBar.add(shoppingMenu);

        depositMenu1.setText("Deposit");
        depositMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                depositMenu1MousePressed(evt);
            }
        });
        MenuBar.add(depositMenu1);

        fixedExMenu.setText("Fixed Expense");
        fixedExMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fixedExMenuMousePressed(evt);
            }
        });
        MenuBar.add(fixedExMenu);

        jMenu3.setText("Payment");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        MenuBar.add(jMenu3);

        jMenu2.setText("Profile");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        MenuBar.add(jMenu2);

        jMenu4.setText("Meal");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
        });
        MenuBar.add(jMenu4);

        jMenu5.setText("Report");
        jMenu5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu5MouseDragged(evt);
            }
        });
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });
        MenuBar.add(jMenu5);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberMenuMousePressed
        MemberForm mf = new MemberForm();
        mf.setVisible(true);
        desktopPanel.add(mf);
    }//GEN-LAST:event_memberMenuMousePressed

    private void depositMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMenu1MousePressed
        DepositForm df = new DepositForm();
        df.setVisible(true);
        desktopPanel.add(df);
    }//GEN-LAST:event_depositMenu1MousePressed

    private void fsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsMenuActionPerformed
        FoodShoppingView fsv = new FoodShoppingView();
        fsv.setVisible(true);
        desktopPanel.add(fsv);
    }//GEN-LAST:event_fsMenuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        OtherShoppingView osv = new OtherShoppingView();
        osv.setVisible(true);
        desktopPanel.add(osv);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void fixedExMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fixedExMenuMousePressed
        FixedExpenseView fxv = new FixedExpenseView();
        fxv.setVisible(true);
        desktopPanel.add(fxv);
    }//GEN-LAST:event_fixedExMenuMousePressed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        PaymentView pv = new PaymentView();
        pv.setVisible(true);
        desktopPanel.add(pv);
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
        MealView mv = new MealView();
        mv.setVisible(true);
        desktopPanel.add(mv);
    }//GEN-LAST:event_jMenu4MousePressed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        // TODO add your handling code here:
        ProfileView pv = new ProfileView();
        pv.setVisible(true);
        desktopPanel.add(pv);
    }//GEN-LAST:event_jMenu2MousePressed

    private void jMenu5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseDragged

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        ReportView rv = new ReportView();
        rv.setVisible(true);
        desktopPanel.add(rv);

    }//GEN-LAST:event_jMenu5MousePressed

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu depositMenu1;
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenu fixedExMenu;
    private javax.swing.JMenuItem fsMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu memberMenu;
    private javax.swing.JMenu shoppingMenu;
    // End of variables declaration//GEN-END:variables
}
