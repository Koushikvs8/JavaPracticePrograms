package AllInone;

public class Duplicatewords {


	public static void main(String[] args) {
		
		String sentence=" koushik learn java , java is in high demand koushik is";
		sentence=sentence.toLowerCase();
		int count=0;
		
		String[] words=sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			boolean flag=false;
			for (int j = i+1; j < words.length; j++) {
				   if(words[i].equals(words[j]))
				   {
					   flag=true;
					   
				   }
				
			
				
			}
			
			 if(flag ) 
			 {
				 System.out.println( words[i] );
			 }
			
			
		}
		
		
	}
}
