package uvg.ed.gt;

public interface Lista<T> {

    void add(T elemento);

    T remove();

    boolean isEmpty();

    int size();

    T get(int indice);

}

