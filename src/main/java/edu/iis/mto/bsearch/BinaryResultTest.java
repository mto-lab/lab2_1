package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

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
}
