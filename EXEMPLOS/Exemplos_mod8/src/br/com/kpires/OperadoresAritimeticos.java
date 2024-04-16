package br.com.kpires;

public class OperadoresAritimeticos {


    public static void main(String args[]) {
        operacoesAritimeticas();
    }

    public static void operacoesAritimeticas() {
        int n1 = 10 + 10;
        int n2 = 10 - 5;
        int n3 = 20 * 2;
        int n4 = 10 / 5;
        float n5 = (n1 + n2) / n4;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }

}
