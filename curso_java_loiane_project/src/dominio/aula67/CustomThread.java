package dominio.aula67;

public class CustomThread extends Thread {
    private String nome;
    private int tempo;

    public CustomThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando a thread: " + nome + " - Iteração: " + (i + 1));
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
