public abstract class BoloBuilder {
    Bolo bolo = new Bolo();

    abstract void saborBuild();
    abstract void recheioBuild();
    abstract void tamanhoBuild();

    Bolo build() {
        return this.bolo;
    }
}
