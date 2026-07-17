package aula_ListaEncadeada;

public class ListaEncadeada<T> {

    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public void adiciona(T elemento, int posicao) {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }

        No<T> novoNo = new No<>(elemento);

        if (posicao == 0) { // Começo da lista
            novoNo.setProximo(this.primeiro);
            this.primeiro = novoNo;
            if (this.tamanho == 0) { // Se a lista estava vazia,
                this.ultimo = novoNo;
            }
        } else if (posicao == this.tamanho) { // Adicionando no final
            this.adiciona(elemento);
        } else { // Adicionando em uma posição
            No<T> atual = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
        }
        this.tamanho++;
    }

    public void pesquisar(T elemento) {
        No<T> atual = this.primeiro;
        while (atual.getProximo() != null) { // Enquanto não for o último
            if (atual.getElemento().equals(elemento)) {
                System.out.println("Elemento encontrado: " + elemento);
                return;
            }
            atual = atual.getProximo(); // atualiza o ponteiro
        }
        System.out.println("Elemento não encontrado: " + elemento);
    }

    public void pesquisar(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            System.out.println("Posição inválida: " + posicao);
            return;
        }
        No<T> atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        System.out.println("Elemento na posição " + posicao + ": " + atual.getElemento());
    }

    public void limpar() {
        // Limpando a lista, deixando todos os nós para coleta de lixo
        for (No<T> atual = this.primeiro; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }

        if (posicao == 0) { // Começo da lista
            this.primeiro = this.primeiro.getProximo();
            if (this.tamanho == 1) { // Se era o único elemento
                this.ultimo = null;
            }
        } else if (posicao == this.tamanho - 1) { // Removendo no final
            No<T> atual = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            atual.setProximo(null);
            this.ultimo = atual;
        } else { // Removendo em uma posição
            No<T> atual = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            atual.setProximo(atual.getProximo().getProximo());
        }
        this.tamanho--;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "Lista encadeada vazia";
        }

        StringBuilder sb = new StringBuilder();
        No<T> atual = this.primeiro;
        while (atual != null) {
            sb.append(atual.getElemento()).append(" -> ");
            atual = atual.getProximo();
        }
        return sb.toString();
    }

}
