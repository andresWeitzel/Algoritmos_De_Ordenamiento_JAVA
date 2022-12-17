package algoritmos.estables.cocktailsort;

public class ComparacionesCantidadOrdenamientos {

	public static void main(String[] args) {

		/*
		 * El algoritmo cocktail sort o burbuja bidireccional tiene la misma complejidad
		 * de media que el m�todo burbuja simple: O(n2). Lo que se persigue con el es
		 * reducir el n�mero de iteraciones y las comparaciones necesarias en relaci�n a
		 * uno de los problemas t�picos del m�todo burbuja simple conocido como
		 * "liebres y tortugas":
		 * 
		 * La eficiencia del m�todo burbuja est� directamente relacionada con la
		 * distancia y la direcci�n en la que un elemento ha de ser movido para que
		 * quede ordenado.
		 * 
		 * Los elementos que han de ser movidos en la misma direci�n sobre la que itera
		 * el m�todo sobre el array se mueven relativamente r�pidos ya que se benefician
		 * de la posibilidad de realizar varios intercambios por iteraci�n.
		 * 
		 * Los elementos que han de ser desplazados en la direcci�n contraria a la que
		 * itera el m�todo se mueven muy lentamente ya que solo pueden ser movidos una
		 * posici�n por cada iteraci�n.
		 * 
		 * Para paliar lo anterior se idea el m�todo burbuja bidireccional. La idea es
		 * simple, por cada iteraci�n recorremos el array de forma alterna en ambas
		 * direcciones. Esto implica que cada iteraci�n del m�todo burbuja bidireccional
		 * debe ser tomado como dos del m�todo burbuja simple. Su utilidad y mejora solo
		 * ser� visible en los casos en los que existan elementos "tortuga"
		 */
		
		
		
		
		/*
		 * IMPORTANTE RECORDEMOS(bubbleSort y cocktailSort)
		 * 
		 * -SON ESTABLES (Una ordenaci�n es estable 
		 * cuando se conserva el orden de los elementos id�nticos) 
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
		System.out.println("\n== Conjuntos de N�meros ==");
		for (int i = 0; i < arrayNumeros01.length; i++) {
			System.out.println(arrayNumeros01[i]);
		}

		// --------------------------------------------------------

		System.out.println("\n== N�mero de Ordenamientos ==");

		bubbleSortBidireccional(arrayNumeros01);

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de N�meros Ordenados ==");
		for (int i = 0; i < arrayNumeros01.length; i++) {
			System.out.println(arrayNumeros01[i]);
		}

		// --------------------------------------------------------
		// --------------------------------------------------------
		System.out.println("\n===============================================");
		System.out.println("=========== BUBBLE SORT EFICIENTE===============");
		System.out.println("=================================================");
		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de N�meros ==");
		for (int i = 0; i < arrayNumeros02.length; i++) {
			System.out.println(arrayNumeros02[i]);
		}

		// --------------------------------------------------------

		System.out.println("\n== N�mero de Ordenamientos ==");

		bubbleSortEficiente(arrayNumeros02);

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de N�meros Ordenados ==");
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
