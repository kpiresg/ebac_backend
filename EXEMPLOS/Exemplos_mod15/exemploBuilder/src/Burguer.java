public class Burguer {
    private String bun = "no bun";
    private String sauce = "no sauce";
    private String salad = "no salad";
    private String cheese = "no cheese";
    private String meat = "no meat";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "Burguer finalizado!" +
                "\nPão: " + bun +
                "\nMolho: " + sauce +
                "\nSalada: " + salad +
                "\nQueijo: " + cheese +
                "\nCarne: " + meat;
    }
}
