package hw;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class testTopWords {

    @Test
    public void testTrivialExample() {
// general test structure
//        input = ...
//        result = sut.f(input);
//        assertSomething(result);
        final ArrayList<String> input = new ArrayList<>();
        Collections.sort(input);
        assertTrue(input.isEmpty());
    }

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
}
