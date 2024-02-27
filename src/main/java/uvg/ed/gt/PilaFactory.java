package uvg.ed.gt;
class PilaFactory {
    public static <E> Pila<E> crearPila(String tipoPila, Lista<E> lista) {
        switch (tipoPila) {
            case "ArrayList":
                return new PilaArrayList<>(lista);
            case "Vector":
                return new PilaVector<>(lista);
            default:
                return new RuntimeException("Tipo de pila no válido");


        }
    }
}

