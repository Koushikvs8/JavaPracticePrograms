package Feb13;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    
    public static void main(String[] args) {
    	String[] names= {"koushik", "koushik","swathi","suresh","null",null};
    	Arrays.asList(names);
    	List<String> words = new LinkedList<String>(Arrays.asList(names));
    	System.out.println(words);
    	words.toArray();
    	System.out.println(words.toArray());
    	
	}
}
