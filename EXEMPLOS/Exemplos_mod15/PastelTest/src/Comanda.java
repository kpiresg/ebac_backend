public class Comanda {
    PastelBuilder builder;

    public void setPastelBuilder(PastelBuilder builder) {
        this.builder = builder;
    }

    public Pastel buildPastel() {
        builder.tamanhoBuild();
        builder.carneBuild();
        builder.molhoBuild();

        return builder.build();
    }
}
