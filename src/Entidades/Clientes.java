/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yanyg
 */
public class Clientes {
    //atributos, es decir campos
    public String usuario;
    public String nombresCliente;
    public String apellidosCliente;
    public String emailCliente;
    public String celularCliente;
    public int contrasenaCliente;
    public String fechaNacimientoCliente;
    
    //constructor
    
    //getters y setters

    public Clientes(String usuario, String nombresCliente, String apellidosCliente, String emailCliente, String celularCliente, int contrasenaCliente, String fechaNacimientoCliente) {
        this.usuario = usuario;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.emailCliente = emailCliente;
        this.celularCliente = celularCliente;
        this.contrasenaCliente = contrasenaCliente;
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public int getContrasenaCliente() {
        return contrasenaCliente;
    }

    public void setContrasenaCliente(int contrasenaCliente) {
        this.contrasenaCliente = contrasenaCliente;
    }

    public String getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(String fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "usuario=" + usuario + ", nombresCliente=" + nombresCliente + ", apellidosCliente=" + apellidosCliente + ", emailCliente=" + emailCliente + ", celularCliente=" + celularCliente + ", contrasenaCliente=" + contrasenaCliente + ", fechaNacimientoCliente=" + fechaNacimientoCliente + '}';
    }
   
}
