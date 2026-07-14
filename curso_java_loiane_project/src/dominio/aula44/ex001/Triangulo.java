package dominio.aula44.ex001;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
    private double altura;
    private double largura;

    @Override
    public void calcularArea() {
        System.out.println("Área do triângulo: " + (0.5 * altura * largura));
    }

    /** Get e Set */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
