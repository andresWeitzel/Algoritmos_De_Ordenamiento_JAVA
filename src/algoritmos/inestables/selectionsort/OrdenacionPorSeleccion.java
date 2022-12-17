package algoritmos.inestables.selectionsort;

public class OrdenacionPorSeleccion {
	
	public static void main(String[] args) {
		
		/*
		 * IMPORTANTE RECORDEMOS
		 * 
		 * -ALGORITMO INESTABLE (Una ordenación es inestable 
		 * cuando NO se conserva el orden de los elementos idénticos) 
		 * 
		 * - TIENE COMPLEJIDAD O(n^2) (fors anidados)
		 * 
		 * - SON DE TIPO METODOS DE SELECCION
		 * 
		 * */
		//https://pharos.sh/ordenar-por-seleccion-en-java/#:~:text=El%20ordenamiento%20de%20selecci%C3%B3n%20es,correcta%20en%20el%20subarreglo%20ordenado.
		//http://repositori.uji.es/xmlui/bitstream/handle/10234/168713/Tema10IS04.pdf?sequence=1&isAllowed=y
		
		

		int arrayNumeros01[] = { 23, 3, 556, 565, 2, 43, 2, 655, 12, 1, 2 };
	
		// --------------------------------------------------------
		// --------------------------------------------------------
		System.out.println("\n===============================================");
		System.out.println("=========== SELECTION SORT ===============");
		System.out.println("=================================================");
		

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números ==");
		for (int i = 0; i < arrayNumeros01.length; i++) {
			System.out.println(arrayNumeros01[i]);
		}

		// --------------------------------------------------------

		System.out.println("\n== Número de Ordenamientos ==");

		selectionSort(arrayNumeros01);

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números Ordenados ==");
		for (int i = 0; i < arrayNumeros01.length; i++) {
			System.out.println(arrayNumeros01[i]);
		}

		
	}
	
	
	
	public static void selectionSort(int arrayInput[]) {
		
		int i;
		int j;
		int min;
		int aux;
		int elemActual;
		int elemMin;
		int sizeArrayInput=arrayInput.length;
		
		
		for (i = 0; i < sizeArrayInput; i++) {
	        // min is the index of the smallest element with an index greater or equal to i
	        min = i;
	        for (j = i + 1; j < sizeArrayInput; j++) {
	            if (arrayInput[j] < arrayInput[min]) {
	                min = j;
	            }
	        }
	        // Swapping i-th and min-th elements
	        int swap = arrayInput[i];
	        arrayInput[i] = arrayInput[min];
	        arrayInput[min] = swap;
	    }
		
	}

	
}

