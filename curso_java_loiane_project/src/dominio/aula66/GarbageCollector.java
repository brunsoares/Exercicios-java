package dominio.aula66;

import dominio.aula61.Contato;

public class GarbageCollector {

    public static void calcularMemoria() {
        final int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory()) / MB;
        System.out.println("Memória usada: " + memoriaUsada + " MB");
    }

    public static void main(String[] args) {
        Contato[] contatos = new Contato[100000];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato(
                    "Contato " + i, "123456789");
            contatos[i] = contato;
        }
        System.out.println("Contatos criados");
        calcularMemoria();
        contatos = null;

        // Forçando a execução do Garbage Collector - Não é recomendado
        Runtime.getRuntime().gc();

        System.out.println("Contatos removidos");
        calcularMemoria();
    }
}
