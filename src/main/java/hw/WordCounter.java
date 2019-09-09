package hw;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/**
 * A map-based class for counting word frequencies from an iterator.
 */
public class WordCounter {

  /** The map for storing the word counts. */
  private Map<String, Integer> theMap;
  private int size = 0;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(int worldcloudsize) {

    // TODO
    this.theMap = null;
    this.size = worldcloudsize;

  }

  public void addWord(final String word) {
    //add word to theMap
    //if word exists
    //then update frequency: getCount + 1
    //else addword to map
    //theMap.put(word, 1);

  }

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

    return -1;

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
  }
}