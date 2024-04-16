public class PizzaCamarao_Carbonara extends PizzaBuilder {
    @Override
    void sabor1Build() {
        pizza.setSabor1("Camarão");
    }

    @Override
    void sabor2Build() {
        pizza.setSabor2("Carbonara");
    }

    @Override
    void tamanhoBuild() {
        pizza.setTamanho("Pequena");
    }
}
