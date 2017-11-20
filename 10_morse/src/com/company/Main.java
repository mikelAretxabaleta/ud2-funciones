package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String texto;
        do{
            System.out.println();
        System.out.print("Cadena de texto: ");
        texto=br.readLine();
            System.out.println(conversor(texto));


        } while (!texto.equalsIgnoreCase("stop"));

    }

    private static String conversor(String texto){

        String morse="";
        for (int i = 0; i < texto.length(); i++) {


            switch (texto.toUpperCase().charAt(i)){

                case 'A':
                    morse=morse+".- ";
                    break;
                case 'B':
                    morse=morse+"-... ";
                    break;
                case 'C':
                    morse=morse+"-.-. ";


            }

        }return morse;
    }
}
