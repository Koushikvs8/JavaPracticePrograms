package JavaNumericalBased;

import java.util.Scanner;

public class LeapYear {
	public static void logic()
	{    
		int year;
		
		while (true) {
		System.out.println("\n"+"Enter the Number ");
		Scanner input =new Scanner(System.in);
		year= input.nextInt();
		if((year%4==0 && year%100!=0 )|| year%400==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not Leap year");
		}
		
		}
	
}
////Executer////
public static void main(String[] args) {
	logic();

}
}
