package dominio.aula20;

import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        // Matriz - Linhas x Colunas
        double[][] matrizAluno = new double[10][4];
        
        for (int i = 0; i < matrizAluno.length; i++) {
            for (int j = 0; j < matrizAluno[i].length; j++) {
                matrizAluno[i][j] = Math.round(Math.random() * 10);
            }
        }

        for (int i = 0; i < matrizAluno.length; i++) {
            for (int j = 0; j < matrizAluno[i].length; j++) {
                System.out.print("Nota do aluno " + (i+1) + ": " + matrizAluno[i][j] + " || ");
            }
            System.out.println("\n-------------");
        }

        // Matriz com 3 dimensões
        int[][][] matriz3d = new int[3][3][3];

        for (int i = 0; i < matriz3d.length; i++) {
            for (int j = 0; j < matriz3d[i].length; j++) {
                for (int k = 0; k < matriz3d[i][j].length; k++) {
                    matriz3d[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i < matriz3d.length; i++) {
            for (int j = 0; j < matriz3d[i].length; j++) {
                for (int k = 0; k < matriz3d[i][j].length; k++) {
                    soma += matriz3d[i][j][k];
                    if (matriz3d[i][j][k] % 2 == 0) {
                        somaPar += matriz3d[i][j][k];
                    } else {
                        somaImpar += matriz3d[i][j][k];
                    }
                }
            }
            System.out.println("Soma da camada " + i + ": " + soma);
            System.out.println("Soma dos pares: " + somaPar);
            System.out.println("Soma dos ímpares: " + somaImpar);
            System.out.println("\n----------");
        }

        // Matriz irregulares - Coluna fixa x Linhas variáveis
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de entrevistados: ");
        int numEntrevistados = scanner.nextInt();
        String [][] nomeFilhos = new String[numEntrevistados][];

        for(int i=0; i < nomeFilhos.length; i++) {
            System.out.println("Digite o número de filhos do entrevistado " + (i+1) + ": ");
            int numFilhos = scanner.nextInt();
            nomeFilhos[i] = new String[numFilhos];
            for(int j=0; j < nomeFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " + (j+1) + " do entrevistado " + (i+1) + ": ");
                nomeFilhos[i][j] = scanner.next();
            }
        }
        scanner.close();

        for(int i=0; i < nomeFilhos.length; i++) {
            System.out.println("Entrevistado " + (i+1) + " tem " + nomeFilhos[i].length + " filhos.");
            for(int j=0; j < nomeFilhos[i].length; j++) {
                System.out.println("Nome do filho " + (j+1) + ": " + nomeFilhos[i][j]);
            }
            System.out.println("\n----------");
        }
    }
}
