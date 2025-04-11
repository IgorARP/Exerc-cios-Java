package Exercíciospt2.ExercicioGpt3;

public class Professor extends Pessoa {
    String materia;

    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    @Override
    public void apresentacao() {
        super.apresentacao();
        System.out.println("E dou aula de: " + materia);
    }
}

