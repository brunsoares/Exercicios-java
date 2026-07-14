package dominio.aula44.ex001;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
    private double aresta;

    /** Get e Set */
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do cubo: " + (6 * Math.pow(getAresta(), 2)));
    }

    @Override
    public void calcularVolume() {
        System.out.println("Volume do cubo: " + (Math.pow(getAresta(), 3)));
    }
}
