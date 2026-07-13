package dominio.aula19;

public class ArraysEX001 {
    public static void main(String[] args) {
        // EX 001 - "Copia" de arrays
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = a;
        for(int i=0; i<a.length; i++){
            // System.out.println("Número em A: " + a[i]);
            // System.out.println("Número em B: " + b[i]);
        }
        // EX 002 - "Copia" de arrays com multiplicação
        int[] b2 = new int[a.length];
        for(int i=0; i<a.length; i++){
            b2[i] = a[i] * 2;
        }
        for(int i=0; i<b2.length; i++){
            // System.out.println("Número em B2: " + b2[i]);
        }
        // EX 003 - Palíndromo
        int[] palindromo = new int[]{1, 2, 3, 2, 1};
        int[] notPalindromo = new int[]{1, 2, 3, 4, 5};
        boolean isPalindromo = true;
        for(int i=0; i<palindromo.length; i++){
            if(palindromo[i] != palindromo[palindromo.length - 1 - i]){
                isPalindromo = false;
                break;
            }
        }
        System.out.println("É palíndromo: " + isPalindromo);
        isPalindromo = true;
        for(int i=0; i<notPalindromo.length; i++){
            if(notPalindromo[i] != notPalindromo[notPalindromo.length - 1 - i]){
                isPalindromo = false;
                break;
            }
        }
        System.out.println("É palíndromo: " + isPalindromo);
        // EX 004 - Diferença entre arrays
        int[] a004 = new int[]{1, 2, 3, 4, 5};
        int[] b004 = new int[]{1, 2, 9, 4, 6};
        int[] diff = new int[a004.length];
        for(int i=0; i<a004.length; i++){
            if(a004[i] != b004[i]){
                diff[i] = a004[i];
            }
        }
        System.out.println("Diferença entre arrays: ");
        for(int i=0; i<diff.length; i++){
            System.out.print(diff[i] + " ");
        }
        // EX 005 - Ordenação de arrays
        int[] a005 = new int[]{5, 3, 1, 4, 2};
        for(int i=0; i<a005.length; i++){
            for(int j=i+1; j<a005.length; j++){
                if(a005[i] > a005[j]){
                    int temp = a005[i];
                    a005[i] = a005[j];
                    a005[j] = temp;
                }
            }
        }
        System.out.println("\nArray ordenado: ");
        for(int i=0; i<a005.length; i++){
            System.out.print(a005[i] + " ");
        }
    }
}
