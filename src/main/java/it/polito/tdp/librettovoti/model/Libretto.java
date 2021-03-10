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
	
	/*public void stampaVotiUguali (int punteggio) {
		//il libretto stampa da solo i voti
		//fatto per fare System.out --> stampa a video
		//se devo mettere i voti a INTERFACCIA GRAFICA non lo posso usare
	}
	
	public String votiUguali (int punteggio) {
		//calcola una stringa che contiene i voti
		//stampa i voti il chiamante
		//POSSO SCEGLIERE DI STAMPARE POI IN INTERFACCIA --> PIù GENERALE, MEGLIO
	}
	*/
	public List<Voto> listaVotiUguali (int punteggio){
		//restituisce i voti uguali al criterio
		//mi piace perchè risolve il problema di cosa devo stampare
		//PROBLEMA: espone all'esterno la tipologia di struttura dati che sto utilizzando
		
		List <Voto> risultato = new ArrayList <>();
		for (Voto v : this.voti)
			if (v.getVoto()==punteggio)
				risultato.add(v); //so che il mio oggetto è contenuto in liste diverse
		return risultato;
	}
	
	public Libretto votiUguali (int punteggio) {
		//ti do un libretto con quei vuoti, poi se vuoi te li stampi
		Libretto risultato = new Libretto ();
		for (Voto v : this.voti)
			if (v.getVoto()==punteggio)
				risultato.add(v);
		return risultato;
	}
	//LA CLASSE LIBRETTO PUO VEDERE E MODIFICARE INTERNAMENTE I SUOI DATI


	


}
