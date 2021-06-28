package code.program;

/**
 *
 * @author bruno
 */
public class Repeticao {
    public static void main(String[] args) {
        int cont = 0;
        
        //Laço de repetição while, traduzindo: enquanto não for falso a condição faça o loop
        //No caso enquanto cont for menor que 5
        System.out.println("LOOP COM WHILE");
        while (cont <= 5){
            System.out.println("Contador no valor atual de: "+cont);
            cont+=1;
        }
        
        //Laço de repetição do while, onde primeiro é feito o código e depois checa
        //Caso for falso a checagem, ele volta para o loop
        //no caso cont vai incrementar 1, e depois vai checar se é menor que 5
        System.out.println("LOOP COM DO WHILE");
        do{
            System.out.println("Contador no valor atual de: "+cont);
            cont++;
        }while(cont <= 5);  //Enquanto for menor que 5 faça
        
        
        //Laço de repetição for, com variavel de controle
        System.out.println("LOOP COM FOR");
        for(int c=0;c<=5;c++){
            System.out.println("Contador no valor atual de: "+c);
        }
        
        
        //Laço de repetição While, loop infinito
        while (true){
            System.out.println("--------Loop infinito--------");
        }
        
        
    }
}
