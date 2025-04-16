package NivelIntermediario3;

public class Uzumaki extends Ninja{
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void habilidadeEspecial (){
        System.out.println("eu sou" + nome + " e essa é minha habilidade especial");
    }
}
