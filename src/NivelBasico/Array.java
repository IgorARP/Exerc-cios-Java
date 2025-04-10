package NivelBasico;

public class Array {
    public static void main(String[] args) {
        /*Arrays são tipos referencia, não é flexível
        Quando inicia um array com new voce lida com um objeto de memória
        Toda array que inicializa com uma string e não tem valor ele devolve null
        toda array qye inicializa com int e não tem valor ele devolve 0, double devolve 0.0
        toda array qye inicializa com boolean e não tem valor devolve false
         */

        String[] nome = new String[6];
        nome[0] = "igor";
        nome[1] = "joao";
        nome[2] = "cleber";
        nome[3] = "jonas";
        nome[4] = "julio";

        System.out.println(nome[5]);

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        boolean[] verdadeiroOuFalso = new boolean[2];
        verdadeiroOuFalso[0] = true;
        System.out.println(verdadeiroOuFalso[1]);

        double[] numeroQuebrado = new double[2];
        numeroQuebrado[0] = 2.45;
        System.out.println(numeroQuebrado[1]);

        /*Redeclara ARRAY
        Quando redeclara um array você sobreescreve o espaço da memoria do antigo array
        jogando o antigo fora com o garbage collector
         */
        nome = new String[7];
        nome[0] = "Hashirama";
        nome[1] = "Tobirama";
        nome[2] = "Hiruzen";
        nome[3] = "Minato";
        nome[4] = "Tsunade";
        nome[5] = "Kakashi";
        nome[6] = "Naruto";
        System.out.println(nome[2]);

        //for para fazer um loop no array

        for (int i = 0; i <7 ; i++) {
            System.out.println(nome[i]);

        }
    }
}
