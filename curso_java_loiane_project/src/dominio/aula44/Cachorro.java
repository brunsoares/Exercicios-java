package dominio.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomestico {
    private String tamanho;
    private String raca;

    @Override
    public void amamentar() {
        // TODO Auto-generated method stub
    }
    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
    }

    /** Get e Set */
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override
    public void levarVeterinario() {
        // TODO Auto-generated method stub
    }
    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
    }
    @Override
    public void brincar() {
        // TODO Auto-generated method stub
    }
    @Override
    public void levarPassear() {
        // TODO Auto-generated method stub
    }

}
