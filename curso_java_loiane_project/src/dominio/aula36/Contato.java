package dominio.aula36;

public class Contato {
    private String nome;
    private Endereco endereco; // Relacionamento 1-1
    private Telefone[] telefone; // Relacionamento 1-N

    /** GET e SET */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }
}
