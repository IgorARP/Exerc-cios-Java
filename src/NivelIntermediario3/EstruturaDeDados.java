package NivelIntermediario3;

import java.util.*;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Array estaticos
        System.out.println("-------ARRAY--------");
        String [] ninjaArray = new String[4];
        ninjaArray[0] = "Naruto";
        ninjaArray[1] = "Sasuke";
        ninjaArray[2] = "Sakura";
        ninjaArray[3] = "Kakashi";

        System.out.println("NinjaArray: " + ninjaArray);
        System.out.println("NinjaArray: " + ninjaArray[0]);

        System.out.println("---------LISTA-----------");
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto");
        ninjaList.add("Sasuke");
        ninjaList.add("Sakura");
        ninjaList.add("Kakashi");
        System.out.println(ninjaList);

        System.out.println("----------STACK--------");
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        System.out.println("Mostrar Stack = " + ninjaStack);
        System.out.println("Tirar da pilha = " + ninjaStack.pop());
        System.out.println("Mostrar proximo elemento a sair = " + ninjaStack.peek());

        System.out.println("---------QUEUE----------");
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Hinata");
        ninjaQueue.add("Shikamaru");
        System.out.println("Ninjas na fila = " + ninjaQueue);
        ninjaQueue.poll();
        System.out.println("Fila depois do poll " +ninjaQueue );
        System.out.println("Ver o primeiro/HEAD = " + ninjaQueue.peek());

        System.out.println("---------LINKED LIST---------");
        LinkedList<String> ninjaLinkedList = new LinkedList<>();
        ninjaLinkedList.add("Naruto");
        ninjaLinkedList.add("Sasuke");
        ninjaLinkedList.add("Sakura");
        System.out.println(ninjaLinkedList);
        ninjaLinkedList.add(1,"Kakashi");
        System.out.println(ninjaLinkedList);
        ninjaLinkedList.remove(2);
        System.out.println(ninjaLinkedList);
    }
}
