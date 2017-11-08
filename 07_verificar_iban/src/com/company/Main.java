package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("IBAN: ");
        String iban = br.readLine();

        if (esValido(iban)) System.out.println("Válido");
        else System.out.println("NO Válido");
    }

    public static boolean esValido(String iban) {

        String iban2 = iban.toUpperCase().replaceAll("\\s", "");
        String iban3 = iban2.replaceFirst("IBAN", "");

        int letra1 = iban3.charAt(0) - 55;
        int letra2 = iban3.charAt(1) - 55;

        String iban4 = iban3.substring(4) + letra1 + letra2 + iban3.substring(2, 4);

        long iban5 = Long.valueOf(iban4);
        System.out.println(iban5);
        return 1 == iban5 % 97;

    }
}
