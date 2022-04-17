package control;

import static dataMysql.Conexion.*;
import javax.swing.JOptionPane;

public class Stock extends javax.swing.JPanel {

    public Stock() {
        this.trs = new javax.swing.table.TableRowSorter<>(modelo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloStock = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        scrollStock = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        barraFiltrar = new javax.swing.JTextField();
        labelFiltrar = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JPanel();
        textoAgregar = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JPanel();
        textoEliminar = new javax.swing.JLabel();
        contenedorAgregar = new javax.swing.JPanel();
        labelProducto = new javax.swing.JLabel();
        inputProducto = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        labelPrecioCompra = new javax.swing.JLabel();
        inputPrecioCompra = new javax.swing.JTextField();
        labelPrecioVenta = new javax.swing.JLabel();
        inputPrecioVenta = new javax.swing.JTextField();
        botonAgregar1 = new javax.swing.JPanel();
        textoAgregar1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 610));

        tituloStock.setBackground(new java.awt.Color(60, 77, 120));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stock de Productos");

        javax.swing.GroupLayout tituloStockLayout = new javax.swing.GroupLayout(tituloStock);
        tituloStock.setLayout(tituloStockLayout);
        tituloStockLayout.setHorizontalGroup(
            tituloStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloStockLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tituloStockLayout.setVerticalGroup(
            tituloStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloStockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        modelo = createModeloTableStock();
        modelo.fireTableDataChanged();
        tableStock.setModel(modelo);
        tableStock.setShowHorizontalLines(false);
        tableStock.setShowVerticalLines(false);
        scrollStock.setViewportView(tableStock);

        barraFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barraFiltrarKeyTyped(evt);
            }
        });

        labelFiltrar.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelFiltrar.setText("Buscar");

        botonAgregar.setBackground(new java.awt.Color(95, 94, 94));
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAgregarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAgregarMouseReleased(evt);
            }
        });

        textoAgregar.setBackground(new java.awt.Color(255, 255, 255));
        textoAgregar.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        textoAgregar.setForeground(new java.awt.Color(255, 255, 255));
        textoAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAgregar.setText("Agregar nuevo producto");
        textoAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout botonAgregarLayout = new javax.swing.GroupLayout(botonAgregar);
        botonAgregar.setLayout(botonAgregarLayout);
        botonAgregarLayout.setHorizontalGroup(
            botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
            .addGroup(botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(botonAgregarLayout.createSequentialGroup()
                    .addComponent(textoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        botonAgregarLayout.setVerticalGroup(
            botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
            .addGroup(botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textoAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        botonEliminar.setBackground(new java.awt.Color(95, 94, 94));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonEliminarMouseReleased(evt);
            }
        });

        textoEliminar.setBackground(new java.awt.Color(255, 255, 255));
        textoEliminar.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        textoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        textoEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEliminar.setText("Eliminar producto");
        textoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout botonEliminarLayout = new javax.swing.GroupLayout(botonEliminar);
        botonEliminar.setLayout(botonEliminarLayout);
        botonEliminarLayout.setHorizontalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonEliminarLayout.setVerticalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelProducto.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelProducto.setText("Nombre");

        labelMarca.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelMarca.setText("Marca");

        labelPrecioCompra.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPrecioCompra.setText("Precio de Compra");

        labelPrecioVenta.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelPrecioVenta.setText("Precio de Venta");

        botonAgregar1.setBackground(new java.awt.Color(95, 94, 94));
        botonAgregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAgregar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAgregar1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonAgregar1MouseReleased(evt);
            }
        });

        textoAgregar1.setBackground(new java.awt.Color(255, 255, 255));
        textoAgregar1.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        textoAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        textoAgregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAgregar1.setText("Agregar");
        textoAgregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout botonAgregar1Layout = new javax.swing.GroupLayout(botonAgregar1);
        botonAgregar1.setLayout(botonAgregar1Layout);
        botonAgregar1Layout.setHorizontalGroup(
            botonAgregar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonAgregar1Layout.setVerticalGroup(
            botonAgregar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoAgregar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorAgregarLayout = new javax.swing.GroupLayout(contenedorAgregar);
        contenedorAgregar.setLayout(contenedorAgregarLayout);
        contenedorAgregarLayout.setHorizontalGroup(
            contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addComponent(labelPrecioCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPrecioVenta)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAgregarLayout.createSequentialGroup()
                        .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                .addComponent(inputPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAgregarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addComponent(inputPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelProducto)
                .addGap(18, 18, 18)
                .addComponent(inputProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelMarca)
                .addGap(18, 18, 18)
                .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        contenedorAgregarLayout.setVerticalGroup(
            contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProducto)
                    .addComponent(inputProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMarca)
                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecioCompra)
                    .addComponent(labelPrecioVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(labelFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollStock, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedorAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(barraFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollStock, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(contenedorAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private javax.swing.table.DefaultTableModel createModeloTableStock(){
        javax.swing.table.DefaultTableModel modeloReturn = new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Codigo", "Nombre", "Marca", "Cantidad", "Precio de Venta", "Precio de Compra"
            }
        );
        try{
            java.sql.Connection conexion = getConnection();
            java.sql.Statement miStatement = conexion.createStatement();
            java.sql.ResultSet datos = miStatement.executeQuery("SELECT * FROM productos");
            while(datos.next()){
                int codigoSQL = datos.getInt("codigo");
                java.lang.String codigoJava = java.lang.String.format("%05d",codigoSQL);
                String [] datosColumna = {codigoJava,datos.getString("nombre"),datos.getString("marca"),(String)datos.getString("cantidad"),(String)datos.getString("precio_venta"),(String)datos.getString("precio_compra")};
                modeloReturn.addRow(datosColumna);
                System.out.println("ARRAY");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
        }
        System.out.println("ARRAY!!!!!!!!!!!");
        contenedorAgregar.setVisible(false);
        return modeloReturn;
    }
    
    private void filtrar(){
        System.out.println("HECHO");
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> trsAux = new javax.swing.table.TableRowSorter(tableStock.getModel());
        trs = trsAux;
        tableStock.setRowSorter(trs);
        barraFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent  e){
                trs.setRowFilter(javax.swing.RowFilter.regexFilter(barraFiltrar.getText(), 1));
            }
        });
    }
    
    private void createTableDelete(){
        modelo.setColumnCount(7);
        javax.swing.table.TableColumn tc = tableStock.getColumnModel().getColumn(6);
        tc.setCellEditor(tableStock.getDefaultEditor(java.lang.Boolean.class));
        tc.setCellRenderer(tableStock.getDefaultRenderer(java.lang.Boolean.class));
    }
    
    private boolean isSelected(int row, int column){
        return tableStock.getValueAt(row, column) != null;
    }
    
    private void botonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseEntered
        botonEliminar.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonEliminarMouseEntered

    private void botonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseExited
        botonEliminar.setBackground(new java.awt.Color(95,94,94));
    }//GEN-LAST:event_botonEliminarMouseExited

    private void botonEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMousePressed
        botonEliminar.setBackground(new java.awt.Color(50,49,49));
    }//GEN-LAST:event_botonEliminarMousePressed

    private void botonEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseReleased
        botonEliminar.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonEliminarMouseReleased

    private void botonAgregar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregar1MouseEntered
        botonAgregar1.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonAgregar1MouseEntered

    private void botonAgregar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregar1MouseExited
        botonAgregar1.setBackground(new java.awt.Color(95,94,94));
    }//GEN-LAST:event_botonAgregar1MouseExited

    private void botonAgregar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregar1MousePressed
        botonAgregar1.setBackground(new java.awt.Color(50,49,49));
    }//GEN-LAST:event_botonAgregar1MousePressed

    private void botonAgregar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregar1MouseReleased
        botonAgregar1.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonAgregar1MouseReleased

    private void botonAgregarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseReleased
        botonAgregar.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonAgregarMouseReleased

    private void botonAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMousePressed
        botonAgregar.setBackground(new java.awt.Color(50,49,49));
    }//GEN-LAST:event_botonAgregarMousePressed

    private void botonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseExited
        botonAgregar.setBackground(new java.awt.Color(95,94,94));
    }//GEN-LAST:event_botonAgregarMouseExited

    private void botonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseEntered
        botonAgregar.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonAgregarMouseEntered

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked

        if("Eliminar".equals(textoEliminar.getText())){
            try{
                textoEliminar.setText("Eliminar producto");
                barraFiltrar.setText("");
                java.sql.Connection conexion = getConnection();
                java.sql.PreparedStatement miStatement = conexion.prepareStatement("DELETE FROM productos WHERE codigo=?");
                for(int i=0;i<tableStock.getRowCount();i++){
                    if(isSelected(i,6)){
                        System.out.println("ELIMINANDO");
                        miStatement.setInt(1, java.lang.Integer.parseInt((String) tableStock.getValueAt(i, 0)));
                        miStatement.executeUpdate();
                    }

                }
                modelo.setColumnCount(6);
                System.out.println("QUE PASO");
                System.out.println("QUE PASO");
                System.out.println("QUE PASO");
                modelo = createModeloTableStock();
                tableStock.setModel(modelo);
                javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> trsAux = new javax.swing.table.TableRowSorter(tableStock.getModel());
                trs = trsAux;
                tableStock.setRowSorter(trs);
                trs.setRowFilter(javax.swing.RowFilter.regexFilter(barraFiltrar.getText(), 1));
            }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
            }
        }    
        else{
            createTableDelete();
            textoEliminar.setText("Eliminar");
        }
        
        System.out.println("------------------------------");
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregar1MouseClicked
        if(inputProducto.getText().length()>0&&inputMarca.getText().length()>0 && inputPrecioVenta.getText().length()>0 && inputPrecioCompra.getText().length()>0){
            try{
                java.sql.Connection conexion = getConnection();
                java.sql.PreparedStatement miPreparedStatement = conexion.prepareStatement("INSERT INTO productos(nombre,marca,precio_venta,precio_compra) VALUES(?,?,?,?)");
                miPreparedStatement.setString(1, inputProducto.getText());
                miPreparedStatement.setString(2, inputMarca.getText());
                miPreparedStatement.setFloat(3, java.lang.Float.parseFloat(inputPrecioVenta.getText()));
                miPreparedStatement.setFloat(4, java.lang.Float.parseFloat(inputPrecioCompra.getText()));
                miPreparedStatement.executeUpdate();
                modelo = createModeloTableStock();
                tableStock.setModel(modelo);
            }catch(java.sql.SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No se han llenado todos los campos","ERROR",0);
        }
        
    }//GEN-LAST:event_botonAgregar1MouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        contenedorAgregar.setVisible(true);
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void barraFiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraFiltrarKeyTyped
        filtrar();
    }//GEN-LAST:event_barraFiltrarKeyTyped
    
    private javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> trs;
    private javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraFiltrar;
    private javax.swing.JPanel botonAgregar;
    private javax.swing.JPanel botonAgregar1;
    private javax.swing.JPanel botonEliminar;
    private javax.swing.JPanel contenedorAgregar;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputPrecioCompra;
    private javax.swing.JTextField inputPrecioVenta;
    private javax.swing.JTextField inputProducto;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelFiltrar;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelPrecioCompra;
    private javax.swing.JLabel labelPrecioVenta;
    private javax.swing.JLabel labelProducto;
    private javax.swing.JScrollPane scrollStock;
    private javax.swing.JTable tableStock;
    private javax.swing.JLabel textoAgregar;
    private javax.swing.JLabel textoAgregar1;
    private javax.swing.JLabel textoEliminar;
    private javax.swing.JPanel tituloStock;
    // End of variables declaration//GEN-END:variables
}
