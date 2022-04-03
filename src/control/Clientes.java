package control;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JPanel {
    DefaultTableModel dtm2 = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           return false;
        }        
    };
    String fechaCalendar;
    Calendar fecha_actual = new GregorianCalendar();
    public Clientes() {
        initComponents();
        calendario1.setCalendar(fecha_actual);
        calendario2.setCalendar(fecha_actual);
        indice2();
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
        res3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        Imprimir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        calendario2.setDateFormatString("dd/MM/yyyy");

        btn_buscar.setBackground(new java.awt.Color(60, 78, 120));
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(null);
        btn_buscar.setFocusable(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        calendario1.setDateFormatString("dd/MM/yyyy");

        lbl_desde.setText("Desde");

        lbl_hasta.setText("Hasta");

        desplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUSQUEDA POR:", "REGISTRO-NOMBRE", "REGISTRO-SOLO FECHA", "VENTA-NOMBRE", "VENTA-SOLO FECHA" }));
        desplegable.setBorder(null);
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable.setFocusable(false);
        desplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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
        jScrollPane2.setViewportView(tabla2);

        Imprimir.setBackground(new java.awt.Color(60, 78, 120));
        Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        Imprimir.setText("imprimir pdf");
        Imprimir.setBorder(null);
        Imprimir.setFocusable(false);
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 161, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 138, Short.MAX_VALUE)
                    .addComponent(res3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 562, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendario2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 295, Short.MAX_VALUE)
                    .addComponent(res3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 295, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void desplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableActionPerformed

    }//GEN-LAST:event_desplegableActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        pdf_();
    }//GEN-LAST:event_ImprimirActionPerformed

    public void indice2(){   
        String [] titulo = new String []{"Codigo", "Nombre", "Cantidad vendida", "Precio Unitario","PrecioFinal"};   
        dtm2.setColumnIdentifiers(titulo); //Asigna los valores a la tabla
        tabla2.setModel(dtm2); 
    }
    void pdf_(){
        
        Document documento = new Document();  
        try {
            String ruta=System.getProperty("user.home");//Para saber el nombre del usuario de la maquina
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Downloads/Reporte.pdf"));
            Paragraph parrafo=new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Formato pdf ventas\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Factura\n\n");
            documento.open();
            documento.add(parrafo);
            PdfPTable tabla_pdf = new PdfPTable(5);//Nos da las columnas
            tabla_pdf.addCell("Codigo");
            tabla_pdf.addCell("Nombre");
            tabla_pdf.addCell("Cantidad vendida");
            tabla_pdf.addCell("Precio Unitario");
            tabla_pdf.addCell("Precio Final");          
            try {
                int fila = tabla2.getRowCount(); //nos da la cantidad de fila
                for (int i = 0; i < fila; i++) {
                    tabla_pdf.addCell((String)tabla2.getValueAt(i, 0));
                    tabla_pdf.addCell((String)tabla2.getValueAt(i, 1));
                    tabla_pdf.addCell((String)tabla2.getValueAt(i, 2));
                    tabla_pdf.addCell((String)tabla2.getValueAt(i, 3));
                    tabla_pdf.addCell((String)tabla2.getValueAt(i, 4));     
                }
                documento.add(tabla_pdf);
            } catch (DocumentException e) {
                System.out.println("Error1");
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado", "Advertencia", 1);
            
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println("Error2");
        }
    }
    public void capturar1(){      
        Date date = calendario2.getDate();        
        long d   = date.getTime();        
        java.sql.Date fecha = new java.sql.Date(d);
        String fech=fecha+"";    
        fechaCalendar=fech;       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton btn_buscar;
    private com.toedter.calendar.JDateChooser calendario1;
    private com.toedter.calendar.JDateChooser calendario2;
    private javax.swing.JComboBox<String> desplegable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_desde;
    private javax.swing.JLabel lbl_hasta;
    private javax.swing.JLabel res3;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
