import java.io.Console;
import java.util.Scanner;

public class CastingExec {

    public static void main(String args[]) {

        Scanner valor = new Scanner(System.in);
        int n_int;

        System.out.println("Digite um valor inteiro: ");
        n_int = valor.nextInt();

        Integer nInteger = Integer.valueOf(n_int);
        Float nFloat = (float) nInteger;

        System.out.println("O valor digitado foi: " + n_int);
        System.out.println("E o valor Wrapper Decimal dele é: " + nFloat);

        valor.close();
    }
}
