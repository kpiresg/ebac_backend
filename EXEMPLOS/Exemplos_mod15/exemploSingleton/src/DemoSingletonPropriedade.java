public class DemoSingletonPropriedade {

    public static void main(String[] args) {

        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Bom dia!");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Boa tarde!");
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
