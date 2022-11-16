package org.booleancaeer.java;

import java.util.Random;

//SNACK2
//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.


public class snack2 {
	
	public static void main(String[] args) {
		
	// SNACK 2
		
		// CREO UN ARRAY DI NOMI
		String[] names = {"Jay", "NIck", "Carey"};
		
		// CREO UN ARRAY DI COGNOMI
		String[] lastNames = {"Gatsby", "Carraway", "buchanan"};
		
		System.out.println(" Lista Invitati : ");
		
		// PRENDO LA CLASSE PER I RANDOM
		Random rnd = new Random();
		
		// CREO UN ARRAY PER STAMPARLI
		String[] fullNames = new String[10];
		
		for( int i = 0; i < 10; i++) {
			
			// ASSEGNO 2 VALORI RANDOM IN BASE ALLA LUNGHEZZA DEI 2 ARRAY
			int randomValue1 = rnd.nextInt(names.length);
			int randomValue2 = rnd.nextInt(lastNames.length);
			
			// STAMPO IL RISULTATO IN BASE AL NUMERO RANDOM TROVATO
			String fullName = names[randomValue1] + " " + lastNames[randomValue2];
			
			// ASSEGNO AD UNA VARIABILE OGNI NOME COMPLETO CREATO
			fullNames[i] = fullName;
			System.out.println(fullNames[i]);
		}
		
	}

}