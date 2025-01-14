package JavaArryBased;

import java.util.Arrays;

public class sortArry {

	
public static void main(String[] args) {
	int a[]= {4,2,1,5,3};
	int Temp;
	System.out.println("arrys before sorting:"+ Arrays.toString(a));
	
	   for (int i = 0; i <a.length-1; i++) {
		   
		for (int j = 0; j <a.length-1; j++) {
			   if(a[j]>a[j+1])
			   {    Temp = a[j];
			        a[j]=a[j+1];
			        a[j+1]=Temp;
				   
			   }
		}
	}
	   System.out.println("arrys after sorting:"+ Arrays.toString(a));
	
	
}
	
	
}
