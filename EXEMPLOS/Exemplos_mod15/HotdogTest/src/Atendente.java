public class Atendente {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        comanda.setBuilder(new HotdogSalsicha());
        Hotdog hotdog = comanda.buildHotdog();
        System.out.println(hotdog);
    }
}
