//SelectionSortTests.java
/*
* 
* EE422C Quiz 2 submission by
* Mina Abbassian
* mea2947
* 16170
* Fall 2020
*/

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;


public class SelectionSortTests {
	
	@Rule
    public Timeout globalTimeout = Timeout.seconds(2);

	@Test
	public void test1() {
		int[] x = {0};
	    int[] expected = {0};
	    SelectionSort.sort(x);
	    assertArrayEquals(expected, x);
	}
	
	@Test
	public void test2() {
		int[] x2 = {0, 1, 2, 3};
	    SelectionSort.sort(x2);
	    int[] expected2 = {0, 1, 2, 3};
	    assertArrayEquals(expected2, x2);
	}

	@Test
	public void test3() {
		int[] x3 = {5, 6, 3, 4, 2, 1};
	    SelectionSort.sort(x3);
	    int[] expected3 = {1, 2, 3, 4, 5, 6};
	    assertArrayEquals(expected3, x3);
	}
	
	@Test
	public void test4() {
		int[] x4 = {5, 6, 1, 9, 2, 3};
	    int[] expected4 = {1, 2, 3, 5, 6, 9};
	    SelectionSort.sort(x4);
	    assertArrayEquals(expected4, x4);
	}
	    
	@Test
	public void test5() { 
		int[] x5 = {5, 1};
		int[] expected5 = {1, 5};
		SelectionSort.sort(x5);
	 	assertArrayEquals(expected5, x5);   
	}
}

