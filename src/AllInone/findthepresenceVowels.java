package AllInone;

public class findthepresenceVowels {
public static void main(String[] args) {
	String name="koushik".toLowerCase();
	int count =0;
	 char[] ch = name.toCharArray();
	  for (int i = 0; i < ch.length; i++) {
		  
		 if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u' )
		 {    
			 System.out.println( ch[i]);
			 count++;
			 
		 }
	}
	  System.out.println(count); 
}
}
