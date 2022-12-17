package algoritmos.inestables.quicksort;

public class OrdenamientoDecimalesQuickSort {
	
	public static void main(String[] args) {
		//https://programmerclick.com/article/2632340784/
		
		// QuickSort en relacion a BubbleSort es más rápida, porque cada 
		//intercambio se salta. En cada intercambio, no podrá intercambiar 
		//entre números adyacentes al mismo tiempo en relacion
		//a la clasificación de burbujas, y la distancia de intercambio es mucho mayor.
		//Por lo tanto, el número total de comparaciones e intercambios se reduce 
		//y la velocidad aumenta naturalmente.
		
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		
		
		quickSort(arr,0, arr.length-1);
		
		
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

		
	}
	

    public static void quickSort(int[] arr,int low,int high){
        
        int i,j,temp,t;
        
     
        
        if(low>high){
            return;
        }
        i=low;
        j=high;
        // temp es la referencia
        temp = arr[low];
 
        while (i<j) {
                         // Desde la derecha primero, luego disminuya hacia la izquierda
            while (temp<=arr[j]&&i<j) {
                j--;
            }
                         // Desde la izquierda, aumentar a la derecha
            while (temp>=arr[i]&&i<j) {
                i++;
            }
                         // Intercambiar si se cumplen las condiciones
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
 
        }
                 // Finalmente, intercambie la referencia a los números iguales a i y j
         arr[low] = arr[i];
         arr[i] = temp;
                 // Llama recursivamente a la media matriz izquierda
        quickSort(arr, low, j-1);
                 // Llama recursivamente a la media matriz derecha
        quickSort(arr, j+1, high);

}
}
