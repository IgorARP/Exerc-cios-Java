package Exercíciospt2.ExercicioGPT4;

public class Funcionario extends Pessoa {
    double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("E meu salário é R$ " + salario);
    }
}