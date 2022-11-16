package org.booleancaeer.java;

//Snack 5
// Dato il seguente array 
// int[] arr = { 70, 39, 18, 36, 51, 59, 1, 47, 67, 87}
/* CALCOLA :
 *  IL NUMERO MINORE
 *  IL NUMERO MAGGIORE
 *  LA MEDIA  
 *  LA SOMMATORIA */

public class snack5 {

	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 36, 51, 59, 1, 47, 67, 87 };
		
		// NUMERO MINIMO strat
		int minValor = arr[0];
		
		
		//NUMERO MASSIMO start
		int maxValor = arr[0];
		
		//AVG start
		int avg = 0;
		
		//SOMMATORIA start
		int sum = 0;
		
		//FACCIO UN CICLO FOR
		for(int i = 0;i < arr.length ; i++) {
			
			// CICLO PER OGNI VALORE IN MODO DA SALVARE IL PIU' PICCOLO O IL PIU' GRANDE
			minValor = Math.min(minValor, arr[i]);
			maxValor = Math.max(maxValor, arr[i]);
			// SOMMO OGNI ELEMENTO OTTENUTO
			sum += arr[i];
		}
		
		// ALLA SOMMA LEVO LA L'UNGHEZZA DELL'ARRAY
		avg = sum / arr.length ;
		
		System.out.println("min : " + minValor);
		System.out.println("max : " + maxValor);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
