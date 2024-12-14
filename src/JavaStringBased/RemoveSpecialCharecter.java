package JavaStringBased;

public class RemoveSpecialCharecter {
public static void main(String[] args) {
	String sentence="!@@#$%% testing %^&**&^%$is&**(( very ^^&** importent";
	
	String updated2=sentence.replaceAll("[^a-zA-Z0-9-\s]", "");
	int specialCount=(sentence.length()-updated2.length());
	System.out.println("the count of special Charecter is :"+ specialCount);
	System.out.println(updated2);
}
}
