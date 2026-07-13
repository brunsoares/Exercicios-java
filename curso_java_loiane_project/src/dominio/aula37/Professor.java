package dominio.aula37;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    /** GET e SET */
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: R$" + salario);
    }
    
}
