import java.util.Scanner;

public class Conversion_Temp_y_Clasificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        double temp;
        

        System.out.println( " Ingresa la temperatura en °C : ");
        temp = sc.nextDouble();

        double F = temp * 9/5 + 32;
     

        if (F < 50) {

            System.out.println( " Temperatura fria ");
            
        } else {
            System.out.println( " Temperatura calida ");
        }



    }
    
}
