package NivelIntermedario7;

public class main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 999999);
        System.out.println("Cadastro: "+ cadastro.getNome() );

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 1111111);
        System.out.println(cadastroRecord.emailcaixaalta());
        System.out.println(cadastroRecord);

    }
}
