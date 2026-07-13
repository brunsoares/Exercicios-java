package dominio.aula20;

import java.util.Scanner;

public class MatrizesEX001 {
    // EX001 - Determine o maior valor da matriz e sua posição
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // for(int i=0; i < matriz.length; i++) {
        //     for(int j=0; j < matriz[i].length; j++) {
        //         matriz[i][j] = (int) Math.round(Math.random() * 9);
        //     }
        // }

        // System.out.println("Matriz: ");
        // for(int i=0; i < matriz.length; i++) {
        //     for(int j=0; j < matriz[i].length; j++) {
        //         System.out.print(matriz[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // int maior = matriz[0][0];
        // int linha = 0;
        // int coluna = 0;
        // for(int i=0; i < matriz.length; i++) {
        //     for(int j=0; j < matriz[i].length; j++) {
        //         if(matriz[i][j] > maior) {
        //             maior = matriz[i][j];
        //             linha = i;
        //             coluna = j;
        //         }
        //     }
        // }
        // System.out.println("Maior valor: " + maior);
        // System.out.println("Posição: [" + linha + "][" + coluna + "]");
        
        // EX002 - Jogo da velha - 2 jogadores
        String[][] tabuleiro = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        boolean isPlayValid = false;
        int player = 1;
    
        System.out.println("Jogo da velha - 2 jogadores\n");
        System.out.println("Jogador 1: X | Jogador 2: O\n");
        atualizaTabuleiro(tabuleiro);

        while(!isFinished) {
            System.out.println("Vez do jogador " + player);
            System.out.println("Digite a linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.println("Digite a coluna (0-2): ");
            int coluna = scanner.nextInt();
            isPlayValid = validPlay(tabuleiro, linha, coluna);
            if(isPlayValid){
                tabuleiro[linha][coluna] = player == 1 ? "X" : "O";
                atualizaTabuleiro(tabuleiro);
                isFinished = checkWinner(tabuleiro);
                if(isFinished) {
                    System.out.println("Jogador " + player + " venceu!");
                } else if(checkDraw(tabuleiro)) {
                    System.out.println("O jogo empatou!");
                    isFinished = true;
                } else {
                    player = player == 1 ? 2 : 1;
                }
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
    }

    private static void atualizaTabuleiro(String[][] tabuleiro) {
        for(int i=0; i < tabuleiro.length; i++) {
            for(int j=0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j] == null) {
                    tabuleiro[i][j] = " ";
                }
                if(j == 2) {
                    System.out.print(tabuleiro[i][j]);
                } else {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
            }
            if(i < 2) {
                System.out.println("\n---------");
            } else {
                System.out.println();
            }
        }
    }

    private static boolean validPlay(String[][] tabuleiro, int linha, int coluna) {
        if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            return false;
        }
        if(!tabuleiro[linha][coluna].equals(" ")) {
            return false;
        }
        return true;
    }

    private static boolean checkWinner(String[][] tabuleiro) {
        // Check linhas
        for(int i=0; i < tabuleiro.length; i++) {
            if(tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][1].equals(tabuleiro[i][2]) && !tabuleiro[i][0].equals(" ")) {
                return true;
            }
        }
        // Check colunas
        for(int j=0; j < tabuleiro[0].length; j++) {
            if(tabuleiro[0][j].equals(tabuleiro[1][j]) && tabuleiro[1][j].equals(tabuleiro[2][j]) && !tabuleiro[0][j].equals(" ")) {
                return true;
            }
        }
        // Check diagonal
        if(tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2]) && !tabuleiro[0][0].equals(" ")) {
            return true;
        }
        if(tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][0]) && !tabuleiro[0][2].equals(" ")) {
            return true;
        }
        return false;
    }

    private static boolean checkDraw(String[][] tabuleiro) {
        for(int i=0; i < tabuleiro.length; i++) {
            for(int j=0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}
