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

public class showOneRs extends javax.swing.JFrame {

    /**
     * Creates new form addCompetition
     */
    public showOneRs() {
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
        jLabel_codeRs = new javax.swing.JLabel();
        jLabel_genderRs = new javax.swing.JLabel();
        jLabel_disciplineRs = new javax.swing.JLabel();
        jLabel_athleteRs = new javax.swing.JLabel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_viewTitle = new javax.swing.JLabel();
        jLabel_dateRs = new javax.swing.JLabel();
        jLabel_positionRs = new javax.swing.JLabel();
        jLabel_timeRs = new javax.swing.JLabel();
        jLabel_roundRs = new javax.swing.JLabel();
        jLabel_competitionRs = new javax.swing.JLabel();
        jLabel_codeTitle = new javax.swing.JLabel();
        jLabel_competitionTitle = new javax.swing.JLabel();
        jLabel_disciplineTitle = new javax.swing.JLabel();
        jLabel_genderTitle = new javax.swing.JLabel();
        jLabel_athleteTitle = new javax.swing.JLabel();
        jLabel_roundTitle = new javax.swing.JLabel();
        jLabel_timeTitle = new javax.swing.JLabel();
        jLabel_positionTitle = new javax.swing.JLabel();
        jLabel_dateTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 50, 46)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_codeRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_codeRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_codeRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 200, 40));

        jLabel_genderRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_genderRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_genderRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 200, 40));

        jLabel_disciplineRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_disciplineRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_disciplineRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 200, 40));

        jLabel_athleteRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_athleteRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_athleteRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 200, 40));

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
        jLabel_viewTitle.setText("RESULT INFO");
        jPanel_header.add(jLabel_viewTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 30));

        jPanel1.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jLabel_dateRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_dateRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_dateRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 200, 40));

        jLabel_positionRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_positionRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_positionRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 200, 40));

        jLabel_timeRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_timeRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_timeRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 40));

        jLabel_roundRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_roundRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_roundRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 200, 40));

        jLabel_competitionRs.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_competitionRs.setForeground(new java.awt.Color(52, 50, 46));
        jPanel1.add(jLabel_competitionRs, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 200, 40));

        jLabel_codeTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_codeTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_codeTitle.setText("Code:");
        jPanel1.add(jLabel_codeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 40));

        jLabel_competitionTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_competitionTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_competitionTitle.setText("Competition:");
        jPanel1.add(jLabel_competitionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 40));

        jLabel_disciplineTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_disciplineTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_disciplineTitle.setText("Discipline:");
        jPanel1.add(jLabel_disciplineTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 40));

        jLabel_genderTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_genderTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_genderTitle.setText("Gender:");
        jPanel1.add(jLabel_genderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 40));

        jLabel_athleteTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_athleteTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_athleteTitle.setText("Athlete:");
        jPanel1.add(jLabel_athleteTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 40));

        jLabel_roundTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_roundTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_roundTitle.setText("Round:");
        jPanel1.add(jLabel_roundTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, 40));

        jLabel_timeTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_timeTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_timeTitle.setText("Time:");
        jPanel1.add(jLabel_timeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 40));

        jLabel_positionTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_positionTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_positionTitle.setText("Position:");
        jPanel1.add(jLabel_positionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, 40));

        jLabel_dateTitle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_dateTitle.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_dateTitle.setText("Date:");
        jPanel1.add(jLabel_dateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 40));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public javax.swing.JLabel jLabel_athleteRs;
    private javax.swing.JLabel jLabel_athleteTitle;
    public javax.swing.JLabel jLabel_codeRs;
    private javax.swing.JLabel jLabel_codeTitle;
    public javax.swing.JLabel jLabel_competitionRs;
    private javax.swing.JLabel jLabel_competitionTitle;
    public javax.swing.JLabel jLabel_dateRs;
    private javax.swing.JLabel jLabel_dateTitle;
    public javax.swing.JLabel jLabel_disciplineRs;
    private javax.swing.JLabel jLabel_disciplineTitle;
    private javax.swing.JLabel jLabel_exit;
    public javax.swing.JLabel jLabel_genderRs;
    private javax.swing.JLabel jLabel_genderTitle;
    private javax.swing.JLabel jLabel_minimize;
    public javax.swing.JLabel jLabel_positionRs;
    private javax.swing.JLabel jLabel_positionTitle;
    public javax.swing.JLabel jLabel_roundRs;
    private javax.swing.JLabel jLabel_roundTitle;
    public javax.swing.JLabel jLabel_timeRs;
    private javax.swing.JLabel jLabel_timeTitle;
    private javax.swing.JLabel jLabel_viewTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_header;
    // End of variables declaration//GEN-END:variables
}
