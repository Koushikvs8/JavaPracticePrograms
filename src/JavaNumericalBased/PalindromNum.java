package JavaNumericalBased;

public class PalindromNum {
	public static void main(String[] args) {
		int n = 4554 ;
		int palindrom=n;
		int rem ,rev =0;
		while(n!=0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		
		if(rev==palindrom)
		{
		System.out.println("Number is Palindrom");
		}
		else
		{
			System.out.println("Number is not Palindrom");
		}
	}
}
