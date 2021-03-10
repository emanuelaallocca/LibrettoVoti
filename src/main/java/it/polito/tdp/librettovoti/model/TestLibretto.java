package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto { //PROGRAMMA CHE CREA 10 VOTI E LI AGGIUNGE

	public static void main(String[] args) {
		
		System.out.println("Test metodi libretto");
		
		Libretto libretto = new Libretto ();
		
		Voto v1 = new Voto ("Analisi 1", 30, LocalDate.of(2019, 2, 15));
		libretto.add(v1);
		libretto.add(new Voto ("Chimica", 25, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto ("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto ("Informatica", 24, LocalDate.of(2019, 9, 15)));
		
		System.out.println(libretto.toString());
		
		List <Voto> venticinque = libretto.listaVotiUguali(25);
		System.out.println(venticinque.toString()); //rappresentazione di una lista con []
		
		Libretto venticinq = libretto.votiUguali(25); //QUESTO LIBRETTO HA ANCHE UN METODO ADD --> POTREI AGGIUNGERE ALTRI VOTI
		System.out.println(venticinq.toString());     //HO OGGETTO CHE SA GESTIRE I PROPRI DATI

	}

}
