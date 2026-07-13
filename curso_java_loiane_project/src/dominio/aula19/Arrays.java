package dominio.aula19;

public class Arrays {
    public static void main(String[] args) {
        // Criando um array de inteiros com 5 elementos - FIXO
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i: numeros) {
            System.out.println("Número: " + i);
        }
    }
}
