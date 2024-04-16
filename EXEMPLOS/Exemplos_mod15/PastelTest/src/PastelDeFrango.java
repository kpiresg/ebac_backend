public class PastelDeFrango extends PastelBuilder {
    @Override
    void tamanhoBuild() {
        pastel.setTamanho("Grande");
    }

    @Override
    void carneBuild() {
        pastel.setCarne("Frango");
    }

    @Override
    void molhoBuild() {
        pastel.setMolho("Catupiry");
    }
}
