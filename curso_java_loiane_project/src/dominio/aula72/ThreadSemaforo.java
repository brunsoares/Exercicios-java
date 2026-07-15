package dominio.aula72;

public class ThreadSemaforo implements Runnable {
    Semaforo semaforo;
    Thread thread;
    final int LOOP = 5;

    public ThreadSemaforo(Semaforo semaforo, String nome) {
        this.semaforo = semaforo;
        this.thread = new Thread(this, nome);
        this.thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().equalsIgnoreCase("T_Verde")) {
            for (int i = 0; i < LOOP; i++) {
                semaforo.acionar(true);
            }
            semaforo.acionar(false);
        } else {
            for (int i = 0; i < LOOP; i++) {
                semaforo.parar(true);
            }
            semaforo.parar(false);
        }
    }

}
