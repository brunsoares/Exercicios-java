/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.program;

/**
 *
 * @author bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando objeto do Controle do sistema
        ControleFunc cf = new ControleFunc();
        //Iniciando o programa, testando as funções do controle
        cf.ligar();
        cf.abrirMenu();
        cf.aumentarVolume();
        cf.play();
        cf.abrirMenu();
    }
    
}
