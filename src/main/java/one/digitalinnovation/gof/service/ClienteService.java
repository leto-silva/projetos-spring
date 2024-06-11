package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.beans.factory.annotation.*;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma interface
 * 
 * @author eugenio.silva
 */

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long Id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long Id, Cliente cliente);
	
	void deletar(Long Id);

}
