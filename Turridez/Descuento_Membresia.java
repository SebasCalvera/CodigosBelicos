import java.util.Scanner;

public class Descuento_Membresia {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int monto;
        boolean esMiembro;

        System.out.println( " Ingresa el valor de tu compra: ");
        monto = sc. nextInt();
        System.out.println( " Es mienrbro par aplicar el descuento: ");
        esMiembro = sc. nextBoolean();

        if (monto > 100 && esMiembro) {
            
            System.out.println( " Descuento aceptado el valor de su compra es: " + (  monto = monto -  (monto * 10 / 100)) );
            
        } else {
            System.out.println( " El valor total de su compra es: " + monto);
        }


    }
    
}
