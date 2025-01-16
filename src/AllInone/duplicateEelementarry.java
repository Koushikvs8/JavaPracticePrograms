package AllInone;

public class duplicateEelementarry {
	
	
	public static void main(String[] args) {
		char[] name = {'k', 'o', 'k', 'u','u','u'};
		
		
		for (int i = 0; i < name.length; i++) {
			int count=0;
			for (int j = i+1; j < name.length; j++) {
				
				if(name[i]==name[j])
				{
					
					count++;
					name[i]=' ';
				}
			}
			if(count>0 || name[i]!=' ')
			{
				System.out.println(name[i] + count);
			}
			
		}
	}
}
