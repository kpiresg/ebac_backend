public class DemoBuilder {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(new CheeseBurguerBuilder());
        Burguer burguer = gerente.buildBurguer();
        System.out.println(burguer);

        System.out.println();

        Gerente gerente1 = new Gerente(new VeganCheeseBurguerBuilder());
        Burguer burguer1 = gerente1.buildBurguer();
        System.out.println(burguer1);
    }
}
