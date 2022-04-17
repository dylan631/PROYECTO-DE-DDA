package dataMysql;

import static dataMysql.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosSQL {
    private static final String SQL_SELECT = "SELECT codigo, nombre, marca, cantidad, precio_venta, precio_compra FROM productos";
    private static final String SQL_SELECTU = "SELECT * FROM productos WHERE codigo =?";
    private static final String SQL_INSERT = "INSERT INTO productos(codigo, nombre, marca, cantidad, precio_venta, precio_compra) VALUES(?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE productos SET nombre = ?, marca = ?,  cantidad = ?, precioUnitario = ?, precioFinal = ? WHERE codigo = ?";
    private static final String SQL_TRUNCATE = "TRUNCATE productos";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE codigo =?";
    static Connection conn = null;
    static PreparedStatement stmt = null;
    static ResultSet rs = null;
    Productos productoU = null;
    int registros = 0;
    static int r=0;
    
    
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
    public static DefaultTableModel mostrarTabla(DefaultTableModel dtm){ 
        try {  
            Statement leer = Conexion.getConnection().createStatement();
            ResultSet rs=leer.executeQuery("select *from productos");//"select *from alumnos"*/
            while(rs.next()){
                Object[] name = new Object[]{rs.getString(1), rs.getString(2),rs.getString(3)};//rs.getString(1), rs.getString(2)+"",rs.getString(3)+""
                dtm.addRow(name);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contactar con la base de datos", "Advertencia", 1);
        }       
        return dtm;
    }
    
    public static DefaultTableModel mostrarTabla2(DefaultTableModel dtm){ 
        try {  
            Statement leer = Conexion.getConnection().createStatement();
            ResultSet rs=leer.executeQuery("select *from productos");//"select *from alumnos"*/
            while(rs.next()){
                Object[] name = new Object[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(6),rs.getString(4)};//rs.getString(1), rs.getString(2)+"",rs.getString(3)+""
                dtm.addRow(name);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contactar con la base de datos", "Advertencia", 1);
        }       
        return dtm;
    }   
    public static DefaultTableModel mostrarTabla3(DefaultTableModel dtm){ 
        try {  
            Statement leer = Conexion.getConnection().createStatement();
            ResultSet rs=leer.executeQuery("select *from productos");//"select *from alumnos"*/
            while(rs.next()){
                Object[] name = new Object[]{rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(6),/*rs.getString(4)*/};//rs.getString(1), rs.getString(2)+"",rs.getString(3)+""
                dtm.addRow(name);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contactar con la base de datos", "Advertencia", 1);
        }       
        return dtm;
    }
    
    public static void actualizar_bd_productos(String codigo, String cantidad){
        try {
            Connection cn = Conexion.getConnection();
            PreparedStatement pst = cn.prepareStatement("update productos set cantidad = ? where codigo ="+codigo);//ahora se va consultar
            pst.setString(1, cantidad);
            pst.executeUpdate();//Indica que todo lo anterior se escriba en la base de datos, se ejecute
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al contactar con la base de datos", "Advertencia", 1);
        }      
    }
    
    public static int ActualizarStock(int cant, String cp){
        try {
            conn = getConnection();
            stmt = conn.prepareStatement("update productos set cantidad=? where codigo= ?");
            stmt.setInt(1,cant);
            stmt.setString(2, cp);
            stmt.executeUpdate();
        } catch (SQLException e) {
            
        }
        return r;
    }
    
    public static int NumeroSerie(){
        int serie=0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement("select max(n_serie) from ventas");
            rs = stmt.executeQuery();
            while(rs.next()){
                serie=Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException e) {
        }
        return serie;
    }
    
    public List<Productos> seleccionar(){
        List<Productos> productos = new ArrayList<>();
        try {            
            conn = getConnection(); //Genera la sesión para conectarnos con la base de datos
            stmt = conn.prepareStatement(SQL_SELECT); //Trae los datos de un tabla
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            while(rs.next()){
                //Recolectamos datos de la base de datos
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String marca = rs.getString("marca");
                int cantidad = rs.getInt("cantidad");
                float precioVenta = rs.getFloat("precio_venta");
                float precioCompra = rs.getFloat("precio_compra");
                
                productoU = new Productos(codigo,nombre,marca,cantidad,precioVenta,precioCompra);
                
                //Agregamos a la lista Productos cada registro de productoU
                productos.add(productoU);    
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
        return productos;
    } 
    
    public void insertar(Productos producto){
        try {            
            conn = Conexion.getConnection(); //Se conecta              
            stmt = conn.prepareStatement(SQL_INSERT); //Se ejecuta el SQL
            stmt.setString(1, producto.getCodigo()); // Llenar valores
            stmt.setString(2, producto.getNombre());
            stmt.setString(3, producto.getMarca());
            stmt.setInt(4, producto.getCantidad());
            stmt.setFloat(5, producto.getPrecioVenta());
            stmt.setFloat(6, producto.getPrecioCompra());
            
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
    
    public boolean consultar(Productos producto){
        boolean buscar = true;
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_SELECTU); //Se ejecuta el SQL
            stmt.setString(1, producto.getCodigo()); // Llenar valores
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            
            if(rs.next()){ //devuelve false si en caso no encuentra ninguna fila
                buscar = false;                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductosSQL.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public Productos consultarEliminar(Productos producto){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_SELECTU); //Se ejecuta el SQL
            stmt.setString(1, producto.getCodigo()); // Llenar valores
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            
            while(rs.next()){ //devuelve false si en caso no encuentra ninguna fila
            //Recolectamos datos de la base de datos
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                String marca = rs.getString("marca");
                int cantidad = rs.getInt("cantidad");
                float precioVenta = rs.getFloat("precio_venta");
                float precioCompra = rs.getFloat("precio_compra");
                
                producto = new Productos(codigo,nombre, marca, cantidad, precioVenta, precioCompra);
            }  
        } catch (SQLException ex) {
            Logger.getLogger(ProductosSQL.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido cerrar con éxito","ERROR",0);
            }
            
        }
        return producto;
    }
    
    public void actualizar(Productos producto){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_UPDATE); //Se ejecuta el SQL
             stmt.setString(1, producto.getCodigo()); // Llenar valores
            stmt.setString(2, producto.getNombre());
            stmt.setString(3, producto.getMarca());
            stmt.setInt(4, producto.getCantidad());
            stmt.setFloat(5, producto.getPrecioVenta());
            stmt.setFloat(6, producto.getPrecioCompra());
            
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
    
    public void eliminar(Productos producto){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_DELETE); //Se ejecuta el SQL
            stmt.setString(1, producto.getCodigo());
            
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
    }
}    
