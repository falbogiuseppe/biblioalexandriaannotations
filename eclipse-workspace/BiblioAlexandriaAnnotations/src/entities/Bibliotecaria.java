package entities;

import org.springframework.stereotype.Component;

import interfaces.ILavoratore;

@Component("BeanBibliotecaria")
public class Bibliotecaria extends Persona implements ILavoratore {

	private int idLavoratore;

	public Bibliotecaria() {
		
	}
	
	public Bibliotecaria(int idLavoratore) {
		super();
		this.idLavoratore = idLavoratore;
	}
	
	public String prestaLibro(Libro libro) {
		return getNome() + " ha prestato il libro " + libro.getTitolo();
	}
	
	public String recuperaLibro(Libro libro) {
		return getNome() + " ha recuperato un libro " + libro.getTitolo();
	}
	
	public String mantieniSilenzio() {
		return getNome() + " sta mantenendo il silenzio";
	}

	public int getIdLavoratore() {
		return idLavoratore;
	}

	public void setIdLavoratore(int idLavoratore) {
		this.idLavoratore = idLavoratore;
	}

	@Override
	public String iniziaTurno() {
		return getNome() + " ha timbrato il cartellino in ingresso";
	}

	@Override
	public String finisciTurno() {
		return getNome() + " ha timbrato il cartellino in uscita";
	}
	
	
	
}
