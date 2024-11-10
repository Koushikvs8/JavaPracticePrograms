package JavaStringBased;

public class RemoveSpecialCharecter {
public static void main(String[] args) {
	String sentence="!@@#$%% testing %^&**&^%$is&**(( very ^^&** importent";
	
	String updated2=sentence.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(updated2);
}
}
