package Ingreso;

import dataMysql.ComprasSQL;
import dataMysql.ProductosSQL;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_codprov = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(0, 204, 204));

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
        jScrollPane2.setViewportView(tabla_productos2);

        calendario.setToolTipText("");
        calendario.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("Cantidad");

        jLabel3.setText("Tabla 1");

        jLabel4.setText("Tabla 2");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(86, 86, 86))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spin_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(txt_codprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addGap(117, 117, 117))
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
        ComprasSQL ob1 = new ComprasSQL(fechaCalendar,codigo, nombre, codigoprov, cant, preuni, prefin);
        ob1.guardar_bd_compras();
        }
    }


    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (codigo == null) {
            JOptionPane.showMessageDialog(null, "Seleccione primero una fila de la tabla1", "ERROR", 0);
        } else {
            cant = spin_cant.getValue().toString();
            if (Integer.parseInt(cant) <= 0) {
                JOptionPane.showMessageDialog(null, "Digite solo numeros enteros positivos", "ERROR", 0);
            } else {
                prefin = String.valueOf(Float.parseFloat(preuni) * Integer.parseInt(cant));
                codigoprov = txt_codprov.getText(); 
                cantfin = Integer.parseInt(cant)+ Integer.parseInt(cantini)+"";
                capturar1();
                actualizar_tabla1();
                mostrarTabla2();
                mostrar_tabla2();
                cantini = cantfin;
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        guardar_elementos_tabla2();
    
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spin_cant;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTable tabla_productos2;
    private javax.swing.JTextField txt_codprov;
    // End of variables declaration//GEN-END:variables
}
