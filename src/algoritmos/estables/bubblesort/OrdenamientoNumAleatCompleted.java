package algoritmos.estables.bubblesort;

/*
 * Se quiere generar un conjunto de 10 numeros aleatorios enteros en un 
 * array y se desea mostrar dichos numeros de forma ordenadas por 
 * consola
 * 
 * */
public class OrdenamientoNumAleatCompleted {

	public static void main(String[] args) {

		 // Para ordenamiento hay muchos algoritmos, algunas mas eficientes que otros
		// Para este ejemplo sencillo implementamos el famoso BUBBLE SORT
		// Recomiendo : https://www.programiz.com/dsa/bubble-sort
		
		
		//===========================================================
		
		int arrayNumeros[] = new int[10]; 
		
		
		// RECORDEMOS QUE EL FOREACH NO REALIZA EL SEGUIMIENTO DE 
		//INDICES, USAMOS EL FOR
		
		
		System.out.println("\n==== Elementos del Array ====");
		//Generamos numeros aleatorios
		for(int i=0 ; i < arrayNumeros.length ; i++) {
			
			//Min:2 / Max:14
			int numAleatorio = (int)(Math.random()*12 + 2);
			
			arrayNumeros[i] = numAleatorio;
			
			System.out.println(numAleatorio);
		}
		
		//===========================================================
		
		//Accedemos a los elementos
		for(int i=0 ; i < (arrayNumeros.length - 1) ; i++) {
			
			for(int j=0; j < (arrayNumeros.length - 1 - i) ; j++) {
				
				
				//Comparamos el elemento actual vs el siguiente
				if(arrayNumeros[j] > arrayNumeros[j+1] )
				{
					
					//Numero actual mas grande que el siguiente, guardamos
					int auxiliar = arrayNumeros[j];
					
					//Guardamos el valorsiguiente en la posicion actual
					arrayNumeros[j] = arrayNumeros[j+1];
					
					//Valor de Auxiliar lo guardamos en siguiente
					arrayNumeros[j+1]=auxiliar;

					
				}
				
				
			}
			
			
		}
		
		//====================================
		
		System.out.println("\n==== Elementos del Array Ordenados ====");
		//Recorremos nuestro array
		for(int i=0 ; i < arrayNumeros.length  ; i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		
		
		
		
		
	
		//===========================================================

		
		
	}

}
