public class Horista extends Empregado {

    private Double precoHora;
    private Double horaTrabalhada;

    @Override
    public Double vencimento() {
        return precoHora * horaTrabalhada;
    }
}
