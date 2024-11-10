package JavaStringBased;

public class NorWordsInString {
	
	public static void countByStingMethod()
	{
		String sentence="java is the mostly used programming language in the world ";
		String[] words=sentence.split("\\s+");
		
		System.out.println("Nor of words :"+ words.length);
		
	}
	
	public static void countByTocharMethod()
	{ String sentence="java is the mostly used programming language in the world";
	int counter=1;
		char[] words=sentence.toCharArray();

	for(int i=0; i<words.length; i++)
	{    
		if(words[i]==' ' )
		{
			counter++;
		}
	}
	System.out.println("Nor of words :"+ counter);
	}
	
	
	
public static void main(String[] args) {
	countByStingMethod();
	countByTocharMethod();
	
	
	
}
}
