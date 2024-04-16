public class DemoSand {

    public static void main(String[] args) {

        Comanda comanda = new Comanda(new SanduicheDeFrango());
        Sand sand1 = comanda.SandBuilder();
        System.out.println(sand1);
    }
}
