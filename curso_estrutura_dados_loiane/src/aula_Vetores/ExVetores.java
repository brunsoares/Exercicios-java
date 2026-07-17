package aula_Vetores;

public class ExVetores {
    public static void main(String[] args) {
        Vetores<Integer> vetor = new Vetores<>(5);
        vetor.adiciona(10);
        vetor.adiciona(20);
        vetor.adiciona(30);

        System.out.println("EX001 - Testando contains:");
        System.out.println("O vetor contém o elemento 20? " + vetor.contains(20));
        System.out.println("O vetor contém o elemento 40? " + vetor.contains(40));

        System.out.println("\nEX002 - Testando lastIndexOf:");
        System.out.println("O último índice do elemento 30 é: " + vetor.lastIndexOf(30));
        System.out.println("O último índice do elemento 40 é: " + vetor.lastIndexOf(40));

        System.out.println("\nEX003 - Testando clear:");
        vetor.clear();
        System.out.println("Conteúdo do vetor: " + vetor.toString());

    }
}
