package dominio.aula24;

public class Carro {
    // Atributos do carro
    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    // Método para exibir a autonomia do carro
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " km");
    }

    String obterInformacoes(boolean infoCompleta) {
        if (infoCompleta) {
            return "Marca: " + marca + ", Modelo: " + modelo + ", Número de Passageiros: " + numeroPassageiros + ", Capacidade de Combustível: " + capacidadeCombustivel + ", Consumo de Combustível: " + consumoCombustivel;
        } else {
            return "Marca: " + marca + ", Modelo: " + modelo;
        }
    }

    /** GETTERS e SETTERS */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
}
