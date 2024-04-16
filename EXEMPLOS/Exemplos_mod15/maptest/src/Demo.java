import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        ClienteMap map = new ClienteMap();

        Pessoa pessoa = new Pessoa("Kauan", "16", "1234", "60");
        map.cadastrar(pessoa);

        Pessoa consulta = map.consultar(pessoa.getCpf());
        System.out.println(consulta.toString());
    }
}
