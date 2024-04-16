public class DemoBolo {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setBuilder(new BoloDeChocolate());
        Bolo bolo1 = cozinheiro.boloBuilder();

        System.out.println(bolo1);
    }
}
