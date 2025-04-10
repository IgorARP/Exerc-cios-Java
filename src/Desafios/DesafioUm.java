package Desafios;

public class DesafioUm {
    public static void main(String[] args) {

        //Ninja 1
        String nomeNinja1 = "naruto";
        int idadeNinja1 = 13;
        String missao1 = "missao1";
        char nivelDificuldade1 = 'A';
        String statusMissao1 = "missao concluida";
        if (idadeNinja1 < 15)
        {   if (nivelDificuldade1 == 'C' || nivelDificuldade1 == 'D'){
           statusMissao1 = "missao concluida";
        }else
            statusMissao1 = "missão NÃO concluida, você não tem idade suficiente para essa missão";

        }else
            statusMissao1 = "missao CONCLUIDA";
        System.out.println(statusMissao1);
        //ninja 2
        String nomeNinja2 = "Sasuke";
        int idadeNinja2 = 17;
        String missao2 = "missao1";


        //Ninja 3
        String nomeNinja3 = "Hinata";
        int idadeNinja3 = 19;
        String missao3 = "missao1";


    }
}
