package dataMysql;

import static dataMysql.Conexion.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentasSQL {
    private static final String SQL_SELECT = "SELECT codigo, nombre, cantidad, precioUnitario, precioFinal FROM productos";
    private static final String SQL_SELECTU = "SELECT * FROM productos WHERE codigo =?";
    private static final String SQL_INSERT = "INSERT INTO productos(codigo, nombre, cantidad, precioUnitario, precioFinal) VALUES(?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE productos SET nombre = ?,  cantidad = ?, precioUnitario = ?, precioFinal = ? WHERE codigo = ?";
    private static final String SQL_TRUNCATE = "TRUNCATE productos";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE codigo =?";
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Ventas productoU = null;
    int registros = 0;
    
    
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
    private static Connection cn;
    private static Statement leer;
    private static ResultSet rs1;
    
    public static void conec_ventas(){
        try {
            cn= Conexion.getConnection(); 
            leer = cn.createStatement();
            rs1=leer.executeQuery("select *from ventas");//"select *from alumnos"*/
        } catch (SQLException e) {
        }   
    }
    public static DefaultTableModel buscar_ventas_productos(DefaultTableModel dtm, String fecha, String codigo){
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
    public static DefaultTableModel buscar_ventas__dni(DefaultTableModel dtm, String fecha, String dni){
        try {
            ResultSet rs=rs1;
            rs.absolute(0); // mueve el cursor a la quinta fila de rs
            while(rs.next()){
                if(rs.getString(2).equals(fecha)&&rs.getString(5).equals(dni)){
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
    public static DefaultTableModel buscar_ventas(DefaultTableModel dtm, String fecha){
        try {
            ResultSet rs=rs1;
            rs.absolute(0); // mueve el cursor a la primera fila de rs
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
    public List<Ventas> seleccionar(){
        List<Ventas> productos = new ArrayList<>();
        try {            
            conn = getConnection(); //Genera la sesión para conectarnos con la base de datos
            stmt = conn.prepareStatement(SQL_SELECT); //Trae los datos de un tabla
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            while(rs.next()){
                //Recolectamos datos de la base de datos
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                float precioUnitario = rs.getFloat("precioUnitario");
                float precioFinal = rs.getFloat("precioFinal");
                
                productoU = new Ventas(codigo,nombre,cantidad,precioUnitario,precioFinal);
                
                //Agregamos a la lista productos cada registro de productoU
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
    
    public void insertar(Ventas producto){
        try {            
            conn = Conexion.getConnection(); //Se conecta              
            stmt = conn.prepareStatement(SQL_INSERT); //Se ejecuta el SQL
            stmt.setString(1, producto.getCodigo()); // Llenar valores
            stmt.setString(2, producto.getNombre());
            stmt.setInt(3, producto.getCantidad());
            stmt.setFloat(4, producto.getPrecioUnitario());
            stmt.setFloat(5, producto.getPrecioFinal());
            
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
    
    public boolean consultar(Ventas producto){
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
            Logger.getLogger(VentasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public Ventas consultarEliminar(Ventas producto){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_SELECTU); //Se ejecuta el SQL
            stmt.setString(1, producto.getNombre()); // Llenar valores
            rs = stmt.executeQuery(); //Convierte los datos obtenidos en objetos
            
            while(rs.next()){ //devuelve false si en caso no encuentra ninguna fila
            //Recolectamos datos de la base de datos
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                float precioUnitario = rs.getFloat("precioUnitario");
                float precioFinal = rs.getFloat("precioFinal");
                
                producto = new Ventas(nombre, cantidad, precioUnitario, precioFinal);
            }  
        } catch (SQLException ex) {
            Logger.getLogger(VentasSQL.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public void actualizar(Ventas producto){
        try {
            conn = Conexion.getConnection(); //Se conecta
            stmt = conn.prepareStatement(SQL_UPDATE); //Se ejecuta el SQL
            stmt.setString(1, producto.getCodigo()); // Llenar valores
            stmt.setString(2, producto.getNombre());
            stmt.setInt(3, producto.getCantidad());
            stmt.setFloat(4, producto.getPrecioUnitario());
            stmt.setFloat(5, producto.getPrecioFinal());
            
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
    
    public void eliminar(Ventas producto){
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
