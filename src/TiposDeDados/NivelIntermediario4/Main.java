package TiposDeDados.NivelIntermediario4;

import NivelIntermediario3.Ninvelninja;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto", "Folha", 18);
        naruto.habilidadeEspecial();
        System.out.println(naruto);

       Uchiha sasuke = new Uchiha( "sasuke", "folha", 18, 2, Ninvelninja.GENIN);
       sasuke.habilidadeEspecial();
       sasuke.estrategiaDeBatalha();
        System.out.println(sasuke);

       Uchiha madara = new Uchiha("MAdara" , "folha", 23, 900, Ninvelninja.KAGE);
       madara.habilidadeEspecial();
       madara.inteligenciaDeCombate();
       madara.inteligenciaDeCombate(150);
       madara.metodoProvisorio();
        System.out.println(madara);

    }
}
