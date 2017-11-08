package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Número: ");
        int numero = Integer.parseInt(br.readLine());

        System.out.println("El factorial es: " + factorial(numero));
    }

    public static int factorial(int numero) {

        int factorial=1;
        for (int i = numero; i > 1; i--) {
            factorial=factorial*i;
        }
        return factorial;

//        if (numero==0) return 1;
//        int factorial = numero*factorial(numero - 1);
//        return factorial;
    }
}
