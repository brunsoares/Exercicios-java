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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando objeto da classe
        Pessoa user = new Pessoa();
        //Colocando dados usando o metódo SET
        user.setNome("Bruno Soares");
        user.setIdade(18);
        user.setPeso(70.5f);
        user.setProfissao("Desenvolvedor");
        
        //Pegando os mesmos dados com o metodo GET
        user.getNome();
        user.getIdade();
        user.getPeso();
        user.getProfissao();
        
        //Mostrando os dados vindos da outra classe PESSOA
        user.printUser();
        
    }
    
}
