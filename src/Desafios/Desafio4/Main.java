package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico("Naruto", 16, "Rasengan");
        NinjaAvancado kakashi = new NinjaAvancado("Kakashi", 33, "Shidori", "Caças");
        naruto.mostrarDetalhesNinja();
        naruto.executarhabilidade();
        System.out.println("-------------------------------------");
        kakashi.mostrarDetalhesNinja();
        kakashi.executarhabilidade();
    }



}
