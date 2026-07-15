package dominio.aula74.ex001;

public class TesteSemaforo {
    public static void main(String[] args) {
        ThreadSemaforo tSemaforo1 = new ThreadSemaforo("ThreadSemaforo");

        for (int i = 0; i < 10; i++) {
            tSemaforo1.getCorAtual();
            tSemaforo1.esperarMudancaCor();
        }

        tSemaforo1.pararThread(); // Para a execução da thread
    }
}
