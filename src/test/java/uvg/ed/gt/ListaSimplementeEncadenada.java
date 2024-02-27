package uvg.ed.gt;

public class ListaSimplementeEncadenada<T> extends ListaAbstracta<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public ListaSimplementeEncadenada() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    @Override
    public void add(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (isEmpty()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        tamanio++;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T elementoEliminado = primero.dato;
        if (tamanio == 1) {
            primero = ultimo = null;
        } else {
            primero = primero.siguiente;
        }
        tamanio--;
        return elementoEliminado;
    }

    @Override
    public boolean isEmpty() {
        return tamanio == 0;
    }