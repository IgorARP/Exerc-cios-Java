package NivelIntermediario3;

public abstract class Ninja implements Estrategia {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    Ninvelninja rank;

    //Metodos Geral! Todos os ninjas vao ter!!
    public void habilidadeEspecial() {
        System.out.println("eu sou um ninja");
    }
    //Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Essa é minha estratégia");
    }
    //Metodo abstrato - obrigatorio em todas as classes que extenderem sua classe
}