/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.program.luta;

import java.util.Random;

/**
 *
 * @author bruno
 */
public class Luta {
    private CadastroLutador desafiante;
    private CadastroLutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    //Metodos getter / setter
    public void setDesafiante(CadastroLutador cl){
        this.desafiante = cl;
    }
    public CadastroLutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiado(CadastroLutador cl){
        this.desafiado = cl;
    }
    public CadastroLutador getDesafiado(){
        return desafiado;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    public int getRounds(){
        return rounds;
    }
    public void setAprovado(boolean aprovado){
        this.aprovada = aprovado;
    }
    public boolean getAprovado(){
        return aprovada;
    }
    
    //Metodos da classe
    public void marcarLuta(CadastroLutador l1, CadastroLutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            //Categorias iguais e lutadores diferentes
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            //Caso for false, será recusada
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovado() == true){ //Apenas se for aprovada vai ter a luta
            System.out.println("APRESENTANDO DESAFIADO");
            this.getDesafiado().apresentar();
            System.out.println("APRESENTANDO DESAFIANTE");
            this.getDesafiante().apresentar();
            //Sistema randomico para decidir vitoria
            Random rd = new Random();
            int luta = rd.nextInt(3);
            System.out.println("===== RESULTADO DA LUTA =====");
            if(luta == 0){
                System.out.println("EMPATE, boa luta!");
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
            }else if(luta == 1){
                System.out.println("O lutador desafiado, "+this.getDesafiado().getNome()+" Venceu, Parabéns");
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
            }else{
                System.out.println("O lutador desafiante, "+this.getDesafiante().getNome()+" Venceu, Parabéns");
                this.getDesafiado().perderLuta();
                this.getDesafiante().ganharLuta();
            }                    
        }else{
            System.out.println("A luta não foi aprovada, ou não foi marcada, reveja por favor");
        }
    }
}
