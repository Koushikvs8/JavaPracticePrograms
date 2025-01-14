package AllInone;

public class swapString {

	
	public static void main(String[] args) {
		String a ="hello";
		String b="world";
		
		System.out.println("before swaping" +" a "+a+" b " +b);
		  
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after swaping" +" a "+a+" b " +b);
	}
}
