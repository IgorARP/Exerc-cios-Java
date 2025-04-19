package Exercícios.Exercicios2;

public class Uzumaki extends Ninja{
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes) {
        super(nome, aldeia, idade, numeroDeMissoes);
    }

    public Uzumaki() {
    }

    @Override
    public void habilidadeespecial() {
        System.out.println("Razengan");
    }
}
