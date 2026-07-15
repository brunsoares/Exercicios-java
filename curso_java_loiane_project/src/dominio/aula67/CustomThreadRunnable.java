package dominio.aula67;

public class CustomThreadRunnable implements Runnable {
    private String nome;
    private int tempo;

    public CustomThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando a thread Runnable: " + nome + " - Iteração: " + (i + 1));
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
