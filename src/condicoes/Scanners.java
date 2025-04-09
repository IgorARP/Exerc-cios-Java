package condicoes;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        //abrir scanner
        Scanner caixaDetexto = new Scanner(System.in);

        //Recebe Nome
        System.out.println("Escreva seu nome aqui:");
        String nome = caixaDetexto.nextLine();
        System.out.println("O nome é: " + nome);

        //Recebe Idade
        System.out.println("Escreva sua idade: ");
        int idade = caixaDetexto.nextInt();
        System.out.println("Sua idade é: " + idade);

        //tratamento de dados
        if (idade >= 18){
            System.out.println("Ja é maior de idade");

        }else {
            System.out.println("Ainda é menor de idade");
        }

        //fechar scanner
        caixaDetexto.close();
    }
}
