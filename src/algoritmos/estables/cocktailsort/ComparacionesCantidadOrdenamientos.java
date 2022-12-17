package algoritmos.estables.cocktailsort;

public class ComparacionesCantidadOrdenamientos {

	public static void main(String[] args) {

		/*
		 * El algoritmo cocktail sort o burbuja bidireccional tiene la misma complejidad
		 * de media que el método burbuja simple: O(n2). Lo que se persigue con el es
		 * reducir el número de iteraciones y las comparaciones necesarias en relación a
		 * uno de los problemas típicos del método burbuja simple conocido como
		 * "liebres y tortugas":
		 * 
		 * La eficiencia del método burbuja está directamente relacionada con la
		 * distancia y la dirección en la que un elemento ha de ser movido para que
		 * quede ordenado.
		 * 
		 * Los elementos que han de ser movidos en la misma direción sobre la que itera
		 * el método sobre el array se mueven relativamente rápidos ya que se benefician
		 * de la posibilidad de realizar varios intercambios por iteración.
		 * 
		 * Los elementos que han de ser desplazados en la dirección contraria a la que
		 * itera el método se mueven muy lentamente ya que solo pueden ser movidos una
		 * posición por cada iteración.
		 * 
		 * Para paliar lo anterior se idea el método burbuja bidireccional. La idea es
		 * simple, por cada iteración recorremos el array de forma alterna en ambas
		 * direcciones. Esto implica que cada iteración del método burbuja bidireccional
		 * debe ser tomado como dos del método burbuja simple. Su utilidad y mejora solo
		 * será visible en los casos en los que existan elementos "tortuga"
		 */
		
		
		
		
		/*
		 * IMPORTANTE RECORDEMOS(bubbleSort y cocktailSort)
		 * 
		 * -SON ESTABLES (Una ordenación es estable 
		 * cuando se conserva el orden de los elementos idénticos) 
		 * 
		 * - TIENEN COMPLEJIDAD O(n^2) (fors anidados)
		 * 
		 * - SON DE TIPO METODOS DE INTERCAMBIO
		 * 
		 * */
		

		int arrayNumeros01[] = { 23, 3, 556, 565, 2, 43, 2, 655, 12, 1, 2 };
		int arrayNumeros02[] = { 23, 3, 556, 565, 2, 43, 2, 655, 12, 1, 2 };

		// --------------------------------------------------------
		// --------------------------------------------------------
		System.out.println("\n===============================================");
		System.out.println("=========== BUBBLE SORT BIDIRECCIONAL===============");
		System.out.println("=================================================");
		

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números ==");
		for (int i = 0; i < arrayNumeros01.length; i++) {
			System.out.println(arrayNumeros01[i]);
		}

		// --------------------------------------------------------

		System.out.println("\n== Número de Ordenamientos ==");

		bubbleSortBidireccional(arrayNumeros01);

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números Ordenados ==");
		for (int i = 0; i < arrayNumeros01.length; i++) {
			System.out.println(arrayNumeros01[i]);
		}

		// --------------------------------------------------------
		// --------------------------------------------------------
		System.out.println("\n===============================================");
		System.out.println("=========== BUBBLE SORT EFICIENTE===============");
		System.out.println("=================================================");
		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números ==");
		for (int i = 0; i < arrayNumeros02.length; i++) {
			System.out.println(arrayNumeros02[i]);
		}

		// --------------------------------------------------------

		System.out.println("\n== Número de Ordenamientos ==");

		bubbleSortEficiente(arrayNumeros02);

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números Ordenados ==");
		for (int i = 0; i < arrayNumeros02.length; i++) {
			System.out.println(arrayNumeros02[i]);
		}

	}

	public static void bubbleSortBidireccional(int arrayInput[]) {

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

}
