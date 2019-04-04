package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0D;
        umaCadeiaDeTexto = "Verdades absolutas curso de Android " +
                "- a vida se resume a boolenos;" +
                " vai ter uma aula sobre isso;" +
                " brasileiro é tudo lixo.";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("Soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("Subtração de A - B = " + (umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número, seu otário...");
        umNumeroA = scanner.nextInt();

        System.out.println("Recebi: " + umNumeroA);

    }
}
