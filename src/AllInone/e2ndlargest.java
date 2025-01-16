package AllInone;

import java.util.Arrays;

public class e2ndlargest {
	
	
	
	
public static void main(String[] args) {
	int[] num = {2,4,78,90,23,56,456,234};
	inbuiltlogic(num);
	  customlogic(num);
	System.out.println(customlogic(num));
	
	
}

private static int customlogic(int[] num) {
	int n=num.length;
	Arrays.sort(num);
	for (int i =(n-2); i>=0 ; i--) {
		if(num[i]!=num[n-1])
		{
			return (num[i]);
		}
	}
	return -1;
	
	
}

private static void inbuiltlogic(int[] num) {
	// TODO Auto-generated method stub
	Arrays.sort(num);
	System.out.println(num[num.length-2]);
	
}
}
