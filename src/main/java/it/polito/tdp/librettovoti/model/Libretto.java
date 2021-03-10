package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto { //CLASSE CHE CONTIENTE TANTI VOTI CHE POSSO METTERE IN UNA LISTA
	
	private List <Voto> voti ; //no metodi getter e setter, solo io posso modificarli
	                           //può essere array e linked list, che entrambe implementano la interfaccia list 
	                           // entrambe definiscono le operazioni che definiscono le liste perchè l'interfaccia comune è quella list
//OGNI LISTA CONTIENE UNA CERTA TIPOLOGIA DI OGGETTI E CON <> DICO CHE TIPO DI OGGETTI CONTIENE

	public Libretto() { //COSTRUTTORE VUOTO
	super();
	this.voti = new ArrayList <>(); //inizializzo la nuova variabile con un nuovo oggetto, creo lista
	                                //QUANDO CREO UN OGGETTO DEVO DIRE TIPO DI LISTA Linked, Array etc..
	                                //unica riga che mi definisce la tipologia, cambio solo in questo punto il tipo di lista
}

	public void add(Voto v1) {
		this.voti.add(v1);
		
	}

	@Override
	public String toString() {
		String s = "";
		for (Voto v: this.voti)
			s= s+ v.toString()+ "\n";
		return s;
	}
	
	


	


}
