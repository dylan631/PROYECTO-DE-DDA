package dataMysql;

import static dataMysql.Conexion.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosSQL {
    static Connection conn = null;
    static PreparedStatement stmt = null;
    static ResultSet rs = null;
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
            stmt = conn.prepareStatement("select max(n_serie) from productos");
            rs = stmt.executeQuery();
            while(rs.next()){
                serie=Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException e) {
        }
        return serie;
    }

}    
