package dominio.aula57;

public class Wrapper {
    public static void main(String[] args) {
        // tipos primitivos
        short s = 10;
        byte by = 10;
        int i = 10;
        long l = 10L;
        float f = 10.0f;
        double d = 10.0;
        boolean b = true;
        char c = 'A';

        // wrappers - Autoboxing (Primitivo > Wrapper)
        Short s1 = 10;
        Byte by1 = 10;
        Integer i1 = 10;
        Long l1 = 10L;
        Float f1 = 10.0f;
        Double d1 = 10.0;
        Boolean b1 = true;
        Character c1 = 'A';
        String st1 = "AAA";

        // wrappers - Unboxing (Wrapper > Primitivo)
        short s2 = s1;
        byte by2 = by1;
        int i2 = i1;
        long l2 = l1;
        float f2 = f1;
        double d2 = d1;
        boolean b2 = b1;
        char c2 = c1;

    }
}
