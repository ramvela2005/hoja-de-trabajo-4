package uvg.ed.gt;

abstract class PilaAbstracta<E> implements Pila<E> {
    protected Lista<E> lista;

    public PilaAbstracta(Lista<E> lista) {
        this.lista = lista;
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }
}

