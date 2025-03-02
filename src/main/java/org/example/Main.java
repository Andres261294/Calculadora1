package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            double num1, num2;
            char operador;
            double resultado = 0;

        System.out.println("Introduce el operador (+, -, *, /, ^,√,%):");
        operador = scanner.next().charAt(0);

        System.out.println("Introduce el primer número:");
        num1 = scanner.nextDouble();

        if (operador != '√'&& operador != '%') {
            System.out.println("Introduce el segundo número:");
            num2 = scanner.nextDouble();
        } else {
            num2 = 0;
        }


        boolean operacionValida = true;
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
            case '√':
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                } else {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    operacionValida = false;
                }
                break;
            case '%':
                System.out.println("porfavor coloque  el porcentaje (sin el símbolo %):");
                double porcentaje = scanner.nextDouble();
                resultado = (num1 * porcentaje) / 100;
                break;
            default:
                System.out.println("Operador inválido.");
                operacionValida = false;
                break;
        }
        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }System.out.println("¿Deseas realizar otra operación? (s/n):");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        scanner.close();
    }
}
