package base;

import java.util.Arrays;

public abstract class EstruturaBase<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaBase(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaBase() {
        this(10);
    }

    protected void adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            System.out.println("Vetor cheio! Não é possível adicionar mais elementos.");
            // throw new ArrayIndexOutOfBoundsException("Vetor cheio! Não é possível
            // adicionar mais elementos.");
        }
    }

    protected void adiciona(T elemento, int posicao) {
        this.aumentaCapacidade();
        if (posicao < 0 || posicao > this.tamanho) {
            System.out.println("Posição inválida! O vetor possui " + this.tamanho + " elementos.");
            // throw new IllegalArgumentException("Posição inválida!");
            return;
        }

        if (this.tamanho >= this.elementos.length) {
            System.out.println("Vetor cheio! Não é possível adicionar mais elementos.");
            // throw new ArrayIndexOutOfBoundsException("Vetor cheio! Não é possível
            // adicionar mais elementos.");
            return;
        }

        for (int i = this.tamanho; i > posicao; i--) {
            this.elementos[i] = this.elementos[i - 1];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    protected void remove(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            System.out.println("Posição inválida! O vetor possui " + this.tamanho + " elementos.");
            // throw new IllegalArgumentException("Posição inválida!");
            return;
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho < this.elementos.length) {
            return;
        }
        int novaCapacidade = this.elementos.length * 2;
        this.elementos = Arrays.copyOf(this.elementos, novaCapacidade);
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.elementos[i]);
            if (i < this.tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
