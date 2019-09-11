package hw;

//import org.apache.commons.lang.StringUtils;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/**
 * A map-based class for counting word frequencies from an iterator.
 */
public class WordCounter {

    //The map for storing the word counts.
    private Map<String, Integer> theMap;
    private int size = 0;


    //Creates a word counter instance and sets the map size.
    public WordCounter(int worldcloudsize) {

        // TODO
        this.theMap = null;
        this.size = worldcloudsize;

    }

    /*public void addWord(final String word) {
        if (StringUtils.isNotEmpty(word)) {
            //if the word already exists in the map, add 1 to its frequency (value)
            if (theMap.containsKey(word)) {
                //update frequency
                theMap.put(word, theMap.get(word) + 1);
            }
            //else addword to map
            else {
                theMap.put(word, 1);
            }
        }
    }

    //when word is removed from window, frequency must decrease by 1
    public void decreaseFrequency(final String word) {
        if (StringUtils.isNotEmpty(word)) {
            if (theMap.get(word) > 1) {
                theMap.put(word, theMap.get(word) - 1);
            }
            //if occurrence being removed is only occurrence, then word must be removed from map
            else {
                theMap.remove(word);
            }
        }
    }*/

    /** Counts the frequencies of all words in the given iterator.
     public void countWords(final Iterator<String> words) {
     int count = 0;
     // TODO for each word in the iterator, update the corresponding frequency in the map
     // Use the getOrDefault method
     while(words.hasNext()){

     }

     }*/

    /**
     * Retrieve the frequency of a particular word.
     */
    public int getCount(final String word) {

        // TODO

        return theMap.getOrDefault(word, 50);

    }

    /**
     * Retrieve the map representing all word frequencies.
     * public Map<String, Integer> getCounts() {
     * return Collections.unmodifiableMap(theMap);
     * }
     */

    public String getTopWords() {
        //Sort map by descending order
        //return only top 'size' words and their frequencies
        return null;
    }
}