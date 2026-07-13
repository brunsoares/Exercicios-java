package dominio.aula37;

public class Aluno extends Pessoa {
    private String curso;
    private String matricula;
    private double[] notas;

    /** GET e SET */
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }
}
