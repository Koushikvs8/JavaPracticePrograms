package AllInone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class wordcountofString {

	
	public static void main(String[] args) {
        String name = "koushik vittal shet";
        char[] ch = name.toCharArray();

        Map<Character, Integer> datasets = new HashMap<>();

        for (char c : ch) {
            if (datasets.containsKey(c)) {
                datasets.put(c, datasets.get(c) + 1);
            } else {
                datasets.put(c, 1);
            }
        }

        // Display the character count
        System.out.println("Character count:");
        for (Map.Entry<Character, Integer> entry : datasets.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}