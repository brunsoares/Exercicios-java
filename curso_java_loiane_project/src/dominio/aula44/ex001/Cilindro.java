package dominio.aula44.ex001;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double altura;
    private double raio;

    /** Get e Set */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do cilindro: " + (2 * Math.PI * getRaio() * (getAltura() + getRaio())));
    }

    @Override
    public void calcularVolume() {
        System.out.println("Volume do cilindro: " + (Math.PI * Math.pow(getRaio(), 2) * getAltura()));
    }
    
}
