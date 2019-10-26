package DAO;

import java.util.Iterator;

import model.Cliente;

public interface ClienteDAO {
	public void novoCliente(Cliente cliente);
	public Iterator<Cliente> clientesAssiduos();
}
