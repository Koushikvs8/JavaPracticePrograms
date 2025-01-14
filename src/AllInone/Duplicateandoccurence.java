package AllInone;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicateandoccurence {

	
	
	
	
	
	
	
	public static void main(String[] args) {
		String sentence ="koushik is java oops oh no oh oops is";
		DublicateandOccurence(sentence);
	}

	public static void DublicateandOccurence(String sentence) {
		// TODO Auto-generated method stub
		String words[]=sentence.split(" ");
		Map< String, Integer> wordpair= new HashMap<String, Integer>();
		for (String word : words) {
			
			if(wordpair.containsKey(word))
			{
				wordpair.put(word, wordpair.get(word)+1);
			
			}
			else {
				wordpair.put(word, 1);
			}
			
		}
		
		Set<String> stringKeys=wordpair.keySet();
		
		for (String word : stringKeys) {
			
			
			if(wordpair.get(word)>1)
			{
				System.out.println( word+ " :" +wordpair.get(word));
			}
		}
		
		
		
	}
}
