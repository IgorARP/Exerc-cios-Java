package NivelIntermediario3;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto", "Folha",
                16 , 19, Ninvelninja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        System.out.println("------------");

        Uchiha sasuke = new Uchiha("Sasuke", "Folha",
                17, 23, Ninvelninja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();
        sasuke.sharinganAtivado();
        System.out.println("------------");

        hatake kakashi = new hatake("Kakashi", "Folha",
                32, 78, Ninvelninja.JOUNNIN);
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.anbu();
        System.out.println("------------");
    }
}
