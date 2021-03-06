/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.MedidasControlador;
import javax.swing.JLabel;

/**
 *
 * @author ANDRES ARCINIEGAS
 */
public class Medidas extends javax.swing.JPanel {

    public static MedidasControlador medidasControlador;
    
    public Medidas() {
       initComponents();
       
    }
    
    public void setMedidasControlador(MedidasControlador controlador){
        medidasControlador = controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLineaHeader = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblL1 = new javax.swing.JLabel();
        lblMedida11 = new javax.swing.JLabel();
        lblUnidad11 = new javax.swing.JLabel();
        lblMedida12 = new javax.swing.JLabel();
        lblUnidad12 = new javax.swing.JLabel();
        lblMedida13 = new javax.swing.JLabel();
        lblUnidad13 = new javax.swing.JLabel();
        lblMedida14 = new javax.swing.JLabel();
        lblMedida24 = new javax.swing.JLabel();
        lblMedida34 = new javax.swing.JLabel();
        lblUnidad33 = new javax.swing.JLabel();
        lblMedida33 = new javax.swing.JLabel();
        lblMedida23 = new javax.swing.JLabel();
        lblUnidad23 = new javax.swing.JLabel();
        lblMedida22 = new javax.swing.JLabel();
        lblUnidad22 = new javax.swing.JLabel();
        lblUnidad32 = new javax.swing.JLabel();
        lblMedida32 = new javax.swing.JLabel();
        lblUnidad31 = new javax.swing.JLabel();
        lblMedida31 = new javax.swing.JLabel();
        lblMedida21 = new javax.swing.JLabel();
        lblUnidad21 = new javax.swing.JLabel();
        lblL2 = new javax.swing.JLabel();
        lblL3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblMagTitle1 = new javax.swing.JLabel();
        lblMagTitle4 = new javax.swing.JLabel();
        lblMagTitle2 = new javax.swing.JLabel();
        lblMagTitle3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 325));
        setMinimumSize(new java.awt.Dimension(800, 325));
        setPreferredSize(new java.awt.Dimension(800, 325));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLineaHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/lineaHeader.png"))); // NOI18N
        add(lblLineaHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 10));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(102, 102, 102));
        lblHeader.setText("Medidas");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/light-green.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 22, -1, 50));

        lblL1.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lblL1.setForeground(new java.awt.Color(47, 85, 151));
        lblL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblL1.setText("L1");
        jPanel1.add(lblL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 67, 50));

        lblMedida11.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida11.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida11.setText("120,54");
        lblMedida11.setFocusable(false);
        lblMedida11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida11.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida11.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida11.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 50));

        lblUnidad11.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad11.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad11.setText("V");
        jPanel1.add(lblUnidad11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 23, -1, 50));

        lblMedida12.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida12.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida12.setText("29,84");
        lblMedida12.setFocusable(false);
        lblMedida12.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida12.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida12.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida12.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, 50));

        lblUnidad12.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad12.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad12.setText("A");
        jPanel1.add(lblUnidad12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 23, -1, 50));

        lblMedida13.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida13.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida13.setText("3,591");
        lblMedida13.setFocusable(false);
        lblMedida13.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida13.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida13.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida13.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 120, 50));

        lblUnidad13.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad13.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad13.setText("kW");
        jPanel1.add(lblUnidad13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 23, -1, 50));

        lblMedida14.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida14.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida14.setText("0,94");
        lblMedida14.setFocusable(false);
        lblMedida14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida14.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida14.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida14.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 120, 50));

        lblMedida24.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida24.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida24.setText("0,97");
        lblMedida24.setFocusable(false);
        lblMedida24.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida24.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida24.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida24.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 120, 50));

        lblMedida34.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida34.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida34.setText("0");
        lblMedida34.setFocusable(false);
        lblMedida34.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida34.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida34.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida34.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 120, 50));

        lblUnidad33.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad33.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad33.setText("kW");
        jPanel1.add(lblUnidad33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 203, -1, 50));

        lblMedida33.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida33.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida33.setText("0,00");
        lblMedida33.setFocusable(false);
        lblMedida33.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida33.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida33.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida33.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 120, 50));

        lblMedida23.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida23.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida23.setText("0,144");
        lblMedida23.setFocusable(false);
        lblMedida23.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida23.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida23.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida23.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 120, 50));

        lblUnidad23.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad23.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad23.setText("kW");
        jPanel1.add(lblUnidad23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 113, -1, 50));

        lblMedida22.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida22.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida22.setText("1,21");
        lblMedida22.setFocusable(false);
        lblMedida22.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida22.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida22.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida22.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 120, 50));

        lblUnidad22.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad22.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad22.setText("A");
        jPanel1.add(lblUnidad22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 113, -1, 50));

        lblUnidad32.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad32.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad32.setText("A");
        jPanel1.add(lblUnidad32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 203, -1, 50));

        lblMedida32.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida32.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida32.setText("0,00");
        lblMedida32.setFocusable(false);
        lblMedida32.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida32.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida32.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida32.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 120, 50));

        lblUnidad31.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad31.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad31.setText("V");
        jPanel1.add(lblUnidad31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 203, -1, 50));

        lblMedida31.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida31.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida31.setText("121,02");
        lblMedida31.setFocusable(false);
        lblMedida31.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida31.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida31.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida31.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 50));

        lblMedida21.setFont(new java.awt.Font("Segoe UI Light", 0, 38)); // NOI18N
        lblMedida21.setForeground(new java.awt.Color(51, 51, 51));
        lblMedida21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedida21.setText("119,22");
        lblMedida21.setFocusable(false);
        lblMedida21.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblMedida21.setMaximumSize(new java.awt.Dimension(100, 50));
        lblMedida21.setMinimumSize(new java.awt.Dimension(100, 50));
        lblMedida21.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.add(lblMedida21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 50));

        lblUnidad21.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lblUnidad21.setForeground(new java.awt.Color(51, 51, 51));
        lblUnidad21.setText("V");
        jPanel1.add(lblUnidad21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 113, -1, 50));

        lblL2.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lblL2.setForeground(new java.awt.Color(47, 85, 151));
        lblL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblL2.setText("L2");
        jPanel1.add(lblL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 68, 50));

        lblL3.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        lblL3.setForeground(new java.awt.Color(47, 85, 151));
        lblL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblL3.setText("L3");
        jPanel1.add(lblL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 68, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/light-red.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 202, -1, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/light-green.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 112, -1, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/lineaSeparadorHorizontal.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 727, 18));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/images/lineaSeparadorHorizontal.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 727, 18));

        lblMagTitle1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMagTitle1.setForeground(new java.awt.Color(102, 102, 102));
        lblMagTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMagTitle1.setText("FP");
        jPanel1.add(lblMagTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 430, 20));

        lblMagTitle4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMagTitle4.setForeground(new java.awt.Color(102, 102, 102));
        lblMagTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMagTitle4.setText("FP");
        jPanel1.add(lblMagTitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 370, 20));

        lblMagTitle2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMagTitle2.setForeground(new java.awt.Color(102, 102, 102));
        lblMagTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMagTitle2.setText("FP");
        jPanel1.add(lblMagTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 410, 20));

        lblMagTitle3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMagTitle3.setForeground(new java.awt.Color(102, 102, 102));
        lblMagTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMagTitle3.setText("FP");
        jPanel1.add(lblMagTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 390, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 260));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblL1;
    private javax.swing.JLabel lblL2;
    private javax.swing.JLabel lblL3;
    private javax.swing.JLabel lblLineaHeader;
    private javax.swing.JLabel lblMagTitle1;
    private javax.swing.JLabel lblMagTitle2;
    private javax.swing.JLabel lblMagTitle3;
    private javax.swing.JLabel lblMagTitle4;
    private javax.swing.JLabel lblMedida11;
    private javax.swing.JLabel lblMedida12;
    private javax.swing.JLabel lblMedida13;
    private javax.swing.JLabel lblMedida14;
    private javax.swing.JLabel lblMedida21;
    private javax.swing.JLabel lblMedida22;
    private javax.swing.JLabel lblMedida23;
    private javax.swing.JLabel lblMedida24;
    private javax.swing.JLabel lblMedida31;
    private javax.swing.JLabel lblMedida32;
    private javax.swing.JLabel lblMedida33;
    private javax.swing.JLabel lblMedida34;
    private javax.swing.JLabel lblUnidad11;
    private javax.swing.JLabel lblUnidad12;
    private javax.swing.JLabel lblUnidad13;
    private javax.swing.JLabel lblUnidad21;
    private javax.swing.JLabel lblUnidad22;
    private javax.swing.JLabel lblUnidad23;
    private javax.swing.JLabel lblUnidad31;
    private javax.swing.JLabel lblUnidad32;
    private javax.swing.JLabel lblUnidad33;
    // End of variables declaration//GEN-END:variables

    public JLabel[] getMeasureLabels(){
        JLabel[] measureLabels = new JLabel[]{
            lblMedida11,
            lblMedida12,
            lblMedida13,
            lblMedida14,
            lblMedida21,
            lblMedida22,
            lblMedida23,
            lblMedida24,
            lblMedida31,
            lblMedida32,
            lblMedida33,
            lblMedida34,

        };
        
        return measureLabels;
    };
    
    public JLabel[] getUnitLabels(){
        JLabel[] measureLabels = new JLabel[]{
            lblUnidad11,
            lblUnidad12,
            lblUnidad13,
            lblUnidad21,
            lblUnidad22,
            lblUnidad23,
            lblUnidad31,
            lblUnidad32,
            lblUnidad33
        };
        
        return measureLabels;
    };
    public JLabel[] getMagLabels(){
        JLabel[] magLabels = new JLabel[]{
            lblMagTitle1,
            lblMagTitle2,
            lblMagTitle3,
            lblMagTitle4,
        };
        
        return magLabels;
    };
                     
}
