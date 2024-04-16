public class Pastel {

    String tamanho = "tamanho indefinido";
    String carne = "sem carne";
    String molho = "sem molho";

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "tamanho='" + tamanho + '\'' +
                ", carne='" + carne + '\'' +
                ", molho='" + molho + '\'' +
                '}';
    }
}
