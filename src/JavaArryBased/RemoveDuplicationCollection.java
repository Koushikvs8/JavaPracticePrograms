package JavaArryBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicationCollection {
public static void main(String[] args) {
	Integer[] num= {1,1,2,3,4,3,5,6,6,89};

	Set<Integer> list =new HashSet<Integer>(Arrays.asList(num));
	
    List<Integer> updatedlist=new ArrayList<Integer>(list)	;
    
    System.out.println(updatedlist);
	
}


}
