package Exercíciospt2.ExercicioGpt3;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentacao() {
        System.out.println("Ola, meu nome é " + nome + " e tenho" + idade + " anos de idade.");

    }
}
