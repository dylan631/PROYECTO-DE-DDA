package control;

import static dataMysql.Conexion.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Stock extends javax.swing.JPanel {

    public Stock() {
        this.trs = new javax.swing.table.TableRowSorter<>(modelo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollStock = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        barraFiltrar = new javax.swing.JTextField();
        labelFiltrar = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JPanel();
        textoAgregar = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JPanel();
        textoEliminar = new javax.swing.JLabel();
        contenedorAgregar = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        labelProducto = new javax.swing.JLabel();
        inputProducto = new javax.swing.JTextField();
        labelMarca = new javax.swing.JLabel();
        labelPrecioCompra = new javax.swing.JLabel();
        labelPrecioVenta = new javax.swing.JLabel();
        botonAgregar1 = new javax.swing.JPanel();
        textoAgregar1 = new javax.swing.JLabel();
        contenedorCodigo = new javax.swing.JPanel();
        inputCodigo = new javax.swing.JTextField();
        codigoInvalido = new javax.swing.JLabel();
        contenedorPrecioCompra = new javax.swing.JPanel();
        inputPrecioCompra = new javax.swing.JTextField();
        precioCompraInvalido = new javax.swing.JLabel();
        contenedorPrecioVenta = new javax.swing.JPanel();
        inputPrecioVenta = new javax.swing.JTextField();
        precioVentaInvalido = new javax.swing.JLabel();
        contenedorMarca = new javax.swing.JPanel();
        inputMarca = new javax.swing.JTextField();
        marcaExistente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 610));

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

        labelCodigo.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelCodigo.setText("Codigo");

        labelProducto.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        labelProducto.setText("Nombre");

        inputProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputProductoKeyReleased(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAgregar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        inputCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputCodigoKeyReleased(evt);
            }
        });

        codigoInvalido.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        codigoInvalido.setForeground(new java.awt.Color(197, 18, 0));
        codigoInvalido.setText("Dato no valido");

        javax.swing.GroupLayout contenedorCodigoLayout = new javax.swing.GroupLayout(contenedorCodigo);
        contenedorCodigo.setLayout(contenedorCodigoLayout);
        contenedorCodigoLayout.setHorizontalGroup(
            contenedorCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codigoInvalido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(inputCodigo)
        );
        contenedorCodigoLayout.setVerticalGroup(
            contenedorCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoInvalido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPrecioCompraKeyReleased(evt);
            }
        });

        precioCompraInvalido.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        precioCompraInvalido.setForeground(new java.awt.Color(197, 18, 0));
        precioCompraInvalido.setText("Dato no valido");

        javax.swing.GroupLayout contenedorPrecioCompraLayout = new javax.swing.GroupLayout(contenedorPrecioCompra);
        contenedorPrecioCompra.setLayout(contenedorPrecioCompraLayout);
        contenedorPrecioCompraLayout.setHorizontalGroup(
            contenedorPrecioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrecioCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPrecioCompra)
                .addContainerGap())
            .addGroup(contenedorPrecioCompraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(precioCompraInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        contenedorPrecioCompraLayout.setVerticalGroup(
            contenedorPrecioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrecioCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPrecioCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioCompraInvalido)
                .addContainerGap())
        );

        inputPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPrecioVentaKeyReleased(evt);
            }
        });

        precioVentaInvalido.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        precioVentaInvalido.setForeground(new java.awt.Color(197, 18, 0));
        precioVentaInvalido.setText("Dato no valido");

        javax.swing.GroupLayout contenedorPrecioVentaLayout = new javax.swing.GroupLayout(contenedorPrecioVenta);
        contenedorPrecioVenta.setLayout(contenedorPrecioVentaLayout);
        contenedorPrecioVentaLayout.setHorizontalGroup(
            contenedorPrecioVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPrecioVentaLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(contenedorPrecioVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPrecioVentaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(precioVentaInvalido, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        contenedorPrecioVentaLayout.setVerticalGroup(
            contenedorPrecioVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPrecioVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(precioVentaInvalido))
        );

        inputMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputMarcaKeyReleased(evt);
            }
        });

        marcaExistente.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        marcaExistente.setForeground(new java.awt.Color(197, 18, 0));
        marcaExistente.setText("Marca ya registrada");

        javax.swing.GroupLayout contenedorMarcaLayout = new javax.swing.GroupLayout(contenedorMarca);
        contenedorMarca.setLayout(contenedorMarcaLayout);
        contenedorMarcaLayout.setHorizontalGroup(
            contenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorMarcaLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(contenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marcaExistente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
        );
        contenedorMarcaLayout.setVerticalGroup(
            contenedorMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcaExistente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorAgregarLayout = new javax.swing.GroupLayout(contenedorAgregar);
        contenedorAgregar.setLayout(contenedorAgregarLayout);
        contenedorAgregarLayout.setHorizontalGroup(
            contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labelCodigo)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMarca)
                            .addComponent(labelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contenedorMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                .addComponent(labelPrecioVenta)
                                .addGap(18, 18, 18)
                                .addComponent(contenedorPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                .addComponent(labelPrecioCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contenedorPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        contenedorAgregarLayout.setVerticalGroup(
            contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAgregarLayout.createSequentialGroup()
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(labelCodigo))
                                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(contenedorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorAgregarLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(labelPrecioCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelProducto)
                            .addComponent(inputProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contenedorPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorAgregarLayout.createSequentialGroup()
                                .addGroup(contenedorAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contenedorPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPrecioVenta))
                                .addGap(18, 28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorAgregarLayout.createSequentialGroup()
                                .addComponent(contenedorMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(contenedorAgregarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelMarca)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(contenedorAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(barraFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollStock, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedorAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
            conexionP = getConnection();
            miStatementP = conexionP.createStatement();
            datosP = miStatementP.executeQuery("SELECT * FROM productos");
            while(datosP.next()){
                int codigoSQL = datosP.getInt("codigo");
                java.lang.String codigoJava = java.lang.String.format("%05d",codigoSQL);
                String [] datosColumna = {codigoJava,datosP.getString("nombre"),datosP.getString("marca"),(String)datosP.getString("cantidad"),(String)datosP.getString("precio_venta"),(String)datosP.getString("precio_compra")};
                modeloReturn.addRow(datosColumna);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
        }
        java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
        codigoInvalido.setForeground(myWhite);
        precioCompraInvalido.setForeground(myWhite);
        marcaExistente.setForeground(myWhite);
        precioVentaInvalido.setForeground(myWhite);
        contenedorAgregar.setVisible(false);
        return modeloReturn;
    }
    
    private void filtrar(){
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
                        miStatement.setInt(1, java.lang.Integer.parseInt((String) tableStock.getValueAt(i, 0)));
                        miStatement.executeUpdate();
                    }

                }
                modelo.setColumnCount(6);
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
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonAgregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregar1MouseClicked
        if(inputProducto.getText().length()>0&&inputMarca.getText().length()>0 && inputPrecioVenta.getText().length()>0 && inputPrecioCompra.getText().length()>0){
            if(!isValidCodigo || !isValidPrecioCompra || !isValidPrecioVenta || !isValidMarca){
                JOptionPane.showMessageDialog(null,"Existen datos no validos","ERROR",0);
            }
            else{
                try{
                    java.sql.Connection conexion = getConnection();
                    java.sql.PreparedStatement miPreparedStatement = conexion.prepareStatement("INSERT INTO productos(codigo,nombre,marca,precio_venta,precio_compra) VALUES(?,?,?,?,?)");
                    miPreparedStatement.setString(1, inputCodigo.getText());
                    miPreparedStatement.setString(2, inputProducto.getText().toLowerCase());
                    miPreparedStatement.setString(3, inputMarca.getText().toUpperCase());
                    miPreparedStatement.setFloat(4, java.lang.Float.parseFloat(inputPrecioVenta.getText()));
                    miPreparedStatement.setFloat(5, java.lang.Float.parseFloat(inputPrecioCompra.getText()));
                    miPreparedStatement.executeUpdate();
                    modelo = createModeloTableStock();
                    tableStock.setModel(modelo);
                    contenedorAgregar.setVisible(true);
                    inputCodigo.setText("");
                    inputProducto.setText("");
                    inputMarca.setText("");
                    inputPrecioVenta.setText("");
                    inputPrecioCompra.setText("");
                    JOptionPane.showMessageDialog(null,"El producto se agrego correctamente","EXITO",1);
                }catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e){
                    JOptionPane.showMessageDialog(null,"Codigo ya existente","ERROR",0);
                }catch(java.sql.SQLException e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No se han llenado todos los campos","ERROR",0);
        }
        
    }//GEN-LAST:event_botonAgregar1MouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        contenedorAgregar.setVisible(true);
        java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
        codigoInvalido.setForeground(myWhite);
        marcaExistente.setForeground(myWhite);
        precioCompraInvalido.setForeground(myWhite);
        precioVentaInvalido.setForeground(myWhite);
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void barraFiltrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraFiltrarKeyTyped
        filtrar();
    }//GEN-LAST:event_barraFiltrarKeyTyped

    private void inputProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputProductoKeyReleased
        try{
            int cant = 0;
            datosP = miStatementP.executeQuery("SELECT * FROM productos");
            while(datosP.next()){
                if(datosP.getString("nombre").equals(inputProducto.getText()) && datosP.getString("marca").equals(inputMarca.getText()))
                    cant++;
            }
            if(cant>0){
                java.awt.Color myRed = new java.awt.Color(197,18,0);
                marcaExistente.setForeground(myRed);
                isValidMarca = false;
            }
            else{
                java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
                marcaExistente.setForeground(myWhite);
                isValidMarca = true;
            }
                
        }catch(java.sql.SQLException e){
            e.printStackTrace();  
        }
    }//GEN-LAST:event_inputProductoKeyReleased

    private void inputMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMarcaKeyReleased
        try{
            int cant = 0;
            datosP = miStatementP.executeQuery("SELECT * FROM productos");
            while(datosP.next()){
                if(datosP.getString("nombre").equals(inputProducto.getText().toLowerCase()) && datosP.getString("marca").equals(inputMarca.getText().toUpperCase()))
                    cant++;
            }
            if(cant>0){
                java.awt.Color myRed = new java.awt.Color(197,18,0);
                marcaExistente.setForeground(myRed);
                isValidMarca = false;
            }
            else{
                java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
                marcaExistente.setForeground(myWhite);
                isValidMarca = true;
            }
                
        }catch(java.sql.SQLException e){
            e.printStackTrace();  
        }
    }//GEN-LAST:event_inputMarcaKeyReleased

    private void inputCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodigoKeyReleased
        if(inputCodigo.getText().matches("(.*)[a-zA-Z](.*)")){
            java.awt.Color myRed = new java.awt.Color(197,18,0);
            codigoInvalido.setForeground(myRed);
            isValidCodigo = false;
        }
        else{
            java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
            codigoInvalido.setForeground(myWhite);
            isValidCodigo = true;
        }
    }//GEN-LAST:event_inputCodigoKeyReleased

    private void inputPrecioCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPrecioCompraKeyReleased
        if(inputPrecioCompra.getText().matches("(.*)[a-zA-Z](.*)")){
            java.awt.Color myRed = new java.awt.Color(197,18,0);
            precioCompraInvalido.setForeground(myRed);
            isValidPrecioCompra = false;
        }
        else{
            java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
            precioCompraInvalido.setForeground(myWhite);
            isValidPrecioCompra = true;
        }
    }//GEN-LAST:event_inputPrecioCompraKeyReleased

    private void inputPrecioVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPrecioVentaKeyReleased
        if(inputPrecioVenta.getText().matches("(.*)[a-zA-Z](.*)")){
            java.awt.Color myRed = new java.awt.Color(197,18,0);
            precioVentaInvalido.setForeground(myRed);
            isValidPrecioVenta = false;
        }
        else{
            java.awt.Color myWhite = new java.awt.Color(240, 240, 240);
            precioVentaInvalido.setForeground(myWhite);
            isValidPrecioVenta = true;
        }
    }//GEN-LAST:event_inputPrecioVentaKeyReleased
    
    private java.sql.Connection conexionP;
    private java.sql.Statement miStatementP;
    private java.sql.ResultSet datosP;
    private java.lang.Boolean isValidCodigo = false;
    private java.lang.Boolean isValidPrecioVenta = false;
    private java.lang.Boolean isValidPrecioCompra = false;
    private java.lang.Boolean isValidMarca = false;
    private javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> trs;
    private javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraFiltrar;
    private javax.swing.JPanel botonAgregar;
    private javax.swing.JPanel botonAgregar1;
    private javax.swing.JPanel botonEliminar;
    private javax.swing.JLabel codigoInvalido;
    private javax.swing.JPanel contenedorAgregar;
    private javax.swing.JPanel contenedorCodigo;
    private javax.swing.JPanel contenedorMarca;
    private javax.swing.JPanel contenedorPrecioCompra;
    private javax.swing.JPanel contenedorPrecioVenta;
    private javax.swing.JTextField inputCodigo;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputPrecioCompra;
    private javax.swing.JTextField inputPrecioVenta;
    private javax.swing.JTextField inputProducto;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelFiltrar;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelPrecioCompra;
    private javax.swing.JLabel labelPrecioVenta;
    private javax.swing.JLabel labelProducto;
    private javax.swing.JLabel marcaExistente;
    private javax.swing.JLabel precioCompraInvalido;
    private javax.swing.JLabel precioVentaInvalido;
    private javax.swing.JScrollPane scrollStock;
    private javax.swing.JTable tableStock;
    private javax.swing.JLabel textoAgregar;
    private javax.swing.JLabel textoAgregar1;
    private javax.swing.JLabel textoEliminar;
    // End of variables declaration//GEN-END:variables
}
