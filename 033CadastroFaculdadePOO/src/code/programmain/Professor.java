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
public class Professor extends Pessoa{
    //Atributos da classe
    private float salario;
    private String materia;
    
    //Construtor da classe
    public Professor(String nm, int id, String sx, float sl, String mt){
        this.setNome(nm);
        this.setIdade(id);
        this.setSexo(sx);
        this.setSalario(sl);
        this.setMateria(mt);
        
    }
    
    //getters e setters
    public void setSalario(float s){
        this.salario = s;
    }
    public float getSalario(){
        return salario;
    }
    public void setMateria(String m){
        this.materia = m;
    }
    public String getMateria(){
        return materia;
    }
    
    //Metodos da classe
    public void pedirAumento(float val){
        System.out.println("-*- Pedido de Aumento -*-");
        System.out.println("Nome:                 "+getNome());
        System.out.println("Salário atual:        R$"+getSalario());
        System.out.println("Matéria:              "+getMateria());
        System.out.println("Valor desejado:       R$"+val);
        System.out.println("-----------------------------");
    }
}
