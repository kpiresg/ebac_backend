package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;
    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    @Override
    public void alterar(Long cpf) {
        if (this.map.containsKey(cpf)) {
            Cliente cliente = this.map.get(cpf);
            cliente.setNome(cliente.getNome());
            cliente.setIdade(cliente.getIdade());
            cliente.setCidade(cliente.getCidade());
            cliente.setEstado(cliente.getEstado());
        } else {
            System.out.println("Esse cpf não possuí nenhum cliente cadastrado." +
                    " Por favor, use o cadastrar para incluir este cliente.");
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }

}
