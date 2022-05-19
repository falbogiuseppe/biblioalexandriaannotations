package entities;

import org.springframework.stereotype.Component;

@Component("BeanCliente")
public class Cliente extends Persona {
	
	private int idCliente;
	
	public String chiediLibro(Libro libro) {
		return getNome() + " ha chiesto il libro " + libro.getTitolo();
	}
	
	public String restituisciLibro(Libro libro) {
		return getNome() + " ha restituito il libro " + libro.getTitolo();
	}

	public Cliente() {
		
	}
	
	public Cliente(int idCliente) {
		super();
		this.idCliente = idCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
	

}
