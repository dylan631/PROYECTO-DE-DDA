package VentanasInicios;

import Ingreso.Devoluciones;
import Ingreso.Proveedores;
import control.Clientes;
import control.Stock;
import control.Transacciones;
import java.awt.Color;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import ventas.DevolucionClienteForms;
import ventas.VentasForm;

public class VentanaPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    boolean activadoDevolucionCliente = false, activadoVentas = false, activadoSalida = false,
            activadoComprar=false,activadoIngreso=false,activadoDevolucionProvee=false,activadoControl=false,
            activadoStock=false,activadoTransaccion=false,activadorVentas=false;

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        ingresoBtn = new javax.swing.JPanel();
        ingresoTxt = new javax.swing.JLabel();
        salidasBtn = new javax.swing.JPanel();
        salidasTxt = new javax.swing.JLabel();
        controlBtn = new javax.swing.JPanel();
        controlTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        comprarBtn = new javax.swing.JPanel();
        comprarTxt = new javax.swing.JLabel();
        devolucionProveeBtn = new javax.swing.JPanel();
        devolucionProveeTxt = new javax.swing.JLabel();
        ventasBtn = new javax.swing.JPanel();
        ventasTxt = new javax.swing.JLabel();
        devolucionClientesBtn = new javax.swing.JPanel();
        devolucionClientesTxt = new javax.swing.JLabel();
        stockBtn = new javax.swing.JPanel();
        stockTxt = new javax.swing.JLabel();
        transaccionesBtn = new javax.swing.JPanel();
        transaccionesTxt = new javax.swing.JLabel();
        rVentasBtn = new javax.swing.JPanel();
        rVentasTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(this.MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(60, 77, 120));
        BG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BGMouseDragged(evt);
            }
        });
        BG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BGMousePressed(evt);
            }
        });

        ingresoBtn.setBackground(new java.awt.Color(0, 153, 153));
        ingresoBtn.setPreferredSize(new java.awt.Dimension(300, 100));

        ingresoTxt.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        ingresoTxt.setForeground(new java.awt.Color(255, 255, 255));
        ingresoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresoTxt.setText("INGRESO");
        ingresoTxt.setToolTipText("");
        ingresoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresoTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresoTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ingresoTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ingresoBtnLayout = new javax.swing.GroupLayout(ingresoBtn);
        ingresoBtn.setLayout(ingresoBtnLayout);
        ingresoBtnLayout.setHorizontalGroup(
            ingresoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(ingresoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ingresoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ingresoBtnLayout.setVerticalGroup(
            ingresoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(ingresoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ingresoBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ingresoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        salidasBtn.setBackground(new java.awt.Color(0, 153, 153));

        salidasTxt.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        salidasTxt.setForeground(new java.awt.Color(255, 255, 255));
        salidasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salidasTxt.setText("SALIDAS");
        salidasTxt.setMaximumSize(new java.awt.Dimension(100, 29));
        salidasTxt.setMinimumSize(new java.awt.Dimension(100, 29));
        salidasTxt.setName(""); // NOI18N
        salidasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salidasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salidasTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salidasTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                salidasTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout salidasBtnLayout = new javax.swing.GroupLayout(salidasBtn);
        salidasBtn.setLayout(salidasBtnLayout);
        salidasBtnLayout.setHorizontalGroup(
            salidasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(salidasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(salidasBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(salidasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        salidasBtnLayout.setVerticalGroup(
            salidasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(salidasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(salidasBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(salidasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        controlBtn.setBackground(new java.awt.Color(0, 153, 153));
        controlBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        controlTxt.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        controlTxt.setForeground(new java.awt.Color(255, 255, 255));
        controlTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        controlTxt.setText("CONTROL");
        controlTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                controlTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                controlTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                controlTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                controlTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout controlBtnLayout = new javax.swing.GroupLayout(controlBtn);
        controlBtn.setLayout(controlBtnLayout);
        controlBtnLayout.setHorizontalGroup(
            controlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(controlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(controlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        controlBtnLayout.setVerticalGroup(
            controlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(controlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(controlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        comprarBtn.setBackground(new java.awt.Color(60, 77, 120));
        comprarBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        comprarTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        comprarTxt.setForeground(new java.awt.Color(60, 77, 120));
        comprarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comprarTxt.setText("COMPRAR");
        comprarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comprarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comprarTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comprarTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comprarTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout comprarBtnLayout = new javax.swing.GroupLayout(comprarBtn);
        comprarBtn.setLayout(comprarBtnLayout);
        comprarBtnLayout.setHorizontalGroup(
            comprarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comprarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        comprarBtnLayout.setVerticalGroup(
            comprarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comprarBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(comprarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        devolucionProveeBtn.setBackground(new java.awt.Color(60, 77, 120));
        devolucionProveeBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        devolucionProveeTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        devolucionProveeTxt.setForeground(new java.awt.Color(60, 77, 120));
        devolucionProveeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devolucionProveeTxt.setText("DEVOLUCIÓN");
        devolucionProveeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucionProveeTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devolucionProveeTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                devolucionProveeTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                devolucionProveeTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                devolucionProveeTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout devolucionProveeBtnLayout = new javax.swing.GroupLayout(devolucionProveeBtn);
        devolucionProveeBtn.setLayout(devolucionProveeBtnLayout);
        devolucionProveeBtnLayout.setHorizontalGroup(
            devolucionProveeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(devolucionProveeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        devolucionProveeBtnLayout.setVerticalGroup(
            devolucionProveeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, devolucionProveeBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(devolucionProveeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ventasBtn.setBackground(new java.awt.Color(60, 77, 120));
        ventasBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        ventasTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        ventasTxt.setForeground(new java.awt.Color(60, 77, 120));
        ventasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventasTxt.setText("VENTAS");
        ventasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventasTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventasTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ventasTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ventasBtnLayout = new javax.swing.GroupLayout(ventasBtn);
        ventasBtn.setLayout(ventasBtnLayout);
        ventasBtnLayout.setHorizontalGroup(
            ventasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventasBtnLayout.createSequentialGroup()
                .addComponent(ventasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventasBtnLayout.setVerticalGroup(
            ventasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventasBtnLayout.createSequentialGroup()
                .addComponent(ventasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        devolucionClientesBtn.setBackground(new java.awt.Color(60, 77, 120));
        devolucionClientesBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        devolucionClientesTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        devolucionClientesTxt.setForeground(new java.awt.Color(60, 77, 120));
        devolucionClientesTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devolucionClientesTxt.setText("DEVOLUCIÓN");
        devolucionClientesTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucionClientesTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devolucionClientesTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                devolucionClientesTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                devolucionClientesTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                devolucionClientesTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout devolucionClientesBtnLayout = new javax.swing.GroupLayout(devolucionClientesBtn);
        devolucionClientesBtn.setLayout(devolucionClientesBtnLayout);
        devolucionClientesBtnLayout.setHorizontalGroup(
            devolucionClientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devolucionClientesBtnLayout.createSequentialGroup()
                .addComponent(devolucionClientesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        devolucionClientesBtnLayout.setVerticalGroup(
            devolucionClientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, devolucionClientesBtnLayout.createSequentialGroup()
                .addComponent(devolucionClientesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        stockBtn.setBackground(new java.awt.Color(60, 77, 120));
        stockBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        stockTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        stockTxt.setForeground(new java.awt.Color(60, 77, 120));
        stockTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockTxt.setText("STOCK");
        stockTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stockTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stockTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stockTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stockTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout stockBtnLayout = new javax.swing.GroupLayout(stockBtn);
        stockBtn.setLayout(stockBtnLayout);
        stockBtnLayout.setHorizontalGroup(
            stockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockBtnLayout.createSequentialGroup()
                .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        stockBtnLayout.setVerticalGroup(
            stockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stockBtnLayout.createSequentialGroup()
                .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        transaccionesBtn.setBackground(new java.awt.Color(60, 77, 120));
        transaccionesBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        transaccionesTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        transaccionesTxt.setForeground(new java.awt.Color(60, 77, 120));
        transaccionesTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transaccionesTxt.setText("TRANSACCIÓN");
        transaccionesTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaccionesTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transaccionesTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transaccionesTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transaccionesTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                transaccionesTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout transaccionesBtnLayout = new javax.swing.GroupLayout(transaccionesBtn);
        transaccionesBtn.setLayout(transaccionesBtnLayout);
        transaccionesBtnLayout.setHorizontalGroup(
            transaccionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaccionesBtnLayout.createSequentialGroup()
                .addComponent(transaccionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        transaccionesBtnLayout.setVerticalGroup(
            transaccionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transaccionesBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(transaccionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rVentasBtn.setBackground(new java.awt.Color(60, 77, 120));
        rVentasBtn.setPreferredSize(new java.awt.Dimension(238, 100));

        rVentasTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rVentasTxt.setForeground(new java.awt.Color(60, 77, 120));
        rVentasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rVentasTxt.setText("VENTAS");
        rVentasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rVentasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rVentasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rVentasTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rVentasTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rVentasTxtMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout rVentasBtnLayout = new javax.swing.GroupLayout(rVentasBtn);
        rVentasBtn.setLayout(rVentasBtnLayout);
        rVentasBtnLayout.setHorizontalGroup(
            rVentasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rVentasBtnLayout.createSequentialGroup()
                .addComponent(rVentasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rVentasBtnLayout.setVerticalGroup(
            rVentasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rVentasBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rVentasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(devolucionProveeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ventasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(devolucionClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(stockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(transaccionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rVentasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salidasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devolucionProveeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devolucionClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transaccionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rVentasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(ingresoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(salidasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(controlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoTxtMouseEntered
        ingresoBtn.setBackground(Color.white);
        ingresoTxt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_ingresoTxtMouseEntered

    private void ingresoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoTxtMouseExited
        ingresoBtn.setBackground(new Color(0,153,153));
        ingresoTxt.setForeground(Color.white);
    }//GEN-LAST:event_ingresoTxtMouseExited

    private void salidasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidasTxtMouseEntered
        salidasBtn.setBackground(Color.white);
        salidasTxt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_salidasTxtMouseEntered

    private void salidasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidasTxtMouseExited
        salidasBtn.setBackground(new Color(0,153,153));
        salidasTxt.setForeground(Color.white);
    }//GEN-LAST:event_salidasTxtMouseExited

    private void controlTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseEntered
        controlBtn.setBackground(Color.white);
        controlTxt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_controlTxtMouseEntered

    private void controlTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseExited
        controlBtn.setBackground(new Color(0,153,153));
        controlTxt.setForeground(Color.white);
    }//GEN-LAST:event_controlTxtMouseExited

    private void salidasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidasTxtMouseClicked
        DevolucionClienteForms newFrame = new DevolucionClienteForms();
        showPanel(newFrame);

        activadoDevolucionCliente = true;
        activadoSalida = true;
        activadoIngreso = false;
        activadoControl = false;
        activadoVentas = false;
        
        desactivarBotones();
        devolucionClientesBtn.setBackground(Color.white);
        devolucionClientesTxt.setForeground(new Color(0,153,153));
        ventasBtn.setBackground(new Color(0,153,153));
        ventasTxt.setForeground(Color.white);
    }//GEN-LAST:event_salidasTxtMouseClicked

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        exitBtn.setBackground(new Color(153, 0, 0));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMousePressed

    private void BGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BGMousePressed

    private void BGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BGMouseDragged

    private void ingresoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoTxtMouseClicked
        Proveedores newFrame = new Proveedores();
        showPanel(newFrame);

        activadoComprar = true;
        activadoIngreso = true;
        activadoSalida = false;
        activadoControl = false;
        activadoDevolucionProvee = false;
        
        desactivarBotones();
        comprarBtn.setBackground(Color.white);
        comprarTxt.setForeground(new Color(0,153,153));
        devolucionProveeBtn.setBackground(new Color(0,153,153));
        devolucionProveeTxt.setForeground(Color.white);    
    }//GEN-LAST:event_ingresoTxtMouseClicked

    private void controlTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseClicked
        Clientes newFrame = new Clientes();
        showPanel(newFrame);
        
        activadorVentas = true;
        activadoIngreso = false;
        activadoSalida = false;
        activadoControl = true;
        activadoStock = false;
        activadoTransaccion = false;

        desactivarBotones();
        rVentasBtn.setBackground(Color.white);
        rVentasTxt.setForeground(new Color(0,153,153));
        stockBtn.setBackground(new Color(0,153,153));
        stockTxt.setForeground(Color.white);    
        transaccionesBtn.setBackground(new Color(0,153,153));
        transaccionesTxt.setForeground(Color.white);  
    }//GEN-LAST:event_controlTxtMouseClicked

    private void comprarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarTxtMouseEntered
        if(activadoComprar==false && activadoIngreso == true){
            comprarBtn.setBackground(Color.white);
            comprarTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_comprarTxtMouseEntered

    private void comprarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarTxtMouseExited
        if(activadoComprar == false && activadoIngreso == true){
            comprarBtn.setBackground(new Color(0,153,153));
            comprarTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_comprarTxtMouseExited

    private void ventasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTxtMouseEntered
        if (activadoVentas == false && activadoSalida == true) {
            ventasBtn.setBackground(Color.white);
            ventasTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_ventasTxtMouseEntered

    private void ventasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTxtMouseExited
        if (activadoVentas == false && activadoSalida == true) {
            ventasBtn.setBackground(new Color(0,153,153));
            ventasTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_ventasTxtMouseExited

    private void devolucionProveeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionProveeTxtMouseEntered
        if(activadoDevolucionProvee==false && activadoIngreso == true){
            devolucionProveeBtn.setBackground(Color.white);
            devolucionProveeTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_devolucionProveeTxtMouseEntered

    private void devolucionProveeTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionProveeTxtMouseExited
        if(activadoDevolucionProvee==false && activadoIngreso == true){
            devolucionProveeBtn.setBackground(new Color(0,153,153));
            devolucionProveeTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_devolucionProveeTxtMouseExited

    private void devolucionClientesTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionClientesTxtMouseEntered
        if (activadoDevolucionCliente == false && activadoSalida == true) {
            devolucionClientesBtn.setBackground(Color.white);
            devolucionClientesTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_devolucionClientesTxtMouseEntered

    private void devolucionClientesTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionClientesTxtMouseExited
        if (activadoDevolucionCliente == false && activadoSalida == true) {
            devolucionClientesBtn.setBackground(new Color(0,153,153));
            devolucionClientesTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_devolucionClientesTxtMouseExited

    private void stockTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTxtMouseEntered
        if(activadoStock == false && activadoControl==true){
            stockBtn.setBackground(Color.white);
            stockTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_stockTxtMouseEntered

    private void stockTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTxtMouseExited
        if(activadoStock == false && activadoControl==true){
            stockBtn.setBackground(new Color(0,153,153));
            stockTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_stockTxtMouseExited

    private void transaccionesTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesTxtMouseEntered
        if(activadoTransaccion==false && activadoControl==true){
            transaccionesBtn.setBackground(Color.white);
            transaccionesTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_transaccionesTxtMouseEntered

    private void transaccionesTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesTxtMouseExited
        if(activadoTransaccion==false && activadoControl==true){
            transaccionesBtn.setBackground(new Color(0,153,153));
            transaccionesTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_transaccionesTxtMouseExited

    private void rVentasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rVentasTxtMouseEntered
        if(activadorVentas==false && activadoControl == true){
            rVentasBtn.setBackground(Color.white);
            rVentasTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_rVentasTxtMouseEntered

    private void rVentasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rVentasTxtMouseExited
        if(activadorVentas==false && activadoControl == true){
            rVentasBtn.setBackground(new Color(0,153,153));
            rVentasTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_rVentasTxtMouseExited

    private void ventasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTxtMouseClicked
        if (activadoSalida == true) {
            VentasForm newFrame = new VentasForm();
            showPanel(newFrame);
            activadoVentas = true;
            activadoDevolucionCliente = false;
            devolucionClientesBtn.setBackground(new Color(0,153,153));
            devolucionClientesTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_ventasTxtMouseClicked

    private void devolucionClientesTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionClientesTxtMouseClicked
        if (activadoSalida == true) {
            DevolucionClienteForms newFrame = new DevolucionClienteForms();
            showPanel(newFrame);

            activadoVentas = false;
            activadoDevolucionCliente = true;
            ventasBtn.setBackground(new Color(0,153,153));
            ventasTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_devolucionClientesTxtMouseClicked

    private void comprarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarTxtMouseClicked
        if (activadoIngreso == true) {
            Proveedores newFrame = new Proveedores();
            showPanel(newFrame);
            
            activadoDevolucionProvee = false;
            activadoComprar = true;
            devolucionProveeBtn.setBackground(new Color(0,153,153));
            devolucionProveeTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_comprarTxtMouseClicked

    private void stockTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTxtMouseClicked
        if (activadoControl == true) {
            Stock newFrame = new Stock();
            showPanel(newFrame);

            activadoTransaccion = false;
            activadorVentas = false;
            activadoStock = true;
            transaccionesBtn.setBackground(new Color(0,153,153));
            transaccionesTxt.setForeground(Color.white);
            rVentasBtn.setBackground(new Color(0,153,153));
            rVentasTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_stockTxtMouseClicked

    private void transaccionesTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesTxtMouseClicked
        if (activadoControl == true) {
            Transacciones newFrame = new Transacciones();
            showPanel(newFrame);

            activadoTransaccion = true;
            activadorVentas = false;
            activadoStock = false;
            stockBtn.setBackground(new Color(0,153,153));
            stockTxt.setForeground(Color.white);
            rVentasBtn.setBackground(new Color(0,153,153));
            rVentasTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_transaccionesTxtMouseClicked

    private void rVentasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rVentasTxtMouseClicked
        if (activadoControl == true) {
            Clientes newFrame = new Clientes();
            showPanel(newFrame);

            activadoTransaccion = false;
            activadorVentas = true;
            activadoStock = false;
            transaccionesBtn.setBackground(new Color(0,153,153));
            transaccionesTxt.setForeground(Color.white);
            stockBtn.setBackground(new Color(0,153,153));
            stockTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_rVentasTxtMouseClicked

    private void ingresoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoTxtMousePressed
        ingresoBtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ingresoTxtMousePressed

    private void salidasTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidasTxtMousePressed
        salidasBtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_salidasTxtMousePressed

    private void controlTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMousePressed
       controlBtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_controlTxtMousePressed

    private void devolucionProveeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionProveeTxtMouseClicked
        if (activadoIngreso == true) {
            Devoluciones newFrame = new Devoluciones();
            showPanel(newFrame);
            
            activadoDevolucionProvee = true;
            activadoComprar = false;
            comprarBtn.setBackground(new Color(0,153,153));
            comprarTxt.setForeground(Color.white);
        }
    }//GEN-LAST:event_devolucionProveeTxtMouseClicked

    private void ingresoTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoTxtMouseReleased
        ingresoBtn.setBackground(Color.white);
        ingresoTxt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_ingresoTxtMouseReleased

    private void salidasTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidasTxtMouseReleased
        salidasBtn.setBackground(Color.white);
        salidasTxt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_salidasTxtMouseReleased

    private void controlTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlTxtMouseReleased
        controlBtn.setBackground(Color.white);
        controlTxt.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_controlTxtMouseReleased

    private void comprarTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarTxtMousePressed
        if(activadoComprar==false && activadoIngreso == true){
            comprarBtn.setBackground(Color.white);
            comprarBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_comprarTxtMousePressed

    private void comprarTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarTxtMouseReleased
        if(activadoComprar==false && activadoIngreso == true){
            comprarBtn.setBackground(Color.white);
            comprarTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_comprarTxtMouseReleased

    private void devolucionProveeTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionProveeTxtMousePressed
        if(activadoDevolucionProvee==false && activadoIngreso == true){
            devolucionProveeBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_devolucionProveeTxtMousePressed

    private void devolucionProveeTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionProveeTxtMouseReleased
        if(activadoDevolucionProvee==false && activadoIngreso == true){
            devolucionProveeBtn.setBackground(Color.white);
            devolucionProveeTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_devolucionProveeTxtMouseReleased

    private void ventasTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTxtMouseReleased
        if (activadoVentas == false && activadoSalida == true) {
            ventasBtn.setBackground(Color.white);
            ventasTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_ventasTxtMouseReleased

    private void ventasTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTxtMousePressed
        if (activadoVentas == false && activadoSalida == true) {
            ventasBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_ventasTxtMousePressed

    private void devolucionClientesTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionClientesTxtMousePressed
        if (activadoDevolucionCliente == false && activadoSalida == true) {
            devolucionClientesBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_devolucionClientesTxtMousePressed

    private void devolucionClientesTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucionClientesTxtMouseReleased
        if (activadoDevolucionCliente == false && activadoSalida == true) {
            devolucionClientesBtn.setBackground(Color.white);
            devolucionClientesTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_devolucionClientesTxtMouseReleased

    private void stockTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTxtMousePressed
        if(activadoStock == false && activadoControl==true){
            stockBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_stockTxtMousePressed

    private void stockTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTxtMouseReleased
        if(activadoStock == false && activadoControl==true){
            stockBtn.setBackground(Color.white);
            stockTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_stockTxtMouseReleased

    private void transaccionesTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesTxtMousePressed
        if(activadoTransaccion==false && activadoControl==true){
            transaccionesBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_transaccionesTxtMousePressed

    private void transaccionesTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesTxtMouseReleased
        if(activadoTransaccion==false && activadoControl==true){
            transaccionesBtn.setBackground(Color.white);
            transaccionesTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_transaccionesTxtMouseReleased

    private void rVentasTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rVentasTxtMousePressed
        if(activadorVentas==false && activadoControl == true){
            rVentasBtn.setBackground(new Color(204,204,204));
        }
    }//GEN-LAST:event_rVentasTxtMousePressed

    private void rVentasTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rVentasTxtMouseReleased
        if(activadorVentas==false && activadoControl == true){
            rVentasBtn.setBackground(Color.white);
            rVentasTxt.setForeground(new Color(0,153,153));
        }
    }//GEN-LAST:event_rVentasTxtMouseReleased

    public void showPanel(JPanel p) {
        p.setSize(900, 610);
        p.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p, AbsoluteLayout.class);
        //contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void desactivarBotones(){
        if(activadoIngreso==true){
            
            ventasBtn.setBackground(new Color(60,77,120));
            ventasTxt.setForeground(new Color(60,77,120));
        
            devolucionClientesBtn.setBackground(new Color(60,77,120));
            devolucionClientesTxt.setForeground(new Color(60,77,120));
            
            stockBtn.setBackground(new Color(60,77,120));
            stockTxt.setForeground(new Color(60,77,120));
        
            transaccionesBtn.setBackground(new Color(60,77,120));
            transaccionesTxt.setForeground(new Color(60,77,120));
        
            rVentasBtn.setBackground(new Color(60,77,120));
            rVentasTxt.setForeground(new Color(60,77,120));            
            
        }
        else if(activadoSalida==true){
            comprarBtn.setBackground(new Color(60,77,120));
            comprarTxt.setForeground(new Color(60,77,120));
        
            devolucionProveeBtn.setBackground(new Color(60,77,120));
            devolucionProveeTxt.setForeground(new Color(60,77,120));
            
            stockBtn.setBackground(new Color(60,77,120));
            stockTxt.setForeground(new Color(60,77,120));
        
            transaccionesBtn.setBackground(new Color(60,77,120));
            transaccionesTxt.setForeground(new Color(60,77,120));
            
            rVentasBtn.setBackground(new Color(60,77,120));
            rVentasTxt.setForeground(new Color(60,77,120));      
            
        }
        else if(activadoControl==true){
            comprarBtn.setBackground(new Color(60,77,120));
            comprarTxt.setForeground(new Color(60,77,120));
        
            devolucionProveeBtn.setBackground(new Color(60,77,120));
            devolucionProveeTxt.setForeground(new Color(60,77,120));
            
            ventasBtn.setBackground(new Color(60,77,120));
            ventasTxt.setForeground(new Color(60,77,120));
        
            devolucionClientesBtn.setBackground(new Color(60,77,120));
            devolucionClientesTxt.setForeground(new Color(60,77,120));
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel comprarBtn;
    private javax.swing.JLabel comprarTxt;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel controlBtn;
    private javax.swing.JLabel controlTxt;
    private javax.swing.JPanel devolucionClientesBtn;
    private javax.swing.JLabel devolucionClientesTxt;
    private javax.swing.JPanel devolucionProveeBtn;
    private javax.swing.JLabel devolucionProveeTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel ingresoBtn;
    private javax.swing.JLabel ingresoTxt;
    private javax.swing.JPanel rVentasBtn;
    private javax.swing.JLabel rVentasTxt;
    private javax.swing.JPanel salidasBtn;
    private javax.swing.JLabel salidasTxt;
    private javax.swing.JPanel stockBtn;
    private javax.swing.JLabel stockTxt;
    private javax.swing.JPanel transaccionesBtn;
    private javax.swing.JLabel transaccionesTxt;
    private javax.swing.JPanel ventasBtn;
    private javax.swing.JLabel ventasTxt;
    // End of variables declaration//GEN-END:variables
}
