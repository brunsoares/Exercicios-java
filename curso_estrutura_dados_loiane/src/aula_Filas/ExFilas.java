package aula_Filas;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExFilas {
    public static void main(String[] args) {
        filaImpressao();
        System.out.println("-----------------------------------");
        batataQuente();
    }

    private static void filaImpressao() {
        Queue<Prioridade> fila = new LinkedList<>();
        fila.add(new Prioridade("Documento 1", 2));
        fila.add(new Prioridade("Documento 2", 1));
        fila.add(new Prioridade("Documento 3", 3));

        System.out.println("Quantidade de elementos na fila: " + fila.size());
        System.out.println("Fila: " + fila.toString());

        while (!fila.isEmpty()) {
            System.out.println("Desenfileirando o elemento com maior prioridade: " + fila.poll());
            System.out.println("Fila: " + fila.toString());
        }
    }

    private static void batataQuente() {
        Queue<Integer> fila = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            fila.add(i);
        }

        System.out.println("Quantidade de jogadores na fila: " + fila.size());
        System.out.println("Fila: " + fila.toString());
        System.out.println();

        while (!(fila.size() == 1)) {
            int random = (int) (Math.random() * 5);
            System.out.println("Batata quente ficou com o jogador: " + random);
            boolean saiu = fila.remove(random);
            if (saiu) {
                System.out.println("Desenfileirando o jogador: " + random);
                System.out.println("Fila: " + fila.toString());
            } else {
                System.out.println("O jogador " + random + " não está na fila.");
            }

        }
        System.out.println("O jogador vencedor é: " + fila.peek());

    }
}
