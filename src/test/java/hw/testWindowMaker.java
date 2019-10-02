
package hw;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

import static org.junit.Assert.*;

public class testWindowMaker {

 /* @Before
  public void setUp() throws Exception {
      fixture = new WordCounter(testcount);
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }
*/
 /*
     @Test
     public void addWord() {
         assertNotNull(fixture);
         assertEquals(5, fixture.getCount("yellow"));
     }

     @Test
     public void decreaseFrequency() {
         assertNotNull(fixture);
         assertEquals(4, fixture.getCount("yellow"));
     }
  */

    @Test
    public void testQueueNonempty() {
        final String[] input = new String[]{"hello", "world", "what", "up"};
        WindowMaker wm = new WindowMaker(input);
        assertNotNull(wm);
    }

    @Test
    public void testIteratorEmpty() {
        final Iterator<String> input = Arrays.asList(
                new String[]{}
        ).iterator();
        assertFalse(input.hasNext());
    }

   /* @Test
    public void testQueueEmpty() {
        final WindowMaker sut = new WindowMaker(3);
        final Iterator<String> input = Arrays.asList(
                new String[] { }
        ).iterator();
        final List<Queue<String>> result = new ArrayList<>();
        // an observer instance that sends updates to a buffer (list) for testing
        final Output outputToList = new Output() {
            public void update(final Queue<String> value) {
                final Queue<String> copyOfValue = new LinkedList<>(value);
                result.add(copyOfValue);
            }
        };
        sut.slidingWindow(input, outputToList);
        assertTrue(result.isEmpty());
    }*/

    //Test for number of words less than lastnwords
    @Test
    public void testNotEnoughWords() {
        final Iterator<String> input = Arrays.asList(new String[]{}).iterator();
    }
    //Test for number of unique words less than howmany

    //Test for no words bigger than minlength

    //
}
