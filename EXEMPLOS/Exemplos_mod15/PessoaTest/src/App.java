public class App {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new PessoaSophia());
        Pessoa sophia = director.pessoaBuild();

        System.out.println(sophia);
    }
}
