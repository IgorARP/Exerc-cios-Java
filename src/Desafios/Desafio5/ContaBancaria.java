package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{
    double saldo;
    TipoConta tipo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipo) {
        this(saldo);
        this.tipo = tipo;
    }

    public void consultarSaldo(){

    }
    public void depositar(){

    }
}
