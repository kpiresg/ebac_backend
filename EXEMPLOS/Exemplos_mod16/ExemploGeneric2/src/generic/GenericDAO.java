package generic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO <T> implements IGenericDAO<T> {
    Map<Class, Map<Long, String>> map;
    public GenericDAO() {
        this.map = new HashMap<>();
    }
    public abstract Class<T> getClassType();

    @Override
    public Boolean cadastrar(T entity) {
        return null;
    }

    @Override
    public Long excluir(Long valor) {
        return null;
    }

    @Override
    public T consultar(Long valor) {
        return null;
    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public Collection<T> buscarTodos() {
        return null;
    }
}
