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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Classe principal onde vamos instanciar os objetos e interagir
        Estudante estu1 = new Estudante("Bruno Soares", 18, "Masculino", 
                "Análise e desenvolvimento de Sistemas", 590.50f);
        //Interagindo com a classe estudante
        estu1.mostrarDetalhes();    //Metodo da classe pai
        estu1.cancelarMatricula();  //Metodo da classe filha
        
        Professor prof1 = new Professor("Robertin Oliveira", 58, "Masculino", 4500 ,"Economia");
        prof1.mostrarDetalhes();    //Metodo da classe pai
        prof1.pedirAumento(7800);   //Metodo da classe filha
    }
    
}
