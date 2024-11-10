
package com.mycompany.joptionpaneclass;
import javax.swing.JOptionPane;

public class JOptionPaneClass {

    public static void main(String[] args) {
        // Solicitar el nombre del usuario//
        String nombre = JOptionPane.showInputDialog("cual es tu nombre?");
        // Solicitar edad//
        String edad = JOptionPane.showInputDialog("Cuantos años tenes?");
        // Mostrar mensaje personalizado //
        JOptionPane.showMessageDialog(null,"Hola "+nombre+ " tienes " +edad);
        // Preguntar si desea continuar//
        int respuesta = JOptionPane.showConfirmDialog(null,"Deseas Continuar?");
        if (respuesta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"vamos a continuar");
        }else{
            JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
            
        }
    }
}
