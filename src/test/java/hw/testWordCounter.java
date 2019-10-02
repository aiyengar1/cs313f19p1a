 package hw;

 import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Collections;
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
  public void testIteratorNonempty() {
   final Iterator<String> input = Arrays.asList(
           new String[]{"hello", "world", "what", "up"}
   ).iterator();
   assertTrue(input.hasNext());
   assertEquals("hello", input.next());
   assertTrue(input.hasNext());
   assertEquals("world", input.next());
   assertTrue(input.hasNext());
   assertEquals("what", input.next());
   assertTrue(input.hasNext());
   assertEquals("up", input.next());
   assertFalse(input.hasNext());
  }

  @Test
  public void testIteratorEmpty() {
   final Iterator<String> input = Arrays.asList(
           new String[]{}
   ).iterator();
   assertFalse(input.hasNext());
  }

  //Test for number of words less than lastnwords
  @Test
  public void testNotEnoughWords() {
   final Iterator<String> input = Arrays.asList(new String[]{}).iterator();
  }
  //Test for number of unique words less than howmany

  //Test for no words bigger than minlength

  //
}
