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
            //System.out.println("Word added");
        }
        //else addword to map
        else {
            theMap.put(word, 1);
            //System.out.println("Word added");
        }
    }

    //when word is removed from window, frequency must decrease by 1
    public void decreaseFrequency(final String word) {
        if (theMap.get(word) > 1) {
            theMap.put(word, theMap.get(word) - 1);
            //System.out.println("Word deleted");
        }
        //if occurrence being removed is only occurrence, then word must be removed from map
        else {
            theMap.remove(word);
            //System.out.println("Word deleted");
        }
    }

    public int getCount(final String word) {

        return theMap.get(word);

    }

    public Map<String, Integer> getSortedWords(final Map<String, Integer> unsortedMap) {
        //Sort map by descending order
        /*TreeMap<String, Integer> sorted = new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(unsortedMap);*/
        //System.out.println("Sorting called");

        Map<String, Integer> sorted = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return sorted;
    }

    //toString method to return only top 'size' words and their frequencies
    public String toString(int cloudsize) {
        //System.out.println("ToString called");
        Map maptoprint = getSortedWords(theMap);
        ArrayList<String> keyList = new ArrayList<String>(maptoprint.keySet());
        ArrayList<Integer> valueList = new ArrayList<Integer>(maptoprint.values());
        String wordcloud = "";
        if (cloudsize < keyList.size()) {
            for (int i = 0, j = keyList.size() - 1; i < cloudsize; i++, j--) {
                wordcloud = "\n" + wordcloud + " " + keyList.get(j) + ": " + valueList.get(j) + "\n";
                //System.out.println("Word added to word cloud");
            }
        } else {
            for (int i = keyList.size() - 1; i >= 0; i--) {
                wordcloud = "\n" + wordcloud + " " + keyList.get(i) + ": " + valueList.get(i) + "\n";
            }
        }
        return wordcloud;
    }
}