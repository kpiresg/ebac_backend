public abstract class PizzaBuilder {

    Pizza pizza = new Pizza();

    abstract void sabor1Build();
    abstract void sabor2Build();
    abstract void tamanhoBuild();

    Pizza build() {
        return pizza;
    }
}
