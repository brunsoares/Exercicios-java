package code.program;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Condicoes {
    public static void main(String[] args) {
        //Importando interação com o usuario
        Scanner scn = new Scanner(System.in);
        //Pegando valores
        System.out.println("Digite o valor da nota 1 = ");
        float nt1 = scn.nextFloat();
        System.out.println("Digite o valor da nota 2 = ");
        float nt2 = scn.nextFloat();
        float md = (nt1+nt2) / 2;
        System.out.println("Sua média é igual a "+md);
        
        //Condição Simples, apenas uma checagem
        /*if(md > 7){
            System.out.println("Sua situação está acima da média, parabéns");
        }*/
        
        //Condição composta, duas checagens if / else
        /*if (md >= 7){
            System.out.println("Parabéns, você foi aprovado!");
        }else{
            System.out.println("Deu ruim, você foi reprovado!");
        }*/
        
        //Condição aninhada, pode ter várias checagens, if / else / else if
        if (md >= 7){
            System.out.println("Parabéns, você foi aprovado!");
        }else if(md < 7 && md >= 4){
            System.out.println("Alerta! você está de recuperação, boa sorte");
        }else{
            System.out.println("Deu ruim! você repetiu de ano, triste ;-;");
        }
        
        //Teste de switch e case
        System.out.println("Digite um valor entre 0 a 2!");
        int val = scn.nextInt();
        //Estrutura switch / case, focado em int, ou string
        switch (val){
            case 0:
                System.out.println("O valor digitado é 0, primeiro case!");
                break;
            case 1:
                System.out.println("O valor digitado é 1, segundo case!");
                break;
            case 2:
                System.out.println("O valor digitado é 2, terceiro case!");
                break;
            default:
                System.out.println("O valor é acima do permitido, valor default!");
                
        }
    }
}
