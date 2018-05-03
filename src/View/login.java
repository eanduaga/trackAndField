package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

/**
 *
 * @author Eider
 */
public class login extends javax.swing.JFrame {

    //Color cOrange = Color.decode("#d25722");
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setLocationRelativeTo(null);
        jIcon_trackAndField.requestFocusInWindow();
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
        jPanel_login = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jSeparator_password = new javax.swing.JSeparator();
        jSeparator_username = new javax.swing.JSeparator();
        jButton_login = new javax.swing.JButton();
        jIcon_trackAndField = new javax.swing.JLabel();
        jPanel_app = new javax.swing.JPanel();
        jLabel_continueToApp = new javax.swing.JLabel();
        jLabel_newAccount = new javax.swing.JLabel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel_forgotPasswd = new javax.swing.JLabel();

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
        setUndecorated(true);
        setResizable(false);

        jPanel_login.setBackground(new java.awt.Color(52, 50, 46));
        jPanel_login.setPreferredSize(new java.awt.Dimension(472, 702));
        jPanel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_username.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_username.setText("USERNAME:");
        jPanel_login.add(jLabel_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel_password.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("PASSWORD:");
        jPanel_login.add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jTextField_username.setBackground(new java.awt.Color(52, 50, 46));
        jTextField_username.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_username.setText("Enter your username");
        jTextField_username.setBorder(null);
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jPanel_login.add(jTextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 300, 30));

        jPasswordField_password.setBackground(new java.awt.Color(52, 50, 46));
        jPasswordField_password.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_password.setText("strongPassword");
        jPasswordField_password.setBorder(null);
        jPasswordField_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusLost(evt);
            }
        });
        jPanel_login.add(jPasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 300, 30));

        jSeparator_password.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_login.add(jSeparator_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 300, 10));

        jSeparator_username.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_login.add(jSeparator_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 300, 10));

        jButton_login.setBackground(new java.awt.Color(255, 255, 255));
        jButton_login.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(52, 50, 46));
        jButton_login.setText("LOG IN");
        jButton_login.setToolTipText("Log in");
        jButton_login.setBorder(null);
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_login.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 300, 50));

        jIcon_trackAndField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIcon_trackAndField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/rsz_trackandfieldicon-_-_copia.png"))); // NOI18N
        jPanel_login.add(jIcon_trackAndField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 130));

        jPanel_app.setBackground(new java.awt.Color(210, 87, 34));
        jPanel_app.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel_app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_continueToApp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_continueToApp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_continueToApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_continueToApp.setText("CONTINUE TO THE APPLICATION");
        jLabel_continueToApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_app.add(jLabel_continueToApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 50));

        jPanel_login.add(jPanel_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 750, 300, 50));

        jLabel_newAccount.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_newAccount.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_newAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_newAccount.setText("Create a new account");
        jLabel_newAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_newAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_newAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_newAccountMouseExited(evt);
            }
        });
        jPanel_login.add(jLabel_newAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 160, 20));

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
        jPanel_header.add(jLabel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 40, 40));

        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/30x30_minimize_1.png"))); // NOI18N
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
        });
        jPanel_header.add(jLabel_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 40));

        jPanel_login.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));
        jPanel_login.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 700, 150, 10));
        jPanel_login.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 150, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OR");
        jPanel_login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, 40, 40));

        jLabel_forgotPasswd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_forgotPasswd.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_forgotPasswd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_forgotPasswd.setText("Forgot your password?");
        jLabel_forgotPasswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_forgotPasswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_forgotPasswdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_forgotPasswdMouseExited(evt);
            }
        });
        jPanel_login.add(jLabel_forgotPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_login, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        if(jTextField_username.getText().equals(""))
        {
            jTextField_username.setText("Enter your username");
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordField_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusLost
        if(jPasswordField_password.getText().equals(""))
        {
            jPasswordField_password.setText("strongPassword");
        }
    }//GEN-LAST:event_jPasswordField_passwordFocusLost

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        if(jTextField_username.getText().equals("Enter your username"))
        {
            jTextField_username.setText("");
            jTextField_username.setCaretColor(Color.decode("#f2f2f2"));
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jPasswordField_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusGained
        if(jPasswordField_password.getText().equals("strongPassword"))
        {
            jPasswordField_password.setText("");
            jPasswordField_password.setCaretColor(Color.decode("#f2f2f2"));
        }
    }//GEN-LAST:event_jPasswordField_passwordFocusGained

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        System.exit(0);
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

    private void jLabel_forgotPasswdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_forgotPasswdMouseEntered
        original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_jLabel_forgotPasswdMouseEntered

    private void jLabel_forgotPasswdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_forgotPasswdMouseExited
        evt.getComponent().setFont(original);
    }//GEN-LAST:event_jLabel_forgotPasswdMouseExited

    private void jLabel_newAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_newAccountMouseEntered
        original = evt.getComponent().getFont();
        Map attributes = original.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        evt.getComponent().setFont(original.deriveFont(attributes));
    }//GEN-LAST:event_jLabel_newAccountMouseEntered

    private void jLabel_newAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_newAccountMouseExited
        evt.getComponent().setFont(original);
    }//GEN-LAST:event_jLabel_newAccountMouseExited

    int xMouse;
    int yMouse;
    Font original;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_login;
    private javax.swing.JLabel jIcon_trackAndField;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel_continueToApp;
    private javax.swing.JLabel jLabel_exit;
    public javax.swing.JLabel jLabel_forgotPasswd;
    private javax.swing.JLabel jLabel_minimize;
    public javax.swing.JLabel jLabel_newAccount;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_app;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JPanel jPanel_login;
    public javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator_password;
    private javax.swing.JSeparator jSeparator_username;
    public javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
