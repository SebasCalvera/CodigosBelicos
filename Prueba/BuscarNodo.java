  // Método para buscar un nodo
    public boolean buscar(int valor) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Método para mostrar la lista de adelante hacia atrás
    public void mostrarAdelante() {
        NodoDoble actual = cabeza;
        System.out.print("Lista de adelante hacia atras: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método para mostrar la lista de atrás hacia adelante
    public void mostrarAtras() {
        NodoDoble actual = cola;
        System.out.print("Lista de atras hacia adelante: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        System.out.println("Insertando elementos al final...");
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.mostrarAdelante(); // Salida: 10 20 30

        System.out.println("\nInsertando un elemento al inicio...");
        lista.insertarAlInicio(5);
        lista.mostrarAdelante(); // Salida: 5 10 20 30

        System.out.println("\nEliminando el valor 20...");
        lista.eliminar(20);
        lista.mostrarAdelante(); // Salida: 5 10 30
        lista.mostrarAtras(); // Salida: 30 10 5

        System.out.println("\nBuscando el valor 10...");
        System.out.println("¿El valor 10 esta en la lista? " + lista.buscar(10));

        System.out.println("\nBuscando el valor 20...");
        System.out.println("¿El valor 20 esta en la lista? " + lista.buscar(20));
    }

