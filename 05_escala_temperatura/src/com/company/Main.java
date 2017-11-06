package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;
        int escala;

        do {
            System.out.println("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción:");

            opcion = br.readLine().charAt(0);

            switch (opcion) {

                case '1':
                    escala = 1;
                    break;
                case '2':
                    escala = 2;
                    break;
                default:
                    escala = -1;
            }

            if (opcion!='3') {
                System.out.print("Temperatura en centígrados: ");
                double centigrados = Double.parseDouble(br.readLine());

                System.out.println(convertirTemperatura(centigrados, escala));
            }
        } while (opcion != '3');
    }

    public static double convertirTemperatura(double centigrados, int escala) {

        if (escala == 1) return (centigrados * 1.8) + 32;
        else if (escala == 2) return (centigrados + 273.15);
        else return -1;
    }
}
