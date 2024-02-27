package uvg.ed.gt;

public class PilaVector<T> extends PilaAbstracta<T> {

    private Vector<T> vector;

    public PilaVector() {
        this.vector = new Vector<>();
        tamanio = 0;
    }

    @Override
    public void push(T elemento) {
        vector.add(elemento);
        tamanio++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        tamanio--;
        return vector.remove(tamanio);
    }

    @Override
    public boolean isEmpty() {
        return tamanio == 0;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return vector.get(tamanio - 1);
    }

}

