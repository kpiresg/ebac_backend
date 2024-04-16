package GeneticTestOneClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericTeste {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Olá");
        list.add("10s");

        List<Long> list2 = new ArrayList<>();
        list2.add(10L);
        list2.add(20L);

        imprimir(list2);
    }

    public static <T> void imprimir(List<T> lista) {
        for (Object st : lista) {
            System.out.println(st);
        }
    }

}
