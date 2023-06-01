package Code;

import java.util.Scanner;
import java.util.Stack;
public class Operaciones {
    public static double evaluarExpresion(String expresion) {
        expresion = expresion.replaceAll(" ", ""); // Eliminar espacios en blanco

        try {
            return evaluar(expresion);
        } catch (IllegalArgumentException ex) {
            System.err.println("Operador no válido: " + ex.getMessage());
            throw ex;
        } catch (ArithmeticException ex) {
            System.err.println("División por cero no permitida");
            throw ex;
        }
    }

    private static double evaluar(String expresion) {
        Stack<Double> operandos = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            if (Character.isDigit(caracter)) {
                StringBuilder sb = new StringBuilder();
                while (i < expresion.length() && (Character.isDigit(expresion.charAt(i)) || expresion.charAt(i) == '.')) {
                    sb.append(expresion.charAt(i));
                    i++;
                }
                i--;
                double numero = Double.parseDouble(sb.toString());
                operandos.push(numero);
            } else if (caracter == '(') {
                operadores.push(caracter);
            } else if (caracter == ')') {
                while (operadores.peek() != '(') {
                    char operador = operadores.pop();
                    double segundoOperando = operandos.pop();
                    double primerOperando = operandos.pop();
                    double resultadoParcial = aplicarOperacion(primerOperando, segundoOperando, operador);
                    operandos.push(resultadoParcial);
                }
                operadores.pop(); // Descartar el paréntesis abierto correspondiente
            } else if (esOperador(caracter)) {
                while (!operadores.isEmpty() && operadores.peek() != '(' && precedencia(operadores.peek()) >= precedencia(caracter)) {
                    char operador = operadores.pop();
                    double segundoOperando = operandos.pop();
                    double primerOperando = operandos.pop();
                    double resultadoParcial = aplicarOperacion(primerOperando, segundoOperando, operador);
                    operandos.push(resultadoParcial);
                }
                operadores.push(caracter);
            }
        }

        while (!operadores.isEmpty()) {
            char operador = operadores.pop();
            double segundoOperando = operandos.pop();
            double primerOperando = operandos.pop();
            double resultadoParcial = aplicarOperacion(primerOperando, segundoOperando, operador);
            operandos.push(resultadoParcial);
        }

        return operandos.pop();
    }

    private static boolean esOperador(char caracter) {
        return caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/';
    }

    private static int precedencia(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        }
        return 0;
    }

    private static double aplicarOperacion(double a, double b, char operador) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("División por cero no permitida");
                }
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}
