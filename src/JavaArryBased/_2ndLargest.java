package JavaArryBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2ndLargest {
	
	
public static void main(String[] args) {
	int[] num= { 1,23,45,67,89,9,34,245};
	int n=num.length;
	
	Arrays.sort(num);
	
System.out.println(num[n-2]);


}


}
