/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Eider
 */
public class manageCoach extends javax.swing.JFrame {

    /**
     * Creates new form managePrueba
     */
    public manageCoach() {
        initComponents();
        JTableHeader header = jTable_coachData.getTableHeader();
        header.setFont(new Font("Century Gothic", Font.BOLD, 14));
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        jLabel_searchIcon.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_background = new javax.swing.JPanel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jPanel_leftMenu = new javax.swing.JPanel();
        jPanel_add = new javax.swing.JPanel();
        jLabel_add = new javax.swing.JLabel();
        leftPanel_add = new javax.swing.JPanel();
        jPanel_delete = new javax.swing.JPanel();
        jLabel_delete = new javax.swing.JLabel();
        leftPanel_delete = new javax.swing.JPanel();
        jPanel_change = new javax.swing.JPanel();
        jLabel_change = new javax.swing.JLabel();
        leftPanel_change = new javax.swing.JPanel();
        jTextField_search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_searchIcon = new javax.swing.JLabel();
        jLabel_viewCoach = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel_rightTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_coachData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel_background.setBackground(new java.awt.Color(242, 242, 242));
        jPanel_background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(52, 50, 46)));
        jPanel_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel_header.add(jLabel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 50));

        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/30x30_minimize_1.png"))); // NOI18N
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
        });
        jPanel_header.add(jLabel_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 50, 50));

        jLabel_title.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(210, 87, 34));
        jLabel_title.setText("COACH MANAGEMENT");
        jPanel_header.add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, 30));

        jPanel_background.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));

        jPanel_leftMenu.setBackground(new java.awt.Color(52, 50, 46));
        jPanel_leftMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_add.setBackground(new java.awt.Color(210, 87, 34));
        jPanel_add.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanel_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_addMouseExited(evt);
            }
        });
        jPanel_add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_add.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel_add.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_add.setText("ADD");
        jLabel_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_addMouseExited(evt);
            }
        });
        jPanel_add.add(jLabel_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 60));

        leftPanel_add.setBackground(new java.awt.Color(210, 87, 34));
        leftPanel_add.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(52, 50, 46)));

        javax.swing.GroupLayout leftPanel_addLayout = new javax.swing.GroupLayout(leftPanel_add);
        leftPanel_add.setLayout(leftPanel_addLayout);
        leftPanel_addLayout.setHorizontalGroup(
            leftPanel_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        leftPanel_addLayout.setVerticalGroup(
            leftPanel_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel_add.add(leftPanel_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        jPanel_leftMenu.add(jPanel_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, 300, -1));

        jPanel_delete.setBackground(new java.awt.Color(210, 87, 34));
        jPanel_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_deleteMouseExited(evt);
            }
        });
        jPanel_delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_delete.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel_delete.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_delete.setText("DELETE");
        jLabel_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_deleteMouseExited(evt);
            }
        });
        jPanel_delete.add(jLabel_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 60));

        leftPanel_delete.setBackground(new java.awt.Color(210, 87, 34));
        leftPanel_delete.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(52, 50, 46)));

        javax.swing.GroupLayout leftPanel_deleteLayout = new javax.swing.GroupLayout(leftPanel_delete);
        leftPanel_delete.setLayout(leftPanel_deleteLayout);
        leftPanel_deleteLayout.setHorizontalGroup(
            leftPanel_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        leftPanel_deleteLayout.setVerticalGroup(
            leftPanel_deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel_delete.add(leftPanel_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jPanel_leftMenu.add(jPanel_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, -1));

        jPanel_change.setBackground(new java.awt.Color(210, 87, 34));
        jPanel_change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_changeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_changeMouseExited(evt);
            }
        });
        jPanel_change.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_change.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel_change.setForeground(new java.awt.Color(52, 50, 46));
        jLabel_change.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_change.setText("CHANGE");
        jLabel_change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_changeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_changeMouseExited(evt);
            }
        });
        jPanel_change.add(jLabel_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 60));

        leftPanel_change.setBackground(new java.awt.Color(210, 87, 34));
        leftPanel_change.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(52, 50, 46)));

        javax.swing.GroupLayout leftPanel_changeLayout = new javax.swing.GroupLayout(leftPanel_change);
        leftPanel_change.setLayout(leftPanel_changeLayout);
        leftPanel_changeLayout.setHorizontalGroup(
            leftPanel_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        leftPanel_changeLayout.setVerticalGroup(
            leftPanel_changeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel_change.add(leftPanel_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel_leftMenu.add(jPanel_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 284, 300, -1));

        jTextField_search.setBackground(new java.awt.Color(52, 50, 46));
        jTextField_search.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField_search.setForeground(new java.awt.Color(242, 242, 242));
        jTextField_search.setText("Search...");
        jTextField_search.setBorder(null);
        jTextField_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_searchFocusLost(evt);
            }
        });
        jPanel_leftMenu.add(jTextField_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 220, 30));

        jSeparator1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel_leftMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, 10));

        jLabel_searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/30x30_searchsinfondowhite.png"))); // NOI18N
        jPanel_leftMenu.add(jLabel_searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        jLabel_viewCoach.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_viewCoach.setForeground(new java.awt.Color(242, 242, 242));
        jLabel_viewCoach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_viewCoach.setText("View Coaches");
        jPanel_leftMenu.add(jLabel_viewCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 110, 20));

        jSeparator2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel_leftMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 110, 10));

        jPanel_background.add(jPanel_leftMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 540));

        jPanel_rightTable.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        jTable_coachData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable_coachData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE", "NAME", "DESCRIPTION", "LOCATION", "START DATE", "END DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_coachData.setSelectionBackground(new java.awt.Color(210, 87, 34));
        jTable_coachData.setSelectionForeground(new java.awt.Color(242, 242, 242));
        jTable_coachData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_coachData);
        if (jTable_coachData.getColumnModel().getColumnCount() > 0) {
            jTable_coachData.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel_rightTableLayout = new javax.swing.GroupLayout(jPanel_rightTable);
        jPanel_rightTable.setLayout(jPanel_rightTableLayout);
        jPanel_rightTableLayout.setHorizontalGroup(
            jPanel_rightTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        jPanel_rightTableLayout.setVerticalGroup(
            jPanel_rightTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        jPanel_background.add(jPanel_rightTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 880, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_background, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_background, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel_headerMouseDragged

    private void jPanel_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_headerMousePressed

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jPanel_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addMouseEntered
        jPanel_add.setBackground(new Color(163, 67, 26));
        leftPanel_add.setBackground(new Color(242, 242, 242));
        jLabel_add.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_jPanel_addMouseEntered

    private void jPanel_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_addMouseExited
        jPanel_add.setBackground(new Color(210, 87, 34));
        leftPanel_add.setBackground(new Color(210, 87, 34));
        jLabel_add.setForeground(new Color(52, 50, 46));
    }//GEN-LAST:event_jPanel_addMouseExited

    private void jPanel_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_deleteMouseEntered
        jPanel_delete.setBackground(new Color(163, 67, 26));
        leftPanel_delete.setBackground(new Color(242, 242, 242));
        jLabel_delete.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_jPanel_deleteMouseEntered

    private void jPanel_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_deleteMouseExited
        jPanel_delete.setBackground(new Color(210, 87, 34));
        leftPanel_delete.setBackground(new Color(210, 87, 34));
        jLabel_delete.setForeground(new Color(52, 50, 46));
    }//GEN-LAST:event_jPanel_deleteMouseExited

    private void jPanel_changeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_changeMouseEntered
        jPanel_change.setBackground(new Color(163, 67, 26));
        leftPanel_change.setBackground(new Color(242, 242, 242));
        jLabel_change.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_jPanel_changeMouseEntered

    private void jPanel_changeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_changeMouseExited
        jPanel_change.setBackground(new Color(210, 87, 34));
        leftPanel_change.setBackground(new Color(210, 87, 34));
        jLabel_change.setForeground(new Color(52, 50, 46));
    }//GEN-LAST:event_jPanel_changeMouseExited

    private void jTextField_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_searchFocusGained
        if(jTextField_search.getText().equals("Search..."))
        {
            jTextField_search.setText("");
            jTextField_search.setCaretColor(Color.decode("#f2f2f2"));
        }
    }//GEN-LAST:event_jTextField_searchFocusGained

    private void jTextField_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_searchFocusLost
        if(jTextField_search.getText().equals(""))
        {
            jTextField_search.setText("Search...");
        }
    }//GEN-LAST:event_jTextField_searchFocusLost

    private void jLabel_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addMouseEntered
        jPanel_add.setBackground(new Color(163, 67, 26));
        leftPanel_add.setBackground(new Color(242, 242, 242));
        jLabel_add.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLabel_addMouseEntered

    private void jLabel_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addMouseExited
        jPanel_add.setBackground(new Color(210, 87, 34));
        leftPanel_add.setBackground(new Color(210, 87, 34));
        jLabel_add.setForeground(new Color(52, 50, 46));
    }//GEN-LAST:event_jLabel_addMouseExited

    private void jLabel_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_deleteMouseEntered
        jPanel_delete.setBackground(new Color(163, 67, 26));
        leftPanel_delete.setBackground(new Color(242, 242, 242));
        jLabel_delete.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLabel_deleteMouseEntered

    private void jLabel_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_deleteMouseExited
        jPanel_delete.setBackground(new Color(210, 87, 34));
        leftPanel_delete.setBackground(new Color(210, 87, 34));
        jLabel_delete.setForeground(new Color(52, 50, 46));
    }//GEN-LAST:event_jLabel_deleteMouseExited

    private void jLabel_changeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeMouseEntered
        jPanel_change.setBackground(new Color(163, 67, 26));
        leftPanel_change.setBackground(new Color(242, 242, 242));
        jLabel_change.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLabel_changeMouseEntered

    private void jLabel_changeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_changeMouseExited
        jPanel_change.setBackground(new Color(210, 87, 34));
        leftPanel_change.setBackground(new Color(210, 87, 34));
        jLabel_change.setForeground(new Color(52, 50, 46));
    }//GEN-LAST:event_jLabel_changeMouseExited
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCoach().setVisible(true);
            }
        });
    }

    int xMouse;
    int yMouse;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel_add;
    public javax.swing.JLabel jLabel_change;
    public javax.swing.JLabel jLabel_delete;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_searchIcon;
    private javax.swing.JLabel jLabel_title;
    public javax.swing.JLabel jLabel_viewCoach;
    private javax.swing.JPanel jPanel_add;
    private javax.swing.JPanel jPanel_background;
    private javax.swing.JPanel jPanel_change;
    private javax.swing.JPanel jPanel_delete;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JPanel jPanel_leftMenu;
    private javax.swing.JPanel jPanel_rightTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTable_coachData;
    private javax.swing.JTextField jTextField_search;
    private javax.swing.JPanel leftPanel_add;
    private javax.swing.JPanel leftPanel_change;
    private javax.swing.JPanel leftPanel_delete;
    // End of variables declaration//GEN-END:variables
}
