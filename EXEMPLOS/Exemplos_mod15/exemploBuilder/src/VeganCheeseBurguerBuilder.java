public class VeganCheeseBurguerBuilder extends BurguerBuilder {

    @Override
    void buildBun() {
        burguer.setBun("Pão integral");
    }

    @Override
    void buildSauce() {
        burguer.setSauce("Molho de salada");
    }

    @Override
    void buildSalad() {
        burguer.setSalad("Alface e tomate");
    }

    @Override
    void buildCheese() {
        burguer.setCheese("Vegan cheese");
    }

    @Override
    void buildMeat() {
        burguer.setMeat("Vegan meat");
    }
}
