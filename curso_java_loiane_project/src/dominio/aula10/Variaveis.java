package dominio.aula10;

public class Variaveis {
    public static void main(String[] args) {
        // Tipos primitivos de ponto flutuante
        float floatNumero = 1.80f; // 4 bytes
        double doubleNumero = 3500.50; // 8 bytes
        // Tipos primitivos inteiros
        byte byteNumero = 127; // -128 a 127
        short shortNumero = 32000; // -32.768 a 32.767
        int intNumero = 23; // -2.147.483.648 a 2.147.483.647
        long longNumero = 123456789L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // Tipos primitivos boolean
        boolean booleanNumero = true; // true ou false
        // Tipos primitivos char
        char charLetra = 'M'; // Armazena um único caractere
        char charNumero = 65; // Armazena um único caractere, nesse caso a letra A (tabela ASCII)
        // Tipos de referência
        String string = "Bruno";

        System.out.println("String: " + string);
        System.out.println("Int: " + intNumero);
        System.out.println("Double: " + doubleNumero);
        System.out.println("Float: " + floatNumero);
        System.out.println("Número longo: " + longNumero);
        System.out.println("Número byte: " + byteNumero);
        System.out.println("Número short: " + shortNumero);
        System.out.println("Boolean: " + booleanNumero);
        System.out.println("Char número: " + charNumero);
        System.out.println("Char letra: " + charLetra);
    }
}
