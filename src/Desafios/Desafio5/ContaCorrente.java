package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);

    }

    public ContaCorrente(double saldo, TipoConta tipo) {
        super(saldo, tipo);
    }

    public void consultarSaldo(){
        System.out.println("Saldo na conta: " + saldo);

    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Foi depositado: " + valor +" em sua conta corrente ");


    }
}
