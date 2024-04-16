public abstract class PastelBuilder {
    Pastel pastel = new Pastel();

    abstract void tamanhoBuild();
    abstract void carneBuild();
    abstract void molhoBuild();

    Pastel build() {
        return pastel;
    }

}
