package cadastro.dao.generic;

import cadastro.domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTypeClass();
    public abstract void atualizarDados(Long codigo, T entity);

    public GenericDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapInterno = this.map.get(getTypeClass());

        if(mapInterno.containsKey(entity.getCodigo())){
            return false;
        }
        mapInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void alterar(Long codigo, T entity) {
        atualizarDados(codigo, entity);
    }

    @Override
    public void excluir(Long codigo) {
        Map<Long, T> mapInterno = this.map.get(getTypeClass());
        mapInterno.remove(codigo);
    }

    @Override
    public T buscar(Long codigo) {
        Map<Long, T> mapInterno = this.map.get(getTypeClass());
        return mapInterno.get(codigo);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapInterno = map.get(getTypeClass());
        return mapInterno.values();
    }
}
