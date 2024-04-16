import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefineAluno {

    Aluno aluno = new Aluno(null, null, null);
    Scanner scanNome = new Scanner(System.in);
    Scanner scanCurso = new Scanner(System.in);
    Scanner scanSala = new Scanner(System.in);
    Scanner scanNota = new Scanner(System.in);
    Scanner scanContinue = new Scanner(System.in);

    List alunoList = new ArrayList<Aluno>();

    public void defineAluno() {

        while (1 == 1) {
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(scanNome.nextLine());
            System.out.println("Digite o curso do aluno: ");
            aluno.setCurso(scanCurso.nextLine());
            System.out.println("Digite a sala do aluno: ");
            aluno.setSala(scanSala.nextLine());
            System.out.println("Digite a nota do aluno: ");
            aluno.setNota(scanNota.nextDouble());

            alunoList.add(aluno.getNome());
            alunoList.add(aluno.getCurso());
            alunoList.add(aluno.getSala());
            alunoList.add(aluno.getNota());

            mostraAluno();

            System.out.println("Deseja adicionar outro aluno? (caso sim, digite 'sim')");
            String result = scanContinue.nextLine();

            if (result.equalsIgnoreCase("sim")) {
                continue;
            } else {
                System.out.println("Ok. Finishing program");
                break;
            }
        }
    }

    public void mostraAluno() {

        System.out.println("Aluno adicionado!");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Sala: " + aluno.getSala());
        System.out.println("Nota: " + aluno.getNota());
    }

    public List getAlunoList() {
        return alunoList;
    }

}
