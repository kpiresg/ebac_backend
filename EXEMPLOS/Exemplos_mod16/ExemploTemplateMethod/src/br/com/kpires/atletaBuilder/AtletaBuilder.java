package br.com.kpires.atletaBuilder;

import br.com.kpires.templateMethod.Atleta;

public abstract class AtletaBuilder {
    protected Atleta atleta = new Atleta();

    protected abstract void buildNome();
    protected abstract void buildIdade();
    protected abstract void buildPeso();

    Atleta build() {
        return atleta;
    }
}
