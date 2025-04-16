package NivelIntermediario4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Naruto------");
        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 17, 25, 1.70);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki com nome alterado");
        System.out.println(naruto.getNome());

        System.out.println("------------Sasuke----------");
        Uchiha sasuke = new Uchiha("Sasuke", "Folha", 18,20,1.76);
    }
}
