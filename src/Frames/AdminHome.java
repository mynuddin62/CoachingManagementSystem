/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author DELL
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnaddstudent = new javax.swing.JButton();
        btninsertnewresult = new javax.swing.JButton();
        btnregisteredstudents = new javax.swing.JButton();
        btnallstudentresults = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\srms images jframe\\images (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 150));

        jPanel2.setBackground(new java.awt.Color(255, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        btnaddstudent.setBackground(new java.awt.Color(204, 204, 204));
        btnaddstudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnaddstudent.setForeground(new java.awt.Color(51, 102, 255));
        btnaddstudent.setText("Add New Student");
        btnaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstudentActionPerformed(evt);
            }
        });

        btninsertnewresult.setBackground(new java.awt.Color(204, 204, 204));
        btninsertnewresult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btninsertnewresult.setForeground(new java.awt.Color(51, 102, 255));
        btninsertnewresult.setText("Insert New Result");
        btninsertnewresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertnewresultActionPerformed(evt);
            }
        });

        btnregisteredstudents.setBackground(new java.awt.Color(204, 204, 204));
        btnregisteredstudents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregisteredstudents.setForeground(new java.awt.Color(51, 102, 255));
        btnregisteredstudents.setText("Registered Students");
        btnregisteredstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisteredstudentsActionPerformed(evt);
            }
        });

        btnallstudentresults.setBackground(new java.awt.Color(204, 204, 204));
        btnallstudentresults.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnallstudentresults.setForeground(new java.awt.Color(51, 102, 255));
        btnallstudentresults.setText("All Students Result");
        btnallstudentresults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallstudentresultsActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 102, 255));
        btnlogout.setText("Log out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnregisteredstudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninsertnewresult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaddstudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnallstudentresults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnaddstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btninsertnewresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(btnregisteredstudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(btnallstudentresults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnlogout)
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstudentActionPerformed
        this.setVisible(false);
        new AddNewStudent().setVisible(true);
    }//GEN-LAST:event_btnaddstudentActionPerformed

    private void btninsertnewresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertnewresultActionPerformed
       this.setVisible(false);
       new InsertNewResult().setVisible(true);
    }//GEN-LAST:event_btninsertnewresultActionPerformed

    private void btnregisteredstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisteredstudentsActionPerformed
        this.setVisible(false);
        new RegisteredStudent().setVisible(true);
    }//GEN-LAST:event_btnregisteredstudentsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        this.setVisible(false);
        new LandingFrame().setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnallstudentresultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallstudentresultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnallstudentresultsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddstudent;
    private javax.swing.JButton btnallstudentresults;
    private javax.swing.JButton btninsertnewresult;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnregisteredstudents;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
