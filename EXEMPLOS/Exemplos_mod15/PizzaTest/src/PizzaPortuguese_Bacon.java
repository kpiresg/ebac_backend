public class PizzaPortuguese_Bacon extends PizzaBuilder {

    @Override
    void sabor1Build() {
        pizza.setSabor1("Portuguesa");
    }

    @Override
    void sabor2Build() {
        pizza.setSabor2("Bacon");
    }

    @Override
    void tamanhoBuild() {
        pizza.setTamanho("Medio");
    }
}
