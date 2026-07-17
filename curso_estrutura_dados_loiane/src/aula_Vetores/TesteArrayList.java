package aula_Vetores;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        System.out.println("Quantidade de elementos no ArrayList: " + arrayList.size());
        System.out.println();

        System.out.println("ArrayList: " + arrayList.toString());
        System.out.println();

        arrayList.remove(1);
        System.out.println("ArrayList após remover o elemento na posição 1: " + arrayList.toString());
        System.out.println();

        System.out.println("Elemento na posição 0: " + arrayList.get(0));
        System.out.println("Elemento na posição 1: " + arrayList.get(1));
        System.out.println();

        arrayList.add(1, "Elemento 5");
        System.out.println("ArrayList após adicionar 'Elemento 5' na posição 1: " + arrayList.toString());
        System.out.println();
    }
}
