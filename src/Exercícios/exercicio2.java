package Exercícios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        /*
        2 - Faça um algoritmo para receber um número qualquer e
        imprimir na tela se o número é par ou ímpar, positivo ou negativo
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número");
        int numero = scanner.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("Seu número é par e positivo");
            } else {
                System.out.println("Seu número é ímpar e positivo");
            }
        }else {
            if (numero % 2 == 0) {
                System.out.println("Seu número é par e negativo");
            } else {
                System.out.println("Seu número é ímpar e negativo");
            }
        }
    }
}
