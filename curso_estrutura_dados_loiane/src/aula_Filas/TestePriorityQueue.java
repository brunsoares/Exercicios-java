package aula_Filas;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {
    public static void main(String[] args) {
        Queue<Prioridade> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Prioridade("Elemento 1", 5));
        priorityQueue.add(new Prioridade("Elemento 2", 2));
        priorityQueue.add(new Prioridade("Elemento 3", 8));

        System.out.println("Quantidade de elementos na fila de prioridade: " + priorityQueue.size());
        System.out.println();

        System.out.println("Fila de prioridade: " + priorityQueue.toString());
        System.out.println();

        System.out.println("Próximo elemento da fila de prioridade: " + priorityQueue.peek());
        System.out.println();

        while (!priorityQueue.isEmpty()) {
            System.out.println("Desenfileirando o elemento com maior prioridade: " + priorityQueue.poll());
            System.out.println("Fila de prioridade: " + priorityQueue.toString());
        }
        System.out.println();
    }
}
