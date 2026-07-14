package dominio.aula53;

public class Testes {
    public static void main(String[] args) {
        // Testando as constantes
        System.out.println(Constantes.SEGUNDA);
        System.out.println(Constantes.TERCA);
        System.out.println(Constantes.QUARTA);
        System.out.println(Constantes.QUINTA);
        System.out.println(Constantes.SEXTA);
        System.out.println(Constantes.SABADO);
        System.out.println(Constantes.DOMINGO);
        // Testando enums - Sem valores
        System.out.println();
        System.out.println(Enum.SEGUNDA);
        System.out.println(Enum.TERCA);
        System.out.println(Enum.QUARTA);
        System.out.println(Enum.QUINTA);
        System.out.println(Enum.SEXTA);
        System.out.println(Enum.SABADO);
        System.out.println(Enum.DOMINGO);
        // Testando enums - Com valores
        System.out.println();
        System.out.println(EnumValores.SEGUNDA + " - " + EnumValores.SEGUNDA.getValor());
        System.out.println(EnumValores.TERCA + " - " + EnumValores.TERCA.getValor());
        System.out.println(EnumValores.QUARTA + " - " + EnumValores.QUARTA.getValor());
        System.out.println(EnumValores.QUINTA + " - " + EnumValores.QUINTA.getValor());
        System.out.println(EnumValores.SEXTA + " - " + EnumValores.SEXTA.getValor());
        System.out.println(EnumValores.SABADO + " - " + EnumValores.SABADO.getValor());
        System.out.println(EnumValores.DOMINGO + " - " + EnumValores.DOMINGO.getValor());
        // Testando enums - Somente valores
        System.out.println();
        EnumValores[] valores = EnumValores.values();
        for (EnumValores valor : valores) {
            System.out.println(valor + " - " + valor.getValor());
        }
        // Testando enums - Somente valores por pesquisa
        System.out.println();
        EnumValores valor = EnumValores.valueOf("SEGUNDA");
        System.out.println(valor + " - " + valor.getValor());
    }
}
