package code.program;

/**
 *
 * @author bruno
 */
public class Metodos {
    
    //Criando um metódo próprio, o void significa que não retorna valor
    //Também da para criar em outras classes e importar para a principal
    //Static significa que ele pode ser usado em outros locais static
    static void somar (int a, int b){
        int result = a+b;
        System.out.println("A soma dos valores é "+result);
    }
    
    //Metódo com retorno
    static int subtr (int a, int b){
        int valor = a-b;
        return valor;
    }
    
    //public deixa o metódo publico a outras classes 
    public static void main(String[] args) {
        //Chamando metódo
        System.out.println("Metódo SOMAR:");
        somar(2,20);
        System.out.println("Metódo SUBTR:");
        System.out.println(subtr(10,5));
        
    }
}
