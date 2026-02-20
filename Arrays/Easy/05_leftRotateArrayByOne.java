class solution {
	
    public static int[] leftRotateArrayByOne(int arr[], int n) {
		// Approach 1: My First Approach (Two Pointer):
		// TC: O(n) SC: O(1)
		
		// Step 1: initialize a pointer at start of the index:
        int i = 0;
		
		// Step 2: traverse through the array:
        for (int j = 1; j < n; j++) {
			// Step 3: swap:
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
			// Step 4: update the pointer to next index
            i++;
        }
        return arr;
    }

	public static int[] leftRotateArrayByOneStriver(int arr[],int n){
		// Approach 2: Striver Approach:
		// TC: O(n) SC: O(1)
		
		// Step 1: store the first element because we have to shift it:
		int temp = arr[0];
		
		// Step 2: traverse throught the array and put curr element in prev position:
		for(int i=1;i<n;i++){
			arr[i-1] = arr[i];
		}
		
		// Step 3: now allocate the first element to last position:
		arr[n-1] = temp;
		
		return arr;
	}
	
    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 6 };
        int n = arr.length;

        // Function Call:
        //leftRotateArrayByOne(arr, n);
		leftRotateArrayByOneStriver(arr,n);
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
