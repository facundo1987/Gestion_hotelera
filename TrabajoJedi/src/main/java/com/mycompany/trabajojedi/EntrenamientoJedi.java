
package com.mycompany.trabajojedi;
import java.util.Random;


public class EntrenamientoJedi {
    
    public static void entrenamiento(int repeticion){
    for (int i=1; i<=repeticion; i++){
        System.out.println("levantado roca..."+i);
    }

}
    public static boolean exploGalax(){
        
        Random aleatorio=new Random();
        boolean habitable=aleatorio.nextBoolean();
        int contador=0;
        
        while (!habitable){
            System.out.println("este planeta no es habitable");
            contador++;
            habitable=aleatorio.nextBoolean();
            
        }
        System.out.println("este planeta es habitable"+aleatorio);
        return habitable;
        
        
    }
    
    
}
