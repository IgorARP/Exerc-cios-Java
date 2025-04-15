package NivelIntermediario3;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome= "naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.sharinganAtivado();


        hatake kakashi = new hatake();
        kakashi.nome = "Kakashi";
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.anbu();

    }
}
