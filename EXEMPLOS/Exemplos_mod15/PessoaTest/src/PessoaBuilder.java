public abstract class PessoaBuilder {

    Pessoa pessoa = new Pessoa();

    abstract void nomeBuild();
    abstract void cpfBuild();
    abstract void idadeBuild();

    Pessoa build() {
        return pessoa;
    }
}
