package uvg.ed.gt;

public abstract class ListaAbstracta<T> implements Lista<T> {

    protected int tamanio;

    @Override
    public abstract void add(T elemento);

    @Override
    public abstract T remove();

    @Override
    public abstract boolean isEmpty();

    @Override
    public int size() {
        return tamanio;
    }

    @Override
    public abstract T get(int indice);

}

