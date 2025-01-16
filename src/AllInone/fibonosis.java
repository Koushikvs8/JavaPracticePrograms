package AllInone;

public class fibonosis {
   
	
	
	public static void main(String[] args) {
		
		int num =10;
		int n1=0;
		int n2=1;
		
		for (int i =0; i<=10; i++)
		{
			System.out.println(n1 +" ");
			int next=n1+n2;
			n1=n2;
			n2=next;
			
		}
		
	}
}
