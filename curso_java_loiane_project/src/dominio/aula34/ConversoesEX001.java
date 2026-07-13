package dominio.aula34;

public class ConversoesEX001 {
    public static void main(String[] args) {
        /** Conversão unidades de área */
        double metros = 10.0;
        double pes = Conversoes.converterMetroParaPes(metros);
        System.out.println(metros + " metros equivalem a " + pes + " pés.");

        double pes2 = 20.0;
        double centimetros2 = Conversoes.converterPesParaCentimetros(pes2);
        System.out.println(pes2 + " pés equivalem a " + centimetros2 + " centímetros.");

        double milhas = 5.0;
        double acres = Conversoes.converterMilhaParaAcres(milhas);
        System.out.println(milhas + " milhas equivalem a " + acres + " acres.");

        double acres2 = 10.0;
        double pes2Convertidos = Conversoes.converterAcresParaPes(acres2);
        System.out.println(acres2 + " acres equivalem a " + pes2Convertidos + " pés.");

        /** Conversão unidades de volume */
        double litros = 2.5;
        double centimetros3 = Conversoes.converterLitrosParaCentimetros(litros);
        System.out.println(litros + " litros equivalem a " + centimetros3 + " centímetros cúbicos.");

        double metros2 = 3.0;
        double litros2 = Conversoes.converterMetrosParaLitros(metros2);
        System.out.println(metros2 + " metros cúbicos equivalem a " + litros2 + " litros.");

        double metros3 = 4.0;
        double pes3 = Conversoes.converterMetrosParaPes(metros3);
        System.out.println(metros3 + " metros cúbicos equivalem a " + pes3 + " pés cúbicos.");

        double galao = 1.0;
        double polegadas = Conversoes.converterGalaoUSAParaPolegadas(galao);
        System.out.println(galao + " galão(s) americano(s) equivalem a " + polegadas + " polegadas cúbicas.");

        double galao2 = 2.0;
        double litros3 = Conversoes.converterGalaoUSAParaLitros(galao2);
        System.out.println(galao2 + " galão(s) americano(s) equivalem a " + litros3 + " litros.");

        /** Conversão unidades de tempo */
        double minutos = 30.0;
        double segundos = Conversoes.converterMinutosParaSegundos(minutos);
        System.out.println(minutos + " minutos equivalem a " + segundos + " segundos.");

        double horas = 2.0;
        double minutosConvertidos = Conversoes.converterHorasParaMinutos(horas);
        System.out.println(horas + " horas equivalem a " + minutosConvertidos + " minutos.");

        double dias = 5.0;
        double horasConvertidas = Conversoes.converterDiasParaHoras(dias);
        System.out.println(dias + " dias equivalem a " + horasConvertidas + " horas.");

        double semanas = 2.0;
        double diasConvertidos = Conversoes.converterSemanasParaDias(semanas);
        System.out.println(semanas + " semanas equivalem a " + diasConvertidos + " dias.");

        double meses = 3.0;
        double diasConvertidos2 = Conversoes.converterMesesParaDias(meses);
        System.out.println(meses + " meses equivalem a " + diasConvertidos2 + " dias.");

        double anos = 2.0;
        double diasConvertidos3 = Conversoes.converterAnosParaDias(anos);
        System.out.println(anos + " anos equivalem a " + diasConvertidos3 + " dias.");
    }
}
