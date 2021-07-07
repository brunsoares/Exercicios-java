/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

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
        // Intanciando a classes do helloWorld
        HelloWorld hw = new HelloWorld();
        Scanner sc = new Scanner(System.in);     //Classe externa precisa do import
        //Variavel name recebe seu valor para executar o metodo
        System.out.println("Digite seu nome para continuar: ");
        hw.name = sc.nextLine();
        hw.print(); //Chamando metodo da classe para executar
    }
    
}
