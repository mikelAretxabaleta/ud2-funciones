package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char opcion;
        char escala;

        do {
            System.out.print("=== Temperaturas ===\n" +
                    "1. Convertir a Fahrenheit\n" +
                    "2. Convertir a Kelvin\n" +
                    "3. Salir\n" +
                    "Opción:");

            opcion = br.readLine().charAt(0);

            switch (opcion) {

                case '1':
                    escala = 'F';
                    break;
                case '2':
                    escala = 'K';
                    break;
                default:
                    escala = '0';
            }

            if (opcion!='3') {
                System.out.print("Temperatura en centígrados: ");
                double centigrados = Double.parseDouble(br.readLine());

                System.out.println(convertirTemperatura(centigrados, escala));
            }
        } while (opcion != '3');
    }

    public static double convertirTemperatura(double centigrados, int escala) {

        if (escala == 'F') return (centigrados * 1.8) + 32;
        else if (escala == 'K') return (centigrados + 273.15);
        else return -1;
    }
}
