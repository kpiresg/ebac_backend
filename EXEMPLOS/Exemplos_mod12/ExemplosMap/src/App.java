import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        testeMap();
    }

    private static void testeMap() {
        
        Map<Integer, String> lista = new HashMap<>();
        Scanner scanLista = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja adicionar? ");
        Integer num = scanNum.nextInt();
        int[] numMap = new int[num];

       for(int i = 0; i < num; i++) {
        System.out.println("Defina o número da chamada: ");
        numMap[i] = scanLista.nextInt();
        System.out.println("Defina o nome: ");
        lista.put(numMap[i], scanName.nextLine());
       }

        Set<Map.Entry<Integer, String>> entry = lista.entrySet();

        for(Map.Entry<Integer, String> e : entry) {
            System.out.println("Nº da chamada: " + e.getKey());
            System.out.println("Aluno: " + e.getValue());
        }
    }
}
