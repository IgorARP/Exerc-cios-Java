package condicoes;

public class Ternarios {
    public static void main(String[] args) {
        //ternario sao maneiras de reduzir o código
        short numero = 11;
        String nivel = (numero >= 10) ? "Esse está com mais de 10 missoes" : "Tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
