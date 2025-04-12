package Desafios.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void executarhabilidade() {
        System.out.println(nome + " está usando a habilidade básica: " + habilidade);
    }

    @Override
    public void mostrarDetalhesNinja() {
        System.out.println("Ninja básico:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }
}


