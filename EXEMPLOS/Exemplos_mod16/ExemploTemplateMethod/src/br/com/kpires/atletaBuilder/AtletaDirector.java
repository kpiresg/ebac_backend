package br.com.kpires.atletaBuilder;

import br.com.kpires.templateMethod.Atleta;

public class AtletaDirector {
    AtletaBuilder builder;

    public void setBuilder(AtletaBuilder builder) {
        this.builder = builder;
    }

    public Atleta buildAtleta() {
        builder.buildNome();
        builder.buildIdade();
        builder.buildPeso();
        builder.build();
        return builder.build();
    }
}
