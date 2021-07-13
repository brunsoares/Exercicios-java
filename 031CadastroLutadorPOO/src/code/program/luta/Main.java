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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Usando a classe de outra forma, já com os parametro
            //A principio terá 4 lutadores
            CadastroLutador cl [] = new CadastroLutador[4]; 
            Luta lt = new Luta();
            cl[0] = new CadastroLutador("Bruno Soares","Brasileiro",18,1.80f,70.5f,10,0,0);
            cl[1] = new CadastroLutador("Robertin da Silva", "Argentino",20,1.90f,80f,4,3,3);
            cl[2] = new CadastroLutador("Narutinho Perreira", "Japonês",32,1.75f,93.5f,6,2,2);
            cl[3] = new CadastroLutador("Pedrin do gás", "Americano",17, 2f,102.4f,7,1,2);
            
            System.out.println("Apresentação dos Lutadores");
            //Apresentando todos
            cl[0].apresentar();
            cl[1].apresentar();
            cl[2].apresentar();
            cl[3].apresentar();
            
            System.out.println("Status dos Lutadores");
            //Status de todos
            cl[0].status();
            cl[1].status();
            cl[2].status();
            cl[3].status();
            
            //Fazendo a luta, de mesma categoria = MÉDIA
            lt.marcarLuta(cl[0], cl[1]);
            lt.lutar();
            cl[0].status();
            cl[1].status();
            
            //Fazendo a luta, categoria = PESADA
            lt.marcarLuta(cl[2], cl[3]);
            lt.lutar();
            cl[2].status();
            cl[3].status();
            
    }
    
}
