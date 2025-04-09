package condicoes;

public class ifElse {
    public static void main(String[] args) {

        String nome = "naruto";
        String rank;
        int idade = 18;
        boolean hokage = false;
        short numeroDeMissoes = 15;

        if (numeroDeMissoes >= 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: gennin");
        }
    }
}
