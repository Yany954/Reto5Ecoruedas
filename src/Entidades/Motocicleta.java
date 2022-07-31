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
public class Motocicleta {
    public int idMotocicleta;
    public String fabricante;
    public String precioUnitarioMotocicleta;
    public String autonomiaMotocicleta;
    public int fk_IdProveedor;
    public int fk_IdProducto;
    //contructor

    public Motocicleta(int idMotocicleta, String fabricante, String precioUnitarioMotocicleta, String autonomiaMotocicleta, int idProveedor, int idProducto) {
        this.idMotocicleta = idMotocicleta;
        this.fabricante = fabricante;
        this.precioUnitarioMotocicleta = precioUnitarioMotocicleta;
        this.autonomiaMotocicleta = autonomiaMotocicleta;
        this.fk_IdProveedor = idProveedor;
        this.fk_IdProducto = idProducto;
    }
    //setters y getters

    public int getIdMotocicleta() {
        return idMotocicleta;
    }

    public void setIdMotocicleta(int idMotocicleta) {
        this.idMotocicleta = idMotocicleta;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPrecioUnitarioMotocicleta() {
        return precioUnitarioMotocicleta;
    }

    public void setPrecioUnitarioMotocicleta(String precioUnitarioMotocicleta) {
        this.precioUnitarioMotocicleta = precioUnitarioMotocicleta;
    }

    public String getAutonomiaMotocicleta() {
        return autonomiaMotocicleta;
    }

    public void setAutonomiaMotocicleta(String autonomiaMotocicleta) {
        this.autonomiaMotocicleta = autonomiaMotocicleta;
    }

    public int getIdProveedor() {
        return fk_IdProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.fk_IdProveedor = idProveedor;
    }

    public int getIdProducto() {
        return fk_IdProducto;
    }

    public void setIdProducto(int idProducto) {
        this.fk_IdProducto = idProducto;
    }
    //metodo to String

    @Override
    public String toString() {
        return "Motocicleta{" + "idMotocicleta=" + idMotocicleta + ", fabricante=" + fabricante + ", precioUnitarioMotocicleta=" + precioUnitarioMotocicleta + ", autonomiaMotocicleta=" + autonomiaMotocicleta + ", idProveedor=" + fk_IdProveedor + ", idProducto=" + fk_IdProducto + '}';
    }
    
}
