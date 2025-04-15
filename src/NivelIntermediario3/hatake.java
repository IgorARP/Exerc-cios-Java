package NivelIntermediario3;

public class hatake extends Ninja implements Sharingan, Anbu{
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
