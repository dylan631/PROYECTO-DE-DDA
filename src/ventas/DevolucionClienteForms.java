package ventas;

import static dataMysql.Conexion.getConnection;
import dataMysql.ProductosSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class DevolucionClienteForms extends javax.swing.JPanel {

    PreparedStatement stmt = null;
    Connection conn = null;
    static ResultSet rs = null;
    String fecha_actual = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    int cant;
    
    public DevolucionClienteForms() {
        initComponents();
        txtFechaActual.setText(fecha_actual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Movemento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFechaCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnDevolucion = new javax.swing.JButton();
        txtFechaActual = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("PRODUCTO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("NUMERO DE SERIE:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/8a71d12a40321402455aa974b63c44c1-gracias-gracias-etiqueta-engomada-de-la-insignia.png"))); // NOI18N

        Movemento.setBackground(new java.awt.Color(255, 255, 255));
        Movemento.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEVOLUCIONES AL CLINETE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel2.setText("DEVOLUCIONES");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5ff5dadf11ada76c06de418d6de3d013-icono-de-pescado-plano.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel4.setText("AL CLIENTE");

        javax.swing.GroupLayout MovementoLayout = new javax.swing.GroupLayout(Movemento);
        Movemento.setLayout(MovementoLayout);
        MovementoLayout.setHorizontalGroup(
            MovementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovementoLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MovementoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MovementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(MovementoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        MovementoLayout.setVerticalGroup(
            MovementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MovementoLayout.createSequentialGroup()
                .addGroup(MovementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MovementoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(82, 82, 82))
                    .addGroup(MovementoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("FECHA ACTUAL:");

        txtFechaCompra.setEditable(false);
        txtFechaCompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFechaCompra.setForeground(new java.awt.Color(204, 0, 51));
        txtFechaCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DNI DEL CLIENTE:");

        txtNumSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNumSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMonto.setEditable(false);
        txtMonto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(204, 0, 51));
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("COD. PRODUCTO:");

        txtNombreProducto.setEditable(false);
        txtNombreProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(0, 102, 51));
        txtNombreProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreProducto.setToolTipText("");

        txtCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("FECHA DE COMPRA:");

        txtCodProducto.setEditable(false);
        txtCodProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodProducto.setForeground(new java.awt.Color(0, 102, 51));
        txtCodProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("NUMERO DE CELULAR:");

        txtCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscar.setBackground(new java.awt.Color(60, 78, 120));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDevolucion.setText("SOLICITAR DEVOLUCION");
        btnDevolucion.setEnabled(false);
        btnDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionActionPerformed(evt);
            }
        });

        txtFechaActual.setEditable(false);
        txtFechaActual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFechaActual.setForeground(new java.awt.Color(204, 0, 51));
        txtFechaActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("MONTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Movemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30)
                                .addComponent(btnDevolucion))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(45, 45, 45)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Movemento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 470, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtNumSerie.getText().equals("")||txtCliente.getText().equals("")||!ValidarNumeros1(txtCliente.getText().trim())){
            JOptionPane.showMessageDialog(this, "COLOCAR UN NUMERO DE SERIE O DNI VALIDO");
        }
        else{
            try { 
            conn = getConnection(); //Genera la sesión para conectarnos con la base de datos
            stmt = conn.prepareStatement("select * from ventas where n_serie = ? AND dni=?"); //Trae los datos de un tabla
            stmt.setString(1,txtNumSerie.getText().trim());
            stmt.setString(2,txtCliente.getText().trim());
            rs = stmt.executeQuery();
            if(!rs.next()){
                JOptionPane.showMessageDialog(this, "EL NUMERO DE SERIE Y EL DNI NO COINCIDEN O NO EXISTE REGISTRO DE ESA VENTA");
            }
            else{
                txtNombreProducto.setText(rs.getString("nombre"));
                txtCodProducto.setText(rs.getString("codigo"));
                txtFechaCompra.setText(rs.getString("fecha"));
                txtMonto.setText(rs.getString("precio_final"));
                cant=Integer.parseInt(rs.getString("cantidad_venta"));
                btnDevolucion.setEnabled(true);
            }                                  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERROR CONEXION");
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionActionPerformed
        if(txtCelular.getText().equals("")){
            JOptionPane.showMessageDialog(this, "COMPLETAR EL RECUADRO DE CELULAR");
        }
        else{
            if(!ValidarNumeros(txtCelular.getText().trim())){
                JOptionPane.showMessageDialog(this, "INSERTAR UN NUMERO VALIDO");
            }
            else{
                if(txtNumSerie.getText().equals("")||txtCliente.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "COMPLETAR LOS RECUADROS VACIOS");
                }
                else{
                    Icon m = new ImageIcon(getClass().getResource("/imagenes/ICONO_DEVOLUCION.png"));
                    try {
                        conn = getConnection();
                        stmt = conn.prepareStatement("select * from productos where codigo = ?");
                        stmt.setString(1,txtCodProducto.getText().trim());
                        rs = stmt.executeQuery();
                        while(rs.next()){
                            int sa = rs.getInt("cantidad")+cant;
                            ProductosSQL.ActualizarStock(sa, txtCodProducto.getText());
                        }
                        stmt = conn.prepareStatement("delete from ventas where n_serie=?");
                        stmt.setString(1,txtNumSerie.getText().trim());
                        stmt.executeUpdate();
                    } catch (SQLException e) {
                    }
                    JOptionPane.showMessageDialog(null, "DEVOLUCION REGISTRADA, TRATAREMOS DE LLAMAR LO ANTES POSIBLE", "Confirmacion", JOptionPane.INFORMATION_MESSAGE, m);
                    btnDevolucion.setEnabled(false);
                    LimpiarTodo();
                }
            }
        }
    }//GEN-LAST:event_btnDevolucionActionPerformed
    
    void LimpiarTodo(){
        txtCelular.setText("");
        txtNumSerie.setText("");
        txtCliente.setText("");
        txtNombreProducto.setText("");
        txtCodProducto.setText("");
        txtFechaCompra.setText("");
        txtMonto.setText("");
    }
    
    public static boolean ValidarNumeros(String datos){
        return datos.matches("[0-9]{9}");
    }
    
    public static boolean ValidarNumeros1(String datos){
        return datos.matches("[0-9]{8}");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Movemento;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDevolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtFechaActual;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
