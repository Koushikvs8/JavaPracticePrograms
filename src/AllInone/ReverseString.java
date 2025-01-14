package AllInone;

public class ReverseString {

	
	public static void main(String[] args) {
		String name= "kook";
		String rev="";
		 for (int i=name.length()-1; i>=0; i--) {
			    
			     rev =rev+name.charAt(i);
			
			 
		}
		 System.out.println( rev );
		 
		 
		 if(name.equals(rev))
		 {
			 System.out.println("palindromic");
		 }
		 else
		 {
			 System.out.println("Not palindromic");
		 }
		
	}
}
