package dominio.aula47;

public class Excecao {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3 };

        try {
            int resultado = 10 / 0; // Isso causará uma ArithmeticException
            System.out.println(numeros[10]); // Isso causará uma ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do limite do array.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }
}
