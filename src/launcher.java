
import java.awt.BorderLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author javi2
 */
public class launcher extends javax.swing.JPanel {

    /**
     * Creates new form launcher
     */
    public launcher() {
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

        jPanel2 = new javax.swing.JPanel();
        imgprincipal = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        anterior = new javax.swing.JLabel();
        siguiente = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        comenzar = new javax.swing.JLabel();
        barrita = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(10, 38, 72));
        jPanel2.setMinimumSize(new java.awt.Dimension(1481, 801));
        jPanel2.setPreferredSize(new java.awt.Dimension(1481, 801));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgprincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos launcher/Embarque/Embarque0.png"))); // NOI18N
        imgprincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(imgprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 880, 480));

        fondo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades/Cuadrado fondo enfocado.png"))); // NOI18N
        fondo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 780, 463));

        fondo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades/Cuadrado fondo enfocado.png"))); // NOI18N
        fondo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 780, 463));

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilidades/Flecha izquierda.png"))); // NOI18N
        anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Flecha derecha.png"))); // NOI18N
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 250, -1, -1));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PuntoCarruselFilled.png"))); // NOI18N
        jPanel2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, 20));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, 20));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, -1, 20));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel2.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, 20));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/PuntoCarruselEmpty.png"))); // NOI18N
        jPanel2.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, -1, 20));

        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Comenzar.png"))); // NOI18N
        comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 730, -1, -1));

        barrita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/Barrita aislada descripción.png"))); // NOI18N
        jPanel2.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        titulo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Embarque y desembarque en helicoptero");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html>Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.<br>\nUt enim ad minim veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur.<br>\n<br>\nQuis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.<br>\n Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anterior;
    private javax.swing.JLabel barrita;
    private javax.swing.JLabel comenzar;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel imgprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel siguiente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
