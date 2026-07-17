package aula_Filas;

public class Prioridade implements Comparable<Prioridade> {
    private String nome;
    private int prioridade;

    public Prioridade(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Prioridade o) {
        if (this.prioridade < o.prioridade) {
            return -1;
        } else if (this.prioridade > o.prioridade) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "nome='" + nome;
    }

    @Override
    public boolean equals(Object obj) {
        Prioridade other = (Prioridade) obj;
        return !nome.equals(other.nome);
    }
}
