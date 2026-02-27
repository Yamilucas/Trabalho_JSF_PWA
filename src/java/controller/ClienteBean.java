package controller;

import dao.ClienteDAO;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.util.List;
import model.Cliente;

@ManagedBean(name = "clienteBean")
@SessionScoped
public class ClienteBean {
    private Cliente cliente;
    private ClienteDAO clienteDAO;
    
    public ClienteBean() {
        cliente = new Cliente();
        clienteDAO = new ClienteDAO();
    }
    
    public String inserir() {
        clienteDAO.insert(cliente);
        cliente = new Cliente();
        return "listagem.xhtml";
    }
    

    
public String voltar() {
        cliente = new Cliente();
        return "index.xhtml";        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clienteDAO.findAll();
    }

      
}