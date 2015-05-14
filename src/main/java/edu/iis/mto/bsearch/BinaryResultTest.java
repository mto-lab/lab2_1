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
	 @Test
	 public void moreElementsOnInputExpectedFoundAsLastElement(){
		 int key = 13;
		 int seq[] = {2, 3, 5, 7, 11, 13};
		 int expectedOnPosition = seq.length;
		 
		 assertTrue(BinarySearch.search(key, seq).isFound());
		 assertThat(expectedOnPosition, is(BinarySearch.search(key, seq).getPosition()));
	 }
	 @Test
	 public void moreElementsOnInputExpectedFoundAsMiddleElement(){
		 int key = 7;
		 int seq[] = {2, 3, 5, 7, 11, 13, 17};
		 int expectedOnPosition = 4;
		 
		 assertTrue(BinarySearch.search(key, seq).isFound());
		 assertThat(expectedOnPosition, is(BinarySearch.search(key, seq).getPosition()));
	 }
	 @Test
	 public void moreElementsOnInputExpectedNotFound(){
		 int key = 19;
		 int seq[] = {2, 3, 5, 7, 11, 13, 17};
		 int expectedOnPosition = -1;
		 
		 assertFalse(BinarySearch.search(key, seq).isFound());
		 assertThat(expectedOnPosition, is(BinarySearch.search(key, seq).getPosition()));
	 }
	 @Test 
	    public void zeroElementOnInputExpectedIllegalArgumentException(){
	        int key = 9;
	        int seq[]={};
	        
	        BinarySearch.search(key, seq);
	    }
}
