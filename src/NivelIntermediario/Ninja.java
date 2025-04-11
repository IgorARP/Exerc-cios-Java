package NivelIntermediario;

public class Ninja {
    //Classe é igual ao molde, do molde a gente constroi os objetos
    String nome;
    String aldeia;
    int idade;
    /*
    O metodo void nao retorna valor public quer dizer que você criou um metodo publico void
    quer dizer que ele não retorna nada
     */
    public String nomeNinja (){
        return "Meu nome é";
    }
    public int anosHokage(int idadeMinima){
        return idadeMinima - idade;
    }
    //metodo geral todos vao ter
    public void habilidadeEspecial (){
        System.out.println("meu nome é " + nome + "e esse é meu ataque especial");
    }
}
