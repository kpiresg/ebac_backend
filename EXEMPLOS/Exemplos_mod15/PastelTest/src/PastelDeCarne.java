public class PastelDeCarne extends PastelBuilder{
    @Override
    void tamanhoBuild() {
        pastel.setTamanho("Medio");
    }

    @Override
    void carneBuild() {
        pastel.setCarne("Carne");
    }

    @Override
    void molhoBuild() {
        pastel.setMolho("Cheedar");
    }
}
