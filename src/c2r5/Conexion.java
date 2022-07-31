package c2r5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    public static void conectar(){
     //Poner en clase aparte y método aparte llamados conexión
        String dbURL = "jdbc:mysql://localhost:3306/ecodosruedas2";
        String username = "root";
        String password = "";
        //String password = Credentials.PASSWORD; //genérico

    // conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println(" Conectado ");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
