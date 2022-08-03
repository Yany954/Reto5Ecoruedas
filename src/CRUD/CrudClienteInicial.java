/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import Entidades.Clientes;
import c2r5.Conexion;
import vista.InterfazCliente;
/**
 *
 * @author yanyg
 */
//implements CRUD<Clientes>
public class CrudClienteInicial implements CRUD<Clientes>{
    @Override
    public boolean crear(Clientes objeto) {
        String sql="INSERT INTO cliente(cliente_username, cliente_nombre,"
               + "cliente_apellidos, cliente_email, cliente_celular,"
               + "cliente_contraseña,cliente_fechaNacimiento)VALUES)VALUES(?,?,?,?,?,?,?) ";
       try(Connection conn = Conexion.conectar()){
            PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, objeto.usuario);
                    statement.setString(2, objeto.nombresCliente);
                    statement.setString(3, objeto.apellidosCliente);
                    statement.setString(4, objeto.emailCliente);
                    statement.setString(5, objeto.celularCliente);
                    statement.setInt(6, objeto.contrasenaCliente);
                    statement.setString(7, objeto.fechaNacimientoCliente);
                    //actualiza la base de datos
               int rowsInserted = statement.executeUpdate();
            conn.close();
            if ( rowsInserted > 0) {
                System.out.println("Registro añadido exitosamente generico");
                return true;
            }
       }  catch(SQLException e){
           System.out.println("Error insertando cliente");
       }
       return false;
    }

    //metodo de creacion de nuevo registro

    @Override
    public ArrayList<Clientes> obtener() {
        //se llama y llena en los campos de texto de la interfaz grafica
        ArrayList<Clientes> clientes = new ArrayList<>();
        try(Connection conn = Conexion.conectar()){
            String sql="SELECT * FROM cliente";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()){
                String usuario = result.getString(1);
                String nombre = result.getString(2);
                String apellido = result.getString(3);
                String email = result.getString(4);
                String celular = result.getString(5);
                int contraseña = result.getInt(6);
                String fechaNacimiento = result.getString(7);
                Clientes c = new Clientes(usuario, nombre, apellido,email,celular,contraseña,fechaNacimiento);
                clientes.add(c);
            }
            conn.close();
            statement.close();
        }  catch(SQLException e){
           System.out.println("Error obteniendo cliente");
       }
       return clientes;
    }

    @Override
    public boolean actualizar(Clientes objeto) {
        /*try(Connection conn = Conexion.conectar()){
            //hacer ifs de cuando escoja cada tipo de checkbox
            String sql="UPDATE cliente SET cliente_username =  WHERE FROM cliente";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while (result.next()){
                String usuario = result.getString(1);
                String nombre = result.getString(2);
                String apellido = result.getString(3);
                String email = result.getString(4);
                String celular = result.getString(5);
                int contraseña = result.getInt(6);
                String fechaNacimiento = result.getString(7);
            }
            System.out.println("Tabla clientes Actualizado");
            return true;
        }  catch(SQLException e){
           System.out.println("Error obteniendo cliente");
       }*/
       return false;
    }

    @Override
    public boolean remover(Clientes objeto) {
        /*Conexion conex=new Conexion();
        try{
            
        } catch(SQLException e){
           System.out.println("Error eliminando cliente");
       }*/
        return false;
    }

    
}
