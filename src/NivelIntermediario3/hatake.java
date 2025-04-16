package NivelIntermediario3;

public class hatake extends Ninja implements Sharingan, Anbu{
    public hatake(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    public void boasVindas(){
        System.out.println(nome + " eu sou um hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }

    @Override
    public void anbu() {
        System.out.println("Participei da Anbu");
    }
}
