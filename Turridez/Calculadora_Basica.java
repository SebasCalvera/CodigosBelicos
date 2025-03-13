package Turridez;

import java.util.Scanner;

public class Calculadora_Basica {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double num1;
        double num2;
        String operador;
   
        System.out.println("");
        System.out.println(" **//CALCULADORA BASICA//** ");
        System.out.println("");
        System.out.println( " Ingresa las variables y el operador (+, -, *, /, %): ");
         num1 = sc.nextDouble();
         num2 = sc. nextDouble();
         operador = sc . next();

        if (operador.equals ("+")) {
            System.out.println( " La suma de las varaibles es: " + (num1 + num2) );   
       
        }  else if   (operador.equals ("-")) {
            System.out.println( " La resta de las variables es: " + (num1 - num2));
          
        } else if (operador.equals ("*")) {
    System.out.println( " La multiplicacion de las variables es: " + (num1 * num2));

          
        } else if (operador.equals( "/")) {
           
         if ( num2 != 0) {
                System.out.println( " La division de ambas varaibles es: "+ ( num1 / num2));            
            }
         else {
           System.out.println( " ERROR Division entre cero ");
        }
   
         } else if (operador.equals ("%")) {
        
          if (num2 != 0) {
            System.out.println( " El modulo de las varaibles es: " + (num1 % num2));
            
        } else {
            System.out.println( " operdadro no valido ");
        }
        
    }
}
}

  
                
             
                
            


            
        




    
    

