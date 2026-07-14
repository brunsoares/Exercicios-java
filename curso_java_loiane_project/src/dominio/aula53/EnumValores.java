package dominio.aula53;

public enum EnumValores {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private int valor;

    private EnumValores(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
