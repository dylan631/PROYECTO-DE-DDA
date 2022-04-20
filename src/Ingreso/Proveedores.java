package Ingreso;

import dataMysql.ComprasSQL;
import dataMysql.ProductosSQL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemas.Eventos_graficos;

public final class Proveedores extends javax.swing.JPanel {

    private final Calendar fecha_actual = new GregorianCalendar();
    String fechaCalendar;

    private void capturar1() {
        try {
            Date date = calendario.getDate();
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            fechaCalendar = String.valueOf(fecha);
        } catch (Exception e) {
        }
    }

    DefaultTableModel htm = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public void tabla_compra_prod() {
        String[] titulo = new String[]{"CODIGO", "PRODUCTO", "MARCA", "PRECIO UNITARIO","CANTIDAD"};
        htm.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla_productos.setModel(htm);
    }

    public void mostrarTabla() {
        tabla_compra_prod();
        ProductosSQL.mostrarTabla2(htm);
    }

    public Proveedores() {
        initComponents();
        calendario.setCalendar(fecha_actual);
        Eventos_graficos.decorar_tabla_estandar(tabla_productos, jScrollPane1);
        Eventos_graficos.decorar_tabla_estandar(tabla_productos2, jScrollPane2);
        mostrarTabla();
        tabla_compra_prod2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_productos2 = new javax.swing.JTable();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        spin_cant = new javax.swing.JSpinner();
        btn_agregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_codprov = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_productos.setRowHeight(35);
        tabla_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_productos);

        tabla_productos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabla_productos2.setRowHeight(35);
        jScrollPane2.setViewportView(tabla_productos2);

        calendario.setToolTipText("");
        calendario.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("Cantidad");

        btn_agregar.setBackground(new java.awt.Color(60, 78, 120));
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(null);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setFocusable(false);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(60, 78, 120));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_codprov, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spin_cant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                        .addGap(111, 111, 111))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(665, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spin_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(txt_codprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents
    String codigo, nombre, codigoprov, cantcom, preuni, prefin, cant,cantini,cantfin;
    private void tabla_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_productosMouseClicked
        int fila = tabla_productos.getSelectedRow();
        codigo = tabla_productos.getValueAt(fila, 0).toString().trim();
        nombre = tabla_productos.getValueAt(fila, 1).toString().trim();
        preuni = tabla_productos.getValueAt(fila, 3).toString().trim();
        cantini = tabla_productos.getValueAt(fila, 4).toString().trim();
    }//GEN-LAST:event_tabla_productosMouseClicked

    DefaultTableModel htm1 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private void actualizar_bd_tabla1(){
        ProductosSQL.actualizar_bd_productos(codigo, cantini);
    }
    
    private void guardar_elementos_tabla1(){        
        int fila = tabla_productos.getRowCount(); //nos da la cantidad de fila
        for (int i = 0; i < fila; i++) {
            String cantidad=tabla_productos.getValueAt(i, 4).toString(); //cambia un objeto a String
            String cod=tabla_productos.getValueAt(i, 0).toString(); //cambia un objeto a String
            ProductosSQL.actualizar_bd_productos(cod, cantidad);
        }   
    }  
    
    private void actualizar_tabla1(){
        int fila=tabla_productos.getSelectedRow();//Retorna el valor numerico de la fila seleccionada       
        if(fila!=-1){
            htm.setValueAt(cantfin, fila, 4);
            String cod=tabla_productos.getValueAt(fila, 0).toString(); //cambia un objeto a String
            ProductosSQL.actualizar_bd_productos(cod, cantfin);
        } 
    } 
       
    private void mostrar_tabla2() {
        Object[] name = new Object[]{fechaCalendar,codigo, nombre, codigoprov, cant, preuni, prefin};
        htm1.addRow(name);
    }

    private void llenar_datos(int i) {
        codigo = tabla_productos2.getValueAt(i, 1).toString();
        nombre = tabla_productos2.getValueAt(i, 2).toString();
        codigoprov = tabla_productos2.getValueAt(i, 3).toString();
        cant = tabla_productos2.getValueAt(i, 4).toString();
        preuni = tabla_productos2.getValueAt(i, 5).toString();
        prefin = tabla_productos2.getValueAt(i, 6).toString();
    }

    private void tabla_compra_prod2() {
        String[] titulo = new String[]{"FECHA","CÓDIGO", "NOMBRE", "CODIGO PROVEEDOR","CANTIDAD","PRECIO UNITARIO", "PRECIO FINAL"};
        htm1.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla_productos2.setModel(htm1);
    }

    public void mostrarTabla2() {
        tabla_compra_prod2();
    }
        
    private void guardar_elementos_tabla2() {
        int fila = tabla_productos2.getRowCount();
        for (int i = 0; i < fila; i++) {
            llenar_datos(i);
            String cantidad_=tabla_productos2.getValueAt(i, 4).toString();
            String codigo_=tabla_productos2.getValueAt(i, 1).toString();
        ComprasSQL ob1 = new ComprasSQL(fechaCalendar,codigo, nombre, codigoprov, cant, preuni, prefin);
        ob1.guardar_bd_compras();
        actualizar_tabla1(codigo_, cantidad_);
        
        //actualizar_tabla1();
        }
    }
    private void actualizar_tabla1(String cod, String cant_fija){   
        for(int i=0; i<tabla_productos.getRowCount(); i++){
            if(cod.equals(tabla_productos.getValueAt(i, 0).toString())){
                String cant=String.valueOf(Integer.parseInt(tabla_productos.getValueAt(i, 4).toString())+Integer.parseInt(cant_fija));
                htm.setValueAt(cant, i, 4);   
                ProductosSQL.actualizar_bd_productos(codigo, cant);
            }  
        }
    }  

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (codigo == null) {
            JOptionPane.showMessageDialog(null, "Seleccione primero una fila de la tabla1", "ERROR", 0);
        } else {
            cant = spin_cant.getValue().toString();
            if (Integer.parseInt(cant) <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser entera positiva", "ERROR", 0);
            } else {
                if(txt_codprov.getText().length() > 0){
                prefin = String.valueOf(Float.parseFloat(preuni) * Integer.parseInt(cant));
                codigoprov = txt_codprov.getText(); 
                cantfin = Integer.parseInt(cant)+ Integer.parseInt(cantini)+"";
                capturar1();
                mostrarTabla2();
                mostrar_tabla2();
                cantini = cantfin;
                txt_codprov.setText(null);
                spin_cant.setValue(0);
                }else{
                    JOptionPane.showMessageDialog(null,"No se han llenado todos los campos","ERROR",0);                    
                }
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        guardar_elementos_tabla2();
        
        JOptionPane.showMessageDialog(null,"Productos agregados correctamente","EXITO",1);
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla_productos2.getModel();
        modelo.setRowCount(0);
        txt_codprov.setText(null);
        spin_cant.setValue(0);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spin_cant;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTable tabla_productos2;
    private javax.swing.JTextField txt_codprov;
    // End of variables declaration//GEN-END:variables
}
