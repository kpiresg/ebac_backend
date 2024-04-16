public class Atendente {

    public static void main(String[] args) {

        Comanda comanda = new Comanda();

        comanda.setPastelBuilder(new PastelDeFrango());
        Pastel pastel1 = comanda.buildPastel();

        comanda.setPastelBuilder(new PastelDeCarne());
        Pastel pastel2 = comanda.buildPastel();

        System.out.println(pastel1);
        System.out.println(pastel2);
    }
}
