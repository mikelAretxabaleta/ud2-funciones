package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce una temperatura en grados centígrados:");
        double centigrados = Double.parseDouble(br.readLine());

        System.out.println(centigrados + " grados centígrados son " + convertirTemperatura(centigrados) + " Fahrenheit");

    }

    public static double convertirTemperatura(double centigrados) {

        return (centigrados * 1.8) + 32;
    }
}
