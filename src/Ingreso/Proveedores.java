package Ingreso;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Proveedores extends javax.swing.JPanel {

    private ArrayList<Proveedor> Lis;
    public Proveedores(){
        Lis = new ArrayList<Proveedor>(); 
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtCiud = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jAgregar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledat = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Nombre");

        jLabel2.setText("Codigo");

        jLabel3.setText("Ciudad");

        jLabel4.setText("Celular");

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jTabledat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Codigo", "Ciudad", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabledat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiud)
                            .addComponent(txtCod)
                            .addComponent(txtNom)
                            .addComponent(txtCel))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jModificar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jEliminar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        String Nom, Cod, Ciud, Cel;
        try{
            Nom = txtNom.getText();
            Cod = txtCod.getText();
            Ciud = txtCiud.getText();
            Cel = txtCel.getText();
            Lis.add(new Proveedor(Nom, Cod, Ciud, Cel));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Verificar Datos");
        }
        limpiar();
        verDatos();
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        int c;
        String Ciud;
        Proveedor aux;
        try{
            c = jTabledat.getSelectedRow();
            aux = Lis.get(c);
            Ciud = JOptionPane.showInputDialog("Nueva Ciudad");
            aux.setCiudad(Ciud);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Escoger Datos a modificar");
        }
        verDatos();
    }//GEN-LAST:event_jModificarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        int c;
        try{
            c = jTabledat.getSelectedRow();
            Lis.remove(c);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Elegir Datos a eliminar");
        }
        verDatos();
    }//GEN-LAST:event_jEliminarActionPerformed

    private void verDatos(){
        String Mat[][] = new String [Lis.size()][4];
        Proveedor aux;
        for(int i=0; i<Lis.size(); i++){
            aux = Lis.get(i);
            Mat[i][0] = aux.getNombre();
            Mat[i][1] = aux.getCodigo();
            Mat[i][2] = aux.getCiudad();
            Mat[i][3] = aux.getCelular();
        }
        jTabledat.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Nombre", "Codigo", "Ciudad", "Celular"
            }
        ));
    }
    
    private void limpiar(){
        txtNom.setText("");
        txtCod.setText("");
        txtCiud.setText("");
        txtCel.setText("");
    }
    
    private void guardar(){
        File file = new File("Proveedores.txt");
        PrintWriter Escribe;
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception e){
            }
        }
        try{
            Proveedor aux;
            Escribe = new PrintWriter(file, "utf-8");
            for(int i=0; i<Lis.size(); i++){
                aux = Lis.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();
        }catch (Exception e){
            }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabledat;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCiud;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
