package dominio.aula34;

public class Calculos {
    public static void main(String[] args) {
        // Chamando métodos estáticos da classe Calculadora
        System.out.println("Soma de dois inteiros: " + Calculadora.somar(5, 10));
        System.out.println("Soma de três inteiros: " + Calculadora.somar(5, 10, 15));
        System.out.println("Soma de dois números decimais: " + Calculadora.somar(5.5, 10.2));
        Calculadora calc = new Calculadora();
        System.out.println("Soma de dois inteiros (não estático): " + calc.somarNaoStatic(5, 10));
    }
}
