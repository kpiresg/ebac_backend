public class Bolo {

    String sabor = "sabor indefinido";
    String recheio = "sem recheio";
    String tamanho = "tamanho indefinido";

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Bolo{" +
                "sabor='" + sabor + '\'' +
                ", recheio='" + recheio + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
