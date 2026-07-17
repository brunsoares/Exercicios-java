package aula_Pilhas;

import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");

        System.out.println("Quantidade de elementos na pilha: " + pilha.size());
        System.out.println("Pilha: " + pilha);
        System.out.println();

        System.out.println("Elemento no topo da pilha: " + pilha.peek());
        System.out.println();

        System.out.println("Pilhas está vazia? " + pilha.isEmpty());
        System.out.println();

        System.out.println("Desempilhando elementos da pilha:");
        while (!pilha.isEmpty()) {
            System.out.println("Elemento desempilhado: " + pilha.pop());
        }
        System.out.println("Pilhas está vazia? " + pilha.isEmpty());
        System.out.println();
    }
}
