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
import sistemas.Eventos_graficos;

public final class Devoluciones extends javax.swing.JPanel {

    private final Calendar fecha_actual = new GregorianCalendar();
    String fechaCalendar;

    private void capturar2() {
        try {
            Date date = calendario.getDate();
            java.sql.Date fecha = new java.sql.Date(date.getTime());
            fechaCalendar = String.valueOf(fecha);
        } catch (Exception e) {
        }
    }

    DefaultTableModel jtm = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public void tabla_compra_devol() {
        String[] titulo = new String[]{"CÓDIGO", "NOMBRE", "MARCA","CANTIDAD"};
        jtm.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla_devol.setModel(jtm);
    }

    public void mostrarTabla() {
        tabla_compra_devol();
        ProductosSQL.mostrarTabla3(jtm);
    }

    public Devoluciones() {
        initComponents();
        Eventos_graficos.decorar_tabla_estandar(tabla_devol, jScrollPane1);
        Eventos_graficos.decorar_tabla_estandar(tabla_devol2, jScrollPane2);
        calendario.setCalendar(fecha_actual);
        mostrarTabla();
        INDICE_compra_prod2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_devol = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_devol2 = new javax.swing.JTable();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        spin_cant = new javax.swing.JSpinner();
        btn_agregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        tabla_devol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_devol.setRowHeight(35);
        tabla_devol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_devolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_devol);

        tabla_devol2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_devol2.setRowHeight(35);
        jScrollPane2.setViewportView(tabla_devol2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addComponent(spin_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(672, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spin_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents
    String codigo, nombre, marca, preuni, prefin, cant,cantini,cantfin;
    private void tabla_devolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_devolMouseClicked
        int fila = tabla_devol.getSelectedRow();
        codigo = tabla_devol.getValueAt(fila, 0).toString().trim();
        nombre = tabla_devol.getValueAt(fila, 1).toString().trim();
        marca = tabla_devol.getValueAt(fila,2).toString().trim();
        cantini = tabla_devol.getValueAt(fila, 3).toString().trim();
    }//GEN-LAST:event_tabla_devolMouseClicked

    DefaultTableModel jtm1 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private void actualizar_bd_tabla1(){
        ProductosSQL.actualizar_bd_productos(codigo, cantini);
    }
    
    private void guardar_elementos_tabla1(){        
        int fila = tabla_devol.getRowCount(); //nos da la cantidad de fila
        for (int i = 0; i < fila; i++) {
            String cantidad=tabla_devol.getValueAt(i, 3).toString(); //cambia un objeto a String
            String cod=tabla_devol.getValueAt(i, 0).toString(); //cambia un objeto a String
            ProductosSQL.actualizar_bd_productos(cod, cantidad);
        }   
    }  
    
    private int actualizar_tabla1(){
        int fila=tabla_devol.getSelectedRow();//Retorna el valor numerico de la fila seleccionada       
        if(Integer.parseInt(cantfin)>=0){
            jtm.setValueAt(cantfin, fila, 3);
            String cod=tabla_devol.getValueAt(fila, 0).toString(); //cambia un objeto a String
            ProductosSQL.actualizar_bd_productos(cod, cantfin);
            return 1;
        }else{
            JOptionPane.showMessageDialog(null,"No hay suficientes productos","ERROR",0);
            return 0;
        }
    } 
       
    private void mostrar_tabla2() {
        Object[] name = new Object[]{fechaCalendar,codigo, nombre, marca, cant, preuni, prefin};
        jtm1.addRow(name);
    }

    private void llenar_datos(int i) {
        codigo = tabla_devol2.getValueAt(i, 1).toString();
        nombre = tabla_devol2.getValueAt(i, 2).toString();
        marca = tabla_devol2.getValueAt(i, 3).toString();
        cant = tabla_devol2.getValueAt(i, 4).toString();
        
    }

    private void INDICE_compra_prod2() {
        String[] titulo = new String[]{"FECHA","CÓDIGO", "NOMBRE", "MARCA","CANTIDAD DEVUELTA"};
        jtm1.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla_devol2.setModel(jtm1);
    }

    
    private void guardar_elementos_tabla2() {
        int fila = tabla_devol2.getRowCount();
        for (int i = 0; i < fila; i++) {
            String cantidad_=tabla_devol2.getValueAt(i, 4).toString();
            String codigo_=tabla_devol2.getValueAt(i, 1).toString();
            actualizar_tabla1(codigo_, cantidad_);
            
        }
    }
    private void actualizar_tabla1(String cod, String cant_fija){   
        for(int i=0; i<tabla_devol.getRowCount(); i++){
            if(cod.equals(tabla_devol.getValueAt(i, 0).toString())){
                String cant=String.valueOf(Integer.parseInt(tabla_devol.getValueAt(i, 3).toString())-Integer.parseInt(cant_fija));
                jtm.setValueAt(cant, i, 3);   
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
                cantfin = Integer.parseInt(cantini)- Integer.parseInt(cant)+"";
                capturar2();
                INDICE_compra_prod2();
                mostrar_tabla2();
                spin_cant.setValue(0);
                cantini = cantfin;
                //JOptionPane.showMessageDialog(null,"El producto se agrego correctamente","EXITO",1);
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        guardar_elementos_tabla2();
        int resultado = actualizar_tabla1();
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabla_devol2.getModel();
        modelo.setRowCount(0);
        spin_cant.setValue(0);
        if(resultado == 1 ){
            JOptionPane.showMessageDialog(null,"La devolución se realizo correctamente","EXITO",1);
        }       
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spin_cant;
    private javax.swing.JTable tabla_devol;
    private javax.swing.JTable tabla_devol2;
    // End of variables declaration//GEN-END:variables
}
