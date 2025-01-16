package AllInone;

import java.util.Arrays;
import java.util.Iterator;

public class sortarry {
	
	
	
	public static void main(String[] args) {
		int[] num = {2,4,78,90,23,56,456,234};
		int temp;
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
