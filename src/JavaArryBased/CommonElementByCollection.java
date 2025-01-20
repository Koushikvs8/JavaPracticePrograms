package JavaArryBased;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonElementByCollection {

	public static void main(String[] args) {
		int [] a1= {2,3,4,9,79,90,32,45};
		int [] a2= {2,3,56,67,89,4,9,3};
		List<Integer> commenlist=logicForFinding(a1, a2 );
		System.out.println("the commen Elemnts are"+commenlist);

	}
public static List<Integer> logicForFinding(int[] a1,int[] a2)
{        List<Integer> commenlist=new ArrayList<Integer>();

for (int i = 0; i < a1.length; i++) {
	for (int j = 0; j < a2.length; j++) {
		if(a1[i]==a2[j])
		{
			commenlist.add(a1[i]);
		}
	}
}

	return commenlist;
	
}
}
