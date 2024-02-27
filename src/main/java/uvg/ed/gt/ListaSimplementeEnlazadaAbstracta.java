package uvg.ed.gt;

abstract class ListaSimplementeEnlazadaAbstracta<E> implements Lista<E> {
    protected Nodo<E> inicio;
    protected int tamaño;

    public ListaSimplementeEnlazadaAbstracta() {
        inicio = null;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return inicio == null;
    }
}

