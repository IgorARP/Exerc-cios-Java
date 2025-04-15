package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        ContaPoupanca conta2 = new ContaPoupanca(1000);

        conta1.depositar(1000);
        conta1.consultarSaldo();

        conta2.depositar(1000);
        conta2.consultarSaldo();
    }
}
