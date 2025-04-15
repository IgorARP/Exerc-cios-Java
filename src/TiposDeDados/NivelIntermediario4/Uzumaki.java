package TiposDeDados.NivelIntermediario4;

import NivelIntermediario3.Ninvelninja;

public class Uzumaki extends Ninja  {
    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Eu sou um uzumaki e essa é minha habilidade especial");
    }
}
