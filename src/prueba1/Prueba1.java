/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.awt.Window;

/**
 *
 * @author Pedro
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        preInicio pp=new preInicio();
        ventana v = new ventana();
        v.setLocationRelativeTo(null);
        pp.setV(v);
        
        v.setContentPane(pp);
        v.setVisible(true);
        pp.setVisible(true);
        pp.cargarImagenes();
    }
}
