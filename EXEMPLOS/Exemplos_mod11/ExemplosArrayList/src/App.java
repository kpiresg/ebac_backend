import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        addLista();
    }

    private static void addLista() {
        Scanner scan = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        while (1 == 1) {
            System.out.println("Digite um nome: ");
            nomes.add(scan.nextLine());

            Collections.sort(nomes);
            System.out.println(nomes);

            System.out.println("Deseja adicionar outro nome? (Caso sim, digite 'Sim')");
            String result = scan.nextLine();
            
            if (result.equalsIgnoreCase("Sim")) {
                continue;
            } else {
                break;
            }
        }
    }


}
