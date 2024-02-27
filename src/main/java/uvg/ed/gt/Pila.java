package uvg.ed.gt;

interface Pila<E> {
    void apilar(E elemento);
    E desapilar();
    E cima();
    boolean estaVacia();
}

