package dominio.aula35;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println("Fatorial de 5: " + fatorial(5));

        System.out.println("Fibonacci na posição 6: " + fibonnaci(10));

        System.out.println("Somatório de 5: " + somatorio(5));
    }

    public static int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }

    // EX001 - Fibonacci
    public static int fibonnaci(int posicao){
        if(posicao == 0){
            return 0;
        } else if(posicao == 1){
            return 1;
        } else {
            return fibonnaci(posicao - 1) + fibonnaci(posicao - 2);
        }
    }

    // EX002 - Somatório
    public static int somatorio(int limite){
        if(limite == 0){
            return 0;
        } else {
            return limite + somatorio(limite - 1);
        }
    }
}
