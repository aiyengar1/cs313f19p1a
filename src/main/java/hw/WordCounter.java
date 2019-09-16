package hw;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

/**
 * A map-based class for counting word frequencies
 */
public class WordCounter {

    //The map for storing the word counts.
    private HashMap<String, Integer> theMap = new HashMap<>();
    private int size = 0;


    //Creates a word counter instance and sets the map size.
    public WordCounter(int worldcloudsize) {

        // TODO
        this.size = worldcloudsize;
    }

    public void addWord(final String word) {
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

    //when word is removed from window, frequency must decrease by 1
    public void decreaseFrequency(final String word) {
        if (theMap.get(word) > 1) {
            theMap.put(word, theMap.get(word) - 1);
        }
        //if occurrence being removed is only occurrence, then word must be removed from map
        else {
            theMap.remove(word);
        }
    }

    public int getCount(final String word) {

        return theMap.get(word);

    }

    public Map getSortedWords(Map<String, Integer> unsortedMap) {
        //Sort map by descending order
       /* Map<String, Integer> sorted = unsortedMap;
        sorted.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
        return sorted;*/

        TreeMap<String, Integer> sorted = new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(theMap);

        return sorted;
    }

    //toString method to return only top 'size' words and their frequencies
    public String toString(int cloudsize) {
        final Map maptoprint = getSortedWords(theMap);
        ArrayList<String> keyList = new ArrayList<String>(maptoprint.keySet());
        ArrayList<Integer> valueList = new ArrayList<Integer>(maptoprint.values());
        String wordcloud = "";
        for (int i = 0; i < cloudsize; i++) {
            wordcloud = "\n" + wordcloud + " " + keyList.get(i) + ": " + valueList.get(i) + "\n";
        }
        return wordcloud;
    }

    /**
     * Retrieve the map representing all word frequencies.
     * public Map<String, Integer> getCounts() {
     * return Collections.unmodifiableMap(theMap);
     * }
     */

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
}