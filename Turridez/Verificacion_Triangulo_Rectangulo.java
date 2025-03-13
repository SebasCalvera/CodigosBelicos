import java.util.Scanner;

public class Verificacion_Triangulo_Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a,b,c;
    
        System.out.println( " Ingre el valor de las varaibles (3): ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int hipotenusa = a;
        int cateto1 = b;
        int cateto2 = c;


        if (b > hipotenusa) {
            
            hipotenusa = b;
            cateto1 = a;
        
        } else if (c > hipotenusa ) {
            
            hipotenusa = c;
            cateto2 = b;
        
        } else if ((cateto1 * cateto1) + (cateto2 * cateto2) == (hipotenusa * hipotenusa)){

            System.out.println("Es un triángulo rectángulo");
        } else {
            System.out.println("No es un triángulo rectángulo");

        }



    }
    
}
