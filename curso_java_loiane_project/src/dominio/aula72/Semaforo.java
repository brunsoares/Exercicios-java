package dominio.aula72;

public class Semaforo {
    boolean verde;

    synchronized void acionar(boolean executando) {
        if (!executando) {
            verde = true;
            notify(); // Libera a thread que está aguardando
            return;
        }

        System.out.println("Semáforo aguardando - Verde");

        verde = true;
        notify(); // Libera a thread que está aguardando

        // Wait - aguarda até que o semáforo seja liberado
        while (verde) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    synchronized void parar(boolean executando) {
        if (!executando) {
            verde = false;
            notify(); // Libera a thread que está aguardando
            return;
        }

        System.out.println("Semáforo aguardando - Vermelho");

        verde = false;
        notify(); // Libera a thread que está aguardando

        // Wait - aguarda até que o semáforo seja liberado
        while (!verde) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
