package JavaArryBased;

import java.util.Arrays;

public class copyArry {
public static void main(String[] args) {
	int[] a= new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	int[] b=new int[3];
	
	for (int i = 0,j =b.length-1; i < b.length; i++,j--) {
		//for (int j =b.length-1; j>=0; j--) {
			b[j]=a[i];
		
	}
	System.out.println(Arrays.toString(b));
}
}
