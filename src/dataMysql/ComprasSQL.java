package dataMysql;

import static dataMysql.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ComprasSQL {
    private static final String SQL_SELECT = "SELECT codigo, nombre, marca, cantidad, precio_venta, precio_compra FROM compras";
    private static final String SQL_SELECTU = "SELECT * FROM compras WHERE codigo =?";
    private static final String SQL_INSERT = "INSERT INTO compras(codigo, nombre, marca, cantidad, precio_venta, precio_compra) VALUES(?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE compras SET nombre = ?, marca = ?,  cantidad = ?, precioUnitario = ?, precioFinal = ? WHERE codigo = ?";
    private static final String SQL_TRUNCATE = "TRUNCATE compras";
    private static final String SQL_DELETE = "DELETE FROM compras WHERE codigo =?";
    
    String fechaCalendar;
    String codigo;
    String nombre;
    String codigoprov;
    String cant;
    String preuni;
    String prefin;

    public ComprasSQL(String fechaCalendar, String codigo, String nombre, String codigoprov, String cant, String preuni, String prefin) {
        this.fechaCalendar = fechaCalendar;
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoprov = codigoprov;
        this.cant = cant;
        this.preuni = preuni;
        this.prefin = prefin;
    }
    
    public static void mostrarTabla(DefaultTableModel jtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Compras compraU = null;
    int registros = 0;
      
    private static Connection cn;
    private static Statement leer;
    private static ResultSet rs1;
    
    public static void conec_compras(){
        try {
            cn= Conexion.getConnection(); 
            leer = cn.createStatement();
            rs1=leer.executeQuery("select *from compras");//"select *from alumnos"*/
        } catch (SQLException e) {
        }   
    }


    public static DefaultTableModel buscar_compras_productos(DefaultTableModel dtm, String fecha, String codigo){
        try {
            ResultSet rs=rs1;
            rs.absolute(0); // mueve el cursor a la quinta fila de rs           
            while(rs.next()){
                if(rs.getString(2).equals(fecha)&&rs.getString(3).equals(codigo)){
                    String [] datos = new String []{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),rs.getString(6),
                    rs.getString(7), rs.getString(8)};  
                    dtm.addRow(datos);              
                }else{
                    String [] datos = new String []{"-",fecha,"-","-","-", "-", "-", "-"};
                    dtm.addRow(datos);                
                }
            }
        } catch (SQLException e) {
            System.out.println("error3");
        }
        return dtm;
    }


    public static DefaultTableModel buscar_compras__proveedor(DefaultTableModel dtm, String fecha, String proveedor){
        try {
            ResultSet rs=rs1;
            rs.absolute(0); // mueve el cursor a la quinta fila de rs
            while(rs.next()){
                if(rs.getString(2).equals(fecha)&&rs.getString(5).equals(proveedor)){
                    String [] datos = new String []{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),rs.getString(6),
                    rs.getString(7), rs.getString(8)};  
                    dtm.addRow(datos);              
                }else{
                    String [] datos = new String []{"-",fecha,"-","-","-", "-", "-", "-"};
                    dtm.addRow(datos);                
                }
            }
        } catch (SQLException e) {
            System.out.println("error3");
        }
        return dtm;
    }


    public static DefaultTableModel buscar_compras(DefaultTableModel dtm, String fecha){
        try {
            ResultSet rs=rs1;
            rs.absolute(0); // mueve el cursor a la quinta fila de rs
            while(rs.next()){
                if(rs.getString(2).equals(fecha)){
                    String [] datos = new String []{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),rs.getString(6),
                    rs.getString(7), rs.getString(8)};  
                    dtm.addRow(datos);              
                }else{
                    String [] datos = new String []{"-",fecha,"-","-","-", "-", "-", "-"};
                    dtm.addRow(datos);                
                }
            }
        } catch (SQLException e) {
            System.out.println("error3");
        }
        return dtm;
    }
    
    public void guardar_bd_compras(){
        try {          
            Connection cn = Conexion.getConnection();
            PreparedStatement pst = cn.prepareStatement("insert into compras values(?,?,?,?,?,?,?,?)");// intruccion para la base de datos
            pst.setString(1, "0");
            pst.setString(2, fechaCalendar);
            pst.setString(3, codigo);      
            pst.setString(4, nombre); 
            pst.setString(5, codigoprov);
            pst.setString(6, cant);
            pst.setString(7, preuni);
            pst.setString(8, prefin); //.trim() quita espacios del principio y final de la cadena de caracteres
            pst.executeUpdate();//Indica que todo lo anterior se escriba en la base de datos, se ejecute
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contactar con la base de datos", "Advertencia", 1);
            }
    }
    
    public boolean conexion(){
        boolean respuesta=false;
        try {
            conn = getConnection();
            if(conn!=null){
                JOptionPane.showMessageDialog(null, "Conexion exitosa con la BD");
                respuesta = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se ha podido establecer conexion con la BD","ERROR",0);
        }
        return respuesta;
    }
    
    /*public List<Compras> seleccionar(){
        List<Compras> compras = new ArrayList<>();
        try {            
            conn = getConnection(); //Genera la sesión para conectarnos con la base de datos
            stmt = conn.prepareStatement(SQL_SELECT); //Trae los datos de un tabla
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            while(rs.next()){
                //Recolectamos datos de la base de datos
                String nSerie = rs.getString("n_serie");
                String fecha = rs.getString("fecha");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String codigoProveedor = rs.getString("codigo_proveedor");
                String codigoProveedor = rs.getString("codigo_proveedor");
                
                compraU = new Compras(codigo,nombre,marca,cantidad,precioVenta,precioCompra);
                
                //Agregamos a la lista Compras cada registro de compraU
                compras.add(compraU);    
            }                                  
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                //cerramos la conexion
                Conexion.close(rs); //Como se importó los médos estáticos se puede poner close(rs)
                Conexion.close(stmt); //Como se importó los médos estáticos se puede poner close(stmt)
                Conexion.close(conn); //Como se importó los médos estáticos se puede poner close(conn)
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return compras;
    } 
    
    public void insertar(Compras compra){
        try {            
            conn = Conexion.getConnection(); //Se conecta              
            stmt = conn.prepareStatement(SQL_INSERT); //Se ejecuta el SQL
            stmt.setString(1, compra.getCodigo()); // Llenar valores
            stmt.setString(2, compra.getNombre());
            stmt.setString(3, compra.getMarca());
            stmt.setInt(4, compra.getCantidad());
            stmt.setFloat(5, compra.getPrecioVenta());
            stmt.setFloat(6, compra.getPrecioCompra());
            
            //Modifica el estado de la base de datos 
            
            registros = stmt.executeUpdate(); //devuelve un entero que nos dice el número de registros a los que ha afectado la operación
            if(registros > 0){
                JOptionPane.showMessageDialog(null, "Se ha guardado con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha guardado con exito","ERROR",0);
            }
        }catch(SQLException ex){
           ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito");
            }
        }
    }
    
    public boolean consultar(Compras compra){
        boolean buscar = true;
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_SELECTU); //Se ejecuta el SQL
            stmt.setString(1, compra.getCodigo()); // Llenar valores
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            
            if(rs.next()){ //devuelve false si en caso no encuentra ninguna fila
                buscar = false;                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ComprasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito","ERROR",0);
            }
            
        }
        return buscar;
    }
    
    public Compras consultarEliminar(Compras compra){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_SELECTU); //Se ejecuta el SQL
            stmt.setString(1, compra.getCodigo()); // Llenar valores
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            
            while(rs.next()){ //devuelve false si en caso no encuentra ninguna fila
            //Recolectamos datos de la base de datos
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String marca = rs.getString("marca");
                int cantidad = rs.getInt("cantidad");
                float precioVenta = rs.getFloat("precio_venta");
                float precioCompra = rs.getFloat("precio_compra");
                
                compra = new Compras(codigo,nombre, marca, cantidad, precioVenta, precioCompra);
            }  
        } catch (SQLException ex) {
            Logger.getLogger(ComprasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito","ERROR",0);
            }
            
        }
        return compra;
    }
    
    public void actualizar(Compras compra){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_UPDATE); //Se ejecuta el SQL
             stmt.setString(1, compra.getCodigo()); // Llenar valores
            stmt.setString(2, compra.getNombre());
            stmt.setString(3, compra.getMarca());
            stmt.setInt(4, compra.getCantidad());
            stmt.setFloat(5, compra.getPrecioVenta());
            stmt.setFloat(6, compra.getPrecioCompra());
            
            //Modifica el estado de la base de datos 
            
            registros = stmt.executeUpdate(); //devuelve un entero que nos dice el número de registros a los que ha afectado la operación
            if(registros > 0){
                JOptionPane.showMessageDialog(null, "Se ha actualizado con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido actualizar","ERROR",0);
            }   
        }catch(SQLException ex){
           ex.printStackTrace(System.out);
        }finally{
            try {
                close(stmt);
                close(conn);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito","ERROR",0);
            }
        }
    }
    
    public void eliminar(Compras compra){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_DELETE); //Se ejecuta el SQL
            stmt.setString(1, compra.getCodigo());
            
            //Modifica el estado de la base de datos 
            
            registros = stmt.executeUpdate(); //devuelve un entero que nos dice el número de registros a los que ha afectado la operación
            if(registros > 0){
                JOptionPane.showMessageDialog(null, "Se ha eliminado con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No hay datos por eliminar","ERROR",0);
            }
            
        }catch(SQLException ex){
           ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito","ERROR",0);
            }
            
        }
            
    }
    
    public void eliminarTodo(){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_TRUNCATE); //Se ejecuta el SQL
            
            //Modifica el estado de la base de datos 
            
            registros = stmt.executeUpdate(); //devuelve un entero que nos dice el número de registros a los que ha afectado la operación
            if(registros == 0){
                JOptionPane.showMessageDialog(null, "Se ha eliminado la base de datos con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar la base de datos","ERROR",0);
            }
            
        }catch(SQLException ex){
           ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito","ERROR",0);
            }
            
        }  
    }*/
}    
