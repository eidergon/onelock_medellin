package onelock;

import com.jtattoo.plaf.fast.FastLookAndFeel;
import connectmysql.Conexion;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static onelock.login.usuarioActual;

public class escritorio extends javax.swing.JFrame {

    Conexion cx;
    String dataToSendUser;
    String dataToSendPass;
    String dataToSendFuntion;

    public escritorio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo-removebg-preview.png")).getImage());
        cx = new Conexion();
        cx.conectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rr = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        ocm = new javax.swing.JButton();
        exit_ocm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escritorio Medellin");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setDoubleBuffered(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplicativos de ecritorio");

        rr.setBackground(new java.awt.Color(102, 102, 255));
        rr.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        rr.setForeground(new java.awt.Color(255, 255, 255));
        rr.setText("RR");
        rr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rr.setEnabled(false);
        rr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rrMouseExited(evt);
            }
        });
        rr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrActionPerformed(evt);
            }
        });

        ac.setBackground(new java.awt.Color(102, 102, 255));
        ac.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ac.setForeground(new java.awt.Color(255, 255, 255));
        ac.setText("AC");
        ac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ac.setEnabled(false);
        ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acMouseExited(evt);
            }
        });
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        ocm.setBackground(new java.awt.Color(102, 102, 255));
        ocm.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ocm.setForeground(new java.awt.Color(255, 255, 255));
        ocm.setText("OCM");
        ocm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocm.setEnabled(false);
        ocm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ocmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ocmMouseExited(evt);
            }
        });
        ocm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocmActionPerformed(evt);
            }
        });

        exit_ocm.setBackground(new java.awt.Color(102, 102, 255));
        exit_ocm.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        exit_ocm.setForeground(new java.awt.Color(255, 255, 255));
        exit_ocm.setText("Cerrar OCM");
        exit_ocm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_ocm.setEnabled(false);
        exit_ocm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_ocmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_ocmMouseExited(evt);
            }
        });
        exit_ocm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ocmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(exit_ocm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rr, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(ocm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rr)
                    .addComponent(ac)
                    .addComponent(ocm))
                .addGap(18, 18, 18)
                .addComponent(exit_ocm)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrActionPerformed
        try {
            String query = "SELECT rr, contraseña_rr FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("rr");
                dataToSendPass = rs.getString("contraseña_rr");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    dispose();
                    String command = "C:\\selenium\\auto_rr.exe " + dataToSendUser + " " + dataToSendPass;
                    Process process = Runtime.getRuntime().exec(command);

                    // Esperar a que el proceso de AutoIt termine antes de continuar
                    int exitCode = process.waitFor();

                    if (exitCode == 0) {
                        // El proceso de AutoIt se completó con éxito
                        System.out.println("Proceso de AutoIt completado correctamente.");
                    } else {
                        // El proceso de AutoIt terminó con un código de error
                        System.err.println("Proceso de AutoIt terminado con código de error: " + exitCode);
                    }
                } else {
                    Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                    JOptionPane.showMessageDialog(null, "No tienes acceso al aplicativo", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
                }
            } else {
                Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                JOptionPane.showMessageDialog(null, "Documento No Valido", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_rrActionPerformed

    private void rrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rrMouseEntered
        rr.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_rrMouseEntered

    private void acMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseEntered
        ac.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_acMouseEntered

    private void ocmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocmMouseEntered
        ocm.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_ocmMouseEntered

    private void rrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rrMouseExited
        rr.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_rrMouseExited

    private void acMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseExited
        ac.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_acMouseExited

    private void ocmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocmMouseExited
        ocm.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_ocmMouseExited

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        try {
            String query = "SELECT contraseña_ac FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendPass = rs.getString("contraseña_ac");

                if (dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    dispose();
                    String command = "C:\\selenium\\auto_ac.exe " + dataToSendPass;
                    Process process = Runtime.getRuntime().exec(command);

                    // Esperar a que el proceso de AutoIt termine antes de continuar
                    int exitCode = process.waitFor();

                    if (exitCode == 0) {
                        // El proceso de AutoIt se completó con éxito
                        System.out.println("Proceso de AutoIt completado correctamente.");
                    } else {
                        // El proceso de AutoIt terminó con un código de error
                        System.err.println("Proceso de AutoIt terminado con código de error: " + exitCode);
                    }
                } else {
                    Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                    JOptionPane.showMessageDialog(null, "No tienes acceso al aplicativo", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
                }
            } else {
                Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                JOptionPane.showMessageDialog(null, "Documento No Valido", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_acActionPerformed

    private void ocmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocmActionPerformed
        try {
            String query = "SELECT ocm, contraseña_ocm FROM Usuarios WHERE usuario_onelock=?";
            PreparedStatement ps = cx.conectar().prepareStatement(query);
            ps.setString(1, usuarioActual);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dataToSendUser = rs.getString("ocm");
                dataToSendPass = rs.getString("contraseña_ocm");

                if (dataToSendUser != null && !dataToSendUser.isEmpty() && dataToSendPass != null && !dataToSendPass.isEmpty()) {
                    dispose();
                    String command = "C:\\selenium\\auto_ocm.exe " + dataToSendUser + " " + dataToSendPass;
                    Process process = Runtime.getRuntime().exec(command);

                    // Esperar a que el proceso de AutoIt termine antes de continuar
                    int exitCode = process.waitFor();

                    if (exitCode == 0) {
                        // El proceso de AutoIt se completó con éxito
                        System.out.println("Proceso de AutoIt completado correctamente.");
                    } else {
                        // El proceso de AutoIt terminó con un código de error
                        System.err.println("Proceso de AutoIt terminado con código de error: " + exitCode);
                    }
                } else {
                    Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                    JOptionPane.showMessageDialog(null, "No tienes acceso al aplicativo", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
                }
            } else {
                Icon x = new ImageIcon(getClass().getResource("/img/letterx_83737.png"));
                JOptionPane.showMessageDialog(null, "Documento No Valido", "ERROR", JOptionPane.INFORMATION_MESSAGE, x);
            }
        } catch (SQLException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_ocmActionPerformed

    private void exit_ocmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ocmActionPerformed
        try {
            String processName = "OCMagent.exe";  // Nombre del proceso que deseas finalizar
            ProcessBuilder processBuilder = new ProcessBuilder("taskkill", "/f", "/im", processName);
            processBuilder.inheritIO(); // Esto redirigirá la entrada y salida estándar al proceso Java actual
            Process process = processBuilder.start();
            int exitCode = process.waitFor(); // Esperar a que termine el proceso
            if (exitCode == 0) {
                System.out.println("El proceso " + processName + " se ha finalizado con éxito.");
            } else {
                System.out.println("No se pudo finalizar el proceso " + processName + ". Código de salida: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
        }
    }//GEN-LAST:event_exit_ocmActionPerformed

    private void exit_ocmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_ocmMouseEntered
        exit_ocm.setBackground(new Color(253, 82, 0));
    }//GEN-LAST:event_exit_ocmMouseEntered

    private void exit_ocmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_ocmMouseExited
        exit_ocm.setBackground(new Color(102, 102, 255));
    }//GEN-LAST:event_exit_ocmMouseExited

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
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FastLookAndFeel());
                    new escritorio().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(onelock.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton exit_ocm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ocm;
    private javax.swing.JButton rr;
    // End of variables declaration//GEN-END:variables
}
