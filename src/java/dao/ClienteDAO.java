package dao;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> clientes;
    
    public ClienteDAO() {
        clientes = new ArrayList<>();
    }
    
    public List<Cliente> findAll() {
        return clientes;
    }
    
    public boolean insert(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }
    
    
}