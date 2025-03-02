package org.example;

import java.util.Scanner;

public class Datos_primitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 20;
        double peso = 65.2;
        char letra = 'A';
        boolean esEstudiante = true;
        short numeroCorto = 32000;
        long numeroLargo = 9223372036854775807L;
        float numeroFlotante = 3.14159f;
        byte numeroByte = 127;

        System.out.println("los datos que ingresaste fueron " + edad+ " "+ peso + " kg "+ letra + " "+ esEstudiante);
        System.out.println("Valor short: " + numeroCorto);
        System.out.println("Valor long: " + numeroLargo);
        System.out.println("Valor float: " + numeroFlotante);
        System.out.println("Valor byte: " + numeroByte);
    }
}
