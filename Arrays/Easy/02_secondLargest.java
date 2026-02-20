import java.util.*;

class solution {
    // Approach 2: Optimal Approach:
    // TC: O(n) SC: O(1)

    // function to find smallest & second smallest:
    public static void secondSmallest(int arr[], int n) {
        // Edge Case:
        if (n < 2) {
            System.out.println("-1,-1");
        }
        // Step 1: Track two variabels:
        int smallest, second_smallest;

        // Step 2: Compare and find the actual smallest and second smallest from them:
        if (arr[0] < arr[1]) {
            smallest = arr[0];
            second_smallest = arr[1];
        } else {
            smallest = arr[1];
            second_smallest = arr[0];
        }

        // Step 3: Now loop from third element and compare both variabels:
        for (int i = 2; i < n; i++) {
            // Step 4: if curr is small than smallest then update:
            if (arr[i] < smallest) {
                // second smallest becomes smallest till now:
                second_smallest = smallest;
                // and smallest becomes curr:
                smallest = arr[i];
            }
            // Step 5: if curr is small than second smallest only then:
            else if (arr[i] < second_smallest) {
                // update second smallest only:
                second_smallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second_smallest);
    }

    // function to find largest & second largest:
    public static void secondLargest(int arr[], int n) {
        // Edge Cases:
        if (n < 2) {
            System.out.println("-1,-1");
        }
        // Step 1: Track two variabels:
        int largest, second_largest;

        // Step 2: Compare and find the actual largest and largest from them:
        if (arr[0] > arr[1]) {
            largest = arr[0];
            second_largest = arr[1];
        } else {
            largest = arr[1];
            second_largest = arr[0];
        }

        // Step 3: Now loop from third element and compare both variabels:
        for (int i = 2; i < n; i++) {
            // Step 4: if curr is larger than largest then update:
            if (arr[i] > largest) {
                // second largest becomes largest till now:
                second_largest = largest;
                // and largest becomes curr:
                largest = arr[i];
            }
            // Step 5: if curr is larger than second largest only then:
            else if (arr[i] < second_largest) {
                // update second largest only:
                second_largest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second_largest);
    }

    public static void main(String[] args) {
        int arr[] = {};
        int n = arr.length;

        // Approach 1: Brute Force:
        // TC:O(N*logn) SC:O(1)

        // Step 1: Sort the array by inbuilt method:
        Arrays.sort(arr);
        // Step 2: Second largest element will be the second last element
        // and second smallest will be the secind element:
        System.out.println("Second Largest: " + arr[n - 2]);
        System.out.println("Second Smallest: " + arr[1]);

        // Edge case: when there is only a single element present

        // Function calls:
        secondSmallest(arr, n);
        secondLargest(arr, n);
    }
}
