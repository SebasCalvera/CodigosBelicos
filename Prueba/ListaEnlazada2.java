public class ListaEnlazada2 {
    Nodo cabeza; // El primer nodo de la lista

    public ListaEnlazada2() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
    }

    // Método para imprimir todos los elementos de la lista
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Método para eliminar un nodo con un valor específico
    public void eliminar(int valor) {
        if (cabeza == null) return;

        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}

