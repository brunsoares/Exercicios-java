package aula_Filas;

public class TesteFilaPrioridade {
    public static void main(String[] args) {
        FilaPrioridade<Prioridade> filaPrioridade = new FilaPrioridade<Prioridade>();
        filaPrioridade.enfileira(new Prioridade("Elemento 1", 4));
        filaPrioridade.enfileira(new Prioridade("Elemento 3", 2));
        filaPrioridade.enfileira(new Prioridade("Elemento 4", 1));
        filaPrioridade.enfileira(new Prioridade("Elemento 2", 3));

        System.out.println("Quantidade de elementos na fila de prioridade: " + filaPrioridade.getTamanho());
        System.out.println();

        System.out.println("Fila de Prioridade: " + filaPrioridade.toString());
        System.out.println();

        System.out.println("Próximo elemento da fila de prioridade: " + filaPrioridade.proximo());
        System.out.println();

        while (!filaPrioridade.estaVazia()) {
            System.out.println(
                    "Desenfileirando o elemento no início da fila de prioridade: " + filaPrioridade.desenfileira());
            System.out.println("Fila de Prioridade: " + filaPrioridade.toString());
        }
        System.out.println();
    }
}
