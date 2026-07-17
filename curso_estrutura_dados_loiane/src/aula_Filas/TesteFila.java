package aula_Filas;

public class TesteFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>(3);
        fila.enfileira("Elemento 1");
        fila.enfileira("Elemento 2");
        fila.enfileira("Elemento 3");

        System.out.println("Quantidade de elementos na fila: " + fila.getTamanho());
        System.out.println();

        System.out.println("Fila: " + fila.toString());
        System.out.println();

        System.out.println("Próximo elemento da fila: " + fila.proximo());
        System.out.println();

        while (!fila.estaVazia()) {
            System.out.println("Desenfileirando o elemento no início da fila: " + fila.desenfileira());
            System.out.println("Fila: " + fila.toString());
        }
        System.out.println();
    }
}
