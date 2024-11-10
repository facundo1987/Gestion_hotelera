
package com.mycompany.super2510;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Super2510 {

    public static void main(String[] args) {
        
        
        String nombre = JOptionPane.showInputDialog("que producto quiere? ");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantos quiere?"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("precio: ")) ;
        
        Compra obj = new Compra(nombre,cantidad,precio);
        ArrayList<Compra> compras = new ArrayList();
        compras.add (obj);
        
        
        JOptionPane.showMessageDialog(null,compras.get(0).getCantidad()+" de "+compras.get(0).getnombre()+" por: "+obj.calcularTotal());
        
        int continuar = JOptionPane.showConfirmDialog(null,"desea continuar?");
        
        while (continuar== JOptionPane.YES_OPTION){
            
        nombre = JOptionPane.showInputDialog("que producto quiere? ");
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantos quiere?"));
        precio = Double.parseDouble(JOptionPane.showInputDialog("precio: ")) ;
        compras.add(obj);
        JOptionPane.showMessageDialog(null,compras.get(0).getCantidad()+" de "+compras.get(0).getnombre()+" por: "+obj.calcularTotal());
        JOptionPane.showConfirmDialog(null,"desea continuar?");
        
        }
       
    
    }
    
        
        
}


