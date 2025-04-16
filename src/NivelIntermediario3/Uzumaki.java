package NivelIntermediario3;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial (){
        System.out.println("eu sou" + nome + " e essa é minha habilidade especial");
    }
}
