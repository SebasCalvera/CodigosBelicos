// Clase ListaCircular
public class ListaCircular {
    Nodo ultimo;

    public ListaCircular() {
        this.ultimo = null;
    }

    // Método para verificar si la lista está vacía
    public boolean estaVacia() {
        return ultimo == null;
    }

    // Método para insertar un nodo al final de la lista
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (estaVacia()) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo; // El nuevo nodo se apunta a sí mismo
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo; // El nuevo nodo se convierte en el último
        }
    }

    // Método para eliminar un nodo por su valor
    public void eliminar(int valor) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = ultimo.siguiente;
        Nodo anterior = ultimo;
        boolean encontrado = false;

        // Recorremos la lista hasta encontrar el nodo o volver al inicio
        do {
            if (actual.dato == valor) {
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        if (encontrado) {
            if (actual == ultimo) { // Caso especial: el nodo a eliminar es el último
                if (ultimo.siguiente == ultimo) { // La lista tiene un solo nodo
                    ultimo = null;
                } else {
                    anterior.siguiente = ultimo.siguiente;
                    ultimo = anterior;
                }
            } else { // El nodo a eliminar no es el último
                anterior.siguiente = actual.siguiente;
            }
            System.out.println("Se eliminó el valor: " + valor);
        } else {
            System.out.println("El valor " + valor + " no se encontró en la lista.");
        }
    }

    // Método para recorrer y mostrar la lista
    public void recorrer() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = ultimo.siguiente;
        System.out.print("Lista Circular: ");
        do {
            System.out.print(actual.dato + " --> ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        System.out.println("(Se cierra el ciclo)");
    }
}