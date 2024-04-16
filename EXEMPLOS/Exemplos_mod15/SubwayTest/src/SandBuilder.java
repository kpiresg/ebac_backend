public abstract class SandBuilder {

    Sand sand = new Sand();

    abstract void buildPao();
    abstract void buildMolho();
    abstract void buildSalada();
    abstract void buildCarne();

    Sand build() {
        return sand;
    }
}
