package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{
    public ClienteMapDAO() {
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTypeClass());
        if(mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTypeClass(), mapaInterno);
        }
    }

    Cliente cliente;

    @Override
    public Class<Cliente> getTypeClass() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Long codigo, Cliente entity) {
        Map<Long, Cliente> mapInterno = this.map.get(getTypeClass());
        Cliente clienteChange = mapInterno.get(codigo);
        clienteChange.setNome(entity.getNome());
        clienteChange.setIdade(entity.getIdade());
    }

}
