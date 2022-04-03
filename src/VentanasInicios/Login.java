package VentanasInicios;

import dataMysql.VentasSQL;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    int caracter;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        iconoLabel = new javax.swing.JLabel();
        inicioLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        userSeparator = new javax.swing.JSeparator();
        userSeparator1 = new javax.swing.JSeparator();
        passwordSeparator = new javax.swing.JSeparator();
        passwordSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        entrarBtn = new javax.swing.JPanel();
        entrarTxt = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        candadoLabel = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backGround.setBackground(new java.awt.Color(60, 77, 120));
        backGround.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backGroundMouseDragged(evt);
            }
        });
        backGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backGroundMousePressed(evt);
            }
        });

        iconoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        iconoLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        iconoLabel.setRequestFocusEnabled(false);
        iconoLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        inicioLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        inicioLabel.setForeground(new java.awt.Color(255, 255, 255));
        inicioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicioLabel.setText("INICIAR SESIÓN");

        userText.setBackground(new java.awt.Color(60, 77, 120));
        userText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userText.setForeground(new java.awt.Color(204, 204, 204));
        userText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userText.setText("Ingrese su nombre de usuario");
        userText.setBorder(null);
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextMousePressed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(60, 77, 120));
        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setText("***************");
        jPasswordField1.setBorder(null);
        jPasswordField1.setDragEnabled(true);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });

        entrarBtn.setBackground(new java.awt.Color(63, 118, 142));

        entrarTxt.setBackground(new java.awt.Color(255, 255, 255));
        entrarTxt.setForeground(new java.awt.Color(255, 255, 255));
        entrarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarTxt.setText("ENTRAR");
        entrarTxt.setToolTipText("");
        entrarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entrarTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout entrarBtnLayout = new javax.swing.GroupLayout(entrarBtn);
        entrarBtn.setLayout(entrarBtnLayout);
        entrarBtnLayout.setHorizontalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );
        entrarBtnLayout.setVerticalGroup(
            entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(entrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(entrarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N

        candadoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/padlock.png"))); // NOI18N

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(candadoLabel)
                    .addComponent(userLabel))
                .addGap(0, 0, 0)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userSeparator1)
                    .addComponent(userSeparator)
                    .addComponent(passwordSeparator)
                    .addComponent(passwordSeparator1)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1)
                            .addComponent(userText))))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inicioLabel)
                .addGap(93, 93, 93))
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(iconoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(entrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(iconoLabel))
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(userSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(userSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(passwordSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(passwordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(userLabel)
                        .addGap(36, 36, 36)
                        .addComponent(candadoLabel)))
                .addGap(67, 67, 67)
                .addComponent(entrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(backGround, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backGroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGroundMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backGroundMousePressed

    private void backGroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGroundMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backGroundMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void userTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMousePressed
        if (userText.getText().equals("Ingrese su nombre de usuario")) {
            userText.setText("");
            userText.setForeground(Color.white);
        }
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            jPasswordField1.setText("***************");
            jPasswordField1.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_userTextMousePressed

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        if (String.valueOf(jPasswordField1.getPassword()).equals("***************")) {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.white);
        }
        if (userText.getText().isEmpty()) {
            userText.setText("Ingrese su nombre de usuario");
            userText.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_jPasswordField1MousePressed

    private void entrarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseEntered
        entrarBtn.setBackground(Color.white);
        entrarTxt.setForeground(new Color(63, 118, 142));
    }//GEN-LAST:event_entrarTxtMouseEntered

    private void entrarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseExited
        entrarBtn.setBackground(new Color(63, 118, 142));
        entrarTxt.setForeground(Color.white);
    }//GEN-LAST:event_entrarTxtMouseExited

    private void entrarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMouseClicked
        String usuario = userText.getText();
        String contrasenia = String.valueOf(jPasswordField1.getPassword());

        if (usuario.equals("FISI") && contrasenia.equals("GRUPO4")) {
            VentasSQL conectar = new VentasSQL();
            conectar.conexion();
            JOptionPane.showMessageDialog(null, "Acceso concedido");
            VentanaPrincipal newFrame = new VentanaPrincipal();
            newFrame.setVisible(true);
            this.dispose();
        } else if (usuario.equals("FISI") && !contrasenia.equals("GRUPO4")) {
            JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA", "", JOptionPane.ERROR_MESSAGE);
        } else if (!usuario.equals("FISI") && contrasenia.equals("GRUPO4")) {
            JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO", "", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO Y CONTRASEÑA INCORRECTO", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_entrarTxtMouseClicked

    private void exitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        exitBtn.setBackground(new Color(153, 0, 0));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMousePressed

    private void entrarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarTxtMousePressed
        entrarBtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_entrarTxtMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backGround;
    private javax.swing.JLabel candadoLabel;
    private javax.swing.JPanel entrarBtn;
    private javax.swing.JLabel entrarTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel iconoLabel;
    private javax.swing.JLabel inicioLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JSeparator passwordSeparator1;
    private javax.swing.JLabel userLabel;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JSeparator userSeparator1;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
