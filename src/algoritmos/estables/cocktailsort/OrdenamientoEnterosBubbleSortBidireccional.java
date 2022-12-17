package algoritmos.estables.cocktailsort;

public class OrdenamientoEnterosBubbleSortBidireccional {

	public static void main(String[] args) {

		//https://www.c-sharpcorner.com/blogs/bidirectional-bubble-sort-in-java
		
		
		int array[] = { 12, 9, 4, 99, 120, 1, 3, 10 };
		
		System.out.println("\n== Conjunto Numérico ==\n");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
		
		
		
		bubbleSortBidireccional(array);
		
		
		
		System.out.println("\n== Conjunto Numérico Ordenado==\n");
		
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	

	}

	public static void bubbleSortBidireccional(int arrayInput[]) {
		
		int longitudArray=arrayInput.length;
		int contador = -1;
		
		
		while (contador < longitudArray) {
			
			contador++;
			
			longitudArray--;
			
			for (int i = contador; i < longitudArray; i++) {
				
				if (arrayInput[i] > arrayInput[i + 1]) {
					
					int auxiliar = arrayInput[i];
					arrayInput[i] = arrayInput[i + 1];
					arrayInput[i + 1] = auxiliar;
				}
			}
			//--i decrementamos
			for (int i = longitudArray; --i >= contador;) {
				
				if (arrayInput[i] > arrayInput[i + 1]) {
					
					int auxiliar = arrayInput[i];
					arrayInput[i] = arrayInput[i + 1];
					arrayInput[i + 1] = auxiliar;
				}
			}
		}
	}

}
