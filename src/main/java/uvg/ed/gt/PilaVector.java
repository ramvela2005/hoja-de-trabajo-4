package uvg.ed.gt;

class PilaVector<E> extends PilaAbstracta<E> {
    public PilaVector(Lista<E> lista) {
        super(lista);
    }

    public void apilar(E elemento) {
        lista.agregarInicio(elemento);
    }

    public E desapilar() {
        return lista.eliminarInicio();
    }

    public E cima() {
        return lista.obtenerInicio();
    }
}

