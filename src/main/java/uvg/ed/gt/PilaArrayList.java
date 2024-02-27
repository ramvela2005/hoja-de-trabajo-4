package uvg.ed.gt;

class PilaArrayList<E> extends PilaAbstracta<E> {
    public PilaArrayList(Lista<E> lista) {
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

