package tarefaCalculoMédia;

public class Exercicio {

    public static void main(String args[]) {
        calculaMedia();
    }

    public static void calculaMedia() {
        int notaA1 = 4;
        int notaA2 = 8;
        int notaA3 = 2;
        int notaA4 = 10;

        int media = (notaA1 + notaA2 + notaA3 + notaA4) / 4;
        System.out.println("A nota do aluno 1 é: " + notaA1);
        System.out.println("A nota do aluno 2 é: " + notaA2);
        System.out.println("A nota do aluno 3 é: " + notaA3);
        System.out.println("A nota do aluno 4 é: " + notaA4);
        System.out.println("A nota média foi: " + media);
    }
}
