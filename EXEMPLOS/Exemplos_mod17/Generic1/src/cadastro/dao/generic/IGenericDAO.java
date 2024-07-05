package cadastro.dao.generic;

import cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity);
    public void alterar(Long codigo, T entity);
    public void excluir(Long codigo);
    public T buscar(Long codigo);
    public Collection<T> buscarTodos();

}
