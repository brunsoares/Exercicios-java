package dominio.aula36;

public class ContatoTeste {
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("João da Silva");

        Telefone telefone = new Telefone();
        telefone.setDdd("11");
        telefone.setNumero("98765-4321");
        telefone.setTipo("Celular");
        Telefone telefone2 = new Telefone();
        telefone2.setDdd("11");
        telefone2.setNumero("1234-5678");
        telefone2.setTipo("Residencial");
        contato.setTelefone(new Telefone[]{telefone, telefone2});

        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setNumero("123");
        endereco.setComplemento("Apto 45");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("01234-567");
        contato.setEndereco(endereco);

        System.out.println("Nome: " + contato.getNome());
        if(contato.getEndereco() != null) {
            System.out.println("Endereço: " + contato.getEndereco().getRua() + ", " + contato.getEndereco().getNumero() + ", " + contato.getEndereco().getComplemento() + ", " + contato.getEndereco().getCidade() + ", " + contato.getEndereco().getEstado() + ", " + contato.getEndereco().getCep());
        } else {
            System.out.println("Endereço: Não informado");
        }
        
        if(contato.getTelefone() != null && contato.getTelefone().length > 0) {
            for(Telefone tel : contato.getTelefone()) {
                System.out.println("Telefone: (" + tel.getDdd() + ") " + tel.getNumero() + " - " + tel.getTipo());
            }
        } else {
            System.out.println("Telefone: Não informado");
        }
    }
}
