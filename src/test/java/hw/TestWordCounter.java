 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

 public class TestWordCounter {

     private WordCounter fixture;
     private int testcount = 0;

  @Before
  public void setUp() throws Exception {
      fixture = new WordCounter(testcount);
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

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
}
