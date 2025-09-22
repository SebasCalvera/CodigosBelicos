public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        System.out.println("Insertando 10, 20, 30, 40 en la lista...");
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);
        lista.recorrer();
        //Salida Lista Circular: 10 -> 20 -> 30 -> 40 -> (Se cierra el circulo)

        System.out.println("\nEliminando el valor 30...");
        lista.eliminar(30);
        lista.recorrer();
        //Salida Lista Circular: 10 -> 20 -> 40 -> (Se cierra el circulo)

        System.out.println("\nEliminando el valor 10 (primer nodo)...");
        lista.eliminar(10);
        lista.recorrer();
        //Salida Lista Circular: 20 -> 40 -> (Se cierra el circulo)

        System.out.println("\nEliminando el valor 40 (último nodo)...");
        lista.eliminar(40);
        lista.recorrer();
        //Salida Lista Circular: 20 -> (Se cierra el circulo)

        System.out.println("\nIntentando eliminar un valor que no existe...");
        lista.eliminar(50);
        lista.recorrer();
        //Salida Lista Circular: El valor 50 no se encuentra en la lista.
        //  Lista Circular: 20 -> (Se cierra el circulo)

    }
}
