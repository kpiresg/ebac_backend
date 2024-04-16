package br.com.kpires.atletaBuilder.atletas;

import br.com.kpires.atletaBuilder.AtletaBuilder;

public class João extends AtletaBuilder {
    @Override
    protected void buildNome() {
        atleta.setNome("João");
    }

    @Override
    protected void buildIdade() {
        atleta.setIdade(21);
    }

    @Override
    protected void buildPeso() {
        atleta.setPeso(75);
    }
}
