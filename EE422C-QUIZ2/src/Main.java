//Main.java
/*
 * 
 * EE422C Quiz 2 submission by
 * Mina Abbassian
 * mea2947
 * 16170
 * Fall 2020
 */

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.out.println("Unsorted array: " + Arrays.toString(array));
		
		SelectionSort.sort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));
	}
	
}
