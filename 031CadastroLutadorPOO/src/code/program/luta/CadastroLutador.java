/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.program.luta;

/**
 *
 * @author bruno
 */
public class CadastroLutador {
    //Definindo os atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Construtor recebendo as variaveis
    public CadastroLutador(String no, String na, int ida, float alt, float pes, int win, int los, int draw){
        //Cada variavel recebe o valor de determinado parametro
        this.nome = no;
        this.nacionalidade = na;
        this.idade = ida;
        this.altura = alt;
        setPeso(pes);   //Para colocar categoria automatica
        this.vitorias = win;
        this.derrotas = los;
        this.empates = draw;
    }
    
    //Metodos getter / setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }
    public float getPeso(){
        return peso;
    }
    public void setCategoria(){
        //Formulando a categoria automatica com base no peso
        if(this.getPeso() > 52.2f && this.getPeso() <= 70.3f){
            this.categoria = "Peso LEVE";
        }else if(this.getPeso() <= 80.9f){
            this.categoria = "Peso MÉDIO";
        }else if(this.getPeso() <= 120.2f){
            this.categoria = "Peso PESADO";
        }else{
            this.categoria = "Inválido";
        }
    }
    public String getCategoria(){
        return categoria;
    }
    public void setVitoria(int vitoria){
        this.vitorias = vitoria;
    }
    public int getVitoria(){
        return vitorias;
    }
    public void setDerrota(int derrota){
        this.derrotas = derrota;
    }
    public int getDerrota(){
        return derrotas;
    }
    public void setEmpate(int empate){
        this.empates = empate;
    }
    public int getEmpate(){
        return empates;
    }
    
    //Metodos da classe que vao ser usados
    public void apresentar(){
        System.out.println("-*- APRESENTANDO LUTADOR -*-");
        System.out.println("Nome:   "+getNome()+"\n"
                + "Nacionalidade:   "+getNacionalidade()+"\n"
                        + "Idade:   "+getIdade()+" anos \n"
                                + "Altura:  "+getAltura()+"m \n"
                                        + "Peso:    "+getPeso()+"kg \n"
                                                + "Categoria:   "+getCategoria()+"\n");
    }
    
    public void status(){
        System.out.println("-*- STATUS DO LUTADOR "+getNome()+" -*-");
        System.out.println("Vitórias:   "+getVitoria()+"\n"
                + "Derrotas:    "+getDerrota()+"\n"
                        + "Empates:    "+getEmpate()+"\n");
    }
    
    public void ganharLuta(){
        this.setVitoria(getVitoria() +1);
    }
    
    public void perderLuta(){
        this.setDerrota(getDerrota() +1);
    }
    
    public void empatarLuta(){
        this.setEmpate(getEmpate() +1);
    }
    
    
}
