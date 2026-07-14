package dominio.aula64;

public class Externa {
    private String nome = "Externa";

    public class Interna {
        private String nome = "Interna";

        public void imprimir() {
            System.out.println(nome);
            System.out.println(Externa.this.nome);
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.imprimir();
    }
}
