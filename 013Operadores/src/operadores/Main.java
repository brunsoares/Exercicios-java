package operadores;

/**
 *
 * @author bruno
 */
public class Main {
    public static void main(String[] args) {
        //Os tipos de operadores usados em java
        int adc = 5+2;
        System.out.println("Adição 5+2= "+adc);
        int sub = 5-2;
        System.out.println("Subtração 5-2= "+sub);
        int mut = 5*2;
        System.out.println("Multiplicação 5*2= "+mut);
        float div = 5/2;
        System.out.println("Divisão Inteira 5/2= "+div); 
        float res = 5%2;
        System.out.println("Resto da divisão 5%2= "+res);
        
        //Cálculos usando a biblioteca math
        int val = 25;
        System.out.println("A raiz quadrada de 25 é "+Math.sqrt(val));  //sqrt() função para pegar raiz quadrada
        int num = 10;
        int exp = 2;
        System.out.println("a potência de 10^2 é "+Math.pow(num, exp)); //pow() é a potência
        //Mostrando valor de PI
        System.out.println("Valor de PI = "+Math.PI);
        //Randomizando número entre 0 e 1
        System.out.println("Valor sorteado = "+Math.random());
    }
    
}
