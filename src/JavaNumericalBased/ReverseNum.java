package JavaNumericalBased;

public class ReverseNum {
public static void main(String[] args) {
	int n = 456789 ;
	int rem ,rev =0;
	System.out.println("Enter Number");
	while(n!=0) {
		rem = n % 10;
		rev = rev * 10 + rem;
		n = n/10;
	}
	System.out.println(rev);

}
}
