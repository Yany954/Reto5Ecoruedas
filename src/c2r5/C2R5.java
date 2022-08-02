package c2r5;

import vista.LOGIN;

public class C2R5 {

    public static void main(String[] args) {
        vista.LOGIN l = new LOGIN();
        l.setVisible(true);
        Conexion.conectar();
        
    }
    
}
