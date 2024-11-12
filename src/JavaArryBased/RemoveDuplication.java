package JavaArryBased;

import java.util.Arrays;

public class RemoveDuplication {

	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        
        // Sort the array
        Arrays.sort(arr);
        
        // Count unique elements
        int uniqueCount = 1; // First element is always unique
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create new array to hold unique elements
        int[] uniqueArr = new int[uniqueCount];
        uniqueArr[0] = arr[0];
        int index = 1;
        
        // Fill uniqueArr with unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArr[index++] = arr[i];
            }
        }

        // Print the array with unique elements
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArr));
    }
}
