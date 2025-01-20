package JavaArryBased;

public class partofStringReverse {

	public static void main(String[] fff) {
		String name ="koushik";
		 String rev="";
		 
		 for (int  i= 0;  i < name.length(); i++) {
			 if(i<=2)
			 {
				 rev=rev+name.charAt(i);
				// System.out.println(rev);
			 }
			 
			 else if(i==3){
			 
			for (int i1 = name.length()-1; i1 >= 3; i1--) {
				rev=rev+name.charAt(i1);
				
			}
			
			break;
		}
			 

		
	}
		 System.out.println(rev);
	}
}
	
	

