package Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void executarhabilidade() {
        System.out.println(nome + " está usando a habilidade avançada: " + especialidade);
    }

    @Override
    public void mostrarDetalhesNinja() {
        System.out.println("Ninja Avançado:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }
}
