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
public class Pessoa {
    //Criando as variaveis usadas na classe
    public String nome;
    public int idade;
    public float peso;
    private String profissao;
    
    //Exemplo de um metodo construtor, sempre com o nome da classe
    //public Pessoa(){   //Código do construtor   }
    
    //Metodo GET, pega o valor de determinada variavel, Retorna o valor dessa variavel
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getProfissao(){
        return this.profissao;
    }
    
    //Metodo SET, coloca o valor em alguma variavel
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    
    //Mostrando o usuario da pessoa
    public void printUser(){
        System.out.println("Seu nome é: "+this.nome+"\n"
                + "Sua idade é: "+this.idade+"\n"
                        + "Seu peso é: "+this.peso+"\n"
                                + "Sua profissão atual é: "+this.profissao);
    }
}
