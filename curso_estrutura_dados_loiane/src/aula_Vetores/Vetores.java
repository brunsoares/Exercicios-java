package aula_Vetores;

import base.EstruturaBase;

public class Vetores<T> extends EstruturaBase<T> {

    public Vetores(int tamanho) {
        super(tamanho);
    }

    public Vetores() {
        super();
    }

    // Ex001 - Método contains
    public boolean contains(T elemento) {
        for (int i = 0; i < super.getTamanho(); i++) {
            if (super.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // EX002 - método lastIndexOf
    public int lastIndexOf(T elemento) {
        for (int i = super.getTamanho() - 1; i >= 0; i--) {
            if (super.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // EX003 - método clear
    public void clear() {
        super.elementos = (T[]) new Object[super.elementos.length];
        super.tamanho = 0;
    }

    public int get(T elemento) {
        for (int i = 0; i < super.getTamanho(); i++) {
            if (super.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public T get(int posicao) {
        if (posicao < 0 || posicao >= super.getTamanho()) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return super.elementos[posicao];
    }

    @Override
    protected void adiciona(T elemento, int posicao) {
        super.adiciona(elemento, posicao);
    }

    @Override
    protected void adiciona(T elemento) {
        super.adiciona(elemento);
    }

    @Override
    protected void remove(int posicao) {
        super.remove(posicao);
    }
}
