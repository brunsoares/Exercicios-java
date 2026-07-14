package dominio.aula44.ex001;

public class TesteFiguras {
    public static void main(String[] args) {
        // Testando as figuras 3D
        Piramide piramide = new Piramide();
        piramide.setAltura(10);
        piramide.setBase(5);
        piramide.setLado(4);

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(10);
        cilindro.setRaio(5);

        Cubo cubo = new Cubo();
        cubo.setAresta(5);
        
        // Testando as figuras 2D
        Quadrado quadrado = new Quadrado();
        quadrado.setAltura(5);
        quadrado.setLargura(5);
        
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(5);
        triangulo.setLargura(5);
    
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        // Inserindo todos no array de figuras
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = piramide;
        figuras[1] = cilindro;
        figuras[2] = cubo;
        figuras[3] = quadrado;
        figuras[4] = triangulo;
        figuras[5] = circulo;

        // Calculando área e volume de cada figura
        for (FiguraGeometrica figura : figuras) {
            if (figura instanceof DimensaoSuperficial) {
                ((DimensaoSuperficial) figura).calcularArea();
            }
            if (figura instanceof DimensaoVolumetrica) {
                ((DimensaoVolumetrica) figura).calcularVolume();
            }
        }
    }
}
