package uvg.ed.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String expresionInfix = leerExpresionInfixDesdeArchivo("datos.txt");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione el tipo de pila a utilizar (ArrayList o Vector): ");
            String tipoPila = scanner.nextLine();

            Lista<Character> lista = new ListaSimplementeEnlazada<>();
            Pila<Character> pila = PilaFactory.crearPila(tipoPila, lista);

            Calculadora calculadora = Calculadora.obtenerInstancia();
            String expresionPostfix = calculadora.convertirInfixToPostfix(expresionInfix);

            int resultado = calculadora.evaluarExpresion(expresionPostfix);

            System.out.println("Expresión infix: " + expresionInfix);
            System.out.println("Expresión postfix: " + expresionPostfix);
            System.out.println("Resultado: " + resultado);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo datos.txt: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static String leerExpresionInfixDesdeArchivo(String nombreArchivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        StringBuilder builder = new StringBuilder();
        while ((linea = lector.readLine()) != null) {
            builder.append(linea);
        }
        lector.close();
        return builder.toString();
    }
}

