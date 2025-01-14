package AllInone;

import java.util.Arrays;

public class angram {

	
	
	
	public static void main(String[] args) {
		String word1="maliyalam";
		String word2="maliyaal7m";
		char[] w1=word1.toCharArray();
		char[] w2=word2.toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		boolean status=Arrays.equals(w1, w2);
		
		if(status)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		
	}
}
