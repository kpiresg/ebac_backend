public class Assalariado extends Empregado {
    private Double salario;

    @Override
    public Double vencimento() {
        return salario;
    }

    public Double getSalario() {
        return vencimento();
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
