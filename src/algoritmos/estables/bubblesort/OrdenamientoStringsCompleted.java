package algoritmos.estables.bubblesort;

import java.util.Arrays;

/*
 * SE DESEA ORDENAR UNA LISTA DE NOMBRES DE EMPLEADOS A TRAVÉS DE ALGUN
 * ALGORITMO DE ORDENAMIENTO. REALIZAR 2 FUNCIONES PARA DICHO ALGORITMO.
 * UNA QUE NO SE NECESITE CREAR UN OBJETO PARA SU USO Y LA OTRA SI
 * MOSTRAR LA LISTA DE NOMBRES EN CONSOLA Y DE FORMA ORDENADA, IMPLEMENTAR 
 * DICHAS FUNCIONES
 * 
 * 
 * */

public class OrdenamientoStringsCompleted {

	public static void main(String[] args) {
		
		String arrayEmpleados[] = {
				"Anabel","Gonzalo","Ramiro","Ramon","Juan","José"
				,"Fabio","Alberto","Marcela"};
		
		System.out.println("\n ==== Listado de Empleados ====");
		for(int i=0; i< arrayEmpleados.length;i++) {
			System.out.println(arrayEmpleados[i]); 
		}
		
		System.out.println("\n ==== Array de Empleados Ordenados Alfabeticamente ====");
		
		System.out.println(bubbleSortString01(arrayEmpleados));
		

		System.out.println("\n ==== Array de Empleados Ordenados Alfabeticamente ====");
		
		OrdenamientoStringsCompleted objetoTest = new OrdenamientoStringsCompleted();
		
		System.out.println(objetoTest.bubbleSortString02(arrayEmpleados));

		
	}
	
	public static String bubbleSortString01(String arrayInput[]) {

		// Accedemos a los elementos
		for (int i = 0; i < (arrayInput.length - 1); i++) {
			
			boolean intercambioNumero = false;

			for (int j = 0; j < (arrayInput.length - 1); j++) {

				// Comparamos el elemento actual vs el siguiente
				if (arrayInput[j].compareTo(arrayInput[j + 1]) > 0 ){

					// Numero actual mas grande que el siguiente, guardamos
					String auxiliar = arrayInput[j];

					// Guardamos el valorsiguiente en la posicion actual
					arrayInput[j] = arrayInput[j + 1];

					// Valor de Auxiliar lo guardamos en siguiente
					arrayInput[j + 1] = auxiliar;
					
					
					intercambioNumero = true;

				}

			}
			
			if(intercambioNumero != true) {
				break;	
			}
			
			

		}
		
		return Arrays.toString(arrayInput);

	}
	
	public String bubbleSortString02(String arrayInput[]) {

		// Accedemos a los elementos
		for (int i = 0; i < (arrayInput.length - 1); i++) {
			
			boolean intercambioNumero = false;

			for (int j = 0; j < (arrayInput.length - 1); j++) {

				// Comparamos el elemento actual vs el siguiente
				if (arrayInput[j].compareTo(arrayInput[j + 1]) > 0 ){

					// Numero actual mas grande que el siguiente, guardamos
					String auxiliar = arrayInput[j];

					// Guardamos el valorsiguiente en la posicion actual
					arrayInput[j] = arrayInput[j + 1];

					// Valor de Auxiliar lo guardamos en siguiente
					arrayInput[j + 1] = auxiliar;
					
					
					intercambioNumero = true;

				}

			}
			
			if(intercambioNumero != true) {
				break;	
			}
			
			

		}
		
		return Arrays.toString(arrayInput);

	}
	



	
}
