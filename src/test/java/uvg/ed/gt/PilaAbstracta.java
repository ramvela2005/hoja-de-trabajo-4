package uvg.ed.gt;

public abstract class PilaAbstracta<T> implements Pila<T> {

    protected int tamanio;

    @Override
    public abstract void push(T elemento);

    @Override
    public abstract T pop();

    @Override
    public abstract boolean isEmpty();

    @Override
    public int size() {
        return tamanio;
    }

    @Override
    public abstract T peek();

}

