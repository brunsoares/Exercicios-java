package dominio.aula85;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Utils {
    public static void main(String[] args) {
        // Exemplos classe math
        System.out.println("Exemplos classe Math");
        System.out.println(Math.abs(-10)); // 10
        System.out.println(Math.ceil(3.55)); // 4.0
        System.out.println(Math.floor(3.55)); // 3.0
        System.out.println(Math.round(3.55)); // 4
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.sqrt(16)); // 4.0
        System.out.println();

        // Exemplos classe date
        System.out.println("Exemplos classe Date");
        Date data = new Date();
        System.out.println(data);
        System.out.println(data.getTime()); // Retorna o tempo em milissegundos desde 01/01/1970
        System.out.println(data.getDate()); // Retorna o dia do mês
        System.out.println(data.getMonth()); // Retorna o mês (0-11)
        System.out.println(data.getYear()); // Retorna o ano (1900 + ano)
        System.out.println();

        // Exemplos classe calendar
        System.out.println("Exemplos classe Calendar");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // Retorna o dia do mês
        System.out.println(calendar.get(Calendar.MONTH)); // Retorna o mês (0-11)
        System.out.println(calendar.get(Calendar.YEAR)); // Retorna o ano
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // Retorna a hora (0-23)
        System.out.println(calendar.get(Calendar.MINUTE)); // Retorna os minutos
        System.out.println(calendar.get(Calendar.SECOND)); // Retorna os segundos
        System.out.println();

        // Exemplos classe gregorianCalendar
        System.out.println("Exemplos classe GregorianCalendar");
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.getTime());
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH)); // Retorna o dia do mês
        System.out.println(gregorianCalendar.get(Calendar.MONTH)); // Retorna o mês (0-11)
        System.out.println(gregorianCalendar.get(Calendar.YEAR)); // Retorna o ano
        System.out.println(gregorianCalendar.get(Calendar.HOUR_OF_DAY)); // Retorna a hora (0-23)
        System.out.println(gregorianCalendar.get(Calendar.MINUTE)); // Retorna os minutos
        System.out.println(gregorianCalendar.get(Calendar.SECOND)); // Retorna os segundos
        System.out.println();

        // Exemplos classe simpledateformat
        System.out.println("Exemplos classe SimpleDateFormat");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(data));
        System.out.println();

        // Exemplos classe dateformat e locale
        System.out.println("Exemplos classe DateFormat e Locale");
        DateFormat df = DateFormat.getInstance();
        System.out.println(df);
        System.out.println(df.format(data));
        Locale.setDefault(new Locale("en", "US")); // Define o locale para inglês dos Estados Unidos
        DateFormat dfLocale = DateFormat.getInstance();
        System.out.println(dfLocale.format(data));
        System.out.println();

        // Exemplo classes de fuso horário
        System.out.println("Exemplo classes de fuso horário");
        Calendar calendarFusoHorario = Calendar.getInstance();
        System.out.println("Fuso horário padrão: " + calendarFusoHorario.getTimeZone().getID());
        TimeZone tz = calendarFusoHorario.getTimeZone();
        for (String id : TimeZone.getAvailableIDs()) {
            System.out.println(id);
        }
        System.out.println();

        // Exemplo classe datas > Java 8
        // Podemos usar por exemplo LocalDateTime, LocalDate, LocalTime, ZonedDateTime
        System.out.println("Exemplo classe datas > Java 8");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getYear());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println();

        // Exemplo diferença de datas com date / calendar
        System.out.println("Exemplo diferença de datas com date / calendar");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2024, Calendar.JANUARY, 1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2024, Calendar.JANUARY, 10);
        long diffInMillis = calendar2.getTimeInMillis() - calendar1.getTimeInMillis();
        // long diffInDays = diffInMillis / (24 * 60 * 60 * 1000);
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
        System.out.println("Diferença em dias: " + diffInDays);
        System.out.println();

        // Exemplo diferença de datas com LocalDate
        System.out.println("Exemplo diferença de datas com LocalDate");
        LocalDateTime localDate1 = LocalDateTime.of(2024, 1, 1, 0, 0);
        LocalDateTime localDate2 = LocalDateTime.of(2024, 1, 10, 0, 0);
        Period period = Period.between(localDate1.toLocalDate(), localDate2.toLocalDate()); // Para horas usamos o
                                                                                            // Duration
        System.out.println("Diferença em dias: " + period.getDays());
        System.out.println();

        // Exemplo formatação de números com NumberFormat
        System.out.println("Exemplo formatação de números com NumberFormat");
        double numero = 1234567.89;
        Locale.setDefault(new Locale("pt", "BR")); // Define o locale para português do Brasil
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("Número formatado: " + nf.format(numero));
        NumberFormat nfCurrency = NumberFormat.getCurrencyInstance();
        System.out.println("Número formatado como moeda: " + nfCurrency.format(numero));
        System.out.println();

        // Exemplo formatação de moedas com DecimalFormat - é mais flexível que o
        // NumberFormat
        System.out.println("Exemplo formatação de moedas com DecimalFormat");
        DecimalFormat dfCurrency = new DecimalFormat("R$ #,##0.00");
        System.out.println("Número formatado como moeda: " + dfCurrency.format(numero));
        System.out.println();

        // Exemplo classes BigDecimal e BigInteger
        System.out.println("Exemplo classes BigDecimal e BigInteger");
        BigDecimal bigDecimal = new BigDecimal("12345678901234567890.12345678901234567890");
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        System.out.println("BigDecimal: " + bigDecimal);
        System.out.println("BigInteger: " + bigInteger);
        BigDecimal bigDecimal2 = new BigDecimal("0.04");
        BigDecimal bigDecimal3 = new BigDecimal("0.03");
        BigDecimal bigDecimalResult = bigDecimal2.subtract(bigDecimal3);
        System.out.println("Resultado da subtração: " + bigDecimalResult);
        System.out.println();

        // Exemplo classes Random
        System.out.println("Exemplo classes Random");
        Random random = new Random();
        System.out.println("Número aleatório entre 0 e 100: " + random.nextInt(101));
        System.out.println("Double aleatório entre 0.0 e 1.0: " + random.nextDouble());
        System.out.println();
    }
}
