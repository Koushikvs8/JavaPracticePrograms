package JavaStringBased;

import java.util.Scanner;

public class PositionofWord {
	
	
public static void main(String[] args) {
	String name="koushik";
	while(true)
	{
		System.out.println("Enter the word");
	Scanner input= new Scanner(System.in);
	String ch=input.nextLine();
	int position=name.indexOf(ch)+1;
	if (position==-1) {
		System.out.println("the word is not included");
	} else {
		System.out.println("the position of the word "+ ch + " is " +position);
	}
	
	}
}
}
