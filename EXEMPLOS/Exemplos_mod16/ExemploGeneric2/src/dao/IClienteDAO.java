package dao;

import domain.Cliente;
import domain.Produto;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Long cpf);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
