package dominio.aula75;

import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) {
        String st1 = "Valor 1";
        String st2 = new String("Valor 1");
        String st3 = new String(st1);
        char[] ch = { 'V', 'a', 'l', 'o', 'r', ' ', '1' };
        String st4 = new String(ch);
        String st5 = new String(ch, 0, 5);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);

        // Comparação
        String st6 = "Valor 1";
        String st7 = "VALOR 1";
        System.out.println(st6.equals(st7)); // false
        System.out.println(st6.equalsIgnoreCase(st7)); // true
        System.out.println(st6 == st1); // true -> Usando a mesma referência
        System.out.println(st6 == st2); // false -> Usando referências diferentes
        System.out.println("a".compareTo("A")); // Diferença entre os caracteres 'a' e 'A'
        System.out.println(st6.startsWith("Valor")); // true
        System.out.println(st6.endsWith("1")); // true
        System.out.println(st6.contains("lor")); // true

        // String builder para concatenação - mais eficiente que StringBuffer
        StringBuilder sb = new StringBuilder();
        sb.append("Valor 1");
        sb.append(" Valor 2");
        sb.append(" Valor 3");
        System.out.println(sb.toString());

        // String buffer para concatenação - É thread-safe
        StringBuffer sbf = new StringBuffer();
        sbf.append("Valor 1");
        sbf.append(" Valor 2");
        sbf.append(" Valor 3");
        System.out.println(sbf.toString());

        // Leitura de arquivos
        StringTokenizer st = new StringTokenizer("Valor 1, Valor 2, Valor 3", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
