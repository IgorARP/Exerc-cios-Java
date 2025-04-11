package Exercíciospt2;

public class Funcionarios {
    String nome;
    double salario;

    public double calcularBonus (){
        return salario * 0.1;
    }

    public void mostrarResultados(){
        System.out.println("Seu nome é:" + nome);
        System.out.println("Seu salario é:" + calcularBonus());
    }

    public Funcionarios(String nome, double salario){
        this.nome = nome;
        this.salario = salario;

    }
}