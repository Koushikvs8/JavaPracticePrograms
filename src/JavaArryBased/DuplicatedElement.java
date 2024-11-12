package JavaArryBased;

public class DuplicatedElement {
	 public static void main(String[] args) {
	        char[] name = {'k', 'o', 'k', 'u','u'};

	        System.out.println("Duplicate characters in the array:");
	        for (int i = 0; i < name.length; i++) {
	            boolean isDuplicate = false;

	            for (int j = i + 1; j < name.length; j++) {
	                if (name[i] == name[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (isDuplicate) {
	                System.out.println(name[i]);
	            }
	        }

	        System.out.println("Program finished.");
	    }
}
