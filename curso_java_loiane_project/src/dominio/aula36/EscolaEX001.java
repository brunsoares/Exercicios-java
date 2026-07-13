package dominio.aula36;

public class EscolaEX001 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setNome("Java");
        curso.setHorario("19:00");
        // Professor
        Professor professor = new Professor();
        professor.setNome("João");
        professor.setDepartamento("TI");
        professor.setEmail("joao@universidade.com");
        curso.setProfessor(professor);
        // Alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Maria");
        aluno1.setMatricula("123");
        aluno1.setNotas(new double[]{9.0, 8.5, 7.5});
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pedro");
        aluno2.setMatricula("456");
        aluno2.setNotas(new double[]{8.0, 3.5, 6.5});
        curso.setAlunos(new Aluno[]{aluno1, aluno2});

        // Exibir informações dos alunos
        aluno1.checkMedia();
        aluno2.checkMedia();
    }
}
