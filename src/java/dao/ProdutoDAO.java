package dao;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private List<Produto> produtos;
    
    public ProdutoDAO() {
        produtos = new ArrayList<>();
    }
    
    public List<Produto> findAll() {
        return produtos;
    }
    
    public boolean insert(Produto produto) {
        produtos.add(produto);
        return true;
    }
}