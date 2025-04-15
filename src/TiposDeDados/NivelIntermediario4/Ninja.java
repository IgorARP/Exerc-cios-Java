package TiposDeDados.NivelIntermediario4;

import NivelIntermediario3.Ninvelninja;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    Ninvelninja rank;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    //Overload de constructor
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, Ninvelninja rank) {
        this( nome, aldeia, idade);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }
    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é "+nome+ " e esse é minha estratégia de batalha");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é "+nome+ " e esse é minha inteligencia de ocmbate");
    }

    public void habilidadeEspecial(){
        System.out.println("Essa é minha habilidade especial");
    }

    public  void inteligenciaDeCombate(int qi){
        if (qi >= 150){
            System.out.println("Seu QI  é:" + qi + " e você é um gênio");

        } else if (qi >= 130) {
            System.out.println("Seu QI  é:" + qi + " e você é ninja promissor");

        }else {
            System.out.println("Seu QI  é:" + qi + " e você precisa treinar mais");
        }
    }

    public void metodoProvisorio(){
        System.out.println("teste");
    }
}
