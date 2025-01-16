package JavaNumericalBased;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrimNumber {
	public static void logic()
	{    
		int num;
		int isprime =1;
		while (true) {
		System.out.println("\n"+"Enter the Number ");
		Scanner input =new Scanner(System.in);
		num= input.nextInt();
		if(num<2)
		{
			System.out.println("Not prime");
		}
		else if(num==2 )
		{
			System.out.println("prime");
		}
		else
		{
			for(int i=2; i<=Math.sqrt(num); i++)
			{
				if(num%i==0)
				{
					System.out.println("Not prime");
					isprime=0;
				}
			}
			if(isprime==1)
			{
				System.out.println("prime");
			}
		}
		
		}
	
}
////Executer////
public static void main(String[] args) {
	
		

	logic();

}
}


	
	

