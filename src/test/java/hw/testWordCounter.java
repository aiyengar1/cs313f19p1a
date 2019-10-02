package hw;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.*;

public class testWordCounter {
    /* @Before
  public void setUp() throws Exception {
      fixture = new WordCounter(testcount);
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }
*/
    //test add word
    @Test
    public void addWord() {
        WordCounter wc = new WordCounter();
        wc.addWord("elephant");
        assertEquals(1, wc.getCount("elephant"));
    }

    @Test
    public void decreaseFrequency() {
        WordCounter wc = new WordCounter();
        wc.addWord("elephant");
        wc.addWord("elephant");
        assertEquals(2, wc.getCount("elephant"));
        wc.decreaseFrequency("elephant");
        assertEquals(1, wc.getCount("elephant"));
    }

    @Test
    public void testIteratorEmpty() {
        final Iterator<String> input = Arrays.asList(
                new String[]{}
        ).iterator();
        assertFalse(input.hasNext());
    }

    @Test
    public void testMapSize() {
        int testmapsize = 5;
        WordCounter wc = new WordCounter();
        wc.setCloudSize(testmapsize);
        assertEquals(testmapsize, wc.getSize());

    }

    //Test for number of words less than lastnwords
    @Test
    public void testNotEnoughWords() {
        final Iterator<String> input = Arrays.asList(new String[]{}).iterator();
        // assert
    }
    //Test for number of unique words less than howmany

    //Test for no words bigger than minlength

    //Test toString method
    @Test
    public void testToString() {
        WordCounter wc = new WordCounter();
        wc.addWord("elephant");
        wc.addWord("elephant");
        wc.addWord("yellow");
        wc.addWord("yellow");
        String testString = "\n\n elephant: 2\n yellow: 2\n";
        assertEquals(testString, wc.toString(4));
    }
}
