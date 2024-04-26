import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Wick
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();     
        
        simuladores sim = new simuladores();
        sim.setSize(1552, 880);
        sim.setLocation(0,0);
        sim.parent = this;
        content.removeAll();
        content.add(sim, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
     
        
        this.setLocationRelativeTo(this);
        JLabel[] escudos = new JLabel[]{ico0, ico1, ico2, ico3, ico4, ico5, ico6, ico7, ico8, ico9, ico10, ico11, ico12, ico13};
        
        
        for(int i = 0; i < 14; i++){
            String ruta = "src/iconos/LauncherButton" + i + ".png";
            utilidades.SetImageLabel(escudos[i], "src/iconos/LauncherButton" + (i + 0) + ".png");
        }
    
        ImageIcon[] icons = new ImageIcon[14];
        MouseListener[] mouseListeners = new MouseListener[14];
        for (int i = 0; i < icons.length; i++) {
            icons[i] = new ImageIcon("src/iconos/LauncherButton" + i + ".png");
            final int index = i;
            mouseListeners[i] = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {}
                    
                @Override
                public void mousePressed(MouseEvent e) {
                Dimension dimension = new Dimension (-5, -5);
                utilidades.SetImageLabel(escudos[index], "src/iconos/LauncherButton" + index + ".png", dimension);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                Dimension dimension = new Dimension (5, 5);
                utilidades.SetImageLabel(escudos[index], "src/iconos/LauncherButton" + index + ".png", dimension);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    Dimension dimension = new Dimension (5, 5);
                    utilidades.SetImageLabel(escudos[index], "src/iconos/LauncherButton" + index + ".png", dimension);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    utilidades.SetImageLabel(escudos[index], "src/iconos/LauncherButton" + index + ".png");
                }
            };
            escudos[i].addMouseListener(mouseListeners[i]);
        }   
    }

        public launcher crearLauncher(){
            launcher laun = new launcher();
            laun.setSize(1552, 880);
            laun.setLocation(0,0);
            return laun;
        }
        
        public void paintLauncher(launcher laun){
            content.removeAll();
            content.add(laun, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
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
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ico0 = new javax.swing.JLabel();
        ico1 = new javax.swing.JLabel();
        ico2 = new javax.swing.JLabel();
        ico3 = new javax.swing.JLabel();
        ico4 = new javax.swing.JLabel();
        ico5 = new javax.swing.JLabel();
        ico6 = new javax.swing.JLabel();
        ico7 = new javax.swing.JLabel();
        ico8 = new javax.swing.JLabel();
        ico9 = new javax.swing.JLabel();
        ico10 = new javax.swing.JLabel();
        ico11 = new javax.swing.JLabel();
        ico12 = new javax.swing.JLabel();
        ico13 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setOpaque(false);
        content.setPreferredSize(new java.awt.Dimension(1552, 880));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        jPanel2.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1550, 880));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 18, 0));

        ico0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton0.png"))); // NOI18N
        ico0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico0);

        ico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton1.png"))); // NOI18N
        ico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico1);

        ico2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton2.png"))); // NOI18N
        ico2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico2);

        ico3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton3.png"))); // NOI18N
        ico3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico3);

        ico4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton4.png"))); // NOI18N
        ico4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico4);

        ico5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton5.png"))); // NOI18N
        ico5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico5);

        ico6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton6.png"))); // NOI18N
        ico6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico6);

        ico7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton7.png"))); // NOI18N
        ico7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico7);

        ico8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton8.png"))); // NOI18N
        ico8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico8);

        ico9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton9.png"))); // NOI18N
        ico9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico9);

        ico10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton10.png"))); // NOI18N
        ico10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico10);

        ico11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton11.png"))); // NOI18N
        ico11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico11);

        ico12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton12.png"))); // NOI18N
        ico12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ico12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico12MouseClicked(evt);
            }
        });
        jPanel1.add(ico12);

        ico13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ico13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/LauncherButton13.png"))); // NOI18N
        ico13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(ico13);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 1510, 90));

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/FondoBase.png"))); // NOI18N
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ico12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico12MouseClicked
        simuladores sim = new simuladores();
        sim.setSize(1552, 880);
        sim.setLocation(0,0);
        sim.parent = this;
        content.removeAll();
        content.add(sim, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_ico12MouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel content;
    private javax.swing.JLabel ico0;
    private javax.swing.JLabel ico1;
    private javax.swing.JLabel ico10;
    private javax.swing.JLabel ico11;
    private javax.swing.JLabel ico12;
    private javax.swing.JLabel ico13;
    private javax.swing.JLabel ico2;
    private javax.swing.JLabel ico3;
    private javax.swing.JLabel ico4;
    private javax.swing.JLabel ico5;
    private javax.swing.JLabel ico6;
    private javax.swing.JLabel ico7;
    private javax.swing.JLabel ico8;
    private javax.swing.JLabel ico9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
