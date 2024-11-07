package JavaNumericalBased;

import java.util.Scanner;

public class EvenOdd {
/////Logic//////
	public static void Logic()
	{     while (true) {
		System.out.println("Enter the Number ");
		Scanner input =new Scanner(System.in);
		int num = input.nextInt();
		if(num%2==0)
		{
			System.out.println("entered number is Even");
		}
		else
		{
			System.out.println("entered number is ODD");
		}
		
	}
	
		
	}
	////Executer////
	public static void main(String[] args) {
		
		Logic();
	}
	
	
}
