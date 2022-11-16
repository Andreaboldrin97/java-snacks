package org.booleancaeer.java;

//Snack3
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

public class snack3 {
	
	public static void main(String[] args) {
		
		// CREO UN ARRAY DI INTERI
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		
		// FACCIO UN CICLO FOR PER VEDERE LA POSIZIONE DEGLI ELEMENTI
		//PARTO DA 1 E OGNI VOLTA SALGO DI 2 ELEMENTI PER OTTENERE I NUMERI DISPARI
		for(int i = 1 ; i < numbers.length ; i+=2) {
			
			// ASSEGNO OGNI VALORE 
			int number = numbers[i]; 
			System.out.println(number);
			
			// ASSEGNO ALLA VARIABILE SOMMA OGNI ELEMENTO DISPARI OTTENUTO
			sum += number;
		}
		
		System.out.println(sum);
	}

}
