package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;


        do {
            System.out.print("=== Calculadora ===\n" +
                    "a) Longitud de la circunferencia\n" +
                    "b) Área del círculo\n" +
                    "c) Volumen de la esfera\n" +
                    "d) Salir\n" +
                    "Opción:");

            opcion = br.readLine().toLowerCase().charAt(0);

            if (opcion != 'd') {
                System.out.print("Radio: ");
                double radio = Double.parseDouble(br.readLine());


                switch (opcion) {

                    case 'a':
                        System.out.println("Longitud de la circunferencia: " + longitud(radio));
                        break;
                    case 'b':
                        System.out.println("Área del círculo: " + area(radio));
                        break;
                    case 'c':
                        System.out.println("Volumen de la esfera: " + volumen(radio));
                        break;
                }
            }

        } while (opcion != 'd');
    }

    public static double longitud(double radio) {

        return 2 * Math.PI * radio;
    }

    public static double area(double radio) {

        return Math.PI * Math.pow(radio, 2);
    }

    public static double volumen(double radio) {

        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
}
