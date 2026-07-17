package aula_Filas;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Elemento 1");
        queue.add("Elemento 2");
        queue.add("Elemento 3");

        System.out.println("Quantidade de elementos na fila: " + queue.size());
        System.out.println();

        System.out.println("Fila: " + queue.toString());
        System.out.println();

        System.out.println("Próximo elemento da fila: " + queue.peek());
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.println("Desenfileirando o elemento no início da fila: " + queue.poll());
            System.out.println("Fila: " + queue.toString());
        }
        System.out.println();
    }
}
