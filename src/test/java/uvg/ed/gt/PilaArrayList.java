package uvg.ed.gt;

public class PilaArrayList<T> extends PilaAbstracta<T> {

    private ArrayList<T> lista;

    public PilaArrayList() {
        this.lista = new ArrayList<>();
        tamanio = 0;
    }

    @Override
    public void push(T elemento) {
        lista.add(elemento);
        tamanio++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        tamanio--;
        return lista.remove(tamanio);
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
        return lista.get(tamanio - 1);
    }

}

