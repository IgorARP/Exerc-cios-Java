package Exercícios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        double salarioMin = 1400;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();
        double salarioD = salario / salarioMin;
        System.out.printf("Seu salario é %.2fx de um salario minimo", salarioD);

    }
}
