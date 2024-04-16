public class PizzaFrango_Carne extends PizzaBuilder{


    @Override
    void sabor1Build() {
        pizza.setSabor1("Frango");
    }

    @Override
    void sabor2Build() {
        pizza.setSabor2("Carne");
    }

    @Override
    void tamanhoBuild() {
        pizza.setTamanho("Grande");
    }
}
