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
public interface Controler {
    //Criando metodos abstratos, que significam que não são montados aqui nesta interface
    //Não necessariamente sempre void
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void play();
    public abstract void pause();
    
}
