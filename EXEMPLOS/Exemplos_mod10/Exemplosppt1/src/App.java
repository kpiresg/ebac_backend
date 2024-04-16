import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        System.out.println("Digite uma NOTA entre 0 a 10: ");
        Scanner nota = new Scanner(System.in);
        Float result = nota.nextFloat();

        while (result > 10 || result < 0) {
            System.out.println("O valor é invalido, por favor digite uma nota entre 0 e 10:");
            result = nota.nextFloat();
        }

        if (result < 5) {
            System.out.println("REPROVADO! " + result + " é menor que 5");
        } else if (result == 5.0) {
            System.out.println("APROVADO! Você tirou 5.0 e esta na média exata!");
        } else {
            System.out.println("APROVADO! " + result + " é maior que 5, PARABENS!");
        }

        nota.close();
    }
}
