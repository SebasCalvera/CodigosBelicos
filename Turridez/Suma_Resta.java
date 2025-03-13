package Turridez;

import java.util.Scanner;

public class Suma_Resta {
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1;
    int num2;


    System.out.println(" **SUMA Y RESTA DE DOS NUMEROS** ");
    System.out.println("");
    System.out.println( " Ingresa las variables: ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    int suma = num1 + num2;
    int resta = num1 - num2;
    System.out.println(( " La suma es: " + suma) + (" La  resta es:" + resta));
   
    
}
}