package org.booleancaeer.java;

import java.util.Random;

/* 
 * Snack 8 - BONUS
Creare un array di 10 elementi interi random compresi tra -50 e +50 (utilizzare l'oggetto random con seed 128 new Random(128))

// Risultato atteso
new int[] { 39, -32, -48, 25, 17, -27, 8, -13, -30, 40 }
trovare il valore assoluto piu' grande e stampare il valore corrispondente
// Risultato atteso
(int) -48
trovare il valore assoluto piu' piccolo e stampare il valore corrispondente
// Risultato atteso
(int) 8
calcolare la sommatoria dei valori multipli di 5
// Risultato atteso
(int) 35
*/

public class snack8 {

	public static void main(String[] args) {
		
		// CHIAMO LA CLASSE RANDOM CON IL SEED
		Random rand = new Random(128);
		
		// CREO L'ARRAY DOVE INSERIRO' I NUMERI
		int[] numbersRand = new int[10];
		
		// NUMERO MINIMO strat
		int minValor = numbersRand[0];
					
		//NUMERO MASSIMO start
		int maxValor = numbersRand[0];
		
		//VARIABILE PER LA SOMMA DEI MULTIPLI DI 5
		int sum = 0;
		
		//CREO UN CICLO FOR PER PRENDERE OGNI ELEMENTO
				for (int i = 0; i < numbersRand.length; i++){
					
					// CREO I NUMERI RAND
					int randNumb = rand.nextInt(101)-50;
					
					// ASSEGNO ALL'ARRAY I NUMERI e li stampo
					numbersRand[i] = randNumb;
					System.out.print(numbersRand[i] + ",");
					
					//controlliamo il numero minore e maggiore
					// CICLO PER OGNI VALORE IN MODO DA SALVARE IL PIU' PICCOLO O IL PIU' GRANDE
					minValor = Math.min(minValor, Math.abs(numbersRand[i]));
					maxValor = Math.max(maxValor, Math.abs(numbersRand[i]));
					
					// USIAMO UN IF PER CONTROLLARE QUALE NUM E' MULTIPLO DI 5
					if(numbersRand[i] % 5 == 0) {
						sum += numbersRand[i];
					}
				}
				
				// STAMPO I RISULTATI
				System.out.println("\n -----------------");
				System.out.println("min : " + minValor);
				System.out.println("max : " + maxValor);
				System.out.println("La somma dei valori multipli di 5 è : " + sum);
	}
	
}
