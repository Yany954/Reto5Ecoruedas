/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import c2r5.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author yanyg
 */
public class CrudCliente {
    public boolean crearCliente(String usuario, String nombresCliente, String apellidosCliente, String emailCliente, String celularCliente, int contrasenaCliente, String fechaNacimientoCliente){
        String sql="INSERT INTO cliente(cliente_username, cliente_nombre,"
               + "cliente_apellidos, cliente_email, cliente_celular,"
               + "cliente_contraseña,cliente_fechaNacimiento)VALUES)VALUES(?,?,?,?,?,?,?) ";
       try(Connection conn = Conexion.conectar()){
            PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1,usuario);
                    statement.setString(2,nombresCliente);
                    statement.setString(3, apellidosCliente);
                    statement.setString(4, emailCliente);
                    statement.setString(5, celularCliente);
                    statement.setInt(6, contrasenaCliente);
                    statement.setString(7, fechaNacimientoCliente);
                    //actualiza la base de datos
                    
               int rowsInserted = statement.executeUpdate();
               statement.close();
            conn.close();
            if ( rowsInserted > 0) {
                System.out.println("Registro añadido exitosamente");
                return true;
            }
            
        }catch(Exception ex){
            System.out.println("Error insertando proveedor" + ex);
        }
       return false;
    }
    public boolean removerCliente(String user){
        try(Connection conn = Conexion.conectar()){
            String sql="DELETE FROM cliente WHERE cliente_username="+user;
            PreparedStatement statement = conn.prepareStatement(sql);
            int clienteseliminados=statement.executeUpdate();
            conn.close();
            if ( clienteseliminados > 0) {
                System.out.println("Registro añadido exitosamente");
                return true;
            }
            
        }catch(Exception ex){
            System.out.println("Error eliminando proveedor" + ex);
        }
        return false;
    }
    public boolean modificarCliente(Entidades.Clientes cliente){
        try(Connection conn = Conexion.conectar()){
            String sql="UPDATE cliente SET cliente_username=?,cliente_nombre=?,cliente_apellidos=?,cliente_email=?,cliente_celular=?,cliente_contraseña=?,cliente_fechaNacimiento=?";
            PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, cliente.getUsuario());
                statement.setString(2, cliente.getNombresCliente());
                statement.setString(3, cliente.getApellidosCliente());
                statement.setString(4, cliente.getEmailCliente());
                statement.setString(5, cliente.getCelularCliente());
                statement.setInt(6, cliente.getContrasenaCliente());
                statement.setString(7, cliente.getFechaNacimientoCliente());
            int modi =statement.executeUpdate();
            if ( modi > 0) {
                System.out.println("Registro añadido exitosamente");
                //JOptionPane.show
                return true;
            }
            conn.close();
        }catch(Exception ex){
            System.out.println("Error eliminando proveedor" + ex);
        }
        return false;
    }
}
