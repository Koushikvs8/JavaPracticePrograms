package JavaArryBased;

import java.util.ArrayList;
import java.util.List;

public class OddNumCollection {
	  
    public static void main(String[] args) {
        int num1[] = {2, 3, 4, 56, 78, 7, 8, 9, 0};
        List<Integer> Evenlist = new ArrayList<Integer>();
        List<Integer> oddlist = new ArrayList<Integer>();

        System.out.println("Program started");

        for (int i = 0; i < num1.length; i++) {
        	
			if(num1[i]%2!=0) 
			{
				System.out.println("Odd Numbers are : "+num1[i] +oddlist.add(num1[i]));
				
			}
			else {
				Evenlist.add(num1[i]);
			}
           
        }

        // Print all numbers
        System.out.println("All numbers: " + Evenlist);
        // Print only odd numbers
        System.out.println("Odd numbers: " + oddlist);
    }
}
