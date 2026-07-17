package aula_Filas;

import base.EstruturaBase;

public class Fila<T> extends EstruturaBase<T> {
    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
        super();
    }

    public void enfileira(T elemento) {
        super.adiciona(elemento);
    }

    public T proximo() {
        if (super.estaVazia()) {
            throw new IllegalStateException("A fila está vazia!");
        }
        return super.elementos[0];
    }

    public T desenfileira() {
        if (super.estaVazia()) {
            throw new IllegalStateException("A fila está vazia!");
        }
        T elemento = super.elementos[0];
        super.remove(0);
        return elemento;
    }

}
