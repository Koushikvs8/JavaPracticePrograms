package AllInone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeduplicateArry {

	
	public static void main(String[] args) {
		Integer[] num = { 3,5,8,8,90,45,45,23,12};
		   
		Set<Integer> set=new HashSet<Integer>(Arrays.asList(num));
		
		
		List<Integer> evnn=new ArrayList<Integer>(set);
		System.out.println(evnn);
		
	}
}
