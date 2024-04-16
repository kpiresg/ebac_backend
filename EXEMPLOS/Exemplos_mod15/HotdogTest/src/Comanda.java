public class Comanda {
    HotdogBuilder builder;

    public void setBuilder(HotdogBuilder builder) {
        this.builder = builder;
    }

    public Hotdog buildHotdog() {
        builder.paoBuild();
        builder.carneBuild();
        builder.molho1Build();
        builder.molho2Build();
        return builder.build();
    }
}
