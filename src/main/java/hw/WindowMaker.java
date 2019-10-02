package hw;

import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.util.Queue;
import java.util.Scanner;

public class WindowMaker {
    final Scanner input = new Scanner(System.in).useDelimiter("(?U)[^\\p{Alpha}0-9']+");
    int howmany = 0, minlength = 0, lastnwords = 0;
    WordCounter myUpdater;

    public WindowMaker(String[] args) {
        System.out.println("Program started");
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
    }

    //Assign the wordcounter to be myUpdater
    public void setUpdater(WordCounter wc) {
        myUpdater = wc;
        myUpdater.setCloudSize(lastnwords);
    }

    public void start() {
        //initialize count to zero
        int count = 0;

        //create an CircularFifoQueue of size lastnwords
        final Queue<String> queue = new CircularFifoQueue<>(lastnwords);
        while (input.hasNextLine()) {
            while (input.hasNext()) {

                final String nextWord = (String) input.next();

                if (nextWord.length() >= minlength) {
                    if (count == lastnwords) {
                        //add nextWord to queue
                        queue.add(nextWord);
                        //remove oldest word from map
                        myUpdater.updateCloud(queue.element(), 1, nextWord, howmany);
                    } else if (count == lastnwords - 1) {
                        //add nextWord to queue
                        queue.add(nextWord);
                        //add nextWord to WordCount HashMap
                        myUpdater.updateCloud(queue.element(), 2, nextWord, howmany);
                        //increment count
                        count++;
                    } else {
                        //add nextWord to queue
                        queue.add(nextWord);
                        //add nextWord to Map
                        myUpdater.updateCloud(queue.element(), 3, nextWord, howmany);
                        //don't print word cloud
                        //increment count
                        count++;
                    }
                }
            }
        }
        input.close();
    }
}
