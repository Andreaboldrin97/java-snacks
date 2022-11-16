package org.booleancaeer.java;

//Snack 7
//Dato il seguente array:
//
//String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
//trovare e stampare la parola piu' lunga e la sua lunghezza
//trovare e stampare la parola piu' corta e la sua lunghezza

public class snack7 {

	public static void main(String[] args) {
		
		// CREO L'ARRAY DI PAROLE
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		// CREO LA STRINGA UNICA IN ORDINE
		String word = "";
		
		// VARIABILE PER IDENTIFICARE LA PAROLA CON IL MAGGIOR NUMERO DI CARATTERI start
		int maximumLength = 0;
		String longestWord = "";
		
		// VARIABILE PER IDENTIFICARE LA PAROLA CON IL MAGGIOR NUMERO DI CARATTERI start
		int minimumLength = 50;
		String shortword = "";
		
		//CREO UN CICLO FOR PER PRENDERE OGNI ELEMENTO
		for (int i = 0; i < words.length; i++){
			
			// CONCATENO LE STRINGHE ->
			word += words[i] + " ";
			
			// CONTROLLO SULLA PAROLA + LUNGA
			if(words[i].length() > maximumLength) {
				// ASSEGNAZIONE Num
				maximumLength = words[i].length();
				longestWord = words[i];
			}
			
			// CONTROLLO SULLA PAROLA + CORTA
			if(words[i].length() < minimumLength) {
				// ASSEGNAZIONE Num
				minimumLength = words[i].length();
				shortword = words[i];
			}
			
			
		}
		
		// CREO LA STRINGA UNICA IN ORDINE inverso
		// CON L'AIUTO DI StringBuffer
		String reverseWord = new StringBuffer(word).reverse().toString();
		
		
		// STAMPO I RISULTATI
		System.out.println("-> " + word);
		System.out.println(reverseWord + " <-");
		System.out.println("-------------------");
		System.out.println("La parola più lunga è : " + longestWord + "è lunga : " + maximumLength);
		System.out.println("La parola più corta è : " + shortword + "è lunga : " + minimumLength );
		
	}
	
}
