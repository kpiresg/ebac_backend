package Generics;

import Generics.domain.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Carro> ListaCarros = new ArrayList<Carro>();

        ListaCarros.add(new Ferrari());
        ListaCarros.add(new Porsche());
        ListaCarros.add(new Honda());
        ListaCarros.add(new Tesla());

        for(Carro carros : ListaCarros) {
            System.out.println(carros);
        }

    }

}
