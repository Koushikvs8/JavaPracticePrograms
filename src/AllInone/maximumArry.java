package AllInone;

public class maximumArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {23,45,67,9,4,78};
		int max=num[0];
		
		for (int i = 1; i < num.length; i++) {
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		System.out.println(max);

	}

}
