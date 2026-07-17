package aula_Pilhas;

import java.util.Stack;

public class ExPilhas {
    public static void main(String[] args) {
        testePalindromo("AABCCBAA");
        testePalindromo("AABCCBA");
        System.out.println("-----------------------------------");
        Stack<Integer> torreA = criaTesteHanoi(5);
        Stack<Integer> torreB = new Stack<>();
        Stack<Integer> torreC = new Stack<>();
        hanoi(5, torreA, torreC, torreB);

    }

    private static void testePalindromo(String palavra) {
        Stack<String> pilhaPalindromoFirst = new Stack<>();
        Stack<String> pilhaPalindromoLast = new Stack<>();
        int metade = Math.abs(palavra.length() / 2);
        for (int i = 0; i < palavra.length(); i++) {
            if (i < metade) {
                pilhaPalindromoFirst.push(String.valueOf(palavra.charAt(i)));
            } else {
                if (metade % 2 == 1 && i == metade) {
                    continue;
                }
                pilhaPalindromoLast.push(String.valueOf(palavra.charAt(i)));
            }
        }
        pilhaPalindromoFirst.sort((a, b) -> a.compareTo(b));
        pilhaPalindromoLast.sort((a, b) -> a.compareTo(b));
        System.out.println("Primeira pilha: " + pilhaPalindromoFirst);
        System.out.println("Segunda pilha: " + pilhaPalindromoLast);

        for (int i = 0; i < pilhaPalindromoFirst.size(); i++) {
            if (!pilhaPalindromoFirst.get(i).equals(pilhaPalindromoLast.get(i))) {
                System.out.println("A palavra " + palavra + " não é um palíndromo.");
                return;
            }
        }
        System.out.println("A palavra " + palavra + " é um palíndromo.");
    }

    private static Stack<Integer> criaTesteHanoi(int tamanho) {
        Stack<Integer> torreA = new Stack<>();
        for (int i = tamanho; i >= 1; i--) {
            torreA.push(i);
        }
        return torreA;
    }

    private static void hanoi(int n, Stack<Integer> origem, Stack<Integer> destino, Stack<Integer> auxiliar) {
        if (n > 0) {
            hanoi(n - 1, origem, auxiliar, destino);
            destino.push(origem.pop());
            System.out.println("Movendo disco " + n + " da torre " + origem + " para a torre " + destino);
            hanoi(n - 1, auxiliar, destino, origem);
            System.out.println("Estado atual das torres: ");
            System.out.println("Torre A: " + origem);
            System.out.println("Torre B: " + auxiliar);
            System.out.println("Torre C: " + destino);
            System.out.println();
        }
    }
}
