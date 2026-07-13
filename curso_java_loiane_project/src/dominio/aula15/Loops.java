package dominio.aula15;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int contador = 0;
        // While - Checa antes de executar
        while (contador < 10) {
            System.out.println("Contador WHILE: " + contador);
            contador++;
        }

        do {
            System.out.println("Contador DO WHILE: " + contador);
            contador++;
        } while (contador < 10); // Do While - Executa antes de checar

        // For - Inicializa, checa e incrementa
        for (int i = 0; i < 10; i++) {
            System.out.println("Contador FOR: " + i);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número (0 para sair, 5 para não fazer nada): ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break; // Sai do loop se o número for 0
            }
            if (numero == 5) {
                continue; // Pula para a próxima iteração se o número for 5
            }
            System.out.println("Você digitou: " + numero);
        }
        scanner.close();
    }
}
