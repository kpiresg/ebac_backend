public class HotdogSalsicha extends HotdogBuilder {

    @Override
    void paoBuild() {
        hotdog.setPao("Pão francês");
    }

    @Override
    void carneBuild() {
        hotdog.setCarne("Salsicha");
    }

    @Override
    void molho1Build() {
        hotdog.setMolho1("Ketchup");
    }

    @Override
    void molho2Build() {
        hotdog.setMolho2("Mostarda");
    }
}
