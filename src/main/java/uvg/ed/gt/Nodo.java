package uvg.ed.gt;

class Nodo<E> {
    E elemento;
    Nodo<E> siguiente;

    public Nodo(E elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
}

