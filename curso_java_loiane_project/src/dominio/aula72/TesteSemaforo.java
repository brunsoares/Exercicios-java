package dominio.aula72;

public class TesteSemaforo {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        ThreadSemaforo thread1 = new ThreadSemaforo(semaforo, "T_Verde");
        ThreadSemaforo thread2 = new ThreadSemaforo(semaforo, "T_Vermelho");

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
