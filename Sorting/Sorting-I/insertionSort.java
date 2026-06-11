public class insertionSort {
      public static void sortInsertion(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                  int minElement = arr[i];
                  int j = i - 1;

                  while (j >= 0 && arr[j] > minElement) {
                        arr[j + 1] = arr[j];
                        j--;
                  }

                  arr[j + 1] = minElement;
            }
      }

      public static void main(String[] args) {
            int arr[] = { 5, 4, 3 };
            sortInsertion(arr);
            for (int nums : arr) {
                  System.out.print(nums + " ");
            }
      }
}

// Insertion Sort

// Idea: Take one element at a time and insert it into its correct position in
// the sorted part.
// Initial: {3, 2, 1}
// Assume Sorted part: {3}

// Take 2
// Move 3 right
// Insert 2 → {2, 3, 1}

// Now sorted part: {2, 3}

// Take 1
// Move 3 right
// Move 2 right
// Insert 1 → {1, 2, 3}