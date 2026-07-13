package dominio.aula24;

public class ContaCorrenteEX001 {
    private String numeroConta;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrenteEX001(String numeroConta, double saldo, boolean especial, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else if (especial && (saldo + limite) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso utilizando limite do cheque especial. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta " + numeroConta + ": R$" + saldo);
    }

    public void exibirInformacoesConta() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Conta Especial: " + (especial ? "Sim" : "Não"));
        if (especial) {
            System.out.println("Limite do Cheque Especial: R$" + limite);
        }
    }

    /** GETTERS e SETTERS */
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
