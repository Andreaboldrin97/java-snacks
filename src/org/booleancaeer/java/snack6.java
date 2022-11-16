package org.booleancaeer.java;

/*Dati i seguenti array:

int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
// Risultato atteso
new int[] { 112, 95, ... }
trovare il valore minimo all'interno di entrambi gli array
trovare il valore massimo all'interno di entrambi gli array
calcolare la media di entrambi gli array (assieme)
calcolare la somma di tutti gli elementi di entrambi gli array */

public class snack6 {

	public static void main(String[] args) {
		
		// CREO 2 ARRAY
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		
		// CREO UN ARRAY PER METTERE LE SOMME 
		int[] arr3 = new int[10];
		
		// CREO LE VARIABILI START DEI VALORI MINIMI
		int minArr1Value = arr1[0];
		int minArr2Value = arr2[0];
		
		// CREO LE VARIABILI START DEI VALORI MINIMI
		int maxArr1Value = arr1[0];
		int maxArr2Value = arr2[0];
		
		// CREO LA VARIABILE PER LA SOMMA TOTALE start
		int sum = 0;
		
		// CREO LA VARIABILE PER LA MEDIA start
		int avg = 0;
		
		System.out.println("contenuto array 3 :");
		
		// CICLO SU ENTRAMBI GLI ARRAY
		for (int i = 0; i < arr1.length; i++) {
				
			// ASSEGNO LA SOMMA IN BASE ALL'INDICE 
				arr3[i] = arr1[i] + arr2[i];
				
				// CICLO PER OGNI VALORE IN MODO DA SALVARE IL PIU' PICCOLO O IL PIU' GRANDE
				minArr1Value = Math.min(minArr1Value, arr1[i]);
				minArr2Value = Math.min(minArr2Value, arr2[i]);
				
				maxArr1Value = Math.max(maxArr1Value, arr1[i]);
				maxArr2Value = Math.max(maxArr2Value, arr2[i]);
				
				// FACCIO LA SOMMA DI TUTTI GLI ELEMENTI CONTEMNUTI NELL'ULTIMO ARRAY
				sum += arr3[i];
				
				
				System.out.print( arr3[i] + ",");
		}
		// CALCOLO LA MEDIA
		avg = sum / (arr1.length + arr2.length);
		
		
		System.out.println("\n ----------------------------");
		// STAMPO I RISULTATI
		System.out.println("min array1 : " + minArr1Value);
		System.out.println("min array2 : " + minArr2Value);
		System.out.println("max array1 : " + maxArr1Value);
		System.out.println("max array2 : " + maxArr2Value);
		System.out.println("somma totale : " + sum);
		System.out.println("avg : " + avg);
	}
	
}
