public class SanduicheDeFrango extends SandBuilder{

    @Override
    void buildPao() {
        sand.setPao("Baguete");
    }

    @Override
    void buildMolho() {
        sand.setMolho("4 queijos");
    }

    @Override
    void buildSalada() {
        sand.setSalada("Alface e tomate");
    }

    @Override
    void buildCarne() {
        sand.setCarne("Peito de frango");
    }
}
