package AllInone;

public class Duplicatewords {


	public static void main(String[] args) {
		
		String sentence=" koushik learn java , java is in high demand koushik is";
		sentence=sentence.toLowerCase();
		int count=0;
		boolean flag=false;
		String[] words=sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			count=0;
			for (int j = i+1; j < words.length; j++) {
				   if(words[i].equals(words[j]))
				   {
					   count++;
					   words[j]="null";
				   }
				
			
				
			}
			System.out.println(count);
			 if(count>0 && !words[i].equals("null") ) 
			 {
				 System.out.println( words[i] );
			 }
			
			
		}
		
		
	}
}
