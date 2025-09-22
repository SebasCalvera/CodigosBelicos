public class Principal {
    public static void main(String[] args) {
        ListaEnlazada miLista = new ListaEnlazada();

        // Agregando elementos a la lista
        miLista.agregar(1);
        miLista.agregar(2);
        miLista.agregar(3);
        miLista.agregar(4);
        System.out.println("Lista después de agregar elementos:");
        miLista.imprimir(); // Salida: 1 -> 2 -> 3 -> 4 -> null

        // Eliminando un elemento
        miLista.eliminar(2);
        System.out.println("\nLista después de eliminar el 2:");
        miLista.imprimir(); // Salida: 1 -> 2 -> 3 -> 4 -> null


        // Eliminando un elemento
        miLista.eliminar(3);

        System.out.println("\nLista después de eliminar el 3:");
        miLista.imprimir(); // Salida: 1 -> 2 -> 4 -> 2 -> null

        miLista.agregar(8);
        System.out.println("\nLista después de agregar 8:");
        miLista.imprimir(); // Salida: 1 -> 2 -> 3 -> 4 -> 8 -> null
    }
}
