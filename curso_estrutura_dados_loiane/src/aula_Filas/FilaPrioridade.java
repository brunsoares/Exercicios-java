package aula_Filas;

public class FilaPrioridade<T> extends Fila<T> {

    @Override
    public void enfileira(T elemento) {

        Comparable<T> elementoComparavel = (Comparable<T>) elemento;
        int i;
        for (i = 0; i < super.getTamanho(); i++) {
            if (elementoComparavel.compareTo(super.elementos[i]) < 0) {
                break;
            }
        }
        super.adiciona(elemento, i);

    }
}
