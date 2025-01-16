package AllInone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import JavaArryBased.ArrysBasicWorkaround;

public class Duplicateandoccurence {

	
	
	
	
	public static void duplicateoccurence(String sentence)
	{
		
		String[] word=sentence.split(" ");
		//System.out.println(Arrays.toString(word));
		Map<String, Integer> wordpair=new HashMap<String, Integer>();
		
		for (String string : word) {
			
			if(wordpair.containsKey(string))
			{
				wordpair.put(string,wordpair.get(string)+1 );
			}
			else
			{
				wordpair.put(string,1 );
			}	
		}
		
		Set<String> keywords=wordpair.keySet();
		
		for (String string : keywords) {
			
			if(wordpair.get(string)>1)
			{
				System.out.println( string+ " :" + wordpair.get(string) );
			}
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		 String sentence="java is java for java and i am lerning oops for oops am";
		 duplicateoccurence(sentence);
		
		
	}
	
	
	
	
	
	
}
