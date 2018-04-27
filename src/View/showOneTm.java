/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Eider
 */

import org.jdesktop.swingx.JXDatePicker;

public class showOneTm extends javax.swing.JFrame {

    /**
     * Creates new form addCompetition
     */
    public showOneTm() {
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
        jLabel_codeTm = new javax.swing.JLabel();
        jLabel_townTm = new javax.swing.JLabel();
        jLabel_countryTm = new javax.swing.JLabel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_viewTitle = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_codeTitle = new javax.swing.JLabel();
        jLabel_countryTitle = new javax.swing.JLabel();
        jLabel_townTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 50, 46)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_codeTm.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_codeTm.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_codeTm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 200, 40));

        jLabel_townTm.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_townTm.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_townTm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 200, 40));

        jLabel_countryTm.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_countryTm.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_countryTm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 200, 40));

        jPanel_header.setBackground(new java.awt.Color(52, 50, 46));
        jPanel_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_headerMouseDragged(evt);
            }
        });
        jPanel_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_headerMousePressed(evt);
            }
        });
        jPanel_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/30x30_exit4.png"))); // NOI18N
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });
        jPanel_header.add(jLabel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 50));

        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/30x30_minimize_1.png"))); // NOI18N
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
        });
        jPanel_header.add(jLabel_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 50, 50));

        jLabel_viewTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_viewTitle.setForeground(new java.awt.Color(210, 87, 34));
        jLabel_viewTitle.setText("TEAM PROFILE");
        jPanel_header.add(jLabel_viewTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 30));

        jPanel1.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jLabel_name.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 420, 50));

        jLabel_codeTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_codeTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_codeTitle.setText("Code:");
        jPanel1.add(jLabel_codeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 40));

        jLabel_countryTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_countryTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_countryTitle.setText("Country:");
        jPanel1.add(jLabel_countryTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 40));

        jLabel_townTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_townTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_townTitle.setText("Town:");
        jPanel1.add(jLabel_townTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jPanel_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel_headerMouseDragged

    private void jPanel_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_headerMousePressed

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(showOneTm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showOneTm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showOneTm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showOneTm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showOneTm().setVisible(true);
            }
        });
    }

    int xMouse;
    int yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_codeTitle;
    public javax.swing.JLabel jLabel_codeTm;
    private javax.swing.JLabel jLabel_countryTitle;
    public javax.swing.JLabel jLabel_countryTm;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_minimize;
    public javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_townTitle;
    public javax.swing.JLabel jLabel_townTm;
    private javax.swing.JLabel jLabel_viewTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_header;
    // End of variables declaration//GEN-END:variables
}
