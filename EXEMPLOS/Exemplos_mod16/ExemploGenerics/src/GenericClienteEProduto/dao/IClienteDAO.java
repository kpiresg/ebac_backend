package GenericClienteEProduto.dao;

import GenericClienteEProduto.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Long cpf);
    public Cliente consultar(Long cpf);
    public Collection buscarTodos();
}
