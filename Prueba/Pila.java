import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        // 1. Creación e inserción (push)
        Stack<Integer> pila = new Stack<>();
        System.out.println("Pila inicialmente vacía: " + pila);

        pila.push(10);  //Insertar un elemento
        pila.push(20);
        pila.push(30);
        System.out.println("Pila después de 'push': " + pila); // Salida: [10, 20, 30]

        // 2. Remoción (pop)
        int elementoRemovido = pila.pop(); // Remover el ultimo elemnto insertado (LIFO)
        System.out.println("Elemento removido con 'pop': " + elementoRemovido); // Salida: 30
        System.out.println("Pila después de 'pop': " + pila); // Salida: [10, 20]

        // 3. Obtener el elemento superior (peek)
        int elementoSuperior = pila.peek();
        System.out.println("Elemento superior con 'peek': " + elementoSuperior); // Salida: 20 
        // Salida: [10, 20] (No hay cambios)
        System.out.println("Pila después de 'peek': " + pila);

        // 4. Verificar si la pila está vacía (empty)
        boolean estaVacia = pila.empty();
        System.out.println("¿La pila está vacía? " + estaVacia); // Salida: false

        // 5. Buscar un elemento (search)

        // Busca el elemento y devuelve su posicion desde la cima (1-based)
        int posicion = pila.search(10);
        // Salidad: 2
        System.out.println("Posición del 10 en la pila (desde arriba): " + posicion);
    }
}
