package JavaArryBased;

import java.util.Iterator;

public class LargestNmr {
public static void main(String[] args) {
	int[] num = {2,4,78,90,23,56,456,234};
	
	int max=num[0];
	
	for (int i = 1; i < num.length; i++) {
		if(num[i]>max)
		{
			max=num[i];
		}
	}
	System.out.println("largest nor :" + max);
}
}
