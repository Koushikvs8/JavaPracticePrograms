package JavaArryBased;

import java.util.Iterator;

public class OddNum {

	public static void main(String[] args) {
		int num[]= {2,3,4,56,78,7,8,9,0};
		System.out.println("Prgram started");
		for (int i=0; i<num.length;i++) {
			
			if(num[i]%2!=0)
			{
				System.out.println("Odd Numbers are : "+num[i]);
				
			}
		}
	}
}
