package uvg.ed.gt;

class Calculadora {
    private static Calculadora instancia = null;

    private Calculadora() {}

    public static Calculadora obtenerInstancia() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    public String convertirInfixToPostfix(String infix) {
        // Implementación de la conversión de infix a postfix
        // Implementation omitida por brevedad
        return null;
    }

    public int evaluarExpresion(String postfix) {
        // Implementación de la evaluación de la expresión postfix
        return 0; // Implementación omitida por brevedad
    }
}

