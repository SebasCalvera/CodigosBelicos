import java.util.Scanner;

public class Rayo_McQueen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidad;
        int limite = 60;

        System.out.println( " Ingrese Velocidad: ");
        velocidad = sc.nextInt();

        if ( velocidad <= limite ) {

            System.out.println( " Velocidad Permitida ");
            
        } else if ( velocidad <= limite + 20) {

            System.out.println( " Exceso leve ");
   
        } else {
            System.out.println( " RAYO MCQQUEEN// EXECESO GRAVE DE VELOCIDAD ");
        }
    }
    
}
