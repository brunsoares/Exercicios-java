package dominio.aula64;

public class Local {
    public void criarClasseInterna() {
        class Interna {
            public void imprimir() {
                System.out.println("Classe interna local");
            }
        }
        Interna interna = new Interna();
        interna.imprimir();
    }

    public static void main(String[] args) {
        Local local = new Local();
        local.criarClasseInterna();
    }
}
