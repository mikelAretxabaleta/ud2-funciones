package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca una cantidad en euros: ");
        double euros=Double.parseDouble(br.readLine());

        System.out.print("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        String moneda=br.readLine();

        System.out.print(euros+" euros son "+calcularCambio(euros, moneda)+" ");

        if (moneda.equalsIgnoreCase("usd")) System.out.println("dolares");
        if (moneda.equalsIgnoreCase("gbp")) System.out.println("libras");
        if (moneda.equalsIgnoreCase("cny")) System.out.println("yuanes");
        if (moneda.equalsIgnoreCase("jpy")) System.out.println("yenes");



    }

    public static double calcularCambio(double euros, String moneda){

        if (moneda.equalsIgnoreCase("usd")) return euros*1.16;

        else if (moneda.equalsIgnoreCase("gbp")) return euros*0.88;

        else if (moneda.equalsIgnoreCase("cny")) return euros*7.70;

        else if (moneda.equalsIgnoreCase("jpy")) return euros*132.15;

        else return -1;


    }

}
