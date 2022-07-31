/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;
import java.util.ArrayList;
/**
 *
 * @author yanyg
 */
public interface CRUD<T>{
    public boolean crear(T objeto);
    public ArrayList<T> obtener();
    public boolean actualizar(T objeto);
    public boolean remover(T objeto);
}
