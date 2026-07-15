package dominio.aula74.ex001;

public class ThreadSemaforo implements Runnable {

    Thread thread;
    CorSemaforo corSemaforo;
    boolean executando = true;
    boolean corMudou = false;

    public ThreadSemaforo(String nome) {
        this.corSemaforo = CorSemaforo.VERMELHO;
        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {
        while (executando) {
            try {
                switch (this.corSemaforo) {
                    case VERMELHO:
                        Thread.sleep(2000);
                        break;
                    case VERDE:
                        Thread.sleep(1000);
                        break;
                    case AMARELO:
                        Thread.sleep(500);
                        break;
                }
                this.mudarCor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void mudarCor() {
        switch (this.corSemaforo) {
            case VERMELHO:
                this.corSemaforo = CorSemaforo.VERDE;
                break;
            case VERDE:
                this.corSemaforo = CorSemaforo.AMARELO;
                break;
            case AMARELO:
                this.corSemaforo = CorSemaforo.VERMELHO;
                break;
        }
        this.corMudou = true;
        notify(); // Notifica que a cor mudou
    }

    public void getCorAtual() {
        System.out.println("Cor do semáforo: " + this.corSemaforo);
    }

    public synchronized void esperarMudancaCor() {
        try {
            while (!this.corMudou) {
                wait();
            }
            this.corMudou = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void pararThread() {
        this.executando = false;
        notify(); // Notifica para sair do wait
    }

}
