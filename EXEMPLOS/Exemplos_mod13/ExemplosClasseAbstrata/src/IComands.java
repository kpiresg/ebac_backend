public interface IComands {

    default void print(String texto) {
        System.out.println(texto);
    }
}
