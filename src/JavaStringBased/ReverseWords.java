package JavaStringBased;

import java.util.Arrays;

public class ReverseWords {
public static void main(String[] args) {
	String str="Koushik work hard until you find the defination of win";
	String[] strCh=str.split(" ");
	String Rev="";

	for (int i =strCh.length-1 ; i >=0; i--) {
		  
		Rev=Rev+strCh[i]+ " ";
		
		
	}
	System.out.println(Rev);
}
}
