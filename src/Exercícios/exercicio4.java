package Exercícios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        /*4 - Faça um algoritmo que receba um número inteiro e
        imprima na tela do seu antecessor e do seu sucessor.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu numero");
        int numero = scanner.nextInt();
        int numero1 = numero -1;
        int numero2 = numero +1;
        System.out.println("Seu antecessor é: " + numero1 +" e seu sucessor é: " + numero2);
    }
}
