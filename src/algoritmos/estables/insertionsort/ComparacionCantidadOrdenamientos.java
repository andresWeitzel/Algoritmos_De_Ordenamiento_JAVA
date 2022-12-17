package algoritmos.estables.insertionsort;

public class ComparacionCantidadOrdenamientos {
	
	public static void main(String[] args) {
		
		
		//http://repositori.uji.es/xmlui/bitstream/handle/10234/168713/Tema10IS04.pdf?sequence=1&isAllowed=y
		/*
		 * IMPORTANTE RECORDEMOS(bubbleSort, cocktailSort e insertionSort )
		 * 
		 * - SON ESTABLES (Una ordenación es estable 
		 * cuando se conserva el orden de los elementos idénticos) 
		 * 
		 * - TIENEN COMPLEJIDAD O(n^2) (fors anidados)
		 * 
		 * - SON DE TIPO METODOS DE INTERCAMBIO (bubbleSort, cocktailSort)
		 * - SON DE TIPO METODOS DE INSERCION (insertionSort)
		 * 
		 * */
		
		int arrayNumeros01[]= {1,2,4,88,7,2222,1900,545445,938333,333,12,22,1,3,44,129,3,1};
		int arrayNumeros02[]= {1,2,4,88,7,2222,1900,545445,938333,333,12,22,1,3,44,129,3,1};
		int arrayNumeros03[]= {1,2,4,88,7,2222,1900,545445,938333,333,12,22,1,3,44,129,3,1};
		
		int sizeArray01=arrayNumeros01.length;
		int sizeArray02=arrayNumeros02.length;
		int sizeArray03=arrayNumeros03.length;
		
		
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		
		System.out.println("\n===============================================");
		System.out.println("=========== BUBBLE SORT EFICIENTE===============");
		System.out.println("=================================================");
		
		
		System.out.println("\n== Array Original (bubbleSortEficiente)==");
		for(int i=0;i<sizeArray01;i++) {
			System.out.println(arrayNumeros01[i]);
		}
		
		bubbleSortEficiente(arrayNumeros01);
		
		System.out.println("\n== Array Ordenado (bubbleSortEficiente)==");
		for(int i=0;i<sizeArray01;i++) {
			System.out.println(arrayNumeros01[i]);
		}
		
		
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		
		
		System.out.println("\n=======================================");
		System.out.println("=========== COCKTAIL SORT ===============");
		System.out.println("=========================================");
		
		System.out.println("\n== Array Original (cocktailSort)==");
		for(int i=0;i<sizeArray02;i++) {
			System.out.println(arrayNumeros02[i]);
		}
		
		cocktailSort(arrayNumeros02);
		
		System.out.println("\n== Array Ordenado (cocktailSort)==");
		for(int i=0;i<sizeArray02;i++) {
			System.out.println(arrayNumeros02[i]);
		}
		
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		
		System.out.println("\n=======================================");
		System.out.println("=========== INSERTION SORT ==============");
		System.out.println("=========================================");
		
		System.out.println("\n== Array Original (insertionSort)==");
		for(int i=0;i<sizeArray03;i++) {
			System.out.println(arrayNumeros03[i]);
		}
		
		insertionSort(arrayNumeros03);
		
		System.out.println("\n== Array Ordenado (insertionSort)==");
		for(int i=0;i<sizeArray03;i++) {
			System.out.println(arrayNumeros03[i]);
		}
		
		
		//-------------------------------------------------------------------------
		//-------------------------------------------------------------------------
		
		
		
		
		
	}
	
	

	
	
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	
	public static void bubbleSortEficiente(int arrayInput[]) {

		int nroTotalPasos = 0;
		int nroIteraciones = 0;
		int nroIntercambios = 0;

		// Accedemos a los elementos
		for (int i = 0; i < (arrayInput.length - 1); i++) {

			boolean intercambioNumero = false;

			nroIteraciones++;

			for (int j = 0; j < (arrayInput.length - 1 - i); j++) {

				nroIteraciones++;

				// Comparamos el elemento actual vs el siguiente
				if (arrayInput[j] > arrayInput[j + 1]) {

					// Numero actual mas grande que el siguiente, guardamos
					int auxiliar = arrayInput[j];

					nroIntercambios++;

					// Guardamos el valorsiguiente en la posicion actual
					arrayInput[j] = arrayInput[j + 1];

					nroIntercambios++;

					// Valor de Auxiliar lo guardamos en siguiente
					arrayInput[j + 1] = auxiliar;

					nroIntercambios++;

					intercambioNumero = true;

				}

			}

			if (intercambioNumero != true) {
				break;
			}

		}

		nroTotalPasos = nroIteraciones + nroIntercambios;

		System.out.println("-------------------------------------------------");
		System.out.println("\nNro Total de Iteraciones : " + nroIteraciones);
		System.out.println("\nNro Total de Intercambios : " + nroIntercambios);
		System.out.println("\nNro Total de Pasos : " + nroTotalPasos);
		System.out.println("-------------------------------------------------");

	}
	
	

	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	
	
