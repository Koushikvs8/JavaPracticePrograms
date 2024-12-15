package JavaArryBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2ndLargest {
	
	
	public static  int get2ndLargestApp1(int[] num)
	{ int n=num.length;
	Arrays.sort(num);
		return num[n-2];
	}
	public static  int get2ndLargestApp2(int[] num)
	{   int n=num.length;
	Arrays.sort(num);
	for (int i =(n-2); i >=0; i--) {
		if(num[i]!=num[n-1])
		{
			return num[i];
		}
	}
	
		return -1;
	}
	
	
public static void main(String[] args) {
	int[] num= { 23,23,23};
	System.out.println(get2ndLargestApp1(num)); 
	System.out.println(get2ndLargestApp2(num));
	
	



}


}
