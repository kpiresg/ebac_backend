package GenericClienteEProduto.domain;

public class Cliente {
    private String name;
    private Long cpf;
    private int yearsOld;
    private String city;

    public Cliente(String name, String cpf, String yearsOld, String city) {
        this.name = name;
        this.cpf = Long.parseLong(cpf);
        this.yearsOld = Integer.parseInt(yearsOld);
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nNome: " + name +
                "\nCpf: " + cpf +
                "\nIdade: " + yearsOld +
                "\nCidade Natal: " + city + "\n";
    }
}
