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

public class showOneComp extends javax.swing.JFrame {

    /**
     * Creates new form addCompetition
     */
    public showOneComp() {
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
        jLabel_codeComp = new javax.swing.JLabel();
        jLabel_locationComp = new javax.swing.JLabel();
        jLabel_descriptionComp = new javax.swing.JLabel();
        jLabel_startDateComp = new javax.swing.JLabel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_viewTitle = new javax.swing.JLabel();
        jLabel_endDateComp = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_codeTitle = new javax.swing.JLabel();
        jLabel_descriptionTitle = new javax.swing.JLabel();
        jLabel_locationTitle = new javax.swing.JLabel();
        jLabel_startDateTitle = new javax.swing.JLabel();
        jLabel_endDateTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 50, 46)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_codeComp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_codeComp.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_codeComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 200, 40));

        jLabel_locationComp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_locationComp.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_locationComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 200, 40));

        jLabel_descriptionComp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_descriptionComp.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_descriptionComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 200, 40));

        jLabel_startDateComp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_startDateComp.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_startDateComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 200, 40));

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
        jLabel_viewTitle.setText("COMPETITION INFO");
        jPanel_header.add(jLabel_viewTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 30));

        jPanel1.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jLabel_endDateComp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_endDateComp.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_endDateComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 40));

        jLabel_name.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 420, 50));

        jLabel_codeTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_codeTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_codeTitle.setText("Code:");
        jPanel1.add(jLabel_codeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 40));

        jLabel_descriptionTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_descriptionTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_descriptionTitle.setText("Description:");
        jPanel1.add(jLabel_descriptionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 40));

        jLabel_locationTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_locationTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_locationTitle.setText("Location:");
        jPanel1.add(jLabel_locationTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 40));

        jLabel_startDateTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_startDateTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_startDateTitle.setText("Start Date:");
        jPanel1.add(jLabel_startDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 40));

        jLabel_endDateTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_endDateTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_endDateTitle.setText("End Date:");
        jPanel1.add(jLabel_endDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 40));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    int xMouse;
    int yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel_codeComp;
    private javax.swing.JLabel jLabel_codeTitle;
    public javax.swing.JLabel jLabel_descriptionComp;
    private javax.swing.JLabel jLabel_descriptionTitle;
    public javax.swing.JLabel jLabel_endDateComp;
    private javax.swing.JLabel jLabel_endDateTitle;
    private javax.swing.JLabel jLabel_exit;
    public javax.swing.JLabel jLabel_locationComp;
    private javax.swing.JLabel jLabel_locationTitle;
    private javax.swing.JLabel jLabel_minimize;
    public javax.swing.JLabel jLabel_name;
    public javax.swing.JLabel jLabel_startDateComp;
    private javax.swing.JLabel jLabel_startDateTitle;
    private javax.swing.JLabel jLabel_viewTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_header;
    // End of variables declaration//GEN-END:variables
}
