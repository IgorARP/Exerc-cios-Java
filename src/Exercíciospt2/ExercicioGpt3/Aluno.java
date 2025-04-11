package Exercíciospt2.ExercicioGpt3;

public class Aluno extends Pessoa {
    double notaFinal;

    public Aluno(String nome, int idade, double notaFinal) {
        super(nome, idade);
        this.notaFinal = notaFinal;
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("Sou aluno e minha nota final é:" + notaFinal);
    }
}
