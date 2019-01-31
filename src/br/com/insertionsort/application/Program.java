package br.com.insertionsort.application;

import br.com.insertionsort.sortingmethod.InsertionSort;

/**
 * 
 * @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
 */
public class Program {

	public static void main(String[] args) {
	
		int[] vector = { 9, 7, 6, 15, 17, 5, 10, 11};
		
		System.out.println("Insertion Sort:");
		System.out.println("Vector before:");
		printVector(vector);

		InsertionSort.sortVector(vector);
		
		System.out.println("Vector after:");
		printVector(vector);
	} 
	
	public static void printVector(int[] vector) {
		System.out.print("[ ");
		for (int i = 0; i < vector.length; i++) {
			if(i == vector.length - 1 )
				System.out.print(vector[i] + " ]");
			else
				System.out.print(vector[i] + ", ");
		}
		System.out.println("\n");
	}

} 
