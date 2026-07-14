package dominio.aula44.ex001;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do círculo: " + (Math.PI * Math.pow(raio, 2)));
    }
    
}
