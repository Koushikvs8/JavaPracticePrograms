package JavaStringBased;

import java.util.HashMap;
import java.util.Set;

public class DuplicatedWordString {
    public static void duplicateWords(String sentence) {
        String[] words = sentence.split(" ");

        // Creating one HashMap with words as keys and their counts as values
        HashMap<String, Integer> wordCount = new HashMap<>();
        // Checking each word
        for (String word : words) {
            // Check if the word is already in the wordCount map
            if (wordCount.containsKey(word)) {
                // If present, increment its count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If not present, add the word with an initial count of 1
                wordCount.put(word, 1);
            }
        }

        // Extracting all keys of wordCount
        Set<String> wordsInString = wordCount.keySet();

        // Iterating through all words in wordCount
        for (String word : wordsInString) {
            // If word count is greater than 1, it's a duplicate
            if (wordCount.get(word) > 1) {
                // Printing the word and its count
                System.out.println(word + " : " + wordCount.get(word));
            }
        } 
    }

    public static void main(String[] args) {
        duplicateWords("java is java nothing can replace is java");
       
    }
}




