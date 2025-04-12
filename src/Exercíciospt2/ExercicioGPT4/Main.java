package Exercíciospt2.ExercicioGPT4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        do {
            System.out.println("\nMenu da loja de conveniências:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do cliente");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Idade do Cliente");
                    int idadeCliente = scanner.nextInt();
                    System.out.println("Valor comprado");
                    double valorComprado = scanner.nextDouble();
                    clientes.add(new Cliente(nomeCliente, idadeCliente, valorComprado));
                    break;

                case 2:
                    System.out.println("Nome do funcionario");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.println("Idade do funcionario");
                    int idadeFuncionario = scanner.nextInt();
                    System.out.println("Salarioo");
                    double salario = scanner.nextDouble();
                    funcionarios.add(new Funcionario(nomeFuncionario, idadeFuncionario, salario));
                    break;

                case 3:
                    System.out.println("\n ==== Lista de clientes");
                    if (clientes.isEmpty()) {
                        System.out.println("Lista de clientes vazia");
                    } else {
                        for (Cliente c : clientes) {
                            c.apresentar();

                        }
                    }
                    break;
                case 4:
                    System.out.println("\n ==== Lista de funcionario");
                    if (funcionarios.isEmpty()) {
                        System.out.println("Lista de funcionarios vazia");
                    } else {
                        for (Funcionario c : funcionarios) {
                            c.apresentar();

                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando programa");
                    break;

                default:
                    System.out.println("opção inválida");
            }
        } while (opcao != 5);
    }
}