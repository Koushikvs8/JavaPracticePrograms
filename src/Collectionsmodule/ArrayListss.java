package Collectionsmodule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListss {
	
	
public static void main(String[] args) {
  String exp="";
	List<String> names=new ArrayList<String>();
	names.add("koushik");
	names.add("swathi");
	names.add("");
	names.add("gilli");
	names.add(2, null);
	names.add("gilli");
	System.out.println(names.toString());
	
	Iterator<String> itrater=names.iterator();
	System.out.print("[");
	while(itrater.hasNext())
	{    
		String name=itrater.next();
		exp=name+", ";
		System.out.print(exp);
		//System.out.print(exp);
	}
	
	System.out.print("]");
	
	
	
}
	
	
}
