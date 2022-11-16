package org.booleancaeer.java;

import java.util.Scanner;

//Esercizio di oggi: Java Snacks
//nome repo: java-snacks
//SNACK1
//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

public class Snack1 {

	public static void main(String[] args) {
		
		// SNACK 1
		
		// APRO CANALE
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		// FACCIO UN CICLO WHILE
		while( i < 5 ) {
			
			System.out.println("inserisci un numero...");
			int number = sc.nextInt();
			
			if(number % 2 == 0) {
				System.out.println(number);
			}
		
			i++;
		}
		
		// CHIUDO CANALE
		sc.close();
		
// ----------------------------------------------------------------
		
	
		
		
	}
}
