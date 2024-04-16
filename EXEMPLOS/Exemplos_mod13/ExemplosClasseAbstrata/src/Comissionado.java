public class Comissionado extends Empregado {
    private Double totalVenda;
    private Double taxaComissao;

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public Double vencimento() {
        return totalVenda / 10;
    }
}
