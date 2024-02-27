package uvg.ed.gt;

interface Lista<E> {
    void agregarInicio(E elemento);
    E obtenerInicio();
    E eliminarInicio();
    boolean estaVacia();
}

