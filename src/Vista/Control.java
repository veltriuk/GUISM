/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author ANDRES ARCINIEGAS
 */
public class Control extends javax.swing.JPanel {

    /**
     * Creates new form Control
     */
    public Control() {
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

        lblL1 = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblL2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblL3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 325));
        setMinimumSize(new java.awt.Dimension(800, 325));
        setPreferredSize(new java.awt.Dimension(800, 325));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblL1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblL1.setForeground(new java.awt.Color(47, 85, 151));
        lblL1.setText("L1");
        add(lblL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 66, -1, 60));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader.setText("Control");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 11, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/light-green.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 88, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/light-green.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 177, -1, -1));

        lblL2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblL2.setForeground(new java.awt.Color(47, 85, 151));
        lblL2.setText("L2");
        add(lblL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 155, -1, 59));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/light-red.png"))); // NOI18N
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 264, -1, -1));

        lblL3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblL3.setForeground(new java.awt.Color(47, 85, 151));
        lblL3.setText("L3");
        add(lblL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 242, -1, 59));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblL1;
    private javax.swing.JLabel lblL2;
    private javax.swing.JLabel lblL3;
    // End of variables declaration//GEN-END:variables
}
