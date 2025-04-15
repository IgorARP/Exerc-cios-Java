package TiposDeDados.NivelIntermediario4;

import NivelIntermediario3.Ninvelninja;

public class Uchiha extends Ninja{
    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Eu sou " + nome + " e essa é minha " +
                "habilidade especial e eu ja completei " + numeroDeMissoes + " missoes");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é "+nome+ " e esse é minha inteligencia de ocmbate");
    }

    @Override
    public  void inteligenciaDeCombate(int qi){
        if (qi >= 150){
            System.out.println("Seu QI  é:" + qi + " e você é um gênio");

        } else if (qi >= 130) {
            System.out.println("Seu QI  é:" + qi + " e você é ninja promissor");

        }else {
            System.out.println("Seu QI  é:" + qi + " e você precisa treinar mais");
        }
    }
    @Override
    public void metodoProvisorio(){
        System.out.println("teste classe uchiha");
    }
}

