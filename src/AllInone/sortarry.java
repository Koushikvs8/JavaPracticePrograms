package AllInone;

import java.util.Arrays;
import java.util.Iterator;

public class sortarry {

	public static void main(String[] args) {
		int[] num= {23,67,2,234,8,90,1,0};
		int  temp;
		   
		
		for (int i = 0; i < num.length-1; i++) {
			
			for (int j = 0; j < num.length-1; j++) {
				
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
				
					
			}
			
			
		}
		System.out.println(Arrays.toString(num));
		
		
		
		
	}
	
	
	
	
	
}
