public class Gerente {
    BurguerBuilder builder;

    public Gerente(BurguerBuilder builder) {
        this.builder = builder;
    }

    public Burguer buildBurguer() {
        builder.buildBun();
        builder.buildSauce();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildMeat();
        return builder.build();
    }
}
