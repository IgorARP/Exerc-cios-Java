package Exercíciospt2;

public class Main {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Joao", 4560.50);
        Funcionarios f2 = new Gerente("Marcelo", 6000);

        f1.mostrarResultados();
        f2.mostrarResultados();
    }
}


