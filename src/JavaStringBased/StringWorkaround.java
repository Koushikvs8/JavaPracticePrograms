package JavaStringBased;

public class StringWorkaround {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	
	String st1=new String("hello");
	String st2=new String("hello");
	
	
	if(s1==s2)
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("Not-equal");
	}
	
	if(st1.equals(st2))
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("Not-equal");
	}
	
	
	
	
}
}
