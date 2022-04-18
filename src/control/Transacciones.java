package control;

import static dataMysql.Conexion.getConnection;
import dataMysql.ObjetoTransaccion;
import javax.swing.JOptionPane;

public class Transacciones extends javax.swing.JPanel {

    public Transacciones(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
    }

    public Transacciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        contenedorTitulo = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        labelDesde = new javax.swing.JLabel();
        listaProductos = new javax.swing.JComboBox<>();
        scrollTablaTransaccion = new javax.swing.JScrollPane();
        tablaTransaccion = new javax.swing.JTable();
        labelIngresos = new javax.swing.JLabel();
        labelSalidas = new javax.swing.JLabel();
        labelSaldos = new javax.swing.JLabel();
        labelProductos = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JPanel();
        labelBuscar = new javax.swing.JLabel();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        labelHasta = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedorTitulo.setBackground(new java.awt.Color(60, 77, 120));

        textoTitulo.setFont(new java.awt.Font("Roboto Light", 3, 12)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setText("CONTROL DE INVENTARIO - KARDEX");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(contenedorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 220, -1));

        labelDesde.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelDesde.setText("Desde");
        add(labelDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 40, -1));

        listaProductos.setModel(createModeloComboBox());
        listaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 150, -1));

        tablaTransaccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaTransaccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Cantidad", "Valor Unitario", "Valor Total", "Cantidad", "Valor Unitario", "Valor Total", "Cantidad", "Valor Unitario", "Valor Total"
            }
        ));
        scrollTablaTransaccion.setViewportView(tablaTransaccion);

        add(scrollTablaTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 830, 120));

        labelIngresos.setBackground(new java.awt.Color(60, 77, 120));
        labelIngresos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        labelIngresos.setForeground(new java.awt.Color(255, 255, 255));
        labelIngresos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngresos.setText("INGRESOS");
        labelIngresos.setOpaque(true);
        add(labelIngresos, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 280, 250, 20));

        labelSalidas.setBackground(new java.awt.Color(60, 77, 120));
        labelSalidas.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        labelSalidas.setForeground(new java.awt.Color(255, 255, 255));
        labelSalidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalidas.setText("SALIDAS");
        labelSalidas.setOpaque(true);
        add(labelSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 280, 246, 20));

        labelSaldos.setBackground(new java.awt.Color(60, 77, 120));
        labelSaldos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        labelSaldos.setForeground(new java.awt.Color(255, 255, 255));
        labelSaldos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldos.setText("SALDOS");
        labelSaldos.setOpaque(true);
        add(labelSaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 280, 246, 20));

        labelProductos.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelProductos.setText("Productos");
        add(labelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 68, -1));

        botonBuscar.setBackground(new java.awt.Color(95, 94, 94));
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonBuscarMouseReleased(evt);
            }
        });

        labelBuscar.setBackground(new java.awt.Color(255, 255, 255));
        labelBuscar.setFont(new java.awt.Font("Roboto Light", 1, 13)); // NOI18N
        labelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBuscar.setText("Buscar");
        labelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout botonBuscarLayout = new javax.swing.GroupLayout(botonBuscar);
        botonBuscar.setLayout(botonBuscarLayout);
        botonBuscarLayout.setHorizontalGroup(
            botonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonBuscarLayout.setVerticalGroup(
            botonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));
        add(fechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));
        add(fechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 150, -1));

        labelHasta.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelHasta.setText("Hasta");
        add(labelHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 40, -1));
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.DefaultComboBoxModel createModeloComboBox(){
        javax.swing.DefaultComboBoxModel modelo = new javax.swing.DefaultComboBoxModel<>();
        try{
            java.sql.Connection conexion = getConnection();
            java.sql.Statement miStatement = conexion.createStatement();
            java.sql.ResultSet datos = miStatement.executeQuery("SELECT DISTINCT nombre FROM productos");
            while(datos.next()){
                modelo.addElement(datos.getString("nombre"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
        }
        
        return modelo;
    }
    
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
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
        }
        return modeloReturn;
    }
    
    private java.util.ArrayList<ObjetoTransaccion> obtenerDatos(java.lang.String nombreTabla, String productoSeleccionado, String fInicial, String fFinal){
        java.util.ArrayList<ObjetoTransaccion> obj= new java.util.ArrayList<>();
        try{
            java.sql.Connection conexion = getConnection();
            java.sql.PreparedStatement miStatement = null;
            if("compras".equals(nombreTabla))
                miStatement = conexion.prepareStatement("SELECT fecha,cantidad_compra,precio_unitario FROM compras WHERE nombre LIKE ? AND fecha BETWEEN ? AND ?");
            else if("ventas".equals(nombreTabla)){
                miStatement = conexion.prepareStatement("SELECT fecha,cantidad_venta,precio_unitario FROM ventas WHERE nombre LIKE ? AND fecha BETWEEN ? AND ?");
            }
            String nombreSQL = "%"+productoSeleccionado+"%";
            miStatement.setString(1, nombreSQL);
            miStatement.setString(2, fInicial);
            miStatement.setString(3, fFinal);
            java.sql.ResultSet datos = miStatement.executeQuery();
            while(datos.next()){
                ObjetoTransaccion transaccion=null;
                if("compras".equals(nombreTabla))
                    transaccion = new ObjetoTransaccion(datos.getString("fecha"),Integer.parseInt(datos.getString("cantidad_compra")),Float.parseFloat(datos.getString("precio_unitario")),nombreTabla);
                else if("ventas".equals(nombreTabla))
                    transaccion = new ObjetoTransaccion(datos.getString("fecha"),Integer.parseInt(datos.getString("cantidad_venta")),Float.parseFloat(datos.getString("precio_unitario")),nombreTabla);
                obj.add(transaccion);
            }
            conexion.close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
        }
        return obj;
    }
    
    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        botonBuscar.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        botonBuscar.setBackground(new java.awt.Color(95,94,94));
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMousePressed
        botonBuscar.setBackground(new java.awt.Color(50,49,49));
    }//GEN-LAST:event_botonBuscarMousePressed

    private void botonBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseReleased
        botonBuscar.setBackground(new java.awt.Color(80,79,79));
    }//GEN-LAST:event_botonBuscarMouseReleased

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaTransaccion.getModel();
        modelo.setRowCount(0);
        java.text.SimpleDateFormat dFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateInicial = fechaInicial.getDate();
        java.util.Date dateFinal = fechaFinal.getDate();
        java.lang.String productoSeleccionado = (java.lang.String)listaProductos.getSelectedItem();
        java.lang.Double saldoTotal = 0.0;
        int saldoCantidad = 0;
        if(dateInicial==null || dateFinal==null || productoSeleccionado==null){
            JOptionPane.showMessageDialog(null,"No se han llenado todos los campos","ERROR",0);
        }
        else{
            String fInicial = dFormat.format(dateInicial);
            String fFinal = dFormat.format(dateFinal);
            try{
                java.sql.Connection conexion = getConnection();
                java.sql.PreparedStatement miStatement1 = conexion.prepareStatement("SELECT CAST(cantidad_compra AS UNSIGNED),CAST(cantidad_compra AS UNSIGNED)*CAST(precio_unitario AS DECIMAL(10,2)) FROM compras WHERE fecha < ?");
                java.sql.PreparedStatement miStatement2 = conexion.prepareStatement("SELECT CAST(cantidad_venta AS UNSIGNED),CAST(cantidad_venta AS UNSIGNED)*CAST(precio_unitario AS DECIMAL(10,2)) FROM ventas WHERE fecha < ?");
                miStatement1.setString(1, fInicial);
                miStatement2.setString(1, fInicial);
                java.sql.ResultSet miResulSet1 = miStatement1.executeQuery();
                java.sql.ResultSet miResulSet2 = miStatement2.executeQuery();
                
                while(miResulSet1.next()){
                    saldoTotal += miResulSet1.getDouble(2);
                    saldoCantidad += miResulSet1.getInt(1);
                }
                
                while(miResulSet2.next()){
                    saldoTotal -= miResulSet2.getDouble(2);
                    saldoCantidad -= miResulSet2.getInt(1);
                }
            }catch(java.sql.SQLException e){
                e.printStackTrace();
            }
            java.util.ArrayList<ObjetoTransaccion> salidas = obtenerDatos("ventas",productoSeleccionado,fInicial,fFinal);
            java.util.ArrayList<ObjetoTransaccion> ingresos = obtenerDatos("compras",productoSeleccionado,fInicial,fFinal);
            java.util.ArrayList<ObjetoTransaccion> datos = new java.util.ArrayList<>();
            datos.addAll(ingresos);
            datos.addAll(salidas);
            datos.sort((o1, o2) -> o1.getFecha().compareTo(o2.getFecha()));
            Double saldoUnitario = saldoTotal/saldoCantidad;
            if(saldoUnitario.isNaN())
                saldoUnitario = 0.0;
            String saldoUnitarioS = String.format("%.2f",saldoUnitario);
            String saldoTotalS = String.format("%.2f",saldoTotal);
            java.lang.String [] inicial = {"Saldo Inicial","0","0","0","0","0","0",String.valueOf(saldoCantidad),saldoUnitarioS,saldoTotalS};
            modelo.addRow(inicial);
            Double precioUnitarioSalida = saldoUnitario;
            for(int i=0;i<datos.size();i++){
                ObjetoTransaccion obj = datos.get(i);
                String tipoTransaccion = obj.getTipoTransaccion();
                if("compras".equals(tipoTransaccion)){
                    Float precioTotal = obj.getCantidad()*obj.getPrecioUnitario();
                    saldoTotal += Double.parseDouble(precioTotal.toString());
                    saldoCantidad += obj.getCantidad();
                    saldoUnitario = saldoTotal/saldoCantidad;
                    java.lang.String [] datosFila = {obj.getFecha(),String.valueOf(obj.getCantidad()),String.format("%.2f",obj.getPrecioUnitario()),String.format("%.2f",precioTotal),"0","0","0",String.valueOf(saldoCantidad),String.format("%.2f",saldoUnitario),String.format("%.2f",saldoTotal)};
                    modelo.addRow(datosFila);
                    precioUnitarioSalida = saldoUnitario;
                }
                else if("ventas".equals(tipoTransaccion)){
                    Double precioTotal = obj.getCantidad()*precioUnitarioSalida;
                    saldoTotal -= Double.parseDouble(precioTotal.toString());
                    saldoCantidad -= obj.getCantidad();
                    saldoUnitario = saldoTotal/saldoCantidad;
                    java.lang.String [] datosFila = {obj.getFecha(),"0","0","0",String.valueOf(obj.getCantidad()),String.format("%.2f", precioUnitarioSalida),String.format("%.2f",precioTotal),String.valueOf(saldoCantidad),String.format("%.2f",saldoUnitario),String.format("%.2f",saldoTotal)};
                    modelo.addRow(datosFila);
                    precioUnitarioSalida = saldoUnitario;
                }
            }
        }
    }//GEN-LAST:event_botonBuscarMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBuscar;
    private javax.swing.JPanel contenedorTitulo;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelDesde;
    private javax.swing.JLabel labelHasta;
    private javax.swing.JLabel labelIngresos;
    private javax.swing.JLabel labelProductos;
    private javax.swing.JLabel labelSaldos;
    private javax.swing.JLabel labelSalidas;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JScrollPane scrollTablaTransaccion;
    private javax.swing.JTable tablaTransaccion;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}
