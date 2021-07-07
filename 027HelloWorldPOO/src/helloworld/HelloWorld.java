/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author bruno
 */
public class HelloWorld {
    public String name;   //Criando a variavel para armazenar nome
    
    //Criando metodo para mostrar na tela
    public void print(){
        System.out.println("Hello World "+this.name+" Tudo bem?"); 
        //this faz referencia ao objeto chamado, no caso seria o hw do Main.java
    }
}
