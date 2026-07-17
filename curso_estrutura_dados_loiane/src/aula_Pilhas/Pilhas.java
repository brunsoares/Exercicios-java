package aula_Pilhas;

import base.EstruturaBase;

public class Pilhas<T> extends EstruturaBase<T> {
    public Pilhas(int capacidade) {
        super(capacidade);
    }

    public Pilhas() {
        super();
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo() {
        if (super.estaVazia()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return super.elementos[super.tamanho - 1];
    }

    public T desempilha() {
        if (super.estaVazia()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        T elemento = super.elementos[super.tamanho - 1];
        super.remove(super.tamanho - 1);
        return elemento;
    }
}
