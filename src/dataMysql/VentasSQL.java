package dataMysql;

import static dataMysql.Conexion.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentasSQL {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    
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
}    
