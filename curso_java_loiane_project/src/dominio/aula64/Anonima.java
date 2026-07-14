package dominio.aula64;

public class Anonima {
    public void imprimir() {
        System.out.println("Classe anônima");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima() {
            @Override
            public void imprimir() {
                System.out.println("Classe anônima sobrescrita");
            }
        };
        anonima.imprimir();
    }
}
