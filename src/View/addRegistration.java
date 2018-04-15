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
public class addRegistration extends javax.swing.JFrame {

    /**
     * Creates new form addCompetition
     */
    public addRegistration() {
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
        jLabel_competition = new javax.swing.JLabel();
        jLabel_athlete = new javax.swing.JLabel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_viewTitle = new javax.swing.JLabel();
        jButton_save = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jComboBox_athlete = new javax.swing.JComboBox<>();
        jComboBox_competition = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 50, 46)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_competition.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_competition.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_competition.setText("COMPETITION:");
        jPanel1.add(jLabel_competition, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel_athlete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_athlete.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_athlete.setText("ATHLETE:");
        jPanel1.add(jLabel_athlete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

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
        jPanel_header.add(jLabel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 50, 50));

        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/30x30_minimize_1.png"))); // NOI18N
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
        });
        jPanel_header.add(jLabel_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 50, 50));

        jLabel_viewTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_viewTitle.setForeground(new java.awt.Color(210, 87, 34));
        jLabel_viewTitle.setText("REGISTRATION");
        jPanel_header.add(jLabel_viewTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 30));

        jPanel1.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 50));

        jButton_save.setBackground(new java.awt.Color(163, 67, 26));
        jButton_save.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(52, 50, 46));
        jButton_save.setText("SAVE");
        jButton_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 140, 50));

        jButton_reset.setBackground(new java.awt.Color(163, 67, 26));
        jButton_reset.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton_reset.setForeground(new java.awt.Color(52, 50, 46));
        jButton_reset.setText("RESET");
        jButton_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, 50));

        jComboBox_athlete.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox_athlete.setForeground(new java.awt.Color(52, 50, 46));
        jComboBox_athlete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_athlete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 300, 30));

        jComboBox_competition.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox_competition.setForeground(new java.awt.Color(52, 50, 46));
        jComboBox_competition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox_competition, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(addRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addRegistration().setVisible(true);
            }
        });
    }

    int xMouse;
    int yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_reset;
    public javax.swing.JButton jButton_save;
    public javax.swing.JComboBox<String> jComboBox_athlete;
    public javax.swing.JComboBox<String> jComboBox_competition;
    private javax.swing.JLabel jLabel_athlete;
    private javax.swing.JLabel jLabel_competition;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_viewTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_header;
    // End of variables declaration//GEN-END:variables
}
