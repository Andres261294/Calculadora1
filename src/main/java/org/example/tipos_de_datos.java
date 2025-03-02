package org.example;

public class tipos_de_datos {
        public static void main(String[] args) {
            //  Operadores Aritméticos
            int a = 10;
            int b = 20;
            int suma = a + b;
            int resta = a - b;
            int multiplicacion = a * b;
            int division = b / a;
            int modulo = b % a;

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);

            //  Operadores Lógicos
            boolean b1 = true;
            boolean b2 = false;
            boolean and = b1 && b2;
            boolean or = b1 || b2;
            boolean not = !b1;

            System.out.println("\nAND lógico: " + and);
            System.out.println("OR lógico: " + or);
            System.out.println("NOT lógico: " + not);

            //  Operadores Relacionales
            boolean esMayor = b > a;
            boolean esMenor = a < b;
            boolean esIgual = a == b;
            boolean esDiferente = a != b;

            System.out.println("\n¿b > a? " + esMayor);
            System.out.println("¿a < b? " + esMenor);
            System.out.println("¿a == b? " + esIgual);
            System.out.println("¿a != b? " + esDiferente);

            //  Operadores de Asignación
            int x = 10;
            x += 5;
            x *= 2;
            System.out.println("\nValor de x después de asignaciones compuestas: " + x);

            //  Operador Ternario
            int edad = 18;
            String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
            System.out.println("\nOperador ternario: " + mensaje);

            //  Operador de Concatenación
            String s1 = "Hola";
            String s2 = "Mundo";
            String concatenacion = s1 + " " + s2;
            System.out.println("\nConcatenación: " + concatenacion);

            // . Operador de Instancia
            String s = "Hola";
            boolean esString = s instanceof String;
            System.out.println("\n¿s es instancia de String? " + esString);

            //  Operadores a Nivel de Bits
            int aBits = 5;
            int bBits = 3;
            int andBits = aBits & bBits;
            int orBits = aBits | bBits;
            int xorBits = aBits ^ bBits;
            int notBits = ~aBits;
            int shiftLeft = aBits << 1;
            int shiftRight = aBits >> 1;

            System.out.println("\nAND a nivel de bits: " + andBits);
            System.out.println("OR a nivel de bits: " + orBits);
            System.out.println("XOR a nivel de bits: " + xorBits);
            System.out.println("NOT a nivel de bits: " + notBits);
            System.out.println("Shift Left: " + shiftLeft);
            System.out.println("Shift Right: " + shiftRight);
        }
    }