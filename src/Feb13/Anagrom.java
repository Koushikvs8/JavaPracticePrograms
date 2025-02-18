package Feb13;

import java.util.Arrays;

public class Anagrom {

	
	
	public static void main(String[] args) {
		String name1="maliyalam";
		String name2="maliyalam";
		char[] n1=name1.toCharArray();
		char[] n2=name1.toCharArray();
		Arrays.sort(n1);;
		Arrays.sort(n2);
		System.out.println(Arrays.equals(n1, n2));
		if(Arrays.equals(n1, n2))
		{System.out.println("anagram");
			
		}
		else
		{
			System.out.println("not anagram");
		}
		
		
	}
	
	
}
