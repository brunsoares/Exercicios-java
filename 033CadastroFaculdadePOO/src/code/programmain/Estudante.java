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
public class Estudante extends Pessoa{
    //Classe filho, pode usar metodos e informações da pai
    private String curso;
    private float mensalidade;
    
    //Construtor da classe
    public Estudante(String nm, int id, String sx, String cs, float ms){
        this.setNome(nm);
        this.setIdade(id);
        this.setSexo(sx);
        this.setCurso(cs);
        this.setMensalidade(ms);
    }
    
    //Setters e getters
    public void setCurso(String c){
        this.curso = c;
    }
    public String getCurso(){
        return curso;
    }
    public void setMensalidade(float m){
        this.mensalidade = m;
    }
    public float getMensalidade(){
        return mensalidade;
    }
    
    //Metodos da classe
    public void cancelarMatricula(){
        System.out.println("-*- Cancelamento -*-");
        System.out.println("Aluno:          "+getNome());
        System.out.println("Curso:          "+getCurso());
        System.out.println("Mensalidade:    "+getMensalidade());
        System.out.println("Cancelamento efetuado!");
    }
}
