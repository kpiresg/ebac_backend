import java.lang.reflect.Array;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("Gostaria de gerar uma tabuada? ");

        Scanner sim = new Scanner (System.in);
        String resposta = sim.nextLine();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um número: ");

            Scanner n = new Scanner(System.in);
            int num = n.nextInt();

            for (int multi = 1; multi <= 10; multi++) {
            int result = multi * num;
                System.out.println(num + " X " + multi + " = " + result);
                
            }

            System.out.println("Gostaria de gerar outra tabuada? ");
            resposta = sim.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                continue;
            }
            else {
                System.out.println("Ok. Encerrando programa!");
                break;
            }
        }


    }
}
