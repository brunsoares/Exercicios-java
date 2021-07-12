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
//Implements Controler, serve para pegar todos os metodos abstratos e colocar o código deles nessa classe
public class ControleFunc implements Controler{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Metodo construtor, sempre que iniciar a classe esse valores são definidos
    public ControleFunc(){
        this.volume = 50;
        this.tocando = false;
        this.ligado = false;
        
    }
    //GETTERS
    private int getVolume(){
        return volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    //SETTERS
    private void setVolume(int vol){
        this.volume = vol;
    }
    private void setLigado(boolean lig){
        this.ligado = lig;
    }
    private void setTocando(boolean toc){
        this.tocando = toc;
    }

    //METODOS ABSTRATOS - CONTROLER
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Sistema ligado?    "+this.getLigado());
        System.out.println("Sistema Tocando?    "+this.getTocando());
        System.out.println("Volume =    "+this.getVolume());
        for(int i=0; i < this.getVolume(); i+=10){  //Mostrando volume pelas |
            System.out.print("|");
        }
        System.out.println(""); //Apenas para quebrar linha 
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu, adeus...");
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){ //Ligado e volume maior que 0
            this.setVolume(0);
        }else{
            System.out.println("Impossivel ligar o MUDO");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){    //Ligado e volume igual a 0
            this.setVolume(50);
        }else{
            System.out.println("Impossivel desligar o MUDO");
        }
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 10);  //Aumenta 10 por "click"
        }else{
            System.out.println("Impossivel aumentar o VOLUME");
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 10);  //Diminui 10 por "click"
        }else{
            System.out.println("Impossivel diminuir o VOLUME");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){   //Se estiver ligado e não estiver tocando
            this.setTocando(true);
        }else{
            System.out.println("Impossivel tocar");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){  //se estiver ligado e tocando
            this.setTocando(false);
        }else{
            System.out.println("Impossivel pausar");
        }
    }
}
