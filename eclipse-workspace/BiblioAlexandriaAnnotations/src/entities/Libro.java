package entities;

import org.springframework.stereotype.Component;

@Component("BeanLibro")
public class Libro {

	private String titolo;
	private String autore;
	private int annoPubblicazione;
	private int numeroPagine;
	private String genere;
	
	public Libro() {
		
	}
	
	public Libro(String titolo, String autore, int annoPubblicazione, int numeroPagine, String genere) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
}
