import java.util.*;

class solution {
    // Approach 2: Optimal Approach
    // TC: O(n) SC:O(1)
    public static int printLargest(int arr[]) {
        // Step 1: Assume first element is largest in array:
        int largest = arr[0];
        // Step 2: Run a loop from second element:
        for (int i = 2; i < arr.length; i++) {
            // Step 3: Compare current element with largest:
            if (largest < arr[i]) {
                // Step 4: Update largest:
                largest = arr[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };
        int n = arr.length;
        // Approach 1: Use Built in method to sort the array:
        // TC: O(N*logn) SC:O(1)
        Arrays.sort(arr);
        // The Largest element will be the last element:
        System.out.println(arr[n - 1]);

        // Function Calls:
        System.out.println(printLargest(arr));
    }
}
