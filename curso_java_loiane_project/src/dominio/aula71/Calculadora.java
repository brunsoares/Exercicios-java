package dominio.aula71;

public class Calculadora {

    private int soma;

    // synchronized -> garante que apenas uma thread por vez pode acessar o método
    // somar
    public synchronized int somar(int[] nums) {
        soma = 0;
        for (int num : nums) {
            soma += num;
            System.out.println("Total parcial de " + Thread.currentThread().getName() + " é: " + soma);
            try {
                Thread.sleep(1000); // Simula um atraso na execução
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
