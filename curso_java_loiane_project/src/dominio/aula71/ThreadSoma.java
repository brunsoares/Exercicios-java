package dominio.aula71;

public class ThreadSoma implements Runnable {

    private String nome;
    private int[] numeros;
    private static Calculadora calculadora = new Calculadora();

    public ThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + nome);
        int soma = calculadora.somar(numeros);
        System.out.println("Soma de " + nome + " é: " + soma);
        System.out.println("Thread " + nome + " finalizada.");
    }

}
