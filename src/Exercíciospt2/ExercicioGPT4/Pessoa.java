package Exercíciospt2.ExercicioGPT4;

public abstract class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Meu nome é: " + nome + " e tenho " + idade + " anos de idade.");
    }
}