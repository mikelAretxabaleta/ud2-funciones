package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe un número entero: ");
        int num = Integer.parseInt(br.readLine());

        if (esPar(num)) System.out.println("El nùmero " + num + " es par");
        else if (esImpar(num)) System.out.println("El nùmero " + num + " es impar");


    }

//    public static String esPar(int num) {
//        if (num % 2 == 0) return "si";
//        else return "no";
//    }
//
//    public static String esImpar(int num) {
//        if (num % 2 == 0) return "no";
//        else return "si";
//    }

    public static boolean esPar(int num) {
        return (num % 2 == 0);
    }

    public static boolean esImpar(int num) {
        return !esPar(num);
    }


}
