package JavaStringBased;

import java.util.Arrays;
import java.util.Scanner;

public class Angogram {
	
public static void main(String[] args) {
	
	
	while(true)
	{
	System.out.println("Enter the name 1");
	Scanner Str1=new Scanner(System.in);
	String name1=Str1.nextLine();
	char[] n1=name1.toCharArray();
	System.out.println("Enter the name 2");
	Scanner Str2=new Scanner(System.in);
	String name2=Str1.nextLine();
	char[] n2=name2.toCharArray();
	
	Arrays.sort(n1);
	Arrays.sort(n2);
	Boolean g= Arrays.equals(n1, n2);
	if(g)
	{
		System.out.println("anagrom");
	}
	else
	{
		System.out.println("not anagrom");
	}
		
	
}
}
}