	public static void cocktailSort(int arrayInput[]) {

		int nroTotalPasos = 0;
		int nroIteraciones = 0;
		int nroIntercambios = 0;

		int longitudArray = arrayInput.length;
		int contador = -1;

		while (contador < longitudArray) {

			contador++;

			longitudArray--;

			for (int i = contador; i < longitudArray; i++) {

				nroIteraciones++;

				if (arrayInput[i] > arrayInput[i + 1]) {

					int auxiliar = arrayInput[i];

					nroIntercambios++;

					arrayInput[i] = arrayInput[i + 1];

					nroIntercambios++;

					arrayInput[i + 1] = auxiliar;

					nroIntercambios++;

				}
			}
			// --i decrementamos
			for (int i = longitudArray; --i >= contador;) {

				nroIteraciones++;

				if (arrayInput[i] > arrayInput[i + 1]) {

					int auxiliar = arrayInput[i];

					nroIntercambios++;

					arrayInput[i] = arrayInput[i + 1];

					nroIntercambios++;

					arrayInput[i + 1] = auxiliar;

					nroIntercambios++;
				}
			}
		}

		nroTotalPasos = nroIteraciones + nroIntercambios;

		System.out.println("-------------------------------------------------");
		System.out.println("\nNro Total de Iteraciones : " + nroIteraciones);
		System.out.println("\nNro Total de Intercambios : " + nroIntercambios);
		System.out.println("\nNro Total de Pasos : " + nroTotalPasos);
		System.out.println("-------------------------------------------------");

	}
	
	
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	
	
	public static void insertionSort(int arrayInput[]) {
		
		int nroTotalPasos = 0;
		int nroIteraciones = 0;
		int nroIntercambios = 0;

		int sizeArray = arrayInput.length;
		
		int elemActual;
		int indiceAnterior;
		
	    for (int j = 1; j < sizeArray; j++) {
	    
	    	nroIteraciones++;
	    	
	    	elemActual = arrayInput[j];
	    	
	        
	    	indiceAnterior = j-1;
	    
	        
	    	while ((indiceAnterior > -1) && (arrayInput[indiceAnterior] > elemActual)) {
	        
	        	nroIteraciones++;
		    	
	    		arrayInput[indiceAnterior+1] = arrayInput[indiceAnterior];
	    		
	    		nroIntercambios++;
	            
	    		indiceAnterior--;
	    		
	    		nroIntercambios++;
	        }
	        arrayInput[indiceAnterior+1] = elemActual;
	        nroIntercambios++;
	    }
	    
	    
		nroTotalPasos = nroIteraciones + nroIntercambios;

		System.out.println("-------------------------------------------------");
		System.out.println("\nNro Total de Iteraciones : " + nroIteraciones);
		System.out.println("\nNro Total de Intercambios : " + nroIntercambios);
		System.out.println("\nNro Total de Pasos : " + nroTotalPasos);
		System.out.println("-------------------------------------------------");

	}
	
	
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	//-------------------------------------------------------------------------
	
	
	
	

}
