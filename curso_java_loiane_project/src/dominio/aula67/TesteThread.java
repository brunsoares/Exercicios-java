package dominio.aula67;

public class TesteThread {
    public static void main(String[] args) {
        // Threads customizadas
        CustomThread thread1 = new CustomThread("Thread 1", 500);
        CustomThread thread2 = new CustomThread("Thread 2", 1000);
        CustomThread thread3 = new CustomThread("Thread 3", 1500);

        // Threads customizadas com Runnable
        CustomThreadRunnable runnable1 = new CustomThreadRunnable("Runnable 1", 500);
        CustomThreadRunnable runnable2 = new CustomThreadRunnable("Runnable 2", 1000);
        CustomThreadRunnable runnable3 = new CustomThreadRunnable("Runnable 3", 1500);
    }
}
