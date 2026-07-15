package dominio.aula71;

public class TesteSoma {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };

        new ThreadSoma("Thread-1", numeros);
        new ThreadSoma("Thread-2", numeros);
    }
}
