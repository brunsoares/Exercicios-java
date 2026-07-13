package dominio.aula34;

public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public int somarNaoStatic(int a, int b) {
        return a + b;
    }
}
