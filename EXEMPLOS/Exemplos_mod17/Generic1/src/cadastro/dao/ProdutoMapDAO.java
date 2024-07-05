package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Persistente;
import cadastro.domain.Produto;

import java.util.Map;

public class ProdutoMapDAO extends GenericDAO<Produto> implements IProdutoDAO {
    public ProdutoMapDAO() {
        super();
    }

    Produto produto;

    @Override
    public Class<Produto> getTypeClass() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Long codigo, Produto entity) {
        Map<Long, Produto> mapInterno = this.map.get(getTypeClass());
        Produto produtoChange = mapInterno.get(codigo);
        produtoChange.setNome(entity.getNome());
        produtoChange.setCodigo(entity.getCodigo());
    }

}
