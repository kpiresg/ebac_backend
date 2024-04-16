import java.util.HashMap;
import java.util.Map;

public class ClienteMap {
    Map<Long, Pessoa> pessoaMap = new HashMap<>();

    public void cadastrar(Pessoa pessoa) {
        this.pessoaMap.put(pessoa.getCpf(), pessoa);
    }

    public Pessoa consultar(Long cpf) {
        return this.pessoaMap.get(cpf);
    }

    public void excluir(Long cpf, Pessoa pessoa) {
        Pessoa pessoaCadastrada = this.pessoaMap.get(cpf);
        this.pessoaMap.remove(pessoaCadastrada.getCpf(), pessoaCadastrada);
    }
}
