package Exercíciospt2.ExercicioGPT4;

public class Cliente extends Pessoa {
    double valorComprado;

    public Cliente(String nome, int idade, double valorComprado) {
        super(nome, idade);
        this.valorComprado = valorComprado;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("E eu já comprei " + valorComprado + " na loja.");
    }
}