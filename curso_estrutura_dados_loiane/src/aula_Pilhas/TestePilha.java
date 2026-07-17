package aula_Pilhas;

public class TestePilha {
    public static void main(String[] args) {
        Pilhas<String> pilha = new Pilhas<String>(3);
        pilha.empilha("Elemento 1");
        pilha.empilha("Elemento 2");
        pilha.empilha("Elemento 3");

        System.out.println("Quantidade de elementos na pilha: " + pilha.getTamanho());
        System.out.println("Pilha: " + pilha);
        System.out.println();

        System.out.println("Elemento no topo da pilha: " + pilha.topo());
        System.out.println();

        System.out.println("Pilhas está vazia? " + pilha.estaVazia());
        System.out.println();

        System.out.println("Desempilhando elementos da pilha:");
        while (!pilha.estaVazia()) {
            System.out.println("Elemento desempilhado: " + pilha.desempilha());
        }
        System.out.println("Pilhas está vazia? " + pilha.estaVazia());
        System.out.println();

    }
}
