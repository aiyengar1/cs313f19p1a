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

        //final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

        int howmany, minlength, lastnwords = 0;

        switch (args.length) {
            case 0:
                howmany = 10;
                minlength = 6;
                lastnwords = 1000;
                break;
            case 1:
                howmany = Integer.parseInt(args[0]);
                break;
            case 2:
                howmany = Integer.parseInt(args[0]);
                minlength = Integer.parseInt(args[1]);
                break;
            case 3:
                howmany = Integer.parseInt(args[0]);
                minlength = Integer.parseInt(args[1]);
                lastnwords = Integer.parseInt(args[2]);
                break;
        }

        int count = 0;

        //System.out.println(input.next());

        //final Iterator<String> iterator = new Iterator<String>;

        // TODO complete this main program
        // 1. create a WordCounter instance
        WordCounter wordcount = new WordCounter(lastnwords);
        // 4. create an ArrayList of size
        // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>)
        // 6. sort the ArrayList in descending order by count
        //    using Collections.sort and an instance of the provided comparator (after fixing the latter)

        System.out.println(lastnwords);

        //String testword = input.next();
        //wordcount.addWord(testword);

        /*while(input.hasNext()){
        if (count == lastnwords) {
            if (input.next().length() >= minlength) {
                //remove first from arrayList
                //call getcount(iterator.next()) in wordcounter
                //add iterator.next() last to arrayList
                //call and print getTopWords
            }
        } else {
            if (input.next().length() >= minlength) {
                //call getcount(iterator.next()) in wordcounter
                //add iterator.next() last to arrayList
                //don't print word cloud
                count++;
            }
        }
        }*/

    }
}
