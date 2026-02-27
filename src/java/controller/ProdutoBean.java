package controller;

import dao.ProdutoDAO;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.util.List;
import model.Produto;

@ManagedBean(name = "produtoBean")
@SessionScoped
public class ProdutoBean {
    private Produto produto;
    private ProdutoDAO produtoDAO;
    
    public ProdutoBean() {
        produto = new Produto();
        produtoDAO = new ProdutoDAO();
    }
    
    public String inserir() {
        produtoDAO.insert(produto);
        produto = new Produto();
        return "listagem.xhtml";
    }
    
    public Produto getProduto() {
        return produto; 
    }
    public void setProduto(Produto produto) { 
        this.produto = produto; 
    }
    public List<Produto> getProdutos() {
        return produtoDAO.findAll();
    }
      public String voltar() {
        produto = new Produto();
        return "index.xhtml";        
    }
}