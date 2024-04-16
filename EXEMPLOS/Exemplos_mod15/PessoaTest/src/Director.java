public class Director {

    PessoaBuilder builder;

    public void setBuilder(PessoaBuilder builder) {

        this.builder = builder;
    }

    public Pessoa pessoaBuild() {

        builder.nomeBuild();
        builder.cpfBuild();
        builder.idadeBuild();
        return builder.build();
    }
}
