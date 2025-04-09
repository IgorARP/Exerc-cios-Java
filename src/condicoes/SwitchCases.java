package condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        //Pedir usuário

        Scanner scanner = new Scanner(System.in);

        //Mostrar opçoes
        System.out.println("Escolha um");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        //Pedir para escolher uma
        int escolha = scanner.nextInt();
        System.out.println("Você escolheou o numero: " + escolha);

        //reação ao escolher
        switch (escolha) {
            case 1:
                System.out.println("Escolheu o naruto");
                break;
            case 2:
                System.out.println("Escolheu o Sasuke");
                break;
            case 3:
                System.out.println("Escolheu o Sakura");
                break;
            default:
                System.out.println("Nao digitou uma respota valida");
        }
        //Fechar caixa
        scanner.close();
    }
}
