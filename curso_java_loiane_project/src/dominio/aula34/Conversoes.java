package dominio.aula34;

public class Conversoes {
    /** Conversão unidades de área */
    public static double converterMetroParaPes(double metros) {
        return metros * 10.76;
    }

    public static double converterPesParaCentimetros(double pes) {
        return pes * 929;
    }

    public static double converterMilhaParaAcres(double milhas) {
        return milhas * 640;
    }

    public static double converterAcresParaPes(double acres) {
        return acres * 43560;
    }

    /** Conversão unidades de volume */
    public static double converterLitrosParaCentimetros(double litros) {
        return litros * 1000;
    }

    public static double converterMetrosParaLitros(double metros) {
        return metros * 1000;
    }

    public static double converterMetrosParaPes(double metros) {
        return metros * 35.32;
    }

    public static double converterGalaoUSAParaPolegadas(double galao) {
        return galao * 231;
    }

    public static double converterGalaoUSAParaLitros(double galao) {
        return galao * 3.785;
    }

    /** Conversão unidades de tempo */
    public static double converterMinutosParaSegundos(double minutos) {
        return minutos * 60;
    }

    public static double converterHorasParaMinutos(double horas) {
        return horas * 60;
    }

    public static double converterDiasParaHoras(double dias) {
        return dias * 24;
    }

    public static double converterSemanasParaDias(double semanas) {
        return semanas * 7;
    }

    public static double converterMesesParaDias(double meses) {
        return meses * 30;
    }

    public static double converterAnosParaDias(double anos) {
        return anos * 365.25;
    }
}
