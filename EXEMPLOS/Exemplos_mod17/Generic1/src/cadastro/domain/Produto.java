package cadastro.domain;

public class Produto implements Persistente {

    Long codigo;
    String nome;

    public Produto(String nome, String codigo) {
        this.nome = nome;
        this.codigo = Long.parseLong(codigo);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
