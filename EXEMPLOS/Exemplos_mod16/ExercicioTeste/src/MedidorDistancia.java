public class MedidorDistancia {

    public static void main(String[] args) {

        IMedidores iMedidor = new MedirKM();
        System.out.println(iMedidor.medir(10000, 20000));
    }
}
