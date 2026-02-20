class solution {
    public static void removeDuplicates(int arr[], int n) {
        // Approach 1: Brute Force
        // TC:O(n) SC:O(n) -> extra space used
		
		// Edge Case:
		if(n == 0){
			System.out.println("-1");
		}
		
        // Step 1: Create a temp array to store the result of size n:
        int temp[] = new int[n];

        // Step 2: There will be always one single element in the array:
        temp[0] = arr[0];

        // Step 3: intialize a pointer to track temp array:
        int index = 1;

        // Step 4: Now traverse the array from second element:
        for (int i = 1; i < n; i++) {
            // Step 5: Check if curr element is unique than prev or not:
            if (arr[i] != arr[i - 1]) {
                // Step 6: if unique then add it to the temp array:
                temp[index] = arr[i];
                // Step 7: update the pointer to next postion:
                index++;
            }
        }

        for (int num : temp) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(index);

    }

    public static void removeDuplicatesOptimized(int arr[], int n) {
        // Approach 2: Two Pointer Approach
        // TC:O(n) SC:O(1)

		// Edge Case:
		if(n == 0){
			System.out.println("-1");
		}
		
        // Step 1: Initalize first pointer to insert unique element:
        int i = 0;
        // Step 2: Initialize count to track how much unique elements are there:
        int count = 1;

        // Step 3: Traverse through the array from second element:
        for (int j = 1; j < n; j++) {
            // Step 4: if curr element is not equal to element at index i means unique
            // element:
            if (arr[i] != arr[j]) {
                // Step 5: First update the pointer to next postion:
                i++;
                // Step 6: Then copy the unique element to that index:
                arr[i] = arr[j];
                // Step 7: Update the count of unique element:
                count++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int n = arr.length;

        // Function calls:
        removeDuplicates(arr, n);
        System.out.println();
        removeDuplicatesOptimized(arr, n);
    }

}
