package uvg.ed.gt;

interface Pila<T> {

    void push(T elemento);

    T pop();

    boolean isEmpty();

    int size();

    T peek();

}

