package c2r5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    public static java.sql.Connection conectar(){
     //Poner en clase aparte y método aparte llamados conexión
        String dbURL = "jdbc:mysql://localhost:3306/entidades";
        String username = "root";
        String password = "deportes3";
        //String password = Credentials.PASSWORD; //genérico
         java.sql.Connection conn;
    // conectar
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println(" Conectado ");
            }
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
