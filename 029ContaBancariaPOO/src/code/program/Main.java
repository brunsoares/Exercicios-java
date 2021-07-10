/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.program;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();     //Adicionando objeto
        
        //Criando um menu de interação
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----Banco----");
        System.out.println("Menu de Opções\n"
                + "1) Abrir Conta\n"
                + "2) Fechar Conta\n"
                + "3) Depositar valor\n"
                + "4) Sacar valor\n"
                + "5) Dados da Conta\n"
                + "6) Sair do programa");
        
        
        //Colocando cada opção juntamente com os metodos da classe, com loop
        boolean continuar = true;
        while (continuar){
            System.out.println("O que você deseja?");
            int valMenu = sc.nextInt();
            switch(valMenu){
                case 1:
                    cb.abrirConta();
                    break;
                case 2:
                    cb.fecharConta();
                    break;
                case 3:
                    cb.depositarConta();
                    break;
                case 4:
                    cb.sacarConta();
                    break;
                case 5:
                    cb.dadosConta();
                    break;
            }
            if(valMenu > 5 || valMenu <= 0){
                System.out.println("Saindo do programa");
                continuar = false;
            }
        }
        }
    }
