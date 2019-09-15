/*
Ananth Iyengar
COMP 313
Project 1A
Main method that will take in a string of words, and based on three variables (<howmany> <minlength> <lastnwords>) will output
a textual word cloud.
 */
package hw;

import org.apache.commons.collections4.queue.*;

import java.util.Arrays;
import java.util.*;

public class TopWords {

    public static void main(final String[] args) {
        //System.out.println("args = " + Arrays.asList(args));
        //final WordCounter instance = new WordCounter();
        // set up the scanner so that it separates words based on space and punctuation

        final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

        int howmany = 0, minlength = 0, lastnwords = 0;

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
            default:
                howmany = Integer.parseInt(args[0]);
                minlength = Integer.parseInt(args[1]);
                lastnwords = Integer.parseInt(args[2]);
        }

        int count = 0;

        //System.out.println(input.next());

        //final Iterator<String> iterator = new Iterator<String>;

        // TODO complete this main program
        //create a WordCounter instance
        WordCounter wordcount = new WordCounter(lastnwords);

        //create an CircularFifoQueue of size lastnwords
        final Queue<String> queue = new CircularFifoQueue<>(lastnwords);

        System.out.println();

        while (input.hasNext()) {
            final String nextWord = input.next();
            if (count == lastnwords) {
                if (nextWord.length() >= minlength) {
                    //add nextWord to queue
                    queue.add(nextWord);
                    //call and print getTopWords
                    //System.out.println(wordcount.toString(howmany));
                }
            } else {
                if (input.next().length() >= minlength) {
                    //add nextWord to queue
                    queue.add(nextWord);
                    //don't print word cloud
                    //increment count
                    count++;
                }
            }
        }

        System.out.println(wordcount.getCount("yellow"));

    }
}
