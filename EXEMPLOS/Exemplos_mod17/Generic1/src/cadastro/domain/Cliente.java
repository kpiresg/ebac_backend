package cadastro.domain;

public class Cliente implements Persistente {

    String nome;
    Long cpf;
    Long idade;

    public Cliente(String nome, String idade, String cpf) {
        this.nome = nome;
        this.idade = Long.parseLong(idade);
        this.cpf = Long.parseLong(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCodigo(Long codigo) {
        this.idade = codigo;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }

    @Override
    public Long getCodigo() {
        return getCpf();
    }
}
