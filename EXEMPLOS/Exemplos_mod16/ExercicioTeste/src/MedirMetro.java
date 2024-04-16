public class MedirMetro implements IMedidores{
    @Override
    public int medir(int v1, int v2) {
        return v2 - v1;
    }
}
