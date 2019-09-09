/*
Ananth Iyengar
COMP 313
Project 1A
Main method that will take in a string of words, and based on three variables (<howmany> <minlength> <lastnwords>) will output
a textual word cloud.
 */
package hw;

import java.util.Arrays;
import java.util.*;

public class TopWords {

    public static void main(final String[] args) {
        //System.out.println("args = " + Arrays.asList(args));
        //final WordCounter instance = new WordCounter();
        // set up the scanner so that it separates words based on space and punctuation

        final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
        int howmany, minlength, lastnwords;
        howmany = input.nextInt();
        minlength = input.nextInt();
        lastnwords = input.nextInt();
        int count = 0;

        final Iterator<String> iterator = new Iterator<String>;
        // TODO complete this main program
        // 1. create a WordCounter instance
        Map<String, Integer> wordMap = new Map<String, Integer>;
        WordCounter wordcount = new WordCounter(howmany);
        // 2. use this to count the words in the input
        // 3. determine the size of the resulting map
        // 4. create an ArrayList of that size and
        // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
        // 6. sort the ArrayList in descending order by count
        //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
        // 7. print the (up to) ten most frequent words in the text
        if (count == lastnwords) {
            if (iterator.next().length() >= minlength) {
                //remove first from arraydeque
                //call getcount(iterator.next()) in wordcounter
                //add iterator.next() last to arraydeque
                //call and print getTopWords
            }
        } else {
            if (iterator.next().length() >= minlength) {
                //call getcount(iterator.next()) in wordcounter
                //add iterator.next() last to arraydeque
                //call and print getTopWords
                count++;
            }
        }

    }
}
