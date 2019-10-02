import hw.WordCounter;
import org.apache.commons.collections4.queue.CircularFifoQueue;

import java.util.Queue;

public class Observable implements WordCounter {
    //create an CircularFifoQueue of size lastnwords
    final Queue<String> queue = new CircularFifoQueue<>(lastnwords);
        while(input.hasNextLine())

    {
        while (input.hasNext()) {


            //get input, create event, throw event

            final String nextWord = (String) input.next();

            if (nextWord.length() >= minlength) {
                if (count == lastnwords) {
                    //remove oldest word from map
                    wordcount.decreaseFrequency(queue.element());
                    //add nextWord to queue
                    queue.add(nextWord);
                    //add nextWord to WordCount HashMap
                    wordcount.addWord(nextWord);
                    //call and print getTopWords
                    System.out.println(wordcount.toString(howmany));
                } else if (count == lastnwords - 1) {
                    //add nextWord to queue
                    queue.add(nextWord);
                    //add nextWord to WordCount HashMap
                    wordcount.addWord(nextWord);
                    //call and print getTopWords
                    System.out.println(wordcount.toString(howmany));
                    //increment count
                    count++;
                } else {
                    //add nextWord to queue
                    queue.add(nextWord);
                    //add nextWord to Map
                    wordcount.addWord(nextWord);
                    //don't print word cloud
                    //increment count
                    count++;
                }
            }
        }
    }
        input.close();
}
