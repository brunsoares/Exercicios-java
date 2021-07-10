/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.program;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ContaBancaria {
    //Valores simulando uma conta bancaria
    String numCont;
    String tipoCont;
    String nomePess;
    float saldo;
    String status = "Fechado";
    
    //Criando objeto para interagir nos metodos com o usuario
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    //Metodos para a conta bancaria
    public void abrirConta(){
        if(this.status == "Fechado"){
            System.out.println("Escolha => ABRIR CONTA");
            System.out.print("Digite seu nome por favor: ");
            this.nomePess = sc.nextLine();  //Pegando nome da pessoa
            System.out.println("Qual tipo de conta você deseja?");
            System.out.println("1- Conta Poupança / 2- Conta Corrente");
            int dec = sc.nextInt();
            if(dec == 1){
                System.out.println("Opção escolhida => (1) Conta Poupança");
                this.tipoCont = "Conta Poupança";
            }else if(dec == 2){
                System.out.println("Opção escolhida => (2) Contra Corrente");
                this.tipoCont = "Conta Corrente";
            }else{
                System.out.println("Valor inválido, por favor selecione um correto!");
            }
            System.out.println("Seu saldo está zerado, deseja adicionar algum valor [1/0]: ");
            System.out.println("1- Adicionar / 0- Cancelar deposito");
            int decSald = sc.nextInt();
            if(decSald == 1){
                System.out.println("Digite um valor a ser adicionado: ");
                this.saldo = sc.nextFloat();
            }
            this.status = "Aberto";
            this.numCont = Integer.toString(rd.nextInt(100));

            //Vendo os dados da conta
            dadosConta();
        }else{
            System.out.println("Sua conta já está aberta, segue os dados dela:");
            dadosConta();
        }
    }
    
    //Metodo Fechar conta
    public void fecharConta(){
        if(this.status == "Aberto"){    //Apenas se tiver aberto
            System.out.println("Escolha => FECHAR CONTA");
            System.out.println("Sua conta Atualmente está aberta, deseja fechar?\n"
                    + "1- Fechar a conta / 0- Cancelar Fechamento");
            System.out.println("Para fechar digite a seguir [1/0]: ");
            int dec = sc.nextInt();
            if(dec == 1){
                System.out.println("Ok, sua contá está fechada atualmente, tenha um bom dia!");
                this.status = "Fechado";
            }
        }else{
            System.out.println("Atualmente sua conta está fechada ou não foi criada, por favor abra uma conta");
        }
    }
    
    //Metodo de deposito
    public void depositarConta(){
        if(this.status == "Aberto"){
            System.out.println("Escolha => DEPOSITAR VALOR");
            System.out.println("Seu saldo atual é de R$"+Float.toString(this.saldo));
            System.out.println("Deseja depositar qual valor?");
            float val = sc.nextFloat();
            if(val != 0){
                System.out.println("Ok, o valor de R$"+val+" Será adicionado a sua conta");
                this.saldo += val;
                System.out.println("Seu saldo atual é de R$"+this.saldo);
            }else{
                System.out.println("Cancelando Deposito, valor zerado!");
            }
        }else{
            System.out.println("Atualmente sua conta está fechada ou não foi criada, por favor abra uma conta");
        }
    }
    
    //Metodo sacar
    public void sacarConta(){
        if(this.status == "Aberto"){
            System.out.println("Escolha => SACAR VALOR");
            System.out.println("Qual a quantia que deseja sacar?");
            float valSac = sc.nextFloat();
            System.out.println("Checando possibilidade de saque...");
            if(valSac > this.saldo){
                System.out.println("Possibilidade de saque negada!\n"
                        + "Sem valor possivel em conta");
            }else{
                System.out.println("Possibilidade de saque permitida");
                this.saldo -= valSac;
                System.out.println("Seu saldo atual é de R$"+this.saldo);
            }
        }else{
            System.out.println("Atualmente sua conta está fechada ou não foi criada, por favor abra uma conta");
        }
    }
    
    //Mostrando dados da conta
    public void dadosConta(){
        System.out.println("-*-Dados da conta-*-");
        System.out.println("Número da conta:    "+this.numCont+"\n"
                + "Tipo da conta:   "+this.tipoCont+"\n"
                        + "Usuário:    "+this.nomePess+"\n"
                                + "Saldo:   "+this.saldo+"\n"
                                        + "Status:  "+this.status);
    }
    
}
