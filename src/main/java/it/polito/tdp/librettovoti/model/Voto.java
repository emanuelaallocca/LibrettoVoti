package it.polito.tdp.librettovoti.model;
 import java.time.*;

 //POJO - Plain Old Java Project
 //BEANS - una classe che al suo interno ha le proprieta definite in questo modo costruttore + getter setter
 // è un semplice contenitore di dati - non ha logica, poi ho un'altra classe che fa collegamenti
 
 // /** serve a fare un BLOCCO DI COMMENTO
 /**
  * MEMORIZZA IL RISULTATO DI UN ESAME SINGOLO
  * @author Acco
  *
  */
 
public class Voto {
	
	private String nome;
	private int voto; //30L come o rappresento?
	private LocalDate data; //data superamento esame
	
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data ;
	}
	
	

}
