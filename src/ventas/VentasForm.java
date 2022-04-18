package ventas;

import static dataMysql.Conexion.*;
import java.sql.*;
import java.util.*;
import dataMysql.ProductosSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import sistemas.Eventos_graficos;

public class VentasForm extends javax.swing.JPanel {
    PreparedStatement stmt = null;
    Connection conn = null;
    static ResultSet rs = null;
    String fecha_actual = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    DefaultTableModel modelo = new DefaultTableModel();
    int item=0,cantidad,nc;
    String cp;
    float precioventa;
    double Tpagar;
    int serieG=0,fila=-1,stock,colum;
    boolean cierto=false;

    public VentasForm() {
        this.serieG = ProductosSQL.NumeroSerie();
        initComponents();
        Eventos_graficos.decorar_tabla_estandar(TablaDetalle, jScrollPane1);
        txtFecha.setText(fecha_actual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        ScrollCant = new javax.swing.JSpinner();
        txtFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnBorrarFila = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/994649_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setText("PUNTO DE VENTA \"ELECTROKAWAI\"");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Venta de electrodomesticos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tel: 987-675-123");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel5)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Dni Cliente:");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                btnBuscarProductoInputMethodTextChanged(evt);
            }
        });
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cod. Produ:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Producto:");

        txtNombreProducto.setEditable(false);
        txtNombreProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(51, 51, 255));
        txtNombreProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Precio:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Marca:");

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtStock.setForeground(new java.awt.Color(51, 51, 255));
        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cantidad:");

        txtPrecioUnitario.setEditable(false);
        txtPrecioUnitario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrecioUnitario.setForeground(new java.awt.Color(51, 51, 255));
        txtPrecioUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Stock:");

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(51, 51, 255));
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(51, 51, 255));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(ScrollCant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFecha))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(ScrollCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaDetalle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaDetalle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "CODIGO", "PRODUCTO", "CANTIDAD", "PREC. UNIT", "TOTAL", "NRO SERIE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDetalle.setToolTipText("");
        TablaDetalle.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaDetalle.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        TablaDetalle.setFocusCycleRoot(true);
        TablaDetalle.setGridColor(new java.awt.Color(153, 153, 153));
        TablaDetalle.setMaximumSize(new java.awt.Dimension(2147483647, 10));
        TablaDetalle.setName(""); // NOI18N
        TablaDetalle.setRequestFocusEnabled(false);
        TablaDetalle.setRowSelectionAllowed(false);
        TablaDetalle.setSelectionBackground(new java.awt.Color(255, 255, 255));
        TablaDetalle.setSelectionForeground(new java.awt.Color(204, 204, 204));
        TablaDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaDetalle.setShowGrid(true);
        TablaDetalle.setUpdateSelectionOnSort(false);
        TablaDetalle.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(TablaDetalle);
        if (TablaDetalle.getColumnModel().getColumnCount() > 0) {
            TablaDetalle.getColumnModel().getColumn(0).setPreferredWidth(10);
            TablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(60);
            TablaDetalle.getColumnModel().getColumn(2).setPreferredWidth(220);
            TablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(40);
            TablaDetalle.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("TOTAL A PAGAR:");

        txtTotalPagar.setEditable(false);
        txtTotalPagar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(0, 204, 0));
        txtTotalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBorrarFila.setText("Borrar utima fila");
        btnBorrarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFilaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.setNextFocusableComponent(btnBorrarFila);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnBorrarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnGenerarVenta)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarFila)
                    .addComponent(btnGenerarVenta)
                    .addComponent(jLabel14)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        CalculoTotal();
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    void TotalaPagar(){
        Tpagar=0;
        for(int i=0;i<TablaDetalle.getRowCount();i++){
            cantidad=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            precioventa=Float.parseFloat(TablaDetalle.getValueAt(i, 4).toString());
            Tpagar=Tpagar+(cantidad*precioventa);
        }
        txtTotalPagar.setText(""+Tpagar);
    }
    
    void CalculoTotal(){
        if(txtCliente.getText().equals("")||txtCodProducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "COMPLETAR TODOS LOS DATOS");
        }
        else{
            if(!ValidarNumeros(txtCliente.getText().trim())){
                JOptionPane.showMessageDialog(this, "DATOS DEL DNI INVALIDOS");
            }
            else{
               if(ScrollCant.getValue().equals(0)){
                   JOptionPane.showMessageDialog(this, "COLOCAR UNA CANTIDAD VALIDA");
               }
               else{
                   try {
                    modelo=(DefaultTableModel)TablaDetalle.getModel();
                    conn = getConnection();
                    stmt = conn.prepareStatement("select * from productos where codigo = ?");
                    stmt.setString(1,txtCodProducto.getText().trim());
                    rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
                    if(TablaDetalle.getRowCount()>0){
                        for(int i=0;i<TablaDetalle.getRowCount();i++){
                            if(txtCodProducto.getText().equals(TablaDetalle.getValueAt(i, 1))){
                            cierto=true;
                            colum=i;
                            }
                            else{
                                    
                            }
                        }
                    }
                    else{
                        
                    }
                    if(cierto==true){
                        while(rs.next()){
                            cantidad=Integer.parseInt(ScrollCant.getValue().toString());
                            nc=Integer.parseInt(TablaDetalle.getValueAt(colum, 3).toString());
                            stock = rs.getInt("cantidad");
                            precioventa = rs.getFloat("precio_venta");
                            stock=stock-nc;
                            if((stock>=cantidad)&&(cantidad>0)){
                            stock=stock-cantidad;
                            txtStock.setText(String.valueOf(stock));
                            nc=nc+cantidad;
                            TablaDetalle.setValueAt(nc, colum, 3);
                            double Total=nc*precioventa;
                            TablaDetalle.setValueAt(Total, colum, 5);
                            cierto=false;
                            }
                            else{
                            JOptionPane.showMessageDialog(this, "STOCK INSUFICIENTE O NUMEROS NEGATIVOS EN LA CANTIDAD");
                            cierto=false;
                            }
                        }
                    }
                    else{
                        fila++;
                        item=item+1;
                        if(rs.next()){
                            cantidad=Integer.parseInt(ScrollCant.getValue().toString());
                            stock = rs.getInt("cantidad");
                            precioventa=rs.getFloat("precio_venta");
                            txtPrecioUnitario.setText(Float.toString(precioventa));
                            double Total=cantidad*precioventa;
                            ArrayList lista=new ArrayList();
                            if((stock>=cantidad)&&(cantidad>0)){
                                stock=stock-cantidad;
                                txtStock.setText(String.valueOf(stock));
                                serieG++;
                                lista.add(item);
                                lista.add(rs.getString("codigo"));
                                lista.add(rs.getString("nombre")+" "+rs.getString("marca"));
                                lista.add(cantidad);
                                lista.add(precioventa);
                                lista.add(Total);
                                lista.add(serieG);
                                Object[]ob=new Object[7];
                                ob[0]=lista.get(0);
                                ob[1]=lista.get(1);
                                ob[2]=lista.get(2);
                                ob[3]=lista.get(3);
                                ob[4]=lista.get(4);
                                ob[5]=lista.get(5);
                                ob[6]=lista.get(6);
                                modelo.addRow(ob);
                                TablaDetalle.setModel(modelo);
                                TotalaPagar();
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "STOCK INSUFICIENTE O NUMEROS NEGATIVOS EN LA CANTIDAD");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "NO SE ENCONTRO EL PORDUCTO EN LA BASE DE DATOS");
                        }
                    }                                  
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                    }
               }
            }
        }
    }
    
    void LimpiarTabla(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void ActualizarCantidad(){
        try {
            conn = getConnection(); 
            for(int i=0;i<modelo.getRowCount();i++){
                cp = TablaDetalle.getValueAt(i, 1).toString();
                stmt = conn.prepareStatement("select * from productos where codigo = ?");
                stmt.setString(1,cp);
                rs = stmt.executeQuery();
                while(rs.next()){
                   int cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
                    int sa = rs.getInt("cantidad")-cant;
                    ProductosSQL.ActualizarStock(sa, cp); 
                }
            }
        } catch (SQLException e) {
        }
    }
    
    public static boolean ValidarNumeros(String datos){
        return datos.matches("[0-9]{8}");
    }
    
    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed
    

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
    try {
        conn = getConnection(); //Genera la sesión para conectarnos con la base de datos
        stmt = conn.prepareStatement("select * from productos where codigo = ?"); //Trae los datos de un tabla
        stmt.setString(1,txtCodProducto.getText().trim());
        rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
        if(TablaDetalle.getRowCount()>0){
            for(int i=0;i<TablaDetalle.getRowCount();i++){
                if(txtCodProducto.getText().equals(TablaDetalle.getValueAt(i, 1))){
                cierto=true;
                colum=i;
                }
                else{
                }
            }
        }
        else{    
        }
        if(cierto==true){
             while(rs.next()){
                txtNombreProducto.setText(rs.getString("nombre"));
                txtMarca.setText(rs.getString("marca"));
                nc=Integer.parseInt(TablaDetalle.getValueAt(colum, 3).toString());
                stock = rs.getInt("cantidad");
                stock=stock-nc;
                txtStock.setText(String.valueOf(stock));
                float precioventa=rs.getFloat("precio_venta");
                txtPrecioUnitario.setText(Float.toString(precioventa));
                }
                cierto=false;
        }
        else{
             if(rs.next()){
                txtNombreProducto.setText(rs.getString("nombre"));
                txtMarca.setText(rs.getString("marca"));
                stock = rs.getInt("cantidad");
                txtStock.setText(String.valueOf(stock));
                float precioventa=rs.getFloat("precio_venta");
                txtPrecioUnitario.setText(Float.toString(precioventa));
                }
             else{
                 JOptionPane.showMessageDialog(this, "NO SE ENCONTRO EL PRODUCTO EN LA BASE DE DATOS");
             }
        }
    } catch (SQLException ex) {
        ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        try { 
            conn = getConnection(); 
            stmt = conn.prepareStatement("insert into ventas values(?,?,?,?,?,?,?,?)");
            for(int i=0;i<TablaDetalle.getRowCount();i++){
            stmt.setInt(1, 0);
            stmt.setString(2, txtFecha.getText().trim());
            stmt.setString(3, TablaDetalle.getValueAt(i, 1).toString().trim());
            stmt.setString(4, TablaDetalle.getValueAt(i, 2).toString().trim());
            stmt.setString(5, txtCliente.getText().trim());
            stmt.setString(6, TablaDetalle.getValueAt(i, 3).toString().trim());
            stmt.setString(7, TablaDetalle.getValueAt(i, 4).toString().trim());
            stmt.setString(8, TablaDetalle.getValueAt(i, 5).toString().trim());
            stmt.executeUpdate();
            }
            ActualizarCantidad();
            JOptionPane.showMessageDialog(this, "VENTA REGISTRADA, GRACIAS");
            LimpiarTabla();
            ScrollCant.setValue(0);
            txtCliente.setText("");
            txtCodProducto.setText("");
            txtStock.setText("");
            txtPrecioUnitario.setText("");
            txtNombreProducto.setText("");
            txtMarca.setText("");
            txtTotalPagar.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnBorrarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFilaActionPerformed
        
        if(TablaDetalle.getRowCount()>0){
            serieG--;
            item--; 
                if((txtCodProducto.getText()).equals(TablaDetalle.getValueAt(fila, 1))){
                    try {
                        conn = getConnection(); //Genera la sesión para conectarnos con la base de datos
                        stmt = conn.prepareStatement("select * from productos where codigo = ?"); //Trae los datos de un tabla
                        stmt.setString(1,txtCodProducto.getText().trim());
                        rs = stmt.executeQuery();
                        while(rs.next()){
                            if((txtStock.getText()).equals(rs.getString("cantidad"))){    
                            }
                            else{
                                int borra1=Integer.parseInt(txtStock.getText());
                                int borra2=Integer.parseInt(TablaDetalle.getValueAt(fila, 3).toString());
                                borra1=borra1+borra2;
                                txtStock.setText(String.valueOf(borra1));
                            }
                        }
                    } catch (SQLException e) {
                    }
                }
                else{
                }
            cierto=false;
            modelo.removeRow(fila);
            fila--;
        }
        else{
            JOptionPane.showMessageDialog(this, "NO CUENTA CON FILAS EN LA TABLA");
        }
    }//GEN-LAST:event_btnBorrarFilaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        TotalaPagar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarProductoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_btnBuscarProductoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarProductoInputMethodTextChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ScrollCant;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrarFila;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
