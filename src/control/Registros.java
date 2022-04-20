package control;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dataMysql.ComprasSQL;
import dataMysql.ProductosSQL;
import dataMysql.VentasSQL;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemas.Eventos_graficos;

public class Registros extends javax.swing.JPanel {
    
    
    DefaultTableModel dtm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           return false;
        }        
    };       
    DefaultTableModel dtm2 = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           return false;
        }        
    };
    String fecha1;
    String fecha2;
    Calendar fecha_actual = new GregorianCalendar();
    String titulo, subtitulo, subtitulo2;

    public Registros() {
        initComponents();
        eventos();

    }
    private void eventos(){
        calendario1.setCalendar(fecha_actual);
        calendario2.setCalendar(fecha_actual);
        Eventos_graficos.decorar_tabla_estandar(tabla1,fondo_tabla1 );
        Eventos_graficos.decorar_tabla_estandar(tabla2,fondo_tabla2 );
        mostrarTabla();
        fondo_tabla2.setVisible(false);
        visible1(false);
        visible2(false);
        btn_imprimir.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendario2 = new com.toedter.calendar.JDateChooser();
        btn_buscar = new javax.swing.JButton();
        calendario1 = new com.toedter.calendar.JDateChooser();
        lbl_desde = new javax.swing.JLabel();
        lbl_hasta = new javax.swing.JLabel();
        desplegable = new javax.swing.JComboBox<>();
        fondo_tabla1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btn_imprimir = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_variable = new javax.swing.JTextField();
        lbl_variable = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        fondo_tabla2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendario2.setDateFormatString("dd/MM/yyyy");
        add(calendario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 111, 200, 30));

        btn_buscar.setBackground(new java.awt.Color(60, 78, 120));
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(null);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 120, 30));

        calendario1.setDateFormatString("dd/MM/yyyy");
        add(calendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 37, 200, 30));

        lbl_desde.setText("Desde");
        add(lbl_desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 180, 30));

        lbl_hasta.setText("Hasta");
        add(lbl_hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 74, 190, 30));

        desplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSQUEDA POR:", "VENTAS-PRODUCTOS", "COMPRAS-PRODUCTOS", "VENTAS-DNI", "COMPRAS-PROVEEDOR", "VENTAS-FECHA", "COMPRAS-FECHA" }));
        desplegable.setBorder(null);
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.setFocusable(false);
        desplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableActionPerformed(evt);
            }
        });
        add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 154, 200, 30));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla1.setRowHeight(35);
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        fondo_tabla1.setViewportView(tabla1);

        add(fondo_tabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 560, 190));

        btn_imprimir.setBackground(new java.awt.Color(60, 78, 120));
        btn_imprimir.setForeground(new java.awt.Color(255, 255, 255));
        btn_imprimir.setText("imprimir pdf");
        btn_imprimir.setBorder(null);
        btn_imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_imprimir.setFocusable(false);
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 110, 30));

        txt_codigo.setEditable(false);
        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 140, 30));

        txt_nombre.setEditable(false);
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 140, 30));

        txt_marca.setEditable(false);
        txt_marca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 160, 30));

        txt_variable.setBackground(new java.awt.Color(240, 240, 240));
        txt_variable.setBorder(null);
        add(txt_variable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, 30));

        lbl_variable.setText("Inserte el valor solicitado");
        add(lbl_variable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 30));

        lbl_codigo.setText("Codigo");
        add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 120, 30));

        lbl_nombre.setText("Nombre");
        add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 120, 30));

        lbl_marca.setText("Marca");
        add(lbl_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 196, 160, 30));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla2.setRowHeight(35);
        fondo_tabla2.setViewportView(tabla2);

        add(fondo_tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 810, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        int num =  desplegable.getSelectedIndex();//retorna el valor del item seleccionado    
        limpiar_tabla2();
        switch(num){   
            case 0: 
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion", "Advertencia", 1);
                btn_imprimir.setVisible(false);
                break;
            case 1: 
                buscarfechas_ventas_productos();
                btn_imprimir.setVisible(true);
                break;
            case 2:
                buscarfechas_compra_productos();
                btn_imprimir.setVisible(true);
                break;
            case 3:
                buscarfechas_ventas_dni();
                btn_imprimir.setVisible(true);
                break;
            case 4:
                buscarfechas_compras_proveedor();
                btn_imprimir.setVisible(true);
                break;
            case 5: 
                buscarfechas_ventas();
                btn_imprimir.setVisible(true);
                break;
            case 6: 
                buscarfechas_compras();
                btn_imprimir.setVisible(true);
                break;
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void desplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableActionPerformed
        int num =  desplegable.getSelectedIndex();//retorna el valor del item seleccionado     
        if(num==0){
            fondo_tabla2.setVisible(false);
            btn_imprimir.setVisible(false);
        }else{
            fondo_tabla2.setVisible(true);
        }
        switch(num){   
            case 0: 
                limpiar_texto();
                visible1(false);
                visible2(false);
                break;
            case 1: 
                limpiar_tabla2();
                indice_tabla2_ventas();
                limpiar_texto();
                visible1(false);
                visible2(true);
                titulo="Formato pdf ventas\n\n";
                subtitulo="Cantidad vendida";
                subtitulo2="DNI cliente";
                break;
            case 2:
                limpiar_tabla2();
                indice_tabla2_compras();
                limpiar_texto();
                visible1(false);
                visible2(true);
                titulo="Formato pdf compras\n\n";
                subtitulo="Cantidad comprada";
                subtitulo2="Codigo proveedor";
                break;
            case 3:
                limpiar_tabla2();
                indice_tabla2_ventas();
                limpiar_texto();
                visible1(true);
                visible2(false);
                titulo="Formato pdf ventas\n\n";
                subtitulo="Cantidad vendida";
                subtitulo2="DNI cliente";
                break;
            case 4:
                limpiar_tabla2();
                indice_tabla2_compras();
                limpiar_texto();
                visible1(true);
                visible2(false);
                titulo="Formato pdf compras\n\n";
                subtitulo="Cantidad comprada";
                subtitulo2="Codigo proveedor";
                
                break;
            case 5: 
                limpiar_tabla2();
                indice_tabla2_ventas();
                limpiar_texto();
                visible1(false);
                visible2(false);
                titulo="Formato pdf ventas\n\n";
                subtitulo="Cantidad vendida";
                subtitulo2="DNI cliente";
                break;
            case 6: 
                limpiar_tabla2();
                indice_tabla2_compras();
                limpiar_texto();
                visible1(false);
                visible2(false);
                titulo="Formato pdf compras\n\n";
                subtitulo="Cantidad comprada";
                subtitulo2="Codigo proveedor";
                break;
        }
    }//GEN-LAST:event_desplegableActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        Pdf_generar ob1 = new Pdf_generar();
        ob1.pdf_(tabla2, titulo, subtitulo, subtitulo2);
        //pdf_(titulo, subtitulo, subtitulo2);
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int fila=tabla1.getSelectedRow(); 
        txt_codigo.setText(tabla1.getValueAt(fila, 0).toString().trim());
        txt_nombre.setText(tabla1.getValueAt(fila, 1).toString().trim());
        txt_marca.setText(tabla1.getValueAt(fila, 2).toString().trim());
    }//GEN-LAST:event_tabla1MouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    public void indice_tabla1(){   
        String [] titulo = new String []{"CÓDIGO", "NOMBRE", "MARCA"};   
        dtm.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla1.setModel(dtm); 
    }  
    public void mostrarTabla(){
        indice_tabla1();
        ProductosSQL.mostrarTabla(dtm);   
    }       
    public void indice_tabla2_compras(){   
        String [] titulo = new String []{"N_SERIE", "FECHA", "CODIGO", "NOMBRE","CODIGO_PROVEEDOR", "CANTIDAD_COMPRA", "PRECIO_UNITARIO", "PRECIO_FINAL"};   
        dtm2.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla2.setModel(dtm2); 
    }
    public void indice_tabla2_ventas(){   
        String [] titulo = new String []{"N_SERIE", "FECHA", "CODIGO", "NOMBRE","DNI_CLIENTE", "CANTIDAD_VENTA", "PRECIO_UNITARIO", "PRECIO_FINAL"};   
        dtm2.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla2.setModel(dtm2); 
    }
    public void limpiar_tabla2(){      
        int filas=dtm2.getRowCount();//nos da la cantidad de fila
        for (int i = 0; i < filas; i++) {
            dtm2.removeRow(0);
        }
    }
    public void buscarfechas_compra_productos(){
        capturar1();
        capturar2();
        ComprasSQL.conec_compras();
        LocalDate start = LocalDate.parse(fecha1); 
        LocalDate end = LocalDate.parse(fecha2); 
        if(start.isEqual(end)){
            ComprasSQL.buscar_compras_productos(dtm2, start.toString(), txt_codigo.getText());
        }else if(start.isAfter(end)){
            JOptionPane.showMessageDialog(null, "ERROR DE FECHA", "Advertencia", 1);
        }else if(start.isBefore(end)){
            List<LocalDate> totalDates = new ArrayList<>(); 
            while (!start.isAfter(end)) { 
                ComprasSQL.buscar_compras_productos(dtm2, start.toString(), txt_codigo.getText());
                totalDates.add(start);
                start = start.plusDays(1);                 
            }      
        }
    }
    public void buscarfechas_ventas_productos(){
        capturar1();
        capturar2();
        VentasSQL.conec_ventas();
        LocalDate start = LocalDate.parse(fecha1); 
        LocalDate end = LocalDate.parse(fecha2); 
        if(start.isEqual(end)){
            VentasSQL.buscar_ventas_productos(dtm2, start.toString(), txt_codigo.getText());
        }else if(start.isAfter(end)){
            JOptionPane.showMessageDialog(null, "ERROR DE FECHA", "Advertencia", 1);
        }else if(start.isBefore(end)){
            List<LocalDate> totalDates = new ArrayList<>(); 
            while (!start.isAfter(end)) { 
                VentasSQL.buscar_ventas_productos(dtm2, start.toString(), txt_codigo.getText());
                totalDates.add(start);
                start = start.plusDays(1);                 
            }      
        }
    }
    public void buscarfechas_ventas_dni(){
        capturar1();
        capturar2();
        VentasSQL.conec_ventas();
        LocalDate start = LocalDate.parse(fecha1); 
        LocalDate end = LocalDate.parse(fecha2);
        if(start.isEqual(end)){
            VentasSQL.buscar_ventas__dni(dtm2, start.toString(), txt_variable.getText());
        }else if(start.isAfter(end)){
            JOptionPane.showMessageDialog(null, "ERROR DE FECHA", "Advertencia", 1);
        }else if(start.isBefore(end)){
            List<LocalDate> totalDates = new ArrayList<>(); 
            while (!start.isAfter(end)) { 
                VentasSQL.buscar_ventas__dni(dtm2, start.toString(), txt_variable.getText());
                totalDates.add(start);
                start = start.plusDays(1);                 
            }      
        }
    }
    public void buscarfechas_compras_proveedor(){
        capturar1();
        capturar2();
        ComprasSQL.conec_compras();
        LocalDate start = LocalDate.parse(fecha1); 
        LocalDate end = LocalDate.parse(fecha2);
        if(start.isEqual(end)){
            ComprasSQL.buscar_compras__proveedor(dtm2, start.toString(), txt_variable.getText());
        }else if(start.isAfter(end)){
            JOptionPane.showMessageDialog(null, "ERROR DE FECHA", "Advertencia", 1);
        }else if(start.isBefore(end)){
            List<LocalDate> totalDates = new ArrayList<>(); 
            while (!start.isAfter(end)) { 
                ComprasSQL.buscar_compras__proveedor(dtm2, start.toString(), txt_variable.getText());
                totalDates.add(start);
                start = start.plusDays(1);                 
            }      
        }
    }
    public void buscarfechas_ventas(){
        capturar1();
        capturar2();
        VentasSQL.conec_ventas();
        LocalDate start = LocalDate.parse(fecha1); 
        LocalDate end = LocalDate.parse(fecha2);
        if(start.isEqual(end)){
            VentasSQL.buscar_ventas(dtm2, start.toString());
        }else if(start.isAfter(end)){
            JOptionPane.showMessageDialog(null, "ERROR DE FECHA", "Advertencia", 1);
        }else if(start.isBefore(end)){
            while (!start.isAfter(end)) { 
                VentasSQL.buscar_ventas(dtm2, start.toString());
                start = start.plusDays(1);                 
            }      
        }
    }
    public void buscarfechas_compras(){
        capturar1();
        capturar2();
        ComprasSQL.conec_compras();
        LocalDate start = LocalDate.parse(fecha1); 
        LocalDate end = LocalDate.parse(fecha2);
        if(start.isEqual(end)){
            ComprasSQL.buscar_compras(dtm2, start.toString());
        }else if(start.isAfter(end)){
            JOptionPane.showMessageDialog(null, "ERROR DE FECHA", "Advertencia", 1);
        }else if(start.isBefore(end)){
            while (!start.isAfter(end)) { 
                ComprasSQL.buscar_compras(dtm2, start.toString());
                start = start.plusDays(1);                 
            }      
        }
    }
    public void visible1(boolean bool){
        lbl_variable.setVisible(bool);
        txt_variable.setVisible(bool);      
    }
    public void visible2(boolean bool){
        lbl_codigo.setVisible(bool);
        txt_codigo.setVisible(bool);   
        lbl_nombre.setVisible(bool);
        txt_nombre.setVisible(bool);
        lbl_marca.setVisible(bool);
        txt_marca.setVisible(bool);
    }
    public void limpiar_texto(){
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_variable.setText("");
        txt_marca.setText("");
    }
    public void capturar1(){      
        Date date = calendario1.getDate();        
        long d   = date.getTime();        
        java.sql.Date fecha = new java.sql.Date(d);
        String fech=fecha+"";    
        fecha1=fech;       
    }
    public void capturar2(){      
        Date date = calendario2.getDate();        
        long d   = date.getTime();        
        java.sql.Date fecha = new java.sql.Date(d);
        String fech=fecha+"";    
        fecha2=fech;       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_imprimir;
    private com.toedter.calendar.JDateChooser calendario1;
    private com.toedter.calendar.JDateChooser calendario2;
    private javax.swing.JComboBox<String> desplegable;
    private javax.swing.JScrollPane fondo_tabla1;
    private javax.swing.JScrollPane fondo_tabla2;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_desde;
    private javax.swing.JLabel lbl_hasta;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_variable;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_variable;
    // End of variables declaration//GEN-END:variables

}
