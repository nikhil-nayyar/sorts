

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

	
	@Test
	void testFive() {
		Integer[] test = {4,3,1,5,2};
		Integer[] result = {1,2,3,4,5};
		
		SelectionSort.sort(test);
		
		Assertions.assertArrayEquals(test,result);		
	}

	@Test
	void testOne() {
		Integer[] test = {1};
		Integer[] result = {1};
		
		SelectionSort.sort(test);
		
		Assertions.assertArrayEquals(test,result);		
	}

	@Test
	void testNull() {
		Integer[] test = {};
		Integer[] result = {};
		
		SelectionSort.sort(test);
		
		Assertions.assertArrayEquals(test,result);
		
	}

}
