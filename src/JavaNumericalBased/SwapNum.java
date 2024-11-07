package JavaNumericalBased;

import java.util.Scanner;

public class SwapNum {
	public static void logicWithTempVariable()
	{    
		int a;
		int b;
		int temp;
		while (true) {
		System.out.println("\n"+"Enter the Number ");
		Scanner input =new Scanner(System.in);
		a= input.nextInt();
		b= input.nextInt();
		temp=b;
		b=a;
		a=temp;
		System.out.println(a+" "+b);
		}
	}
		public static void logicWithOutTempVariable()
		{    
			int a;
			int b;
			int temp;
			while (true) {
			System.out.println("\n"+"Enter the Number ");
			Scanner input =new Scanner(System.in);
			a= input.nextInt();
			b= input.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a+" "+b);
			
			}
		
	}
	////Executer////
	public static void main(String[] args) {
		logicWithTempVariable();
		logicWithOutTempVariable();
	}
}
