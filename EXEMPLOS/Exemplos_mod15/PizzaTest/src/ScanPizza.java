import java.util.Scanner;

public class ScanPizza {
    PizzaBuilder pizza;

    public PizzaBuilder getPizza() {
        return pizza;
    }
    public void scanPizza() {

        System.out.println("Selecione a pizza: ");
        System.out.println("Digite '1' - Pizza Frango/Carne \n" +
                "Digite '2' - Pizza Camarão/Carbonara \n" +
                "Digite '3' - Pizza Portuguesa/Bacon");

        Scanner scan = new Scanner(System.in);
        String textScan = scan.nextLine();
        scan.close();

        if (textScan.equals("1")) {
            pizza = new PizzaFrango_Carne();
        } else if (textScan.equals("2")){
            pizza = new PizzaCamarao_Carbonara();
        } else {
            pizza = new PizzaPortuguese_Bacon();
        }
    }
}
