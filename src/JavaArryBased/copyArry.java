package JavaArryBased;

import java.util.Arrays;

public class copyArry {
public static void main(String[] args) {
	int[] a= new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	int[] b=new int[3];
	
	for (int i =2,  j =0; i>=0; i--,j++) {
		
			b[j]=a[i];
			
		
	}
	System.out.println(Arrays.toString(b));
}


}
