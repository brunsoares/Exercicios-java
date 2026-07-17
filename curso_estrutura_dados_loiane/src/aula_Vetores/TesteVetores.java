package aula_Vetores;

public class TesteVetores {
    public static void main(String[] args) {
        Vetores<String> vetor = new Vetores<String>(3);
        // vetor.adicionaNaoOtimizado("Elemento 1");
        // vetor.adicionaNaoOtimizado("Elemento 2");
        // vetor.adicionaNaoOtimizado("Elemento 3");
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println("Quantidade de elementos no vetor: " + vetor.getTamanho());
        System.out.println();

        System.out.println("Vetor: " + vetor.toString());
        System.out.println();

        System.out.println("Elemento na posição 0: " + vetor.get(0));
        System.out.println("Elemento na posição 1: " + vetor.get(1));
        System.out.println("Elemento na posição 2: " + vetor.get(2));
        System.out.println();

        System.out.println("Existe o elemento 'Elemento 1' no vetor? " + vetor.get("Elemento 1"));
        System.out.println("Existe o elemento 'Elemento 4' no vetor? " + vetor.get("Elemento 4"));
        System.out.println();

        System.out.println("Adicionando 'Elemento 4' na posição 0:");
        vetor.adiciona("Elemento 4", 0);

        System.out.println("Removendo o elemento na posição 1:");
        vetor.remove(1);
        System.out.println();

        System.out.println("Vetor: " + vetor.toString());

    }
}
