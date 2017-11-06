package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce la base: ");
        double base = Double.parseDouble(br.readLine());

        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(br.readLine());

        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo(base, altura));

    }

    public static double perimetroRectangulo(double base, double altura) {

        return 2 * (base + altura);

    }


}
