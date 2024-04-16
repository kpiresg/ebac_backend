public class BoloDeChocolate extends BoloBuilder {

    @Override
    void saborBuild() {
        bolo.setSabor("Chocolate");
    }

    @Override
    void recheioBuild() {
        bolo.setRecheio("Chantily");
    }

    @Override
    void tamanhoBuild() {
        bolo.setTamanho("Grande");
    }
}
