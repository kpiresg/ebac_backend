import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        Scanner scanNome = new Scanner(System.in);
        Scanner scanNumAlunos = new Scanner(System.in);
        Scanner scanChamaAluno = new Scanner(System.in);
        Scanner scanNumChamada = new Scanner(System.in);
        Map<Integer, String> lista = new TreeMap<>();

        System.out.println("Digite o numero de alunos: ");
        Integer numAlunos = scanNumAlunos.nextInt();
        Integer numAluno = 1;
        String[] nomeAluno = new String[numAlunos];

        for(int i = 0; i < numAlunos; i++) {
            System.out.println("Defina o nome do aluno: ");
            nomeAluno[i] = scanNome.nextLine();
            lista.put(numAluno++, nomeAluno[i]);
        }

        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for(Map.Entry<Integer, String> e : entry) {
            System.out.println("Nº da chamada: " + e.getKey());
            System.out.println("Nome do aluno: " + e.getValue());
        }
        
        System.out.println("Deseja chamar algum aluno? (Caso sim, digite 'sim')");
        String chamaAluno = scanChamaAluno.nextLine();
        
        if (chamaAluno.equalsIgnoreCase("sim")) {
            System.out.println("Digite o numero da chamada: ");
            int numChamada = scanNumChamada.nextInt();
            System.out.println(lista.get(numChamada));
        }
    }
}