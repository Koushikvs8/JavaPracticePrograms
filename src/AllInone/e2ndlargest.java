package AllInone;

import java.util.Arrays;

public class e2ndlargest {
	
	
	
	
public static void main(String[] args) {
	int[] num = {2,4,78,90,23,56,456,234};
	inbuiltlogic(num);
	customlogic(num);
	
	
	
}

private static void customlogic(int[] num) {
	
	
	
	
}

private static void inbuiltlogic(int[] num) {
	// TODO Auto-generated method stub
	Arrays.sort(num);
	System.out.println(num[num.length-2]);
	
}
}
