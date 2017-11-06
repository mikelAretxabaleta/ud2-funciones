package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número entero: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("El nùmero " + num + " es par: " + esPar(num));
        System.out.println("El nùmero " + num + " es impar: " + esImpar(num));


    }

    public static String esPar(int num) {
        if (num % 2 == 0) return "si";
        else return "no";
    }

    public static String esImpar(int num) {
        if (num % 2 == 0) return "no";
        else return "si";
    }


}
