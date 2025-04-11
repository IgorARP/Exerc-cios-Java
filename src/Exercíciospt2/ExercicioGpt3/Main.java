package Exercíciospt2.ExercicioGpt3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("José", 15, 7.6);
        Professor professor = new Professor("Roberta", 45, "Matemática");

        aluno.apresentacao();
        professor.apresentacao();
    }
}
