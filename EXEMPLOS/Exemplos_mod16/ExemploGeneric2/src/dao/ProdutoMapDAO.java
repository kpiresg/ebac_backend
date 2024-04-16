package dao;

import domain.Cliente;
import domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoMapDAO implements IProdutoDAO{

    Map<Long, Produto> map;
    public ProdutoMapDAO() {
        this.map = new HashMap<>();
    }


    @Override
    public Boolean cadastrar(Produto produto) {
        if (this.map.containsKey(produto.getCodigo())) {
            System.out.println("Esse produto já foi cadastrado: " + this.map.get(produto.getCodigo()));
            return false;
        }
        this.map.put(produto.getCodigo(), produto);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    @Override
    public void alterar(Long cpf) {
        Produto produto = this.map.get(cpf);
        produto.setNome("Guarana");
    }

    @Override
    public Produto consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return this.map.values();
    }
}
