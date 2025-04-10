package Exercícios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        /*
        3 - Faça um algoritmo que leia dois valores inteiros A e B,
        se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário deve-se multiplicar A por B. Ao final de qualquer um dos cálculos
        deve-se referir o resultado a uma variável C eimprimir seu valor na tela.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite valor de A:");
        int valorA = scanner.nextInt();

        System.out.println("Digite valor de B");
        int valorB = scanner.nextInt();

        if (valorA == valorB){
            int soma = valorA + valorB;
            System.out.println("O valor de A é igual valor de de B ent A + B é igual a: " + soma);
        }else {
            int soma2 = valorA * valorB;
            System.out.println("O valor de A é diferente do valor de B então eles multiplicados são: " + soma2);
        }

    }
}
