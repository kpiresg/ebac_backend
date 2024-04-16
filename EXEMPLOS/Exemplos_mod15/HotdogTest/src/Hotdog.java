public class Hotdog {
    String pao = "sem pao";
    String carne = "sem carne";
    String molho1 = "sem molho";
    String molho2 = "sem molho";

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setMolho1(String molho1) {
        this.molho1 = molho1;
    }

    public void setMolho2(String molho2) {
        this.molho2 = molho2;
    }

    @Override
    public String toString() {
        return "Hotdog{" +
                "pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", molho1='" + molho1 + '\'' +
                ", molho2='" + molho2 + '\'' +
                '}';
    }
}
