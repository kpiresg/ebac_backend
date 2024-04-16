public class Sand {

    private String pao = "sem pao";
    private String molho = "sem molho";
    private String salada = "sem salada";
    private String carne = "sem carne";

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public String toString() {
        return "Sand{" +
                "pao='" + pao + '\'' +
                ", molho='" + molho + '\'' +
                ", salada='" + salada + '\'' +
                ", carne='" + carne + '\'' +
                '}';
    }
}
