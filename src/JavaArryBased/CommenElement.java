package JavaArryBased;

public class CommenElement {
	public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        // Call the method to find common elements
        findCommonElements(array1, array2);
    }

    // Method to find common elements between two arrays
    public static void findCommonElements(int[] array1, int[] array2) {
        // Loop through the first array
        for (int i = 0; i < array1.length; i++) {
            // Loop through the second array
            for (int j = 0; j < array2.length; j++) {
                // If a common element is found
                if (array1[i] == array2[j]) {
                    // Print the common element
                    System.out.println("Common element: " + array1[i]);
                    break; // No need to check further elements of array2
                }
            }
        }
    }
}
