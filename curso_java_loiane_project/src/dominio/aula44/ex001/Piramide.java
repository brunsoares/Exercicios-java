package dominio.aula44.ex001;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double altura;
    private double base;
    private double lado;

    /** Get e Set */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área da pirâmide: " + (getBase() * getLado() / 2));
    }

    @Override
    public void calcularVolume() {
        System.out.println("Volume da pirâmide: " + (getBase() * getAltura() / 3));
    }
}