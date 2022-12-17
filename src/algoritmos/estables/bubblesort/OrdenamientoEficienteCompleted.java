package algoritmos.estables.bubblesort;

public class OrdenamientoEficienteCompleted {

	public static void main(String[] args) {

		int numero[] = { 23, 3, 556, 565, 2, 43, 2, 655, 12 };

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números ==");
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}

		// --------------------------------------------------------

		bubbleSort(numero);

		// --------------------------------------------------------
		System.out.println("\n== Conjuntos de Números Ordenados ==");
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}

	}

	public static void bubbleSort(int arrayInput[]) {

		// Accedemos a los elementos
		for (int i = 0; i < (arrayInput.length - 1); i++) {

			boolean intercambioNumero = false;

			for (int j = 0; j < (arrayInput.length - 1 - i); j++) {

				// Comparamos el elemento actual vs el siguiente
				if (arrayInput[j] > arrayInput[j + 1]) {

					// Numero actual mas grande que el siguiente, guardamos
					int auxiliar = arrayInput[j];

					// Guardamos el valorsiguiente en la posicion actual
					arrayInput[j] = arrayInput[j + 1];

					// Valor de Auxiliar lo guardamos en siguiente
					arrayInput[j + 1] = auxiliar;

					intercambioNumero = true;

				}

			}

			if (intercambioNumero != true) {
				break;
			}

		}

	}

}
