import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;

public class ExemploHashSet {
    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {

        Set<Aluno> lista = new HashSet<Aluno>();
        Scanner text = new Scanner(System.in);
        
        Aluno a = new Aluno("Kauan", "SI", 10.0);
        Aluno b = new Aluno("Lucas", "Historia", 10.0);
        Aluno c = new Aluno("Gabriele", "Design", 10.0);
        Aluno d = new Aluno("Gabriele", "Design", 8.0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        System.out.println(lista);
    }

    
}
