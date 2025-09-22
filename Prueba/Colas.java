
public class Colas {
    public static void main(String[] args) {
       
        // 1. Creación e inserción (offer)
        Queue<Integer> cola = new LinkedList<>();
        System.out.println("Cola inicialmente vacía: " + cola);

        cola.offer(10); // Insertar un elemento
        cola.offer(20);
        cola.offer(30);
        System.out.println("Cola después de 'offer': " + cola); // Salida: [10, 20, 30]

        // 2. Remoción (poll)
        int primeroRemovido = cola.poll(); // Remover el primer elemento insertando (FIFO)
        System.out.println("Elemento removido con 'poll': " + primeroRemovido); // Salida: 10
        System.out.println("Cola después de 'poll': " + cola); // Salida [20, 30]

        // 3. Obtener el primer elemento (peek)
        int primerElemento = cola.peek();
        System.out.println("Primer elemento con 'peek': " + primerElemento); // Salida: 20
        // Salida: [20, 30] (No hay cambios)
        System.out.println("Cola después de 'peek': " + cola);

        // 4. Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty();
        System.out.println("¿La cola está vacía? " + estaVacia); // Salida: false 
    }
}
