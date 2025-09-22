public class NodoDoble {
    int dato;
    NodoDoble anterior, siguiente;

    public NodoDoble(int valor) {
        this.dato = valor;
        this.anterior = this.siguiente = null;
    }
}
