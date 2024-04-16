package generic;

import java.util.Collection;

public interface IGenericDAO <T> {

    public Boolean cadastrar(T entity);
    public Long excluir(Long valor);
    public T consultar(Long valor);
    public void alterar(T entity);
    public Collection<T> buscarTodos();
}
