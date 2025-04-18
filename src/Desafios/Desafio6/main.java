package Desafios.Desafio6;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Ninja> ninjasLista = new LinkedList<Ninja>();
        ninjasLista.add(new Ninja("Naruto", 17, "Folha"));
        ninjasLista.add(new Ninja("Sasuke", 17, "Folha"));
        ninjasLista.add(new Ninja("Sakura", 17, "Folha"));
        ninjasLista.add(new Ninja("Kakashi", 31, "Folha"));
        ninjasLista.add(new Ninja("Gaara", 17, "Areia"));
        ninjasLista.add(new Ninja("Shikamaru", 17, "Konoha"));
        ninjasLista.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("----------------Lista de Ninjas-------------- " );
        //complexidade o(n)
        for(Ninja ninja : ninjasLista){
            System.out.println(ninja);
        }

        ninjasLista.addFirst(new Ninja("Boruto", 10, "Konoha"));
        ninjasLista.removeFirst();

        Ninja terceiroNinja = ninjasLista.get(3);
        System.out.println("\n o terceiro ninja é" + terceiroNinja);
    }
}
