package Feb13;

import java.util.Iterator;

public class ReverseString {
	  static String word="kook";
	  static String rev="";
	 
	public static void main(String[] args) {
		for (int i =word.length()-1 ; i>=0; i--) {
			rev=rev+word.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equals("kook"))
		{
			System.out.println("palindomic");
		}
		else
		{
			System.out.println("not palindomic");
		}
	}
	

}
