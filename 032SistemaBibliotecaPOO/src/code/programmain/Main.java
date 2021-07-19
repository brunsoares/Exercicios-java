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
        //Instanciando classe leitor com caracteristicas
        Pessoa leitor = new Pessoa("Bruno Soares", 18, "Masculino");
        
        //Instanciando classe Livro e passando parametros
        Livro lv = new Livro("Pai rico Pai pobre", "Robert T. Kiyosaki", 320, 155, leitor);
        //Ações da classe Livro
        lv.detalhesLivro();
        System.out.println("EXECUTANDO AÇÕES DA CLASSE LIVRO");
        lv.abrirLivro();
        lv.folhearLivro();
        lv.avancarPag();
        System.out.println("--------------------------------------");
        lv.detalhesLivro();
    }
    
}
