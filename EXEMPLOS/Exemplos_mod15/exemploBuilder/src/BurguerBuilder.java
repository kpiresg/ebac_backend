public abstract class BurguerBuilder {

    Burguer burguer = new Burguer();

    abstract void buildBun();
    abstract void buildSauce();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buildMeat();

    Burguer build() {
        return burguer;
    }
}
