package dominio.aula36;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public void checkMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double result = soma / notas.length;
        if(result >= 7){
            System.out.println("Aprovado: " + result);
        } else {
            System.out.println("Reprovado: " + result);
        }
    }

    /** GET e SET */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
