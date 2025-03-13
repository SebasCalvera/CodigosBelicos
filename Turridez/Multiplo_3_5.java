import java.util.Scanner;

public class Multiplo_3_5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num;

        System.out.println( " ***MULTIPLO DE 3 Y DE 5*** ");
        System.out.println("");
        System.out.println( " Ingresa un numero: ");
        num = sc.nextInt();

        if ( num % 3 == 0 && num % 5 == 0) {

            System.out.println( " Es multiplo de 3 y de 5 ");
            
        } else {

            System.out.println( " No es multiplo de 3 y de 5 ");
        }


    }
}
