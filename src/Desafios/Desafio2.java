package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int numeroMax = 10;
        int cadastrados = 0;
        int opcao = 0;

        //Fazer array
        String [] ninjas = new String[numeroMax];

        while (opcao != 3){
            System.out.println("\n ===== Menu Ninja =====");
            System.out.println("1.Cadastrar Ninja");
            System.out.println("2.Listar Ninjas Castrados");
            System.out.println("3.Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if(cadastrados < numeroMax){
                        System.out.println("Digite o nome do ninja");
                        String nomeNinja = scanner.nextLine();
                       ninjas[cadastrados] = nomeNinja;
                        cadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    }else {
                        System.out.println("A lista de ninjas esta cheia, impossivel cadastrar um novo ninja");
                    }
                    break;
                case 2:
                    if (cadastrados == 0){
                        System.out.println("nenhum ninja encontrado");

                    }else {
                        System.out.println("======== Lista de Ninjas ======== ");
                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println(ninjas[i]);

                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos terminando o programa .. Aguardo");
                    break;

                default:
                    System.out.println("Essa opção não é valida");
                    break;

            }
        }
    }
}
