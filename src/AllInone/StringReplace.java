package AllInone;

public class StringReplace {
     
	  
	
	
	public static String rplaceChar(String str)
	{
		 String replaced=str.replaceAll("[NnMm]", "");
		return replaced;
		
	}
	
	
	
	
	public static void main(String[] args) {
		String word ="MMfgjMhhmmhNNhjnn";
		
	
		System.out.println(rplaceChar(word));
		
	}
}
