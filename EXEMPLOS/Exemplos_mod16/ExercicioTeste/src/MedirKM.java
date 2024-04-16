public class MedirKM implements IMedidores{
    @Override
    public int medir(int v1, int v2) {
        return v2 / 1000 - v1 / 1000;
    }
}
