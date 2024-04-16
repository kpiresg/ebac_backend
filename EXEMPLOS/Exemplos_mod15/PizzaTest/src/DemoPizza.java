public class DemoPizza {

    public static void main(String[] args) {

        Comanda comanda = new Comanda();
        ScanPizza scanPizza = new ScanPizza();

        scanPizza.scanPizza();

        comanda.setBuilder(scanPizza.getPizza());
        Pizza pizza = comanda.buildPizza();
        System.out.println(pizza);

        //comanda.setBuilder(new PizzaCamarao_Carbonara());
        //Pizza pizza1 = comanda.buildPizza();
        //System.out.println(pizza1);
    }
}
