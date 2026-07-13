package dominio.aula24;

public class Correntistas {
    public static void main(String[] args) {
        ContaCorrenteEX001 conta1 = new ContaCorrenteEX001("12345-6", 1000.0, true, 500.0);
        ContaCorrenteEX001 conta2 = new ContaCorrenteEX001("98765-4", 2000.0, false, 0.0);

        // Exibindo informações das contas
        System.out.println("Informações da Conta 1:");
        conta1.exibirInformacoesConta();
        System.out.println("\nInformações da Conta 2:");
        conta2.exibirInformacoesConta();

        // Realizando saques
        System.out.println("\nRealizando saques:");
        conta1.realizarSaque(1200.0); // Saque utilizando limite do cheque especial
        conta2.realizarSaque(2500.0); // Saldo insuficiente

        // Exibindo saldos atualizados
        System.out.println("\nSaldos atualizados:");
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        // Realizando depósitos
        System.out.println("\nRealizando depósitos:");
        conta1.depositar(300.0);
        conta2.depositar(500.0);

        // Exibindo saldos atualizados
        System.out.println("\nSaldos atualizados:");
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
