public class Pizza {

    private String sabor1 = "sem sabor";
    private String sabor2 = "sem sabor";
    private String tamanho = "tamanho não definido";

    public void setSabor1(String sabor1) {
        this.sabor1 = sabor1;
    }

    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "sabor1='" + sabor1 + '\'' +
                ", sabor2='" + sabor2 + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
