package bsearch;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchResultTest {

    private final int NOT_FOUND = -1;

    @Test
    public void isInSequenceOfSizeOne() {
        final int key = 3;
        final int[] seq = {3};
        final int positionInSequence = 1;
        final boolean expectResult = true;

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound() && searchResult.getPosition() == positionInSequence, is(expectResult));
    }
}
