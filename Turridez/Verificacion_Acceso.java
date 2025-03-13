package Turridez;

import java.util.Scanner;

public class Verificacion_Acceso {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String user = "admin";
        String password = "1234";

        System.out.println( " Ingresa tu usario y contrseña: " );
        String usuario = sc. next();
        String contrseña = sc.next();

        if ( usuario.equals (user)&& contrseña.equals (password )) {
            System.out.println( " Acceso Permitido ");

            
        } else {

            System.out.println( " ASccesos Denegado ");
        }

    }
    
}
