/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.programmain;

/**
 *
 * @author bruno
 */
public class Pessoa {
    //Classe pai, onde todas vão se basear
    private String nome;
    private int idade;
    private String sexo;
    
    
    //Getters e setters de cada
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
       return nome;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public int getIdade(){
        return idade;
    }
    public void setSexo(String sx){
        this.sexo = sx;
    }
    public String getSexo(){
        return sexo;
    }
    
    //Metodo da classe pai que todas podem usar
    public void mostrarDetalhes(){
        System.out.println("-*- Dados da Pessoa -*-");
        System.out.println("Nome:   "+getNome());
        System.out.println("Idade:  "+getIdade());
        System.out.println("Sexo:   "+getSexo());
        System.out.println("------------------------");
    }
}
