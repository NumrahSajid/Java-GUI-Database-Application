/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimra Sajid
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Left = new javax.swing.JPanel();
        Manager = new javax.swing.JLabel();
        ManagerLogin = new javax.swing.JButton();
        P_Head = new javax.swing.JPanel();
        Search_Bikes = new javax.swing.JButton();
        Existing_Bikes_User = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Exit_Button = new javax.swing.JButton();
        P_Head1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        P_Right = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        UserProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Manager.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Manager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Manager.setText("              Manager");

        ManagerLogin.setText("Login");
        ManagerLogin.setToolTipText("");
        ManagerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_LeftLayout = new javax.swing.GroupLayout(P_Left);
        P_Left.setLayout(P_LeftLayout);
        P_LeftLayout.setHorizontalGroup(
            P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Manager, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(ManagerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_LeftLayout.setVerticalGroup(
            P_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(ManagerLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_Head.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Search_Bikes.setText("Search Bikes");
        Search_Bikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BikesActionPerformed(evt);
            }
        });

        Existing_Bikes_User.setText("View Existing Bikes");
        Existing_Bikes_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Existing_Bikes_UserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("   Bike Current Directory");

        javax.swing.GroupLayout P_HeadLayout = new javax.swing.GroupLayout(P_Head);
        P_Head.setLayout(P_HeadLayout);
        P_HeadLayout.setHorizontalGroup(
            P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_HeadLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Existing_Bikes_User, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(Search_Bikes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        P_HeadLayout.setVerticalGroup(
            P_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search_Bikes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Existing_Bikes_User)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        P_Head1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bike Rental System");

        javax.swing.GroupLayout P_Head1Layout = new javax.swing.GroupLayout(P_Head1);
        P_Head1.setLayout(P_Head1Layout);
        P_Head1Layout.setHorizontalGroup(
            P_Head1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Head1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        P_Head1Layout.setVerticalGroup(
            P_Head1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_Head1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        P_Right.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        User.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User.setText("                 User");

        UserProfile.setText("User Login");
        UserProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_RightLayout = new javax.swing.GroupLayout(P_Right);
        P_Right.setLayout(P_RightLayout);
        P_RightLayout.setHorizontalGroup(
            P_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        P_RightLayout.setVerticalGroup(
            P_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(UserProfile)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit_Button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(P_Head1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P_Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(P_Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(P_Head1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Exit_Button)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Existing_Bikes_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Existing_Bikes_UserActionPerformed
        ExistingBikes Obj = new ExistingBikes();
        Obj.setVisible(true);
    }//GEN-LAST:event_Existing_Bikes_UserActionPerformed

    private void Search_BikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BikesActionPerformed
//        SearchBike Obj = new SearchBike();
  //      Obj.setVisible(true);
    }//GEN-LAST:event_Search_BikesActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void UserProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserProfileActionPerformed
        
     //  UserProfile Obj = new UserProfile();
     //  Obj.setVisible(true);
     
     LoginUser Obj = new LoginUser();
     Obj.setVisible(true);
        
        
    }//GEN-LAST:event_UserProfileActionPerformed

    private void ManagerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerLoginActionPerformed

             LoginManager1 Obj = new LoginManager1();
       Obj.setVisible(true);
        

     
    }//GEN-LAST:event_ManagerLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Existing_Bikes_User;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JLabel Manager;
    private javax.swing.JButton ManagerLogin;
    private javax.swing.JPanel P_Head;
    private javax.swing.JPanel P_Head1;
    private javax.swing.JPanel P_Left;
    private javax.swing.JPanel P_Right;
    private javax.swing.JButton Search_Bikes;
    private javax.swing.JLabel User;
    private javax.swing.JButton UserProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
