package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Número: ");
        int numero = Integer.parseInt(br.readLine());

        System.out.println("Fibonacci: " + fibonacci(numero));
        System.out.print("Fibonacci (recursivo): " + recursivo(numero));

    }

    private static int fibonacci(int numero) {

        int primero = 0;
        int segundo = 1;
        int otro;

        if (numero == 0) return 0;
        else if (numero < 0) return -1;

        for (int i = 3; i < numero; i++) {

            otro = primero;
            primero = segundo;
            segundo = otro + segundo;

        }

        return primero + segundo;
    }

    private static int recursivo(int numero) {
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

}
