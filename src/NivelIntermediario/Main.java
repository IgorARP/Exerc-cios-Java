package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
      //Criar objeto ninja
       Uzumake naruto = new Uzumake();
        naruto.nome = "Naruto";
        naruto.aldeia = "Folha";
        naruto.idade = 17;
        naruto.ModoSabio();

       uchiha Sasuke = new uchiha();
       Sasuke.nome = "Sasuke";
       Sasuke.idade = 19;
       Sasuke.aldeia = "folha";
       Sasuke.ShairnganAtivado();
        int quantotempofalta = Sasuke.anosHokage(70);
        System.out.println(quantotempofalta);

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura";
        Sakura.aldeia = "Folha";
        Sakura.idade = 18;

       Hyuga Hinata = new Hyuga();
       Hinata.nome = "Hinata";
       Hinata.aldeia = "folha";
       Hinata.idade = 18;
       Hinata.biakuya();

       Boruto boruto = new Boruto();
       boruto.nome = "Boruto";
       boruto.aldeia = "folha";
       boruto.idade = 9;
       boruto.ModoSabio();
       boruto.AtivarKarma();
       boruto.AtivarJogan();


    }
}
