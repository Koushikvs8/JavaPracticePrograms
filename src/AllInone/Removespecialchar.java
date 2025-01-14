package AllInone;

public class Removespecialchar {

	public static void main(String[] args) {
		String sent=" @@#$$^^& &&**( (() is the 27228 ***";
		String sentu= sent.replaceAll("[^a-zA-Z0-9-\\s]", "");
		System.out.println(sentu);
		
	}
}
