public class Pessoa {

    String nome;
    int idade;
    Long cpf;
    float peso;

    public Pessoa(String nome, String idade, String cpf, String peso) {

        this.nome = nome;
        this.idade = Integer.parseInt(idade);
        this.cpf = Long.parseLong(cpf);
        this.peso = Float.parseFloat(peso);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                ", peso=" + peso +
                '}';
    }
}
