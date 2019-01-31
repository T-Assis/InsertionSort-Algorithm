package br.com.insertionsort.sortingmethod;

/**
 *
 * @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
 */
public class InsertionSort {

	public static void sortVector(int[] vector) {
		
		// Loop that runs across the vector.
		// Loop que percorre todo o vetor.
		for (int i = 1; i < vector.length; i++) {
			
			// Selects the first non-ordered element of the vector.
			// Seleciona o primeiro elemento n�o ordenado do vetor.
			int smallerElement = vector[i];
			int j = i - 1;
			
			// Shifts all elements to the right to create the position for the unclassified element.
			// Desloca todos os elementos para a direita para criar a posi��o para o elemento n�o classificado.
			while (j >= 0 && vector[j] > smallerElement) {
				vector[j + 1] = vector[j];
				j--;
			}
			
			// Inserts the unclassified element into its correct position.	
			// Insere o elemento n�o classificado em sua posi��o correta.
			vector[j + 1] = smallerElement;
		}

	}

}
