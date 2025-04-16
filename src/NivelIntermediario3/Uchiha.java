package NivelIntermediario3;

public class Uchiha extends Ninja implements Sharingan{

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("meu nome é" + nome + " e esse é meu ataque");
    }

    /*
    Metodo:
    Implementa da interface Sharingan
     */
    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado");
    }
}
