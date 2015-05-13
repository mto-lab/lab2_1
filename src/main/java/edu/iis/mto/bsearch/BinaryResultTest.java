package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class BinaryResultTest {

	@Test
	public void oneElementOnInputExpectedTrue() {
        int key = 7;
        int seq[] = {7};

        assertTrue(BinarySearch.search(key, seq).isFound());
    }

	 @Test
	    public void oneElementOnInputExpectedFalse() {
	        int key = 7;
	        int seq[] = {2};

	        assertFalse(BinarySearch.search(key, seq).isFound());
	 }
	 @Test
	    public void moreElementsOnInputExpectedFoundAsFirstElement() {
	        int key = 2;
	        int seq[] = {2, 3, 5, 7, 11, 13};
	        int expectedOnPosition = 1;
	        
	        assertTrue(BinarySearch.search(key, seq).isFound());
	        assertThat(expectedOnPosition, is(BinarySearch.search(key, seq).getPosition()));
	    }

}
