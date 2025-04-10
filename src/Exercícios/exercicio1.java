package Exercícios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        /*
        1 - Faça um algoritmo que leia os valores de A, B, C e
        em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
         */
        // abrir scanner
        Scanner scanner = new Scanner(System.in);

        //insira valor de A
        System.out.println("Insira valor de A");
        int valorA = scanner.nextInt();

        //insira valor de B
        System.out.println("Insira valor de B");
        int valorB = scanner.nextInt();

        //insira valor C
        System.out.println("Insira valor de C");
        int valorC = scanner.nextInt();

        int soma = valorA + valorB;
        System.out.println("O valor de A +B é: " + soma);

        if (soma < valorC ){
            System.out.println("Valor de A + B é menor que o valor de C!!!");

        } else {
            System.out.println("");
        }
    }
}
