package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipo) {
        super(saldo, tipo);
    }

    public void consultarSaldo(){
            System.out.println("Saldo na conta: " + saldo);

        }
        public void depositar(double valor){
            double taxa = valor * 0.01;
            saldo += (valor - taxa);
            System.out.println("Foi depositado: " + valor +" em sua conta corrente  com uma taxa: " + taxa);


        }

}
