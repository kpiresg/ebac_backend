public class PessoaSophia extends PessoaBuilder {


    @Override
    void nomeBuild() {
        pessoa.setNome("Sophia");
    }

    @Override
    void cpfBuild() {
        pessoa.setCpf("123");
    }

    @Override
    void idadeBuild() {
        pessoa.setIdade("10");
    }
}
