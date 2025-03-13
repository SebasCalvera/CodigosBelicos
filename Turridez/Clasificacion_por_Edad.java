import java.util.Scanner;

public class Clasificacion_por_Edad {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println( " Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad < 12 ) {

            System.out.println( " Es un niñ@ ");


            
        } else if ( edad < 18 ) {

            System.out.println( "Es un/una adolecente ");

            
        } else 
        {
            System.out.println( " Es un adulto ");
        }


    }
}
