package dominio.aula61;

public class TesteReferencia {
    public static void main(String[] args) {
        Contato contato1 = new Contato("João", "123456789");
        int valor = 10;

        System.out.println("Contato 1: " + contato1.getNome() + " - " + contato1.getTelefone());
        System.out.println("Valor: " + valor);

        // Alterando o nome por instância sem referencia
        alterarContato(contato1, valor);

        System.out.println("Contato 1: " + contato1.getNome() + " - " + contato1.getTelefone());
        System.out.println("Valor: " + valor);

        // Alterando o nome do contato1
        alterarContatoRef(contato1, valor);

        // Checagem do valor do contato1 e da variável valor
        System.out.println("Contato 1: " + contato1.getNome() + " - " + contato1.getTelefone());
        System.out.println("Valor: " + valor);
        // Valor não é afetado pois a passagem é por valor e não por referencia

        // Passagem de parâmetros via varargs
        System.out.println();
        System.out.println("Passagem de parâmetros via varargs");
        System.out.println("Soma: " + soma(1, 2, 3, 4, 5));
    }

    public static void alterarContatoRef(Contato contato, int valor) {
        contato.setNome("Maria");
        contato.setTelefone("987654321");

        valor = 20;
    }

    public static void alterarContato(Contato contato, int valor) {
        contato = new Contato("Maria", "987654321");
        valor = 20;
    }

    public static int soma(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
