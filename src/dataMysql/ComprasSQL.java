package dataMysql;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ComprasSQL {
   
    String fechaCalendar;
    String codigo;
    String nombre;
    String codigoprov;
    String cant;
    String preuni;
    String prefin;
    
    private static Connection cn;
    private static Statement leer;
    private static ResultSet rs1;
    

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
   
}