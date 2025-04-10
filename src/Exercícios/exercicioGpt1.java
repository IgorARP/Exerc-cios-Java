package Exercícios;

import java.util.Scanner;

public class exercicioGpt1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroMax = 6;
        int cadastro = 0;
        int opcao = 0;

        String[] pokemon = new String[numeroMax];

        while (opcao != 5) {
            System.out.println("====== Party de Pokemon =======");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1.Colocar Pokemon na Party");
            System.out.println("2.Ver os Pokemons na Party");
            System.out.println("3.Remover Pokemon da Party");
            System.out.println("4.Ver espaços que ainda restam na Party");
            System.out.println("5.Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (cadastro < numeroMax) {
                        System.out.println("Digite o Pokemon que quer adicionar na party:");
                        String pokemonAdicionado = scanner.nextLine();
                        pokemon[cadastro] = pokemonAdicionado;
                        cadastro++;
                        System.out.println("Pokemon adicionado!");

                    } else {
                        System.out.println("Party completa!!!");
                    }
                    break;

                case 2:
                    if (cadastro == 0) {

                        System.out.println("Não possui nenhum Pokemon adicionado!");
                    } else {
                        for (int i = 0; i < cadastro; i++) {
                            System.out.println(pokemon[i]);
                        }
                    }
                    break;

                case 3:
                    if (cadastro == 0) {
                        System.out.println("Nenhum Pokemon na party para remover!");
                    } else {
                        System.out.println("Pokemons na sua party");
                        for (int i = 0; i < cadastro; i++) {
                            System.out.println((i + 1) + "." + pokemon[i]);

                        }
                        System.out.println("Digite o número do Pokemon que deseja remover");
                        int remover = scanner.nextInt();
                        if (remover < 1 || remover > cadastro) {
                            System.out.println("Número inválido");
                        } else {
                            for (int i = remover - 1; i < cadastro - 1; i++) {
                                pokemon[i] = pokemon[i + 1];
                            }
                            pokemon[cadastro - 1] = null;
                            cadastro--;
                            System.out.println("Pokemon removido com sucesso");
                        }
                        break;
                    }
                case 4:
                    int espacoRestante = numeroMax - cadastro;
                    if (espacoRestante == 0) {
                        System.out.println("Sua party está cheia!");

                    } else if (cadastro == 0) {
                        System.out.println("Sua party esta vazia!");

                    } else {
                        System.out.println("Sua party tem: " + espacoRestante + "espaços vazios !");

                    }
                    break;

                case 5:
                    System.out.println("Fechando o sistema ... Por favor Aguarde");
                    break;

                default:
                    System.out.println("Escolha uma opção dente as acima:");
                    break;
            }
        }
    }
}