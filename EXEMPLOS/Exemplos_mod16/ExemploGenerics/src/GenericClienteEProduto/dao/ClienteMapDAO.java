package GenericClienteEProduto.dao;

import GenericClienteEProduto.TemplateMethod.ChangeClient;
import GenericClienteEProduto.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        } else {
            this.map.put(cliente.getCpf(), cliente);
            return true;
        }
    }

    @Override
    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    @Override
    public void alterar(Long cpf) {
        Cliente clienteAlterar = this.map.get(cpf);
        ChangeClient changeClient = ChangeClient.getInstance();
        clienteAlterar.setName(changeClient.getNome());
        clienteAlterar.setYearsOld(changeClient.getIdade());
        clienteAlterar.setCity(changeClient.getCidade());
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection buscarTodos() {
        return this.map.values();
    }

}
