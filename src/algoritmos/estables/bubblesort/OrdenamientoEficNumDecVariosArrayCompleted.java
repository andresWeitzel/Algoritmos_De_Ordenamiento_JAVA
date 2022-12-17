package algoritmos.estables.bubblesort;

import java.util.Arrays;

/*
 * SE DESEA ORDENAR DOS CONJUNTOS NUMERICOS DECIMALES APLICANDO UN ALGORITMO DE 
 * ORDENAMIENTO. DICHOS CONJUNTOS SERAN ORDENADOS POR LA MISMA FUNCION
 * QUE SE IMPLEMENTE.
 * 
 * */

public class OrdenamientoEficNumDecVariosArrayCompleted {

	public static void main(String[] args) {

		double primerArray[] = { 123.5, 344.3, 44, 4.2, 7.89, 23.2 };
		double segundoArray[] = { 34.6, 788.6, 3.555, 98.23, 7.6 };

		// --------------------------------------------------------------------
		System.out.println("\n == Conjuntos de Números del Primer Array ==");

		for (int i = 0; i < primerArray.length; i++) {
			System.out.println(primerArray[i]);
		}

		// --------------------------------------------------------------------
		System.out.println("\n == Conjuntos de Números del Segundo Array ==");
		for (int i = 0; i < segundoArray.length; i++) {
			System.out.println(segundoArray[i]);
		}
		// --------------------------------------------------------------------
		System.out.println(bubbleSortDecimales(primerArray, segundoArray));

		// USANDO LA CLASE ARRAYS DE LA API COLLECTION PODEMOS HASTA AHORRARNOS
		// PLANTEAR UN ALGORITMO DE ORDENACION, PORQUE ESTA MAS QUE EFICIENTIZADO
		// EN LA CLASE, PERO AL NO SER LOGICO EN NUESTRO CASO PODEMOS USAR EL METODO
		// TOSTRING PARA VISUALIZACION

	}

	public static String bubbleSortDecimales(double arrayInput01[], double arrayInput02[]) {

		// =============ORDENAMOS EL PRIMER ARRAY===================
		// Accedemos a los elementos
		for (int i = 0; i < (arrayInput01.length - 1); i++) {

			boolean intercambioNumero = false;

			for (int j = 0; j < (arrayInput01.length - 1 - i); j++) {

				// Comparamos el elemento actual vs el siguiente
				if (arrayInput01[j] > arrayInput01[j + 1]) {

					// Numero actual mas grande que el siguiente, guardamos
					double auxiliar = arrayInput01[j];

					// Guardamos el valorsiguiente en la posicion actual
					arrayInput01[j] = arrayInput01[j + 1];

					// Valor de Auxiliar lo guardamos en siguiente
					arrayInput01[j + 1] = auxiliar;

					intercambioNumero = true;

				}

			}

			if (intercambioNumero != true) {
				break;
			}

		}

		// =============ORDENAMOS EL SEGUNDO ARRAY===================
		// Accedemos a los elementos
		for (int i = 0; i < (arrayInput02.length - 1); i++) {

			boolean intercambioNumero = false;

			for (int j = 0; j < (arrayInput02.length - 1 - i); j++) {

				// Comparamos el elemento actual vs el siguiente
				if (arrayInput02[j] > arrayInput02[j + 1]) {

					// Numero actual mas grande que el siguiente, guardamos
					double auxiliar = arrayInput02[j];

					// Guardamos el valorsiguiente en la posicion actual
					arrayInput02[j] = arrayInput02[j + 1];

					// Valor de Auxiliar lo guardamos en siguiente
					arrayInput02[j + 1] = auxiliar;

					intercambioNumero = true;

				}

			}

			if (intercambioNumero != true) {
				break;
			}

		}

		return "\n === ARRAYS DE NÚMEROS ENTEROS ORDENADOS ==== \n" + "\n == Primer Array ==\n"
				+ Arrays.toString(arrayInput01) + "\n" + "\n == Segundo Array ==\n" + Arrays.toString(arrayInput02)
				+ "\n";

	}

}
