package dataMysql;

import java.sql.*;


public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://www.chriskira.xyz/chriskir_test";
    private static final String JDBC_USER = "chriskir_user";
    private static final String JDBC_PASSWORD = "2rscH3nfDAeRtnq";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD); //Conectar a la base de datos
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close(); //Cierra ResultSet
    }    
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close(); //Cierra Statement
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close(); //Cierra PreparedStatement
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close(); //Cierra Connection
    }
    
}
