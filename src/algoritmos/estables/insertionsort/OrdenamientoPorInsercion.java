package algoritmos.estables.insertionsort;

public class OrdenamientoPorInsercion {
	
	/*
	 * Insertamos los elementos de la matriz en sus posiciones 
	 * adecuadas uno por uno en el orden de insercion
	 * */
	
	
	//https://pharos.sh/orden-de-insercion-en-java/
	//https://www.geeksforgeeks.org/quick-sort/
	//https://www.geeksforgeeks.org/quick-sort/
	
	public static void main(String[] args) {
		
		int arrayNumeros[]= {1,2,4,88,7,12,22,1,3,44};
		
		int sizeArray=arrayNumeros.length;
		
		System.out.println("\n== Array Original ==");
		for(int i=0;i<sizeArray;i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		insertionSort(arrayNumeros);
		
		System.out.println("\n== Array Ordenado ==");
		for(int i=0;i<sizeArray;i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		
		
	}
	
	public static void insertionSort(int array[]) {
		
		int sizeArray = array.length;
		int elemActual;
		int indiceAnterior;
		
	    for (int j = 1; j < sizeArray; j++) {
	    
	    	elemActual = array[j];
	        
	    	indiceAnterior = j-1;
	    
	        
	    	while ((indiceAnterior > -1) && (array[indiceAnterior] > elemActual)) {
	        
	    		array[indiceAnterior+1] = array[indiceAnterior];
	            
	    		indiceAnterior--;
	        }
	        array[indiceAnterior+1] = elemActual;
	    }
	}

}
