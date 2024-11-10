
package com.mycompany.forclass;
import java.util.Scanner;
import java.util.Random;
public class ForClass {
    
    public static void  main (String[] args){
            System.out.println("programas: ");
            System.out.println("primero");
            System.out.println("segundo");
            System.out.println("tercero");
            System.out.println("cuarto");
            System.out.println("quinto");
            System.out.println("sexto");
            
            System.out.println(".");
            System.out.print("opcion: ");
            Scanner tec=new Scanner(System.in);
            String opcion=tec.next();
            switch (opcion.toLowerCase()){
                case "primero":
                    //System.out.println("ponga numeros");
                    Scanner tec2=new Scanner(System.in);
                    int num;
                    int suma=0;
                    for (;;){ //con for no definido podemos solucionar esto.
                        //me parece muy raro
                        System.out.println("numero: ");
                        num=tec2.nextInt();   
                        if (num==0){
                            break;
                        }
                        suma+= num;
                        }
                    System.out.println("la suma es: "+suma);
                    
                case "segundo":
                    
                    Scanner tec3=new Scanner(System.in);
                    int num2=0;
                    
                    System.out.println("por favor por un numero");
                    num2=tec3.nextInt();
                    System.out.println("Los numeros del:"+num2+"son: ");
                    
                    for (int i=0; i<=num2; i++ ){
                    System.out.println(i);
                    }
                
                case "tercero":
                    Scanner tec4=new Scanner(System.in);
                    int num3;
                    int suma2=0;
                    System.out.println("por favor ingresar 15 numeros: ");
                    
                    for(int i=1;i<=15;i++){
                        
                        System.out.print("numero "+i+" : ");
                        num3=tec4.nextInt();
                        suma2+=num3;
                        
                    }
                    System.out.println("la suma es: "+suma2);
                    
                case "cuarto":
                    Scanner tec5=new Scanner(System.in);
                    int num4;
                    int suma3=0;
                    int mayo=0;
                    
                    System.out.println("ponga su sueldo: ");
                    
                    for (int i=1;i<=10;i++){
                        
                    System.out.println("sueldo "+i+": ");
                    num4=tec5.nextInt();
                    suma3+=num4;
                    
                    if (num4>=10000){
                        mayo+=num4;
                    }
                    
                    }
                    System.out.println("suma de los sueldos: "+suma3);
                    System.out.println("sueldos altos: "+mayo);
                    
                case "quinto":
                    Scanner tec6=new Scanner(System.in);
                    int num5;
                    boolean neg;
                    System.out.println("poner 10 numeros");
                    for (int i=1;i<=10;i++){
                        System.out.println("numero "+i+":");
                        num5=tec6.nextInt();
                        if (num5>0){
                            neg=true;
                            
                        }
                        
                    }
                    if(neg=true){
                        System.out.println("hay numeros negativos");
                        }
                    
                case "sexto":
                    Scanner tec7= new Scanner(System.in);
                    int x=8;
                    int op=0;
                    
                    while (op!=8){
                        System.out.println("inserte un numero:");
                        op=tec7.nextInt();
                        if (op!=8){
                            
                            if (op<=8){
                            System.out.println("es un numero mayor que "+op);
                            }
                            
                            if(op>=8){
                            System.out.println("el numero es menor que "+op);
                            }
                        
                        }
                    }
                    System.out.println("muy bien");
                
                case "septimo":
                    
                    
                    
                    
                    
                    
                    
                        
                    
            }
        
        
    }

}
