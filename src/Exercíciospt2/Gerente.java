package Exercíciospt2;

public class Gerente extends Funcionarios{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus (){
        return salario * 0.2;
    }
}
