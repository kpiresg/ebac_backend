package br.com.kpires;

import br.com.kpires.atletaBuilder.AtletaDirector;
import br.com.kpires.atletaBuilder.atletas.João;
import br.com.kpires.templateMethod.Atleta;
import br.com.kpires.templateMethod.Trabalhador;

public class App {

    public static void main(String[] args) {
        AtletaDirector director = new AtletaDirector();
        director.setBuilder(new João());
        Atleta joao = director.buildAtleta();

        Trabalhador t = new Atleta();

        System.out.println(joao);
        t.executar();
    }
}
