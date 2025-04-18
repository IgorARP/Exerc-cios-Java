package NivelIntermediario5List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array
        //São estaticos, não alteram de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Arrary " + ninjasArray[0]);
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);

        }

        //Listas
        //Não são estaticas, elas podem aumentar e diminuir

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        //Add na lista
        ninjasList.add("Kakashi hatake");
        System.out.println(ninjasList);

        //Remover da Lista
        ninjasList.remove("Kakashi hatake");
        System.out.println(ninjasList);

        //Trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println(ninjasList);

        //Ver tamanho da lista
        System.out.println(ninjasList.size());
    }
}
