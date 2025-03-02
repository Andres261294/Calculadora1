package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operador;

        System.out.println("Introduce el primer número:");
        num1 = scanner.nextDouble();
        System.out.println("6. Raíz cuadrada");

        System.out.println("Introduce el operador (+, -, *, /, ^):");
        operador = scanner.next().charAt(0);

        System.out.println("Introduce el segundo numero:");
        num2 = scanner.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return; // Sale del programa
                }
                break;
             case '^':
                resultado = Math.pow(num1, num2);
                break;

            case 6:
                System.out.print("Ingrese el número: ");
                num1 = scanner.nextDouble();
                resultado = raizCuadrada(num1);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Operador inválido.");
                return; // Sale del programa
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
        }
    public static double raizCuadrada(double num) {
        if (num < 0) {
            System.out.println("Error: No se puede calcular la raíz de un número negativo.");
            return Double.NaN; // Retorna "Not a Number" si el número es negativo
        }
        return Math.sqrt(num);
    }
    }
