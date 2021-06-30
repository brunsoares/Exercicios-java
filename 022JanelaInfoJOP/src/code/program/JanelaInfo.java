package code.program;

//Importando o JOP, JOpitionPane, que tem janelas prontas já
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */

public class JanelaInfo {
    public static void main(String[] args) {
        int num, cont=0, contPar=0, contImp=0, cont100=0, som=0;
        do{
            //Criando a janela, e o resultado digitado será armazenado na variavel num
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor: (0 Para interromper) "));
            if (num == 0) break;    //Apenas para cancelar o loop
            //É necessário a conversão
            //Fazendo os dados para mostrar
            cont++;     //Contagem de valores digitados
            
            if (num % 2 == 0){  //Valor par
                contPar++;
            }else{              //Valor ímpar
                contImp++;
            }
            
            if (num > 100) cont100++;   //Valores acima de 100
            
            som += num; //Somando para tirar a média
            
        }while (num != 0); 
        
        //Tirando a média
        float md = som/cont;
        
        //Debug
        /*
        System.out.println("Total de valores digitados: "+cont);
        System.out.println("Total de valor Pares digitados: "+contPar);
        System.out.println("Total de valores Ímpares digitados: "+contImp);
        System.out.println("Total de valores Acima de 100: "+cont100);
        System.out.println("Média dos valores digitados: "+md);
        */
        
        //Mostrando na tela
        JOptionPane.showMessageDialog(null, "<html>--------------------<br/>Resultado Final<br/>--------------------"+
                "<br/>Total de valores digitados: "+cont+
                "<br/>Total de valores Pares digitados: "+contPar+
                "<br/>Total de valores Ímpares digitados: "+contImp+
                "<br/>Total de valores Acima de 100: "+cont100+
                "<br/>Média dos valores digitados: "+md);
    }
}
