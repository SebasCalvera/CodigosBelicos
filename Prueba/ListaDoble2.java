public class ListaDoble2
    NodoDoble cola;

    public ListaDoble2() {
        this.cabeza = null;
        this.cola = null;
    }

    // Método para insertar un nodo al inicio de la lista
    public void insertarAlInicio(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    // Método para insertar un nodo al final de la lista
    public void insertarAlFinal(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Método para eliminar un nodo
    public void eliminar(int valor) {
        NodoDoble actual = cabeza;
        while (actual != null && actual.dato != valor) {
            actual = actual.siguiente;
        }
        if (actual == null) return;

        if (actual == cabeza) cabeza = actual.siguiente;
        if (actual == cola) cola = actual.anterior;
        if (actual.anterior != null) actual.anterior.siguiente = actual.siguiente;
        if (actual.siguiente != null) actual.siguiente.anterior = actual.anterior;
    }

    // Método para buscar un nodo
    public boolean buscar(int valor) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.dato == valor) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Mostrar de adelante hacia atrás
    public void mostrarAdelante() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Mostrar de atrás hacia adelante
    public void mostrarAtras() {
        NodoDoble actual = cola;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlFinal(30);
        lista.insertarAlFinal(40);

        System.out.println("Lista hacia adelante:");
        lista.mostrarAdelante();

        System.out.println("Lista hacia atrás:");
        lista.mostrarAtras();

        System.out.println("Buscando 30: " + lista.buscar(30));
        System.out.println("Eliminando 20...");
        lista.eliminar(20);
        lista.mostrarAdelante();
    }
}
