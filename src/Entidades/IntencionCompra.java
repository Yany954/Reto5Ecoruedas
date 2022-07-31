/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.time.*;
/**
 *
 * @author yanyg
 */
public class IntencionCompra {
    public int idIntencion;
    public String fk_usuario;
    public String fk_IdProducto;
    public LocalTime fecha;

    public IntencionCompra(int idIntencion, String fk_usuario, String fk_IdProducto, LocalTime fecha) {
        this.idIntencion = idIntencion;
        this.fk_usuario = fk_usuario;
        this.fk_IdProducto = fk_IdProducto;
        this.fecha = fecha;
    }

    public int getIdIntencion() {
        return idIntencion;
    }

    public void setIdIntencion(int idIntencion) {
        this.idIntencion = idIntencion;
    }

    public String getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(String fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public String getFk_IdProducto() {
        return fk_IdProducto;
    }

    public void setFk_IdProducto(String fk_IdProducto) {
        this.fk_IdProducto = fk_IdProducto;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "IntencionCompra{" + "idIntencion=" + idIntencion + ", fk_usuario=" + fk_usuario + ", fk_IdProducto=" + fk_IdProducto + ", fecha=" + fecha + '}';
    }
    
}
