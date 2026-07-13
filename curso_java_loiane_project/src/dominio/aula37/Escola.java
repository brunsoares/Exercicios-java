package dominio.aula37;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setCpf("123.456.789-00");
        aluno1.setEndereco("Rua A, 123");
        aluno1.setTelefone("(11) 98765-4321");
        aluno1.setCurso("Engenharia");
        aluno1.setMatricula("20230001");
        aluno1.setNotas(new double[]{8.5, 7.0, 9.0});

        Professor professor1 = new Professor();
        professor1.setNome("Dr. Silva");
        professor1.setCpf("987.654.321-00");
        professor1.setEndereco("Rua B, 456");
        professor1.setTelefone("(11) 91234-5678");
        professor1.setEspecialidade("Matemática");
        professor1.setSalario(5000.00);

        // Exibindo informações do aluno
        aluno1.imprimir();
        
        System.out.println();
        
        // Exibindo informações do professor
        professor1.imprimir();
        
        System.out.println();
        
        System.out.println(Final.getMensagem());
    }
}
