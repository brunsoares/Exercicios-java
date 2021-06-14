
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        //Declarando variaveis com os tipos de dados
        //Declaração simples
        //Inteiro
        int num = 22;
        //Char
        char let = 'B';     //Char só ocupa uma letra
        //String
        String nome = "Bruno";  //String é uma variação do tipo Caracthere, não é um type realmente em java
        //Float
        float flt = 1.8f;   //f Obrigatóriamente para declarar float
        //Boolean
        boolean sono = true;
        
        //Printando na tela 
        System.out.println("Tipos de dados - Declaração Simples");
        System.out.println("Int = "+num);
        System.out.println("Char = "+let);
        System.out.println("String = "+nome);
        System.out.println("Float = "+flt);
        System.out.println("Boolean = "+sono);
        
        //Pegando dados do usuario, System.in é a forma que o dado entra 
        Scanner teclado = new Scanner(System.in);   //Scanner biblioteca adicional, para pegar dados
        
        //Pegando dados e armazenando nas variaveis
        System.out.print("Digite seu nome: ");
        String name = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.print("Digite seu peso: ");
        float peso = teclado.nextFloat();
        
        //Mostrando os valores
        System.out.println("Resultados dos seus dados: ");
        System.out.println("Seu nome é "+name);
        System.out.println("Sua idade é "+idade);
        System.out.println("Seu peso é "+peso);
        
        //Conversão de tipos de dados
        System.out.println("Conversão String -> int");
        String valor = "20";
        int val = Integer.parseInt(valor);  //Convertendo para int
        System.out.println("Conversão Int -> string");
        int nume = 20;
        String numero = Integer.toString(nume);     //Convertendo para string
        
        
    }
}
