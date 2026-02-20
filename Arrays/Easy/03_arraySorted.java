class solution {
    public static boolean sortedBruteForce(int arr[], int n) {
        // Approach 1: Brute Force
        // TC:O(n^2) SC:O(1)

        // Edge Case:
        if (n == 0 || n == 1) {
            return true;
        }

        // Step 1: compare the curr element with all the elements in array:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Step 2: compare curr with next:
                if (arr[i] > arr[j]) {
                    // Step 3: if curr > next exit loop and return false:
                    return false;
                }
            }
        }
        // Step 4: if condition fails then return true:
        return true;
    }

    public static boolean sortedOptimal(int arr[], int n) {
        // Approach 2: Optimal solution
        // TC:O(n) SC:O(1)

        // Edge Case:
        if (n == 0 || n == 1) {
            return true;
        }
        // Step 1: check the elements from start to end of array:
        for (int i = 0; i < n - 1; i++) {
            // Step 2: compare curr with next:
            if (arr[i] > arr[i + 1]) {
                // Step 3: if curr > next exit loop and return false:
                return false;
            }
        }
        // Step 4: if condition fails then return true:
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        // Function calls:
        System.out.println(sortedBruteForce(arr, n));
        System.out.println(sortedOptimal(arr, n));
    }
}
