/*
Ananth Iyengar
COMP 313
Project 1A
Main method that will take in a string of words, and based on three variables (<howmany> <minlength> <lastnwords>) will output
a textual word cloud.
 */
package hw;

import org.apache.commons.collections4.queue.*;
import sun.misc.Signal;

import java.util.Arrays;
import java.util.*;

public class TopWords {

    public static void main(final String[] args) {
        // properly terminate on SIGPIPE received from downstream
        if (!"Windows".equals(System.getProperty("os.name"))) {
            Signal.handle(new Signal("PIPE"), (final Signal sig) -> System.exit(1));
        }

        // set up the scanner so that it separates words based on space and punctuation
        final Scanner input = new Scanner(System.in).useDelimiter("(?U)[^\\p{Alpha}0-9']+");
        System.out.println("Program started");

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
                howmany = 10;
                minlength = 6;
                lastnwords = 1000;
        }

        //initialize count to zero
        int count = 0;

        // TODO complete this main program
        //create a WordCounter instance
        WordCounter wordcount = new WordCounter(lastnwords);

        //create an CircularFifoQueue of size lastnwords
        final Queue<String> queue = new CircularFifoQueue<>(lastnwords);
        while (input.hasNextLine()) {
            //System.out.println("input has Next Line");
            while (input.hasNext()) {
                //System.out.println("input has Next");
                final String nextWord = (String) input.next();

                if (nextWord.length() >= minlength) {
                    if (count == lastnwords) {
                        //remove oldest word from map
                        wordcount.decreaseFrequency(queue.element());
                        //System.out.println("element deleted from map");
                        //add nextWord to queue
                        queue.add(nextWord);
                        //System.out.println("element added to queue");
                        //add nextWord to WordCount HashMap
                        wordcount.addWord(nextWord);
                        //System.out.println("Element added to map");
                        //call and print getTopWords
                        System.out.println(wordcount.toString(howmany));
                    } else if (count == lastnwords - 1) {
                        //add nextWord to queue
                        queue.add(nextWord);
                        //System.out.println("word added to queue");
                        //add nextWord to WordCount HashMap
                        wordcount.addWord(nextWord);
                        //System.out.println("Word added to map");
                        //call and print getTopWords
                        System.out.println(wordcount.toString(howmany));
                        //increment count
                        count++;
                    } else {
                        //add nextWord to queue
                        queue.add(nextWord);
                        //System.out.println("word added to queue");
                        //add nextWord to Map
                        wordcount.addWord(nextWord);
                        //System.out.println("word added to map");
                        //don't print word cloud
                        //increment count
                        count++;
                        //System.out.println("count incremented");
                    }
                }
            }
        }
        input.close();
    }
}
