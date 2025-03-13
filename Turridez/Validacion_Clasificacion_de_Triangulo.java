import java.util.Scanner;

public class Validacion_Clasificacion_de_Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        int a,b,c;

        System.out.println( " Ingresa el valor de los tres lados: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ( a + b > c &&  a + c > b && c + b > a ) {

            if ( a == b && b == c) {

                System.out.println( " Es un triangulo Equilatero ");
                
            } else if (  a==b || a==c || b==c) {
                
            System.out.println( " Es un rectangulo Isosceles ");
                
            } else {

                System.out.println( " Es un rectangulo Escaleno ");
            }
            
        } else {
            
            System.out.println("Los lados no forman un triángulo");
        }
    }
    
}
