package org.booleancaeer.java;

import java.util.Random;

//
//Snack4 (Bonus)
//Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi elementi random 
//finchè il numero di elementi presenti nell'array che ne ha di meno + quelli mostrati a video non è uguale al numero di elementi presenti nell'array che ne ha di più
//--
//Creare due array di dimensione diversa e stampare un numero di valori interi casuali pari alla differenza di dimensione
//(es: arr1.length = 3; arr2.length = 10;  --> stampo 7 valori interi casuali)

public class snack4 {

	public static void main(String[] args) {
		// PRENDO LA CLASSE PER I NUMERI RANDOM
		Random rand = new Random();
		
		
		// CREO I DUE ARRAY DI LUNGHEZZA DIVERSA
		
			// ARRAY 1 PIU' CORTO
		int[] array1 = new int[22];
			// ARRAY 2 PIU' LUNGO
		int[] array2 = new int[3];
		
		// ISTANZIO UN VARIABILE PER LA LUNGHEZZA
		int lengthDiff = 0;

		// IN UNA CONDIZIONE VEDO LA DIFFERENZA TRA GLI ARRAY
		 if(array1.length == array2.length) {
			System.out.println("The arrays have the same length.");
			return;
		 }else {
			 lengthDiff = Math.abs(array1.length - array2.length);
		 }

		// STAMPO LA DIFFERENZA IN CONSOLE
		System.out.println("DIFF : " + lengthDiff);
		
// UNA VOLTA TROVATA LA DIFFERENZA CICLO PER LA DIFFERENZA IN MODO DA OTTENERE NUMERI RANDOM
		for(int i = 0; i < lengthDiff; i++) {
			
			// CREO UN NUMERO RANDOM E LO STAMPO DA 0-200
			int randomNumber = rand.nextInt(201);
			System.out.println(randomNumber);
		}

		
	}
	
}
