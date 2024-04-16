public class ClubeDeFutebol {
    private String nome;
    private String cor;
    private int idadeDoClube;

    // Método para colocar o nome, cor e idade do clube.
    public void setValores(String nome, String cor, int idadeDoClube) {
        this.nome = nome;
        this.cor = cor;
        this.idadeDoClube = idadeDoClube;
    }

    // Método para pegar nome
    public String getNome() {
        return nome;
    }

    // Método para pegar cor
    public String getCor() {
        return cor;
    }

    // Método para pegar idade do clube
    public int getIdadeDoClube() {
        return idadeDoClube;
    }

    // Método para mostrar no terminal
    public void mostrarValores() {
        System.out.println("Nome do Clube: " + nome);
        System.out.println("Cor do clube: " + cor);
        System.out.println("Idade do clube: " + idadeDoClube);
    }
}
