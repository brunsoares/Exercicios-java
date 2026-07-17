package aula_ListaEncadeada;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("Elemento 1");
        lista.adiciona("Elemento 2");
        lista.adiciona("Elemento 3");

        System.out.println("Lista encadeada: " + lista.toString());
        System.out.println("Quantidade de elementos na lista encadeada: " + lista.getTamanho());
        System.out.println();

        System.out.println("Pesquisando o elemento 'Elemento 2' na lista encadeada:");
        lista.pesquisar("Elemento 2");
        System.out.println();
        System.out.println("Pesquisando o elemento 'Elemento 4' na lista encadeada:");
        lista.pesquisar("Elemento 4");
        System.out.println();
        System.out.println("Pesquisando o elemento na posição 1 na lista encadeada:");
        lista.pesquisar(1);
        System.out.println();
        System.out.println("Pesquisando o elemento na posição 5 na lista encadeada:");
        lista.pesquisar(5);
        System.out.println();

        System.out.println("Limpando a lista encadeada...");
        lista.limpar();
        System.out.println("Lista encadeada após a limpeza: " + lista.toString());

        lista.adiciona("Elemento 1");
        lista.adiciona("Elemento 2");
        lista.adiciona("Elemento 3");
        System.out.println("Adicionando elementos novamente na lista encadeada:");
        lista.adiciona("Elemento 4", 0); // Começo da lista
        lista.adiciona("Elemento 5", 3); // Meio da lista
        lista.adiciona("Elemento 6", 5); // Final da lista
        System.out.println("Lista encadeada: " + lista.toString());

        System.out.println("Removendo o elemento na posição 0 (primeiro elemento):");
        lista.remover(0);
        System.out.println("Lista encadeada: " + lista.toString());

        System.out.println("Removendo o elemento na posição 2 (meio da lista):");
        lista.remover(2);
        System.out.println("Lista encadeada: " + lista.toString());

        System.out.println("Removendo o elemento na posição 3 (último elemento):");
        lista.remover(3);
        System.out.println("Lista encadeada: " + lista.toString());

        System.out.println("Removendo o elemento na posição 0 (primeiro elemento):");
        lista.remover(0);
        System.out.println("Lista encadeada: " + lista.toString());

        System.out.println("Removendo o elemento na posição 0 (último elemento):");
        lista.remover(1);
        System.out.println("Lista encadeada: " + lista.toString());

        System.out.println("Removendo o elemento na posição 0 (primeiro/último elemento):");
        lista.remover(0);
        System.out.println("Lista encadeada: " + lista.toString());
    }
}
