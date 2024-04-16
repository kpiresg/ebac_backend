public class Pessoa {

    String nome;
    Long cpf;
    int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = Long.parseLong(cpf);
    }

    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }
}
