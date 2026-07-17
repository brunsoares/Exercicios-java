package aula_ListaEncadeada;

import java.util.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.addFirst("Elemento 0");
        lista.addLast("Elemento 4");

        System.out.println("Quantidade de elementos na lista: " + lista.size());
        System.out.println();

        System.out.println("Lista: " + lista.toString());
        System.out.println();

        System.out.println("Primeiro elemento da lista: " + lista.getFirst());
        System.out.println("Último elemento da lista: " + lista.getLast());
        System.out.println();

        System.out.println("Removendo o primeiro elemento da lista: " + lista.removeFirst());
        System.out.println("Removendo o último elemento da lista: " + lista.removeLast());
        System.out.println("Removendo o elemento 'Elemento 2' da lista: " + lista.remove("Elemento 2"));
        System.out.println("Lista após remoções: " + lista.toString());
        System.out.println();

        System.out.println("Verificando se a lista contém 'Elemento 3': " + lista.contains("Elemento 3"));
        System.out.println("Verificando se a lista contém 'Elemento 5': " + lista.contains("Elemento 5"));
        System.out.println();

    }
}
