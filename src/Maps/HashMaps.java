package Maps;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	
	public static void main(String[] args) {
		
		Map<Integer, String> students =new HashMap<Integer, String>();
		      students.put(121, "koushik");
		      students.put(122, "swathi");
		      students.put(123, "gourav");
		      students.put(124, "lakshmi");
		      students.put(null, "suhas");
		      students.put(null, "fff");
		      
		      System.out.println(students.values());
		      System.out.println(students.keySet());
		      
		      Set<Integer> keys= students.keySet();
		      Iterator<Integer> it=  keys.iterator();
		      while(it.hasNext())
		      {       
		    	  System.out.println(students.get(it.next()));
		      }
		     
		      
		      for (Map.Entry<Integer, String> entry : students.entrySet()) {
		            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		        }
		
		
		
	}
}
