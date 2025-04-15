package NivelIntermediario3;

public class Uchiha extends Ninja implements Sharingan{

    @Override
    public void habilidadeEspecial(){
        System.out.println("meu nome é" + nome + " e esse é meu ataque");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado");
    }
}
