package aula_Vetores;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetores<T> {
    private T[] elementos;
    private int tamanho;

    public Vetores(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.tamanho = 0;
    }

    public void adicionaNaoOtimizado(T elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public void adiciona(T elemento) {
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

    public void adiciona(T elemento, int posicao) {
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

    public void aumentaCapacidade() {
        if (this.tamanho < this.elementos.length) {
            return;
        }
        int novaCapacidade = this.elementos.length * 2;
        this.elementos = Arrays.copyOf(this.elementos, novaCapacidade);
    }

    public void remove(int posicao) {
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

    // Ex001 - Método contains
    public boolean contains(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // EX002 - método lastIndexOf
    public int lastIndexOf(T elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // EX003 - método clear
    public void clear() {
        this.elementos = (T[]) new Object[this.elementos.length];
        this.tamanho = 0;
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

    public T get(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            System.out.println("Posição inválida! O vetor possui " + this.tamanho + " elementos.");
            // throw new IllegalArgumentException("Posição inválida!");
            return null;
        }
        return this.elementos[posicao];
    }

    public int get(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int getTamanho() {
        return tamanho;
    }
}
