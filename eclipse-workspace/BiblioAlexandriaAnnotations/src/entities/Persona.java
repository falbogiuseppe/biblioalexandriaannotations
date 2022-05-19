package entities;

import org.springframework.stereotype.Component;

@Component("BeanPersona")
public class Persona {

	private String nome;
	private String cognome;
	private int eta;
	private String indirizzo;
	private int numeroTelefono;
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, int eta, String indirizzo, int numeroTelefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
	
	
}
