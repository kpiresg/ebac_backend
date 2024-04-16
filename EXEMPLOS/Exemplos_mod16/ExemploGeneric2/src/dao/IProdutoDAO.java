package dao;

import domain.Cliente;
import domain.Produto;

import java.util.Collection;

public interface IProdutoDAO {

    public Boolean cadastrar(Produto produto);
    public void excluir(Long cpf);
    public void alterar(Long cpf);
    public Produto consultar(Long cpf);
    public Collection<Produto> buscarTodos();
}
