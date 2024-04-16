public abstract class HotdogBuilder {

    Hotdog hotdog = new Hotdog();

    abstract void paoBuild();
    abstract void carneBuild();
    abstract void molho1Build();
    abstract void molho2Build();

    Hotdog build() {
        return hotdog;
    }
}
