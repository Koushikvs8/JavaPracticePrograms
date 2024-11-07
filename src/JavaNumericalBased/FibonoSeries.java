package JavaNumericalBased;

import java.util.Scanner;

public class FibonoSeries {
	public static void Logic()
	{   int num;  
		int a1=0;
		int b1=1;
		while (true) {
		System.out.println("\n"+"Enter the Number ");
		Scanner input =new Scanner(System.in);
		num = input.nextInt();
		for(int i=0; i<=num; i++)
			
		{    System.out.print(a1+ " "); //0 and 1 are commen so we declare variable a1 and b1
			int nextnum= a1+b1;
			a1=b1;
			b1=nextnum;
			   
		}
		
	}
	
		
	}
	////Executer////
	public static void main(String[] args) {
		
		Logic();
	}
}
