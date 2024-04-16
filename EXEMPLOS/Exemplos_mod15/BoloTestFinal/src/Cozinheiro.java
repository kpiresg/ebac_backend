public class Cozinheiro {

    BoloBuilder builder;

    public void setBuilder(BoloBuilder bolo) {
        this.builder = bolo;
    }

    Bolo boloBuilder() {
        builder.saborBuild();
        builder.recheioBuild();
        builder.tamanhoBuild();

        return builder.build();
    }
}
