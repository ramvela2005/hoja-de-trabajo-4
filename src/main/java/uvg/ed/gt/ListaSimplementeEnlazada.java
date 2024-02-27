package uvg.ed.gt;
import java.util.NoSuchElementException;

class ListaSimplementeEnlazada<E> extends ListaSimplementeEnlazadaAbstracta<E> {
    public void agregarInicio(E elemento) {
        Nodo<E> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
        tamaño++;
    }

    public E obtenerInicio() {
        if (estaVacia()) {
            throw new NoSuchElementException();
        }
        return inicio.elemento;
    }

    public E eliminarInicio() {
        if (estaVacia()) {
            throw new NoSuchElementException();
        }
        E elementoEliminado = inicio.elemento;
        inicio = inicio.siguiente;
        tamaño--;
        return elementoEliminado;
    }
}

