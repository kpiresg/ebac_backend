public class CheeseBurguerBuilder extends BurguerBuilder {

    @Override
    void buildBun() {
        burguer.setBun("White bread");
    }

    @Override
    void buildSauce() {
        burguer.setSauce("Tasty sauce");
    }

    @Override
    void buildSalad() {
        burguer.setSalad("Lettuce and tomato");
    }

    @Override
    void buildCheese() {
        burguer.setCheese("American cheese");
    }

    @Override
    void buildMeat() {
        burguer.setMeat("Burguer meat");
    }
}
