public class Comanda {

    PizzaBuilder builder;

    //public Comanda(PizzaBuilder builder) {
    //    this.builder = builder;
    //}


    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza buildPizza() {
        builder.sabor1Build();
        builder.sabor2Build();
        builder.tamanhoBuild();
        return builder.build();
    }
}
