package Feb13;

public class replace {
	public static String rplaceChar(String str)
	{
		 String replaced=str.replace('M', '2').replace('N', '3');
		return replaced;
		
	}
	
	
	
	
	public static void main(String[] args) {
		String word ="MMfgjMhhmmhNNhjnn";
		
	
		System.out.println(rplaceChar(word));
		
	}
}
