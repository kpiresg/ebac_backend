public class Comanda {

    SandBuilder builder;

    public Comanda(SandBuilder builder) {
        this.builder = builder;
    }

    public Sand SandBuilder() {
        builder.buildPao();
        builder.buildMolho();
        builder.buildSalada();
        builder.buildCarne();
        return builder.build();
    }
}
