package dominio.aula24;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro lancer = new Carro("Mitsubishi", "Lancer", 5, 50, 12);
        Carro civic = new Carro("Honda", "Civic", 5, 47, 14);
        Carro veyron = new Carro("Bugatti", "Veyron", 2, 100, 8);
        Carro mustang = new Carro("Ford", "Mustang", 4, 60, 10);

        // Visualizando atributos
        System.out.println(lancer.obterInformacoes(true));
        System.out.println(civic.obterInformacoes(true));
        System.out.println(veyron.obterInformacoes(true));
        System.out.println(mustang.obterInformacoes(true));

        // Exibindo a autonomia dos carros
        System.out.println("\nAutonomia dos carros:");
        System.out.println(lancer.obterInformacoes(false));
        lancer.exibirAutonomia();
        System.out.println(civic.obterInformacoes(false));
        civic.exibirAutonomia();
        System.out.println(veyron.obterInformacoes(false));
        veyron.exibirAutonomia();
        System.out.println(mustang.obterInformacoes(false));
        mustang.exibirAutonomia();
    }
}
