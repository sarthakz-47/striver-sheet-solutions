class solution {

	public static void moveZeros(int arr[], int n) {
		// Approach 1: Brute Force:
		// TC: O(n) SC: O(n)

		// Step 1: create a temp array to store the result:
		int temp[] = new int[n];

		// Step 2: intialize a pointer to track the temp array:
		int idx = 0;

		// Step 3: traverse throught whole array:
		for (int i = 0; i < n; i++) {
			// Step 4: if curr element is non-zero then add it to temp array:
			if (arr[i] != 0) {
				temp[idx] = arr[i];
				// Step 5: move the pointer of temp array by one:
				idx++;
			}
		}

		for (int nums : temp) {
			System.out.print(nums + " ");
		}

	}

	public static void moveZerosOptimized(int arr[], int n) {
		// Approach 1: Two Pointer:
		// TC: O(n) SC: O(1)

		// Step 1: initialze a pointer to track and uodate element:
		int i = 0;

		// Step 2: traverse through each element in array:
		for (int j = 0; j < n; j++) {
			// Step 3: if curr element is non-zero means move it forward:
			if (arr[j] != 0) {
				// Step 4: swap with ith position:
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				// Step 5: update the pointer to next in array:
				i++;

			}
		}

		for (int nums : arr) {
			System.out.print(nums + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };
		int n = arr.length;

		// Function call:
		moveZeros(arr, n);
		moveZerosOptimized(arr, n);
	}
}